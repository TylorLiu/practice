package org.tylor.hkp.client.bizModel.device;

/**
 * @author liubin10
 *		   2017年5月15日
 */
//

//此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
//请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//在重新编译源模式时, 对此文件的所有修改都将丢失。
//生成时间: 2017.05.15 时间 04:23:09 PM CST 
//

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
*         &lt;element name="DevId" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
*         &lt;element name="DevIndexCode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
*         &lt;element name="Pack">
*           &lt;complexType>
*             &lt;complexContent>
*               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*                 &lt;sequence>
*                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
*                 &lt;/sequence>
*                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
public class DelDevRequestMessage {

	@XmlElement(name = "DevId", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String devId;
	@XmlElement(name = "DevIndexCode", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String devIndexCode;
	@XmlElement(name = "Pack", required = true)
	protected DelDevRequestMessage.Pack pack;

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
	 * @return possible object is {@link DelDevRequestMessage.Pack }
	 *
	 */
	public DelDevRequestMessage.Pack getPack() {
		return pack;
	}

	/**
	 * 设置pack属性的值。
	 *
	 * @param value
	 *            allowed object is {@link DelDevRequestMessage.Pack }
	 *
	 */
	public void setPack(DelDevRequestMessage.Pack value) {
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
	 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
	 *       &lt;/sequence>
	 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "command" })
	public static class Pack {

		@XmlElement(name = "Command", required = true)
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlSchemaType(name = "NCName")
		protected String command;
		@XmlAttribute(name = "type", required = true)
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlSchemaType(name = "NCName")
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
