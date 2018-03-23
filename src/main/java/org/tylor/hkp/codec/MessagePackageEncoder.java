package org.tylor.hkp.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * VAG报文编码
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:13:16
 */
public class MessagePackageEncoder extends MessageToByteEncoder<MessagePackage> {

	@Override
	protected void encode(ChannelHandlerContext ctx, MessagePackage msg, ByteBuf out) throws Exception {

		if (msg == null || msg.getPackageHead() == null) {
			throw new Exception("The encode message is null");
		}
		out.writeBytes(msg.getPackageHead().getHeadFlag());
		out.writeInt(msg.getXmlMessage().getBytes("utf-8").length + PackageHead.HEAD_LENGTH);
		out.writeInt(msg.getPackageHead().getSequence());
		out.writeByte(msg.getPackageHead().getVersion());
		out.writeByte(msg.getPackageHead().getEncode());
		out.writeShort(msg.getPackageHead().getRec());
		out.writeBytes(msg.getXmlMessage().getBytes("utf-8"));
	}

}
