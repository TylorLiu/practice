//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.25 时间 11:42:39 AM CST 
//


package org.tylor.hkp.client.vagConfig;

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
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}service"/>
 *         &lt;element ref="{}register"/>
 *         &lt;element ref="{}netzones"/>
 *         &lt;element ref="{}vag"/>
 *         &lt;element ref="{}vag_other"/>
 *         &lt;element ref="{}stream_other"/>
 *         &lt;element ref="{}dag"/>
 *         &lt;element ref="{}exchange"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "service",
    "register",
    "netzones",
    "vag",
    "vagOther",
    "streamOther",
    "dag",
    "exchange"
})
@XmlRootElement(name = "config")
public class Config {

    @XmlElement(required = true)
    protected Service service;
    @XmlElement(required = true)
    protected Register register;
    @XmlElement(required = true)
    protected Netzones netzones;
    @XmlElement(required = true)
    protected Vag vag;
    @XmlElement(name = "vag_other", required = true)
    protected VagOther vagOther;
    @XmlElement(name = "stream_other", required = true)
    protected StreamOther streamOther;
    @XmlElement(required = true)
    protected Dag dag;
    @XmlElement(required = true)
    protected Exchange exchange;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * 获取service属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Service }
     *     
     */
    public Service getService() {
        return service;
    }

    /**
     * 设置service属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Service }
     *     
     */
    public void setService(Service value) {
        this.service = value;
    }

    /**
     * 获取register属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Register }
     *     
     */
    public Register getRegister() {
        return register;
    }

    /**
     * 设置register属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Register }
     *     
     */
    public void setRegister(Register value) {
        this.register = value;
    }

    /**
     * 获取netzones属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Netzones }
     *     
     */
    public Netzones getNetzones() {
        return netzones;
    }

    /**
     * 设置netzones属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Netzones }
     *     
     */
    public void setNetzones(Netzones value) {
        this.netzones = value;
    }

    /**
     * 获取vag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Vag }
     *     
     */
    public Vag getVag() {
        return vag;
    }

    /**
     * 设置vag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Vag }
     *     
     */
    public void setVag(Vag value) {
        this.vag = value;
    }

    /**
     * 获取vagOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VagOther }
     *     
     */
    public VagOther getVagOther() {
        return vagOther;
    }

    /**
     * 设置vagOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VagOther }
     *     
     */
    public void setVagOther(VagOther value) {
        this.vagOther = value;
    }

    /**
     * 获取streamOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StreamOther }
     *     
     */
    public StreamOther getStreamOther() {
        return streamOther;
    }

    /**
     * 设置streamOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StreamOther }
     *     
     */
    public void setStreamOther(StreamOther value) {
        this.streamOther = value;
    }

    /**
     * 获取dag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Dag }
     *     
     */
    public Dag getDag() {
        return dag;
    }

    /**
     * 设置dag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Dag }
     *     
     */
    public void setDag(Dag value) {
        this.dag = value;
    }

    /**
     * 获取exchange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Exchange }
     *     
     */
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * 设置exchange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Exchange }
     *     
     */
    public void setExchange(Exchange value) {
        this.exchange = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
