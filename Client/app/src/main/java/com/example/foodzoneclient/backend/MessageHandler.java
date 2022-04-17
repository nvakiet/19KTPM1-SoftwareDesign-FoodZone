package com.example.foodzoneclient.backend;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Message;
import android.util.Log;

import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.protocols.ServerMessage;
import com.example.foodzoneclient.protocols.UserInfo;
import com.example.foodzoneclient.ui.LoginFragment;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolConfig;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;

public class MessageHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        String serverIP = ctx.channel().remoteAddress().toString();
        System.out.println("Connect to server at " + serverIP);
//        ctx.pipeline().addBefore("WSFrameDecoder", "WSProtocol",
//                new WebSocketClientProtocolHandler(WebSocketClientProtocolConfig.newBuilder()
//                .webSocketUri("ws:/" + serverIP + "/ws")
//                .allowExtensions(true)
//                .build()));
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        System.out.println("Disconnect from the server");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
        Log.i(ContainerClient.LOG_TAG, "Receive response from server");
        ServerMessage serverMessage = (ServerMessage) msg;

        Message uiMsg;
        if (serverMessage.getMsg().equals("login_response")) {
            uiMsg = Message.obtain(LoginFragment.loginFragmentHandler);
            uiMsg.what = 1;
            String result = serverMessage.getLoginResponse().getResult();
            uiMsg.obj = result;
            if (result.equals("Success")) {
                UserInfo info = serverMessage.getLoginResponse().getUserInfo();
                // If login success, save user info to a shared preference file
                SharedPreferences prefs = FoodZone.getContext().getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = prefs.edit();
                prefEditor.putString("Username", info.getUsername());
                prefEditor.putString("Fullname", info.getFullname());
                prefEditor.putString("ID", info.getId());
                prefEditor.putString("Address", info.getAddress());
                prefEditor.putString("Phone", info.getPhone());
                prefEditor.putString("Image", info.getImgName());
                prefEditor.apply();
            }
            uiMsg.sendToTarget();
        }

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        Log.e(ContainerClient.LOG_TAG, "AN EXCEPTION HAS OCCURRED IN THE CLIENT MESSAGE HANDLER!", cause);
        Message msg = Message.obtain(ContainerClient.getInstance().currentUIHandler);
        msg.what = -200; // Error code for failed connection
        msg.obj = "Server communication error. The connection will be closed.";
        msg.sendToTarget();
        ContainerClient.getInstance().disconnect();

    }
}
