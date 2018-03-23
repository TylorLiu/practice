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


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="local_ip" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="local_port" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="max_transmit" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="rtp_rtcp_port" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="rtsp_port" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="tcp_port_count" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="tcp_portbase" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="udp_port_count" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="udp_portbase" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "stream_other")
public class StreamOther {

    @XmlAttribute(name = "local_ip", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String localIp;
    @XmlAttribute(name = "local_port", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String localPort;
    @XmlAttribute(name = "max_transmit", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String maxTransmit;
    @XmlAttribute(name = "rtp_rtcp_port", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rtpRtcpPort;
    @XmlAttribute(name = "rtsp_port", required = true)
    protected String rtspPort;
    @XmlAttribute(name = "tcp_port_count", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String tcpPortCount;
    @XmlAttribute(name = "tcp_portbase", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String tcpPortbase;
    @XmlAttribute(name = "udp_port_count", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String udpPortCount;
    @XmlAttribute(name = "udp_portbase", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String udpPortbase;

    /**
     * 获取localIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalIp() {
        return localIp;
    }

    /**
     * 设置localIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalIp(String value) {
        this.localIp = value;
    }

    /**
     * 获取localPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPort() {
        return localPort;
    }

    /**
     * 设置localPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPort(String value) {
        this.localPort = value;
    }

    /**
     * 获取maxTransmit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxTransmit() {
        return maxTransmit;
    }

    /**
     * 设置maxTransmit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxTransmit(String value) {
        this.maxTransmit = value;
    }

    /**
     * 获取rtpRtcpPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtpRtcpPort() {
        return rtpRtcpPort;
    }

    /**
     * 设置rtpRtcpPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtpRtcpPort(String value) {
        this.rtpRtcpPort = value;
    }

    /**
     * 获取rtspPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getRtspPort() {
        return rtspPort;
    }

    /**
     * 设置rtspPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRtspPort(String value) {
        this.rtspPort = value;
    }

    /**
     * 获取tcpPortCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcpPortCount() {
        return tcpPortCount;
    }

    /**
     * 设置tcpPortCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcpPortCount(String value) {
        this.tcpPortCount = value;
    }

    /**
     * 获取tcpPortbase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcpPortbase() {
        return tcpPortbase;
    }

    /**
     * 设置tcpPortbase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcpPortbase(String value) {
        this.tcpPortbase = value;
    }

    /**
     * 获取udpPortCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdpPortCount() {
        return udpPortCount;
    }

    /**
     * 设置udpPortCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdpPortCount(String value) {
        this.udpPortCount = value;
    }

    /**
     * 获取udpPortbase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdpPortbase() {
        return udpPortbase;
    }

    /**
     * 设置udpPortbase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdpPortbase(String value) {
        this.udpPortbase = value;
    }

}
