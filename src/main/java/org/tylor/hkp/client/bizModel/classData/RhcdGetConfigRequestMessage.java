
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.06 时间 10:32:25 AM CST 
//
package org.tylor.hkp.client.bizModel.classData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * 课堂数据统计配置获取 请求的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DevId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DevIndexCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Pack">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PPVSPMessage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Params">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "devId", "devIndexCode", "pack" })
@XmlRootElement(name = "Message")
public class RhcdGetConfigRequestMessage {

	@XmlElement(name = "DevId")
	protected long devId;
	@XmlElement(name = "DevIndexCode")
	protected String devIndexCode;
	@XmlElement(name = "Pack", required = true)
	protected RhcdGetConfigRequestMessage.Pack pack = new Pack();

	/**
	 * 获取devId属性的值。
	 *
	 */
	public long getDevId() {
		return devId;
	}

	/**
	 * 设置devId属性的值。
	 *
	 */
	public void setDevId(long value) {
		this.devId = value;
	}

	/**
	 * 获取devIndexCode属性的值。
	 *
	 */
	public String getDevIndexCode() {
		return devIndexCode;
	}

	/**
	 * 设置devIndexCode属性的值。
	 *
	 */
	public void setDevIndexCode(String value) {
		this.devIndexCode = value;
	}

	/**
	 * 获取pack属性的值。
	 *
	 * @return possible object is {@link RhcdGetConfigRequestMessage.Pack }
	 *
	 */
	public RhcdGetConfigRequestMessage.Pack getPack() {
		return pack;
	}

	/**
	 * 设置pack属性的值。
	 *
	 * @param value
	 *            allowed object is {@link RhcdGetConfigRequestMessage.Pack }
	 *
	 */
	public void setPack(RhcdGetConfigRequestMessage.Pack value) {
		this.pack = value;
	}

	/**
	 * <p>
	 * anonymous complex type的 Java 类。
	 *
	 * <p>
	 * 以下模式片段指定包含在此类中的预期内容。
	 *
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="PPVSPMessage">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="Params">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 *
	 *
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "ppvspMessage" })
	public static class Pack {

		@XmlElement(name = "PPVSPMessage", required = true)
		protected RhcdGetConfigRequestMessage.Pack.PPVSPMessage ppvspMessage = new PPVSPMessage();
		@XmlAttribute(name = "type")
		protected String type = "PPVSP";

		/**
		 * 获取ppvspMessage属性的值。
		 *
		 * @return possible object is
		 *         {@link RhcdGetConfigRequestMessage.Pack.PPVSPMessage }
		 *
		 */
		public RhcdGetConfigRequestMessage.Pack.PPVSPMessage getPPVSPMessage() {
			return ppvspMessage;
		}

		/**
		 * 设置ppvspMessage属性的值。
		 *
		 * @param value
		 *            allowed object is
		 *            {@link RhcdGetConfigRequestMessage.Pack.PPVSPMessage }
		 *
		 */
		public void setPPVSPMessage(RhcdGetConfigRequestMessage.Pack.PPVSPMessage value) {
			this.ppvspMessage = value;
		}

		/**
		 * 获取type属性的值。
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getType() {
			return type;
		}

		/**
		 * 设置type属性的值。
		 *
		 * @param value
		 *            allowed object is {@link String }
		 *
		 */
		public void setType(String value) {
			this.type = value;
		}

		/**
		 * <p>
		 * anonymous complex type的 Java 类。
		 *
		 * <p>
		 * 以下模式片段指定包含在此类中的预期内容。
		 *
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="Params">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 *
		 *
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "version", "sequence", "commandType", "command", "params" })
		public static class PPVSPMessage {

			@XmlElement(name = "Version")
			protected String version = "2.0";
			@XmlElement(name = "Sequence")
			protected int sequence = 0;
			@XmlElement(name = "CommandType", required = true)
			protected String commandType = "REQUEST";
			@XmlElement(name = "Command", required = true)
			protected String command = "TRANSSTDCONFIG";
			@XmlElement(name = "Params", required = true)
			protected RhcdGetConfigRequestMessage.Pack.PPVSPMessage.Params params = new Params();

			/**
			 * 获取version属性的值。
			 *
			 */
			public String getVersion() {
				return version;
			}

			/**
			 * 设置version属性的值。
			 *
			 */
			public void setVersion(String value) {
				this.version = value;
			}

			/**
			 * 获取sequence属性的值。
			 *
			 */
			public int getSequence() {
				return sequence;
			}

			/**
			 * 设置sequence属性的值。
			 *
			 */
			public void setSequence(int value) {
				this.sequence = value;
			}

			/**
			 * 获取commandType属性的值。
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getCommandType() {
				return commandType;
			}

			/**
			 * 设置commandType属性的值。
			 *
			 * @param value
			 *            allowed object is {@link String }
			 *
			 */
			public void setCommandType(String value) {
				this.commandType = value;
			}

			/**
			 * 获取command属性的值。
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getCommand() {
				return command;
			}

			/**
			 * 设置command属性的值。
			 *
			 * @param value
			 *            allowed object is {@link String }
			 *
			 */
			public void setCommand(String value) {
				this.command = value;
			}

			/**
			 * 获取params属性的值。
			 *
			 * @return possible object is
			 *         {@link RhcdGetConfigRequestMessage.Pack.PPVSPMessage.Params }
			 *
			 */
			public RhcdGetConfigRequestMessage.Pack.PPVSPMessage.Params getParams() {
				return params;
			}

			/**
			 * 设置params属性的值。
			 *
			 * @param value
			 *            allowed object is
			 *            {@link RhcdGetConfigRequestMessage.Pack.PPVSPMessage.Params }
			 *
			 */
			public void setParams(RhcdGetConfigRequestMessage.Pack.PPVSPMessage.Params value) {
				this.params = value;
			}

			/**
			 * <p>
			 * anonymous complex type的 Java 类。
			 * 
			 * <p>
			 * 以下模式片段指定包含在此类中的预期内容。
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string"/>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "configCmd" })
			public static class Params {

				@XmlElement(name = "ConfigCmd", required = true)
				protected String configCmd = "GET /ISAPI/ContentMgmt/RecordingHost/ClassDataControl";

				/**
				 * 获取configCmd属性的值。
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getConfigCmd() {
					return configCmd;
				}

				/**
				 * 设置configCmd属性的值。
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setConfigCmd(String value) {
					this.configCmd = value;
				}

			}

		}

	}

}
