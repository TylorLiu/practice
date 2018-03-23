//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.25 时间 11:42:39 AM CST 
//


package org.tylor.hkp.client.vagConfig;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="alarm_ip" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="alarm_port" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="cu_maxnum" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ehome_hb_interval" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ehome_hbtimeout_times" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ehome_port" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="net_agent_port" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ntp_ip" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ntp_port" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="pic_ip" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="pic_port" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="stream_ip" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="stream_port" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="stream_rtsp_port" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="vag_code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "vag_other")
public class VagOther {

    @XmlAttribute(name = "alarm_ip", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String alarmIp;
    @XmlAttribute(name = "alarm_port", required = true)
    protected String alarmPort;
    @XmlAttribute(name = "cu_maxnum", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cuMaxnum;
    @XmlAttribute(name = "ehome_hb_interval", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String ehomeHbInterval;
    @XmlAttribute(name = "ehome_hbtimeout_times", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String ehomeHbtimeoutTimes;
    @XmlAttribute(name = "ehome_port", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String ehomePort;
    @XmlAttribute(name = "net_agent_port", required = true)
    protected String netAgentPort;
    @XmlAttribute(name = "ntp_ip", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String ntpIp;
    @XmlAttribute(name = "ntp_port", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String ntpPort;
    @XmlAttribute(name = "pic_ip", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String picIp;
    @XmlAttribute(name = "pic_port", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String picPort;
    @XmlAttribute(name = "stream_ip", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String streamIp;
    @XmlAttribute(name = "stream_port", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String streamPort;
    @XmlAttribute(name = "stream_rtsp_port", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String streamRtspPort;
    @XmlAttribute(name = "vag_code", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String vagCode;

    /**
     * 获取alarmIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmIp() {
        return alarmIp;
    }

    /**
     * 设置alarmIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmIp(String value) {
        this.alarmIp = value;
    }

    /**
     * 获取alarmPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getAlarmPort() {
        return alarmPort;
    }

    /**
     * 设置alarmPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlarmPort(String value) {
        this.alarmPort = value;
    }

    /**
     * 获取cuMaxnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuMaxnum() {
        return cuMaxnum;
    }

    /**
     * 设置cuMaxnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuMaxnum(String value) {
        this.cuMaxnum = value;
    }

    /**
     * 获取ehomeHbInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEhomeHbInterval() {
        return ehomeHbInterval;
    }

    /**
     * 设置ehomeHbInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEhomeHbInterval(String value) {
        this.ehomeHbInterval = value;
    }

    /**
     * 获取ehomeHbtimeoutTimes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEhomeHbtimeoutTimes() {
        return ehomeHbtimeoutTimes;
    }

    /**
     * 设置ehomeHbtimeoutTimes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEhomeHbtimeoutTimes(String value) {
        this.ehomeHbtimeoutTimes = value;
    }

    /**
     * 获取ehomePort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEhomePort() {
        return ehomePort;
    }

    /**
     * 设置ehomePort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEhomePort(String value) {
        this.ehomePort = value;
    }

    /**
     * 获取netAgentPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getNetAgentPort() {
        return netAgentPort;
    }

    /**
     * 设置netAgentPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetAgentPort(String value) {
        this.netAgentPort = value;
    }

    /**
     * 获取ntpIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpIp() {
        return ntpIp;
    }

    /**
     * 设置ntpIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpIp(String value) {
        this.ntpIp = value;
    }

    /**
     * 获取ntpPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpPort() {
        return ntpPort;
    }

    /**
     * 设置ntpPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpPort(String value) {
        this.ntpPort = value;
    }

    /**
     * 获取picIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicIp() {
        return picIp;
    }

    /**
     * 设置picIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicIp(String value) {
        this.picIp = value;
    }

    /**
     * 获取picPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicPort() {
        return picPort;
    }

    /**
     * 设置picPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicPort(String value) {
        this.picPort = value;
    }

    /**
     * 获取streamIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamIp() {
        return streamIp;
    }

    /**
     * 设置streamIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamIp(String value) {
        this.streamIp = value;
    }

    /**
     * 获取streamPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamPort() {
        return streamPort;
    }

    /**
     * 设置streamPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamPort(String value) {
        this.streamPort = value;
    }

    /**
     * 获取streamRtspPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamRtspPort() {
        return streamRtspPort;
    }

    /**
     * 设置streamRtspPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamRtspPort(String value) {
        this.streamRtspPort = value;
    }

    /**
     * 获取vagCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVagCode() {
        return vagCode;
    }

    /**
     * 设置vagCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVagCode(String value) {
        this.vagCode = value;
    }

}
