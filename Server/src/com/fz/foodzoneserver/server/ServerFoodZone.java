package com.fz.foodzoneserver.server;

import com.fz.foodzoneserver.protocols.ClientMessage;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServerFoodZone {
	private static Logger logger = LogManager.getLogger(ServerFoodZone.class.getName());
	private Channel serverChannel = null;
	private int port;
	private String ipAddr = "";
	private Thread serverThread = null;
	
	public ServerFoodZone(String dbConnString, String ip, int port) {
		// Connect connection pool with database connection string here
		if (!ip.isEmpty())
			ipAddr = ip;
		this.port = port;
	}
	
	public void start() throws Exception {
		//Run the server on another thread
		serverThread = new Thread(() -> {
			EventLoopGroup bossGroup = new NioEventLoopGroup();
			EventLoopGroup workerGroup = new NioEventLoopGroup();

			try {
				//Setup the server
				ServerBootstrap serverBs = new ServerBootstrap();
				serverBs.group(bossGroup, workerGroup)
						.channel(NioServerSocketChannel.class)
						.childHandler(new ChannelInitializer<NioSocketChannel>() {
							@Override
							protected void initChannel(NioSocketChannel ch) throws Exception {
								//TODO: Add server handlers here
								ChannelPipeline pipeline = ch.pipeline();
								pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
								pipeline.addLast(new ProtobufEncoder());
								pipeline.addLast(new ProtobufVarint32FrameDecoder());
								pipeline.addLast(new ProtobufDecoder(ClientMessage.getDefaultInstance()));
								pipeline.addLast(new MessageHandler());
							}
						})
						.option(ChannelOption.SO_BACKLOG, 128)
						.childOption(ChannelOption.SO_KEEPALIVE, true)
						.childOption(ChannelOption.SO_RCVBUF, 8 * 1024)
						.childOption(ChannelOption.SO_SNDBUF, 8 * 1024);

				//Bind the server to an address + port
				ChannelFuture chFuture = serverBs.bind(ipAddr, port).sync();
				logger.info("Server starts successfully on port " + port + (ipAddr == "" ? " of all network interfaces" : " of address " + ipAddr));
				logger.info("Enter 0 to stop the server.");
				//System.out.println("Server starts successfully on port " + port + (ipAddr == "" ? " of all network interfaces" : " of address " + ipAddr));

				//Keep the server channel for manual closing
				serverChannel = chFuture.channel();
				//Block this thread until all groups finish
				serverChannel.closeFuture().sync();
			} catch (Exception e) {
				logger.error("Server error", e);
				//System.out.println("Server - Netty error");
			} finally {
				//Close the event loop groups and remove the current server channel
				workerGroup.shutdownGracefully();
				bossGroup.shutdownGracefully();
				serverChannel = null;
			}
		});
		
		//Start the server thread
		serverThread.setName("Server-Thread-" + (ipAddr == "" ? ":" : ipAddr + ":") + port);
		serverThread.start();
	}
	
	public void closeServer() {
		try {
			if (serverChannel != null || serverThread != null) {
				logger.info("Close Server on " + (ipAddr == "" ? ":" : ipAddr + ":") + port);
				serverChannel.close();
				serverChannel = null;
				serverThread.join();
				serverThread = null;
			}
		}
		catch (Exception e) {
			logger.error("Server error", e);
		}
	}
}
