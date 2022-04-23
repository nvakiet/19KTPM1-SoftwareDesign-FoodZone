package com.fz.foodzoneserver.server;

import com.fz.foodzoneserver.protocols.*;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class MessageHandler extends ChannelInboundHandlerAdapter {
    private        String username = null;
    private static Logger logger   = LogManager.getLogger(MessageHandler.class.getName());

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        logger.info("A client from " + ctx.channel().remoteAddress().toString() + " has connected.");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        logger.info("A client from " + ctx.channel().remoteAddress().toString() + " has disconnected.");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
        ClientMessage         clientMessage = (ClientMessage) msg;
        ServerMessage.Builder serverMessage = ServerMessage.newBuilder();

        switch (clientMessage.getMsg()) {

            // Client requests login
            case "login":
                serverMessage
                        .setMsg("login_response")
                        .setLoginResponse(handleLoginRequest(clientMessage.getLoginRequest()));
                break;

            // Client requests register
            case "register":
                serverMessage
                        .setMsg("register_response")
                        .setRegisterResponse(handleRegisterRequest(clientMessage.getRegisterRequest()));
                break;

            // Client requests update profile
            case "updateInfo":
                serverMessage.setMsg("updateInfo_response")
                        .setUpdateInfoResponse(handleUpdateInfoResponse(clientMessage.getUpdateInfoRequest()));
                break;

        }
        ctx.writeAndFlush(serverMessage.build());
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        logger.error("An exception occurred at client " + ctx.channel().remoteAddress().toString(), cause);
        ctx.close();
    }

    public LoginResponse handleLoginRequest(LoginRequest request) {
        LoginResponse.Builder response = LoginResponse.newBuilder();
        try {
            DBHandler dbHandler = new DBHandler();
            String    result    = dbHandler.queryLogin(request.getUsername(), request.getPassword());
            response.setResult(result);
            if (result.equals("Success")) {
                response.setUserInfo(dbHandler.queryUserInfo(request.getUsername()));
                username = request.getUsername();
                logger.info("User \"" + username + "\" has logged in");
            }
            dbHandler.releaseConn();
        } catch (SQLException e) {
            logger.error("Can't get database connection from connection pool", e);
        }
        return response.build();
    }

    public RegisterResponse handleRegisterRequest(RegisterRequest request) {
        RegisterResponse.Builder response = RegisterResponse.newBuilder();
        try {
            DBHandler dbHandler = new DBHandler();
            String    result    = dbHandler.insertUser(request);
            response.setResult(result);
            if (result.equals("Success")) {
                logger.info("New user \"" + request.getUsername() + "\" has been registered");
            }
            dbHandler.releaseConn();
        } catch (SQLException e) {
            logger.error("Can't get database connection from connection pool", e);
        }
        return response.build();
    }

    private UpdateInfoResponse handleUpdateInfoResponse(UserInfo request) {
        UpdateInfoResponse.Builder response = UpdateInfoResponse.newBuilder();
        try {
            DBHandler dbHandler = new DBHandler();
            String    result    = dbHandler.updateUserInfo(request);
            response.setResult(result);
            if (result.equals("Success"))
                logger.info("User \"" + request.getUsername() + "\" has changed their info");

            dbHandler.releaseConn();
        } catch (SQLException e) {
            logger.error("Can't get database connection from connection pool", e);
        }
        return response.build();
    }
}
