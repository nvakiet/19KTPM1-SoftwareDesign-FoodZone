package com.example.foodzoneclient.backend;

//import static io.netty.buffer.Unpooled.wrappedBuffer;
//import android.util.Log;
import com.example.foodzoneclient.protocols.ServerMessage;
//import com.google.protobuf.MessageLite;
//import com.google.protobuf.MessageLiteOrBuilder;
//import java.util.List;
//import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
//import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
//import io.netty.handler.codec.MessageToMessageDecoder;
//import io.netty.handler.codec.MessageToMessageEncoder;
//import io.netty.handler.codec.http.HttpClientCodec;
//import io.netty.handler.codec.http.HttpObjectAggregator;
//import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
//import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolConfig;
//import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
//import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
//import io.netty.handler.stream.ChunkedWriteHandler;

public class ClientAdapterInitializer extends ChannelInitializer<Channel> {
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
//        pipeline.addLast(new HttpClientCodec());
//        pipeline.addLast(new HttpObjectAggregator(65536));
//        pipeline.addLast(new ChunkedWriteHandler());
//
//        // Protocol packet decoding
//        pipeline.addLast("WSFrameDecoder", new MessageToMessageDecoder<WebSocketFrame>() {
//            @Override
//            protected void decode(ChannelHandlerContext ctx, WebSocketFrame frame, List<Object> objs) throws Exception {
//                ByteBuf buf = ((BinaryWebSocketFrame) frame).content();
//                objs.add(buf);
//                buf.retain();
//            }
//        });
//
//        //Protocol package encoding
//        pipeline.addLast("WSFrameEncoder", new MessageToMessageEncoder<MessageLiteOrBuilder>() {
//            @Override
//            protected void encode(ChannelHandlerContext ctx, MessageLiteOrBuilder msg, List<Object> out) throws Exception {
//                ByteBuf result = null;
//                if (msg instanceof MessageLite) {
//                    result = wrappedBuffer(((MessageLite) msg).toByteArray());
//                }
//                if (msg instanceof MessageLite.Builder) {
//                    result = wrappedBuffer(((MessageLite.Builder) msg).build().toByteArray());
//                }
//
//                WebSocketFrame frame = new BinaryWebSocketFrame(result);
//                out.add(frame);
//            }
//        });
//
//        pipeline.addLast(new ProtobufDecoder(ServerMessage.getDefaultInstance()));
//        pipeline.addLast(new MessageHandler());

        pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
        pipeline.addLast(new ProtobufEncoder());
        pipeline.addLast(new ProtobufVarint32FrameDecoder());
        pipeline.addLast(new ProtobufDecoder(ServerMessage.getDefaultInstance()));
        pipeline.addLast(new MessageHandler());
    }
}
