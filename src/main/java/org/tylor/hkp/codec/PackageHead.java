package org.tylor.hkp.codec;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import lombok.Data;

/**
 * VAG报文头部
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:21:48
 */
@Data
public class PackageHead implements Serializable {
	/** 序列化ID */
	private static final long serialVersionUID = 1L;
	public static final int HEAD_LENGTH = 16; // 16 bytes
	private byte[] headFlag = new byte[4]; // 协议标识，默认为HKP$
	private int length; // 长度
	private int sequence; // 消息序号
	private byte version = 1; // 版本
	private byte encode = 0; // 是否加密
	private short rec; // 保留字段

	public PackageHead() {
		super();
		try {
			headFlag = "HKP$".getBytes("iso8859-1");
		} catch (UnsupportedEncodingException e) {
			headFlag[0] = 'H';
			headFlag[1] = 'K';
			headFlag[2] = 'P';
			headFlag[3] = '$';
		}
	}

}
