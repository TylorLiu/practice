//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.14 时间 10:40:33 AM CST 
//

package org.tylor.hkp.client.bizModel.classData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enabled">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
 *                 &lt;attribute name="opt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "", propOrder = { "enabled" })
@XmlRootElement(name = "ClassDataControl")
public class ClassDataControl {

	@XmlElement(required = true)
	protected ClassDataControl.Enabled enabled;
	@XmlAttribute(name = "version")
	protected String version;

	/**
	 * 获取enabled属性的值。
	 *
	 * @return possible object is {@link ClassDataControl.Enabled }
	 *
	 */
	public ClassDataControl.Enabled getEnabled() {
		return enabled;
	}

	/**
	 * 设置enabled属性的值。
	 *
	 * @param value
	 *            allowed object is {@link ClassDataControl.Enabled }
	 *
	 */
	public void setEnabled(ClassDataControl.Enabled value) {
		this.enabled = value;
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
	 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
	 *       &lt;attribute name="opt" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *     &lt;/extension>
	 *   &lt;/simpleContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "value" })
	public static class Enabled {

		@XmlValue
		protected boolean value;
		@XmlAttribute(name = "opt")
		protected String opt;

		/**
		 * 获取value属性的值。
		 * 
		 */
		public boolean isValue() {
			return value;
		}

		/**
		 * 设置value属性的值。
		 * 
		 */
		public void setValue(boolean value) {
			this.value = value;
		}

		/**
		 * 获取opt属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOpt() {
			return opt;
		}

		/**
		 * 设置opt属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setOpt(String value) {
			this.opt = value;
		}

	}

}
