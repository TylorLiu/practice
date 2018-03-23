//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.10 时间 03:35:10 PM CST 
//

package org.tylor.hkp.client.bizModel.device;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * anonymous complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enbale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "value" })
public class Chan {

	@XmlValue
	protected String value;
	@XmlAttribute(name = "id")
	protected String id;
	@XmlAttribute(name = "enable")
	protected String enable;
	@XmlAttribute(name = "indexcode")
	protected String indexcode;

	/**
	 * 获取value属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * 设置value属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * 获取id属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置id属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * 获取enable属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnable() {
		return enable;
	}

	/**
	 * 设置enable属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEnable(String value) {
		this.enable = value;
	}

	/**
	 * 获取enbale属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIndexcode() {
		return indexcode;
	}

	/**
	 * 设置enbale属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIndexcode(String value) {
		this.indexcode = value;
	}

}
