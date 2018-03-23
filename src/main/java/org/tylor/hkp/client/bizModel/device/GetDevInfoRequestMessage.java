//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.10 时间 03:03:34 PM CST 
//

package org.tylor.hkp.client.bizModel.device;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="DevId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DevIndexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pack" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RegType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DevIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DevPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NmsIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NmsPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
public class GetDevInfoRequestMessage {

	@XmlElement(name = "DevId")
	protected String devId;
	@XmlElement(name = "DevIndexCode")
	protected String devIndexCode;
	@XmlElement(name = "Pack")
	protected GetDevInfoRequestMessage.Pack pack;

	/**
	 * 获取devId属性的值。
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDevId() {
		return devId;
	}

	/**
	 * 设置devId属性的值。
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setDevId(String value) {
		this.devId = value;
	}

	/**
	 * 获取devIndexCode属性的值。
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDevIndexCode() {
		return devIndexCode;
	}

	/**
	 * 设置devIndexCode属性的值。
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setDevIndexCode(String value) {
		this.devIndexCode = value;
	}

	/**
	 * 获取pack属性的值。
	 *
	 * @return possible object is {@link GetDevInfoRequestMessage.Pack }
	 *
	 */
	public GetDevInfoRequestMessage.Pack getPack() {
		return pack;
	}

	/**
	 * 设置pack属性的值。
	 *
	 * @param value
	 *            allowed object is {@link GetDevInfoRequestMessage.Pack }
	 *
	 */
	public void setPack(GetDevInfoRequestMessage.Pack value) {
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
	 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="RegType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="DevIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="DevPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="NmsIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="NmsPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
	@XmlType(name = "", propOrder = { "command", "regType", "typeCode", "userName", "password", "devIp", "devPort", "nmsIp", "nmsPort" })
	public static class Pack {

		@XmlElement(name = "Command")
		protected String command;
		@XmlElement(name = "RegType")
		protected String regType;
		@XmlElement(name = "TypeCode")
		protected String typeCode;
		@XmlElement(name = "UserName")
		protected String userName;
		@XmlElement(name = "Password")
		protected String password;
		@XmlElement(name = "DevIp")
		protected String devIp;
		@XmlElement(name = "DevPort")
		protected String devPort;
		@XmlElement(name = "NmsIp")
		protected String nmsIp;
		@XmlElement(name = "NmsPort")
		protected String nmsPort;
		@XmlAttribute(name = "type")
		protected String type;

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
		 * 获取regType属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRegType() {
			return regType;
		}

		/**
		 * 设置regType属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRegType(String value) {
			this.regType = value;
		}

		/**
		 * 获取typeCode属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTypeCode() {
			return typeCode;
		}

		/**
		 * 设置typeCode属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTypeCode(String value) {
			this.typeCode = value;
		}

		/**
		 * 获取userName属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getUserName() {
			return userName;
		}

		/**
		 * 设置userName属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setUserName(String value) {
			this.userName = value;
		}

		/**
		 * 获取password属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPassword() {
			return password;
		}

		/**
		 * 设置password属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPassword(String value) {
			this.password = value;
		}

		/**
		 * 获取devIp属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDevIp() {
			return devIp;
		}

		/**
		 * 设置devIp属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDevIp(String value) {
			this.devIp = value;
		}

		/**
		 * 获取devPort属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDevPort() {
			return devPort;
		}

		/**
		 * 设置devPort属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDevPort(String value) {
			this.devPort = value;
		}

		/**
		 * 获取nmsIp属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNmsIp() {
			return nmsIp;
		}

		/**
		 * 设置nmsIp属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNmsIp(String value) {
			this.nmsIp = value;
		}

		/**
		 * 获取nmsPort属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNmsPort() {
			return nmsPort;
		}

		/**
		 * 设置nmsPort属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNmsPort(String value) {
			this.nmsPort = value;
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

	}

}
