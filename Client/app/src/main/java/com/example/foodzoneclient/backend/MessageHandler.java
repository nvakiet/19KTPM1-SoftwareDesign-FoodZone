package com.example.foodzoneclient.backend;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Message;
import android.util.Log;

import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.R;
import com.example.foodzoneclient.model.Product;
import com.example.foodzoneclient.model.Restaurant;
import com.example.foodzoneclient.protocols.FoodInfo;
import com.example.foodzoneclient.protocols.FoodListResponse;
import com.example.foodzoneclient.protocols.LoginResponse;
import com.example.foodzoneclient.protocols.RegisterResponse;
import com.example.foodzoneclient.protocols.RestaurantInfo;
import com.example.foodzoneclient.protocols.RestaurantListResponse;
import com.example.foodzoneclient.protocols.ServerMessage;
import com.example.foodzoneclient.protocols.UpdateInfoResponse;
import com.example.foodzoneclient.protocols.UpdatePasswordResponse;
import com.example.foodzoneclient.protocols.UserInfo;
import com.example.foodzoneclient.ui.ChangePasswordActivity;
import com.example.foodzoneclient.ui.FoodMenuActivity;
import com.example.foodzoneclient.ui.LoginFragment;
import com.example.foodzoneclient.ui.MainScreenActivity;
import com.example.foodzoneclient.ui.ProfileActivity;
import com.example.foodzoneclient.ui.RegisterFragment;

import java.util.List;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class MessageHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        String serverIP = ctx.channel().remoteAddress().toString();
        Log.i(ContainerClient.LOG_TAG, "Connect to server at " + serverIP);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        Log.i(ContainerClient.LOG_TAG, "Disconnect from the server");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
        Log.i(ContainerClient.LOG_TAG, "Receive response from server");
        ServerMessage serverMessage = (ServerMessage) msg;

        switch (serverMessage.getMsg()) {

            // Receives login response from server
            case "login_response":
                handleLoginResponse(serverMessage.getLoginResponse());
                break;

            // Receives register response from server
            case "register_response":
                handleRegisterResponse(serverMessage.getRegisterResponse());
                break;

            // Receives register response from server
            case "updateInfo_response":
                handleUpdateInfoResponse(serverMessage.getUpdateInfoResponse());
                break;

            // Receives register response from server
            case "updatePassword_response":
                handleUpdatePasswordResponse(serverMessage.getUpdatePasswordResponse());
                break;

            case "restaurantList_response":
                handleRestaurantListResponse((serverMessage.getRestaurantListResponse()));
                break;

            case "foodList_response":
                handleFoodListResponse((serverMessage.getFoodListResponse()));
                break;
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        Log.e(ContainerClient.LOG_TAG, "AN EXCEPTION HAS OCCURRED IN THE CLIENT MESSAGE HANDLER!", cause);
        Message msg = Message.obtain(ContainerClient.getInstance().currentUIHandler);
        msg.what = -200; // Error code for failed connection
        msg.obj  = "Server communication error. The connection will be closed.";
        msg.sendToTarget();
        ContainerClient.getInstance().disconnect();

    }

    private void handleLoginResponse(LoginResponse response) {
        Message uiMsg;
        uiMsg      = Message.obtain(LoginFragment.loginFragmentHandler);
        uiMsg.what = 1;
        String result = response.getResult();
        uiMsg.obj = result;
        if (result.equals("Success")) {
            UserInfo info = response.getUserInfo();
            // If login success, save user info to a shared preference file
            SharedPreferences        prefs      = FoodZone.getContext().getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor prefEditor = prefs.edit();
            prefEditor.putString("Username", info.getUsername())
                    .putString("Fullname", info.getFullname())
                    .putString("ID", info.getId())
                    .putString("Address", info.getAddress())
                    .putString("Phone", info.getPhone())
                    .putString("Image", info.getImgName())
                    .apply();
        }
        uiMsg.sendToTarget();
    }

    private void handleRegisterResponse(RegisterResponse response) {
        Message uiMsg;
        uiMsg      = Message.obtain(RegisterFragment.registerFragmentHandler);
        uiMsg.what = 1;
        String result = response.getResult();
        uiMsg.obj = result;
        uiMsg.sendToTarget();
    }

    private void handleUpdateInfoResponse(UpdateInfoResponse response) {
        Message uiMsg;
        uiMsg      = Message.obtain(ProfileActivity.profileHandler);
        uiMsg.what = 1;
        uiMsg.obj  = response.getResult();
        uiMsg.sendToTarget();
    }

    private void handleUpdatePasswordResponse(UpdatePasswordResponse response) {
        Message uiMsg;
        uiMsg      = Message.obtain(ChangePasswordActivity.changePasswordhandler);
        uiMsg.what = 1;
        uiMsg.obj  = response.getResult();
        uiMsg.sendToTarget();
    }

    private void handleRestaurantListResponse(RestaurantListResponse response) {
        Message uiMsg;
        uiMsg      = Message.obtain(MainScreenActivity.restaurantListHandler);
        uiMsg.what = 1;
        uiMsg.obj  = response.getResult();

        List<RestaurantInfo> tmp;
        if (response.getResult().equals("Success")) {
            tmp = response.getRestaurantList();
            Log.i("resID", String.valueOf(tmp.size()));

            for (int i = 0; i < tmp.size(); i++) {
                MainScreenActivity.list.add(new Restaurant(tmp.get(i).getID(), R.drawable.tcf1, tmp.get(i).getName(), tmp.get(i).getAddress()));
            }
        }

        uiMsg.sendToTarget();
    }

    private void handleFoodListResponse(FoodListResponse response) {
        Message uiMsg;
        uiMsg      = Message.obtain(FoodMenuActivity.foodListHandler);
        uiMsg.what = 1;
        uiMsg.obj  = response.getResult();

        List<FoodInfo> tmp;
        if (response.getResult().equals("Success")) {
            tmp = response.getFoodList();
            Log.i("resID", String.valueOf(tmp.size()));

            for (int i = 0; i < tmp.size(); i++) {
                FoodMenuActivity.list.add(new Product(tmp.get(i).getID(), tmp.get(i).getName(), tmp.get(i).getDescription(), 1, tmp.get(i).getPrice()));
            }
        }

        uiMsg.sendToTarget();
    }
}
