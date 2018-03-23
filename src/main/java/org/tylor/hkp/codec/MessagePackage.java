package org.tylor.hkp.codec;

import java.io.Serializable;
import lombok.Data;

/**
 * VAG 报文
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:21:27
 */
@Data
public class MessagePackage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PackageHead packageHead;
	private String xmlMessage;

	public MessagePackage(PackageHead packageHead, String xmlMessage) {
		super();
		this.packageHead = packageHead;
		this.xmlMessage = xmlMessage;
		// packageHead.setSequence(Server.getNextClientSequence());
	}

	public MessagePackage(String xmlMessage) {
		this(new PackageHead(), xmlMessage);
	}

	public MessagePackage() {
		// TODO Auto-generated constructor stub
	}

	public PackageHead getPackageHead() {
		return packageHead;
	}

	public void setPackageHead(PackageHead packageHead) {
		this.packageHead = packageHead;
	}

	public String getXmlMessage() {
		return xmlMessage;
	}

	public void setXmlMessage(String xmlMessage) {
		this.xmlMessage = xmlMessage;
	}

}
