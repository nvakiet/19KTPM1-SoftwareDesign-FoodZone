package com.example.foodzoneclient.backend;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.protocols.ClientMessage;
import com.example.foodzoneclient.protocols.LoginRequest;
import com.example.foodzoneclient.protocols.RegisterRequest;
import com.example.foodzoneclient.ui.LoginFragment;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ContainerClient {
    INSTANCE;
    // For debugging
    public static final String LOG_TAG = "FoodZone";
    // A list of possible server addresses
    private ArrayList<String> iplist = new ArrayList<String>();
    private int currentIpIdx = 0;
    private int port;
    // Use this send requests to server
    private Channel channel = null;
    // To access the client network loop
    private Bootstrap bootstrap = null;
    private EventLoopGroup recvGroup = new NioEventLoopGroup(1);
    private EventLoopGroup sendGroup = new NioEventLoopGroup(1);
    // A thread to read the server list
    private Thread readServerList = null;
    private InputStream is = null; // To read the assets file packaged in the APK
    // Status flag
    boolean connectSuccess = false;
    boolean isConnecting = false;
    // Handler of the current running UI
    public Handler currentUIHandler = null;

    private ContainerClient() {
        // Make this private for singleton class
    }

    public static ContainerClient getInstance() {
        return INSTANCE;
    }

    public void initServerIPs(InputStream is) {
        this.is = is;

        // Run a thread to read the list of server addresses
        readServerList = new Thread(new Runnable() {
            @Override
            public void run() {
                // Read the ip file
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                    String line = reader.readLine();
                    while (line != null) {
                        iplist.add(line);
                        line = reader.readLine();
                    }
                    is.close();
                } catch (Exception e) {
                    Log.e(LOG_TAG, Log.getStackTraceString(e));
                }
            }
        });
        readServerList.start();
    }

    public void connect(int port) {
        if (isConnecting) return;
        isConnecting = true;
        this.port = port;
        try {
            readServerList.join();
            if (iplist.isEmpty()) {
                Log.e(LOG_TAG, "Must initialize the server IP list before starting a connection.");
                return;
            }
            if (recvGroup.isShutdown())
                recvGroup = new NioEventLoopGroup(1);
            recvGroup.execute(new Runnable() {
                @Override
                public void run() {
                    doConnect();
                }
            });
        } catch (Exception e) {
            Log.e(LOG_TAG, "An error has occurred while trying to connect", e);
        }
    }

    private void doConnect() {
        try {
            // Initialize the bootstrap
            if (bootstrap == null) {
                bootstrap = new Bootstrap();
                bootstrap.group(recvGroup)
                        .channel(NioSocketChannel.class)
                        .option(ChannelOption.SO_KEEPALIVE, true)
                        .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 200)
                        .handler(new ClientAdapterInitializer());
            }
            // Reset the current ip index if used up all IPs last time
            if (currentIpIdx >= iplist.size())
                currentIpIdx = 0;
            // Connect at the current working server ip
            String ip = iplist.get(currentIpIdx);
            Log.i(LOG_TAG, "Connecting to server...");
            ChannelFuture f = bootstrap.connect(ip, port);
            // Listen to connection result at current IP, if failed, connect again at next IP
            f.addListener( new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture future) throws Exception {
                    if(!future.isSuccess() ) {
                        //if can't connect, try again
                        future.channel().close();
                        currentIpIdx++;
                        if (currentIpIdx < iplist.size()) {
                            String ip = iplist.get(currentIpIdx);
                            bootstrap.connect(ip, port).addListener(this);
                        }
                        else {
                            connectSuccess = false;
                            isConnecting = false;
                            // Send connection failed announcement to the UI
                            Message msg = Message.obtain(currentUIHandler);
                            msg.what = -100; // Error code for failed connection
                            msg.obj = "Unable to connect to server";
                            msg.sendToTarget();
                        }
                    }
                    else {
                        connectSuccess = true;
                        isConnecting = false;
                        channel = future.channel();
                        Log.i(LOG_TAG, "Successfully connect to server at " + iplist.get(currentIpIdx) + ":" + port);
                    }
                }
            });
        } catch( Exception ex ) {
            Log.e(LOG_TAG, "An error has occurred while trying to connect", ex);
        }
    }

    public void disconnect() {
        if (recvGroup.isShutdown())
            return;
        recvGroup.execute(new Runnable() {
            @Override
            public void run() {
                channel.close().awaitUninterruptibly();
            }
        });
        recvGroup.shutdownGracefully();
        channel = null;
        bootstrap = null;
    }

    public void sendToServer(ClientMessage msg) {
        sendGroup.execute(new Runnable() {
            @Override
            public void run() {
                if (channel == null) {
                    connect(9999);
                    while (isConnecting) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException ignored) {}
                    }
                }
                if (!connectSuccess)
                    Log.e(ContainerClient.LOG_TAG,"No connection to server, can't send message.");
                channel.writeAndFlush(msg).addListener(new ChannelFutureListener() {
                    @Override
                    public void operationComplete(ChannelFuture future) throws Exception {
                        if (!future.isSuccess()) {
                            Log.e(LOG_TAG, "Failed to send client message to server.");
                            FoodZone.showToast(currentUIHandler, "Can't send request to server. Please try again");
                            disconnect();
                        }
                    }
                });
            }
        });
    }

    private boolean checkString(String userName){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher= pattern.matcher(userName);
        boolean isSpecial=matcher.find();
        return isSpecial;
    }

    public void sendLoginRequest(LoginRequest loginRequest) {

        sendGroup.execute(new Runnable() {
            @Override
            public void run() {
                // Case username has special characters
                if(checkString(loginRequest.getUsername())){
                    FoodZone.showToast(currentUIHandler, "Username can only contain alphabetic and numeric characters");
                    return;
                }
                // case username or password is blank
                if(loginRequest.getUsername().isEmpty() || loginRequest.getPassword().isEmpty()){
                    FoodZone.showToast(currentUIHandler, "Username and password can't be empty");
                    return;
                }
                // Send the request to the server after validation success
                ClientMessage msg = ClientMessage.newBuilder()
                        .setMsg("login")
                        .setLoginRequest(loginRequest).build();
                sendToServer(msg);
            }
        });
    }

    public void sendRegisterRequest(RegisterRequest request){
        sendGroup.execute(new Runnable() {
            @Override
            public void run() {
                // check if Username contains special characters
                if(checkString(request.getUsername())){
                    FoodZone.showToast(currentUIHandler, "Username can only contain alphabetic and numeric characters");
                    return;
                }

                // check if any field is missing
                if(request.getUsername().isEmpty() || request.getPassword().isEmpty() ||
                    request.getFullname().isEmpty() || request.getId().isEmpty() ||
                    request.getPhone().isEmpty() || request.getAddress().isEmpty()) {
                    FoodZone.showToast(currentUIHandler, "Please fill in all information fields");
                    return;
                }

                // check if a phone number is valid: exactly 10 characters long and only has numeric characters
                if(!request.getPhone().matches("^0[0-9]{9}$")){
                    FoodZone.showToast(currentUIHandler, "Vietnam phone number must be exactly 10 characters long, only contains digits and starts with 0 (no country code)");
                    return;
                }

                // check if password length is valid (>=8)
                if((request.getPassword()).length() < 8 || request.getPassword().length() > 64) {
                    FoodZone.showToast(currentUIHandler, "Password must have at least 8 characters and at most 64 characters");
                    return;
                }

                ClientMessage msg = ClientMessage.newBuilder()
                        .setMsg("register")
                        .setRegisterRequest(request)
                        .build();
                sendToServer(msg);
            }
        });
    }

//    private int checkChangePassword(changePassInfo changePassword) {
//        boolean flag=true; // used to check change pass successfully
//
//        // check if new password is same with old password (old password)
//        if(changePassword.getOldPass().equals(changePassword.getNewPass())){
//            flag=false;
//            return 1;
//        }
//
//        // check if new password length is valid (>=8)
//        if(changePassword.getNewPass().length()<8){
//            flag=false;
//            return 2;
//        }
//
//        // check if newPassword different from newPasswordConfirm
//        if (!changePassword.getNewPass().equals(changePassword.getNewPassConfirm())) {
//            return 3;
//        }
//
//        // check if new password contains username or same with username
//        if(changePassword.getNewPass().contains(changePassword.getUsername())) {
//            flag=false;
//            return 4;
//        }
//
//        // check if all cases above passed and if new password != old password then change password successfully
//        if(!(changePassword.getOldPass().equals(changePassword.getNewPass()))&& flag){
//            return 0;
//        }
//        //Unexpected error
//        return -1;
//
//    }
}