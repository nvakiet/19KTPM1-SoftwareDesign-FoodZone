package com.fz.foodzoneserver.server;

import com.fz.foodzoneserver.protocols.ClientMessage;
import com.fz.foodzoneserver.protocols.LoginRequest;
import com.fz.foodzoneserver.protocols.LoginResponse;
import com.fz.foodzoneserver.protocols.ServerMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class MessageHandler extends ChannelInboundHandlerAdapter {
	private String username = null;
	private static Logger logger = LogManager.getLogger(MessageHandler.class.getName());
	
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
		ClientMessage clientMessage = (ClientMessage) msg;
		ServerMessage.Builder serverMessage = ServerMessage.newBuilder();
		// Client requests login
		if (clientMessage.getMsg().equals("login")) {
			serverMessage.setMsg("login_response");
			serverMessage.setLoginResponse(handleLoginRequest(clientMessage.getLoginRequest()));
		}

		ctx.writeAndFlush(serverMessage.build());
		logger.info("Sent response back to client");
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		super.exceptionCaught(ctx, cause);
		logger.error("An exception occured at client " + ctx.channel().remoteAddress().toString(), cause);
		ctx.close();
	}

	public LoginResponse handleLoginRequest(LoginRequest request) {
		LoginResponse.Builder response = LoginResponse.newBuilder();
		try {
			DBHandler dbHandler = new DBHandler();
			String result = dbHandler.queryLogin(request.getUsername(), request.getPassword());
			response.setResult(result);
			if (result.equals("Success")) {
				response.setUserInfo(dbHandler.queryUserInfo(request.getUsername()));
			}
			dbHandler.releaseConn();
		} catch (SQLException e) {
			logger.error("Can't get database connection from connection pool", e);
		}
		return response.build();
	}
}
