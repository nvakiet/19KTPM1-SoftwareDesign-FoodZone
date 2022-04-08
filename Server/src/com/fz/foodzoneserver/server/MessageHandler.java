package com.fz.foodzoneserver.server;

import com.fz.foodzoneserver.protocols.ClientMessage;
import com.fz.foodzoneserver.protocols.InfoResponse;
import com.fz.foodzoneserver.protocols.ServerMessage;
import com.fz.foodzoneserver.protocols.orderResponse;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MessageHandler extends ChannelInboundHandlerAdapter {
	private String username = null;
	private int type = 0;
	private Logger logger = LogManager.getLogger(ServerFoodZone.class.getName());
	
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
		ClientMessage clientMsg = (ClientMessage) msg;
		int op = clientMsg.getOpcode();
		ServerMessage.Builder response = ServerMessage.newBuilder();
		// TODO: Make a class to retrieve database connection from ConnectionPool and handle database queries
		if (op == 1) {
			// TODO: Handle client messages here
		}
		ctx.writeAndFlush(response.build());
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		super.exceptionCaught(ctx, cause);
		logger.error("An exception occured at client " + ctx.channel().remoteAddress().toString(), cause);
	}
}
