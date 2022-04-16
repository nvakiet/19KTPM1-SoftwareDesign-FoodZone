package com.fz.foodzoneserver.server;

import com.fz.foodzoneserver.protocols.ClientMessage;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

/**
 * com.fz.foodzoneserver.server<br/>
 * Created by Ngo Van Anh Kiet - MSSV: 19127191<br/>
 * Date 14/4/2022 - 11:06 PM<br/>
 * Description: Wrapper class to initialize server child handlers<br/>
 */
public class ServerChannelInitializer extends ChannelInitializer<NioSocketChannel> {
	@Override
	protected void initChannel(NioSocketChannel socketChannel) throws Exception {
		//TODO: Add server handlers here
		ChannelPipeline pipeline = socketChannel.pipeline();
		pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
		pipeline.addLast(new ProtobufEncoder());
		pipeline.addLast(new ProtobufVarint32FrameDecoder());
		pipeline.addLast(new ProtobufDecoder(ClientMessage.getDefaultInstance()));
		pipeline.addLast(new MessageHandler());
	}
}
