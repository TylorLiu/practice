//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.25 时间 11:42:39 AM CST 
//


package org.tylor.hkp.client.vagConfig;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}netzone"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "netzone"
})
@XmlRootElement(name = "netzones")
public class Netzones {

    @XmlElement(required = true)
    protected List<Netzone> netzone;

    /**
     * 获取netzone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Netzone }
     *     
     */
    public List<Netzone> getNetzone() {
      if (netzone == null) {
        netzone = new ArrayList<Netzone>();
      }
      return this.netzone;
    }

    /**
     * 设置netzone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Netzone }
     *     
     */
    public void setNetzone(List<Netzone> value) {
        this.netzone = value;
    }

}
