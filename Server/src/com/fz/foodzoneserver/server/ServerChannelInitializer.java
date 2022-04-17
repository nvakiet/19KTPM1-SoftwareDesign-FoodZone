package com.fz.foodzoneserver.server;

import com.fz.foodzoneserver.protocols.ClientMessage;
//import com.google.protobuf.MessageLite;
//import com.google.protobuf.MessageLiteOrBuilder;
//import io.netty.buffer.ByteBuf;
//import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
//import io.netty.handler.codec.MessageToMessageDecoder;
//import io.netty.handler.codec.MessageToMessageEncoder;
//import io.netty.handler.codec.http.HttpObjectAggregator;
//import io.netty.handler.codec.http.HttpServerCodec;
//import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
//import io.netty.handler.codec.http.websocketx.WebSocketFrame;
//import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
//import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketServerCompressionHandler;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
//import io.netty.handler.stream.ChunkedWriteHandler;
//import java.util.List;
//import static io.netty.buffer.Unpooled.wrappedBuffer;

/**
 * com.fz.foodzoneserver.server<br/>
 * Created by Ngo Van Anh Kiet - MSSV: 19127191<br/>
 * Date 14/4/2022 - 11:06 PM<br/>
 * Description: Wrapper class to initialize server child handlers<br/>
 */
public class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {
	@Override
	protected void initChannel(SocketChannel socketChannel) throws Exception {
		//TODO: Add server handlers here
		ChannelPipeline pipeline = socketChannel.pipeline();

//		// HTTP Websocket server handlers
//		pipeline.addLast(new HttpServerCodec());
//		pipeline.addLast(new HttpObjectAggregator(65536));
//		pipeline.addLast(new ChunkedWriteHandler()); // To handle large packets
//		pipeline.addLast(new WebSocketServerCompressionHandler());
//		pipeline.addLast(new WebSocketServerProtocolHandler("/ws", null, true));
//
//		// Protocol packet decoding
//		pipeline.addLast(new MessageToMessageDecoder<WebSocketFrame>() {
//			@Override
//			protected void decode(ChannelHandlerContext ctx, WebSocketFrame frame, List<Object> objs) throws Exception {
//				ByteBuf buf = ((BinaryWebSocketFrame) frame).content();
//				objs.add(buf);
//				buf.retain();
//			}
//		});
//
//		//Protocol package encoding
//		pipeline.addLast(new MessageToMessageEncoder<MessageLiteOrBuilder>() {
//			@Override
//			protected void encode(ChannelHandlerContext ctx, MessageLiteOrBuilder msg, List<Object> out) throws Exception {
//				ByteBuf result = null;
//				if (msg instanceof MessageLite) {
//					result = wrappedBuffer(((MessageLite) msg).toByteArray());
//				}
//				if (msg instanceof MessageLite.Builder) {
//					result = wrappedBuffer(((MessageLite.Builder) msg).build().toByteArray());
//				}
//
//				WebSocketFrame frame = new BinaryWebSocketFrame(result);
//				out.add(frame);
//			}
//		});
//
//		// Unpack data into protocol classes
//		pipeline.addLast(new ProtobufDecoder(ClientMessage.getDefaultInstance()));
//
//		// Handle incoming messages from clients
//		pipeline.addLast(new MessageHandler());

		pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
		pipeline.addLast(new ProtobufEncoder());
		pipeline.addLast(new ProtobufVarint32FrameDecoder());
		pipeline.addLast(new ProtobufDecoder(ClientMessage.getDefaultInstance()));
		pipeline.addLast(new MessageHandler());
	}
}
