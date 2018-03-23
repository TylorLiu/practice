//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.14 时间 11:07:29 AM CST 
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
 *         &lt;element name="requestURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="statusString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "requestURL", "statusCode", "statusString", "subStatusCode" })
@XmlRootElement(name = "ResponseStatus")
public class ResponseStatus {

	@XmlElement(required = true)
	protected String requestURL;
	protected byte statusCode;
	@XmlElement(required = true)
	protected String statusString;
	@XmlElement(required = true)
	protected String subStatusCode;
	@XmlAttribute(name = "version")
	protected String version;

	/**
	 * 获取requestURL属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestURL() {
		return requestURL;
	}

	/**
	 * 设置requestURL属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestURL(String value) {
		this.requestURL = value;
	}

	/**
	 * 获取statusCode属性的值。
	 * 
	 */
	public byte getStatusCode() {
		return statusCode;
	}

	/**
	 * 设置statusCode属性的值。
	 * 
	 */
	public void setStatusCode(byte value) {
		this.statusCode = value;
	}

	/**
	 * 获取statusString属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatusString() {
		return statusString;
	}

	/**
	 * 设置statusString属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatusString(String value) {
		this.statusString = value;
	}

	/**
	 * 获取subStatusCode属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubStatusCode() {
		return subStatusCode;
	}

	/**
	 * 设置subStatusCode属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSubStatusCode(String value) {
		this.subStatusCode = value;
	}

	/**
	 * 获取version属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * 设置version属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value) {
		this.version = value;
	}

}
