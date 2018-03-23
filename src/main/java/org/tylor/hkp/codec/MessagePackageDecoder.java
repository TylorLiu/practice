package org.tylor.hkp.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import lombok.extern.slf4j.Slf4j;

/**
 * VAG报文解码
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:13:04
 */
@Slf4j
public class MessagePackageDecoder extends LengthFieldBasedFrameDecoder {

	public MessagePackageDecoder(int maxFrameLength, int lengthFieldOffset, int lengthFieldLength, int lengthAdjustment, int initialBytesToStrip) {
		super(maxFrameLength, lengthFieldOffset, lengthFieldLength, lengthAdjustment, initialBytesToStrip);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected MessagePackage decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        ByteBuf frame = null;
	    try {
            frame = (ByteBuf) super.decode(ctx, in);
            // 粘包拆包的关键就在于这个空值判断。如果是空，则会等待下个包过来然后组成完整的数据包再传递给handler
            if (frame == null) {
                return null;
            }
            log.debug("接收到VAG数据帧长度：" + frame.readableBytes());
            MessagePackage messagePackage = new MessagePackage();
            PackageHead packageHead = new PackageHead();
            frame.readBytes(4);// 跳过HKP$
            packageHead.setLength(frame.readInt());
            packageHead.setSequence(frame.readInt());
            packageHead.setVersion(frame.readByte());
            packageHead.setEncode(frame.readByte());
            packageHead.setRec(frame.readShort());
            messagePackage.setPackageHead(packageHead);
            byte[] req = new byte[frame.readableBytes()];
            frame.readBytes(req);
            messagePackage.setXmlMessage(new String(req, "UTF-8"));
            return messagePackage;
        }finally {
	        if (frame!=null){
                frame.release();
            }
        }

	}
}
