//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.01 时间 12:13:13 PM CST 
//


package org.tylor.hkp.client.bizModel.device;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="Pack">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                   &lt;element name="Result">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Dev">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DevId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="DevIndexCode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                             &lt;element name="DevName" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                             &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DvrType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="VoiceDataType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="DevIp" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *                             &lt;element name="DevPort" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="AlarmInNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="AlarmOutNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="AudioNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="HardDiskNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="TalkChanStart" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="TalkChanCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="AnalogChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="DigitChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="StartChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="DigitStartChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="ZeroChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="MirrorChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="PosNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="LanguageType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="StartDTalkChan" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="MultiStreamProto" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AnalogChan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Chan" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MirrorChan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Chan" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ZeroChan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DigitChan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Chan" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="IpcAlarmInNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="IpcAlarmOutNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="AlarmInChan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Chan" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AlarmOutChan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Chan" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="ExtInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = {
    "pack"
})
@XmlRootElement(name = "Message")
public class GetDevInfoResponseMessage {

    @XmlElement(name = "Pack", required = true)
    protected GetDevInfoResponseMessage.Pack pack;

    /**
     * 获取pack属性的值。
     *
     * @return
     *     possible object is
     *     {@link GetDevInfoResponseMessage.Pack }
     *
     */
    public GetDevInfoResponseMessage.Pack getPack() {
        return pack;
    }

    /**
     * 设置pack属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link GetDevInfoResponseMessage.Pack }
     *
     */
    public void setPack(GetDevInfoResponseMessage.Pack value) {
        this.pack = value;
    }


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
     *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *         &lt;element name="Result">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Dev">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DevId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="DevIndexCode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *                   &lt;element name="DevName" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *                   &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DvrType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="VoiceDataType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="DevIp" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
     *                   &lt;element name="DevPort" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="AlarmInNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="AlarmOutNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="AudioNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="HardDiskNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="TalkChanStart" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="TalkChanCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="AnalogChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="DigitChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="StartChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="DigitStartChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="ZeroChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="MirrorChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="PosNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="LanguageType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="StartDTalkChan" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="MultiStreamProto" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AnalogChan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Chan" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MirrorChan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Chan" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ZeroChan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DigitChan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Chan" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="IpcAlarmInNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="IpcAlarmOutNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="AlarmInChan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Chan" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AlarmOutChan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Chan" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ExtInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "command",
        "result",
        "dev",
        "extInfo"
    })
    public static class Pack {

        @XmlElement(name = "Command", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String command;
        @XmlElement(name = "Result", required = true)
        protected GetDevInfoResponseMessage.Pack.Result result;
        @XmlElement(name = "Dev", required = true)
        protected GetDevInfoResponseMessage.Pack.Dev dev;
        @XmlElement(name = "ExtInfo", required = true)
        protected GetDevInfoResponseMessage.Pack.ExtInfo extInfo;
        @XmlAttribute(name = "type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String type;

        /**
         * 获取command属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCommand() {
            return command;
        }

        /**
         * 设置command属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCommand(String value) {
            this.command = value;
        }

        /**
         * 获取result属性的值。
         *
         * @return
         *     possible object is
         *     {@link GetDevInfoResponseMessage.Pack.Result }
         *
         */
        public GetDevInfoResponseMessage.Pack.Result getResult() {
            return result;
        }

        /**
         * 设置result属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link GetDevInfoResponseMessage.Pack.Result }
         *
         */
        public void setResult(GetDevInfoResponseMessage.Pack.Result value) {
            this.result = value;
        }

        /**
         * 获取dev属性的值。
         *
         * @return
         *     possible object is
         *     {@link GetDevInfoResponseMessage.Pack.Dev }
         *
         */
        public GetDevInfoResponseMessage.Pack.Dev getDev() {
            return dev;
        }

        /**
         * 设置dev属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link GetDevInfoResponseMessage.Pack.Dev }
         *
         */
        public void setDev(GetDevInfoResponseMessage.Pack.Dev value) {
            this.dev = value;
        }

        /**
         * 获取extInfo属性的值。
         *
         * @return
         *     possible object is
         *     {@link GetDevInfoResponseMessage.Pack.ExtInfo }
         *
         */
        public GetDevInfoResponseMessage.Pack.ExtInfo getExtInfo() {
            return extInfo;
        }

        /**
         * 设置extInfo属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link GetDevInfoResponseMessage.Pack.ExtInfo }
         *
         */
        public void setExtInfo(GetDevInfoResponseMessage.Pack.ExtInfo value) {
            this.extInfo = value;
        }

        /**
         * 获取type属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setType(String value) {
            this.type = value;
        }


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
         *         &lt;element name="DevId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="DevIndexCode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
         *         &lt;element name="DevName" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
         *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DvrType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="VoiceDataType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="DevIp" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
         *         &lt;element name="DevPort" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="AlarmInNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="AlarmOutNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="AudioNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="HardDiskNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="TalkChanStart" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="TalkChanCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="AnalogChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="DigitChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="StartChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="DigitStartChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="ZeroChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="MirrorChanNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="PosNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="LanguageType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="StartDTalkChan" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="MultiStreamProto" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AnalogChan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Chan" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MirrorChan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Chan" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ZeroChan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DigitChan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Chan" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="IpcAlarmInNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="IpcAlarmOutNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="AlarmInChan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Chan" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AlarmOutChan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Chan" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "devId",
            "devIndexCode",
            "devName",
            "serialNumber",
            "dvrType",
            "voiceDataType",
            "devIp",
            "devPort",
            "alarmInNum",
            "alarmOutNum",
            "audioNum",
            "hardDiskNum",
            "talkChanStart",
            "talkChanCount",
            "analogChanNum",
            "digitChanNum",
            "startChanNum",
            "digitStartChanNum",
            "zeroChanNum",
            "mirrorChanNum",
            "posNum",
            "languageType",
            "startDTalkChan",
            "multiStreamProto",
            "firmwareVersion",
            "analogChan",
            "mirrorChan",
            "zeroChan",
            "digitChan",
            "ipcAlarmInNum",
            "ipcAlarmOutNum",
            "alarmInChan",
            "alarmOutChan"
        })
        public static class Dev {

            @XmlElement(name = "DevId", required = true)
            protected Integer devId;
            @XmlElement(name = "DevIndexCode", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String devIndexCode;
            @XmlElement(name = "DevName", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String devName;
            @XmlElement(name = "SerialNumber", required = true)
            protected String serialNumber;
            @XmlElement(name = "DvrType", required = true)
            protected Integer dvrType;
            @XmlElement(name = "VoiceDataType", required = true)
            protected Integer voiceDataType;
            @XmlElement(name = "DevIp", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NMTOKEN")
            protected String devIp;
            @XmlElement(name = "DevPort", required = true)
            protected Integer devPort;
            @XmlElement(name = "AlarmInNum", required = true)
            protected Integer alarmInNum;
            @XmlElement(name = "AlarmOutNum", required = true)
            protected Integer alarmOutNum;
            @XmlElement(name = "AudioNum", required = true)
            protected Integer audioNum;
            @XmlElement(name = "HardDiskNum", required = true)
            protected Integer hardDiskNum;
            @XmlElement(name = "TalkChanStart", required = true)
            protected Integer talkChanStart;
            @XmlElement(name = "TalkChanCount", required = true)
            protected Integer talkChanCount;
            @XmlElement(name = "AnalogChanNum", required = true)
            protected Integer analogChanNum;
            @XmlElement(name = "DigitChanNum", required = true)
            protected Integer digitChanNum;
            @XmlElement(name = "StartChanNum", required = true)
            protected Integer startChanNum;
            @XmlElement(name = "DigitStartChanNum", required = true)
            protected Integer digitStartChanNum;
            @XmlElement(name = "ZeroChanNum", required = true)
            protected Integer zeroChanNum;
            @XmlElement(name = "MirrorChanNum", required = true)
            protected Integer mirrorChanNum;
            @XmlElement(name = "PosNum", required = true)
            protected Integer posNum;
            @XmlElement(name = "LanguageType", required = true)
            protected Integer languageType;
            @XmlElement(name = "StartDTalkChan", required = true)
            protected Integer startDTalkChan;
            @XmlElement(name = "MultiStreamProto", required = true)
            protected Integer multiStreamProto;
            @XmlElement(name = "FirmwareVersion", required = true)
            protected String firmwareVersion;
            @XmlElement(name = "AnalogChan", required = true)
            protected GetDevInfoResponseMessage.Pack.Dev.AnalogChan analogChan;
            @XmlElement(name = "MirrorChan", required = true)
            protected GetDevInfoResponseMessage.Pack.Dev.MirrorChan mirrorChan;
            @XmlElement(name = "ZeroChan", required = true)
            protected GetDevInfoResponseMessage.Pack.Dev.ZeroChan zeroChan;
            @XmlElement(name = "DigitChan", required = true)
            protected GetDevInfoResponseMessage.Pack.Dev.DigitChan digitChan;
            @XmlElement(name = "IpcAlarmInNum", required = true)
            protected Integer ipcAlarmInNum;
            @XmlElement(name = "IpcAlarmOutNum", required = true)
            protected Integer ipcAlarmOutNum;
            @XmlElement(name = "AlarmInChan", required = true)
            protected GetDevInfoResponseMessage.Pack.Dev.AlarmInChan alarmInChan;
            @XmlElement(name = "AlarmOutChan", required = true)
            protected GetDevInfoResponseMessage.Pack.Dev.AlarmOutChan alarmOutChan;

            /**
             * 获取devId属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getDevId() {
                return devId;
            }

            /**
             * 设置devId属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setDevId(Integer value) {
                this.devId = value;
            }

            /**
             * 获取devIndexCode属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDevIndexCode() {
                return devIndexCode;
            }

            /**
             * 设置devIndexCode属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDevIndexCode(String value) {
                this.devIndexCode = value;
            }

            /**
             * 获取devName属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDevName() {
                return devName;
            }

            /**
             * 设置devName属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDevName(String value) {
                this.devName = value;
            }

            /**
             * 获取serialNumber属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSerialNumber() {
                return serialNumber;
            }

            /**
             * 设置serialNumber属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSerialNumber(String value) {
                this.serialNumber = value;
            }

            /**
             * 获取dvrType属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getDvrType() {
                return dvrType;
            }

            /**
             * 设置dvrType属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setDvrType(Integer value) {
                this.dvrType = value;
            }

            /**
             * 获取voiceDataType属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getVoiceDataType() {
                return voiceDataType;
            }

            /**
             * 设置voiceDataType属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setVoiceDataType(Integer value) {
                this.voiceDataType = value;
            }

            /**
             * 获取devIp属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDevIp() {
                return devIp;
            }

            /**
             * 设置devIp属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDevIp(String value) {
                this.devIp = value;
            }

            /**
             * 获取devPort属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getDevPort() {
                return devPort;
            }

            /**
             * 设置devPort属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setDevPort(Integer value) {
                this.devPort = value;
            }

            /**
             * 获取alarmInNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getAlarmInNum() {
                return alarmInNum;
            }

            /**
             * 设置alarmInNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setAlarmInNum(Integer value) {
                this.alarmInNum = value;
            }

            /**
             * 获取alarmOutNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getAlarmOutNum() {
                return alarmOutNum;
            }

            /**
             * 设置alarmOutNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setAlarmOutNum(Integer value) {
                this.alarmOutNum = value;
            }

            /**
             * 获取audioNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getAudioNum() {
                return audioNum;
            }

            /**
             * 设置audioNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setAudioNum(Integer value) {
                this.audioNum = value;
            }

            /**
             * 获取hardDiskNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getHardDiskNum() {
                return hardDiskNum;
            }

            /**
             * 设置hardDiskNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setHardDiskNum(Integer value) {
                this.hardDiskNum = value;
            }

            /**
             * 获取talkChanStart属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getTalkChanStart() {
                return talkChanStart;
            }

            /**
             * 设置talkChanStart属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setTalkChanStart(Integer value) {
                this.talkChanStart = value;
            }

            /**
             * 获取talkChanCount属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getTalkChanCount() {
                return talkChanCount;
            }

            /**
             * 设置talkChanCount属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setTalkChanCount(Integer value) {
                this.talkChanCount = value;
            }

            /**
             * 获取analogChanNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getAnalogChanNum() {
                return analogChanNum;
            }

            /**
             * 设置analogChanNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setAnalogChanNum(Integer value) {
                this.analogChanNum = value;
            }

            /**
             * 获取digitChanNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getDigitChanNum() {
                return digitChanNum;
            }

            /**
             * 设置digitChanNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setDigitChanNum(Integer value) {
                this.digitChanNum = value;
            }

            /**
             * 获取startChanNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getStartChanNum() {
                return startChanNum;
            }

            /**
             * 设置startChanNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setStartChanNum(Integer value) {
                this.startChanNum = value;
            }

            /**
             * 获取digitStartChanNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getDigitStartChanNum() {
                return digitStartChanNum;
            }

            /**
             * 设置digitStartChanNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setDigitStartChanNum(Integer value) {
                this.digitStartChanNum = value;
            }

            /**
             * 获取zeroChanNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getZeroChanNum() {
                return zeroChanNum;
            }

            /**
             * 设置zeroChanNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setZeroChanNum(Integer value) {
                this.zeroChanNum = value;
            }

            /**
             * 获取mirrorChanNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getMirrorChanNum() {
                return mirrorChanNum;
            }

            /**
             * 设置mirrorChanNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setMirrorChanNum(Integer value) {
                this.mirrorChanNum = value;
            }

            /**
             * 获取posNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getPosNum() {
                return posNum;
            }

            /**
             * 设置posNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setPosNum(Integer value) {
                this.posNum = value;
            }

            /**
             * 获取languageType属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getLanguageType() {
                return languageType;
            }

            /**
             * 设置languageType属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setLanguageType(Integer value) {
                this.languageType = value;
            }

            /**
             * 获取startDTalkChan属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getStartDTalkChan() {
                return startDTalkChan;
            }

            /**
             * 设置startDTalkChan属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setStartDTalkChan(Integer value) {
                this.startDTalkChan = value;
            }

            /**
             * 获取multiStreamProto属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getMultiStreamProto() {
                return multiStreamProto;
            }

            /**
             * 设置multiStreamProto属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setMultiStreamProto(Integer value) {
                this.multiStreamProto = value;
            }

            /**
             * 获取firmwareVersion属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFirmwareVersion() {
                return firmwareVersion;
            }

            /**
             * 设置firmwareVersion属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFirmwareVersion(String value) {
                this.firmwareVersion = value;
            }

            /**
             * 获取analogChan属性的值。
             *
             * @return
             *     possible object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.AnalogChan }
             *
             */
            public GetDevInfoResponseMessage.Pack.Dev.AnalogChan getAnalogChan() {
                return analogChan;
            }

            /**
             * 设置analogChan属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.AnalogChan }
             *
             */
            public void setAnalogChan(GetDevInfoResponseMessage.Pack.Dev.AnalogChan value) {
                this.analogChan = value;
            }

            /**
             * 获取mirrorChan属性的值。
             *
             * @return
             *     possible object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.MirrorChan }
             *
             */
            public GetDevInfoResponseMessage.Pack.Dev.MirrorChan getMirrorChan() {
                return mirrorChan;
            }

            /**
             * 设置mirrorChan属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.MirrorChan }
             *
             */
            public void setMirrorChan(GetDevInfoResponseMessage.Pack.Dev.MirrorChan value) {
                this.mirrorChan = value;
            }

            /**
             * 获取zeroChan属性的值。
             *
             * @return
             *     possible object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.ZeroChan }
             *
             */
            public GetDevInfoResponseMessage.Pack.Dev.ZeroChan getZeroChan() {
                return zeroChan;
            }

            /**
             * 设置zeroChan属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.ZeroChan }
             *
             */
            public void setZeroChan(GetDevInfoResponseMessage.Pack.Dev.ZeroChan value) {
                this.zeroChan = value;
            }

            /**
             * 获取digitChan属性的值。
             *
             * @return
             *     possible object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.DigitChan }
             *
             */
            public GetDevInfoResponseMessage.Pack.Dev.DigitChan getDigitChan() {
                return digitChan;
            }

            /**
             * 设置digitChan属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.DigitChan }
             *
             */
            public void setDigitChan(GetDevInfoResponseMessage.Pack.Dev.DigitChan value) {
                this.digitChan = value;
            }

            /**
             * 获取ipcAlarmInNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getIpcAlarmInNum() {
                return ipcAlarmInNum;
            }

            /**
             * 设置ipcAlarmInNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setIpcAlarmInNum(Integer value) {
                this.ipcAlarmInNum = value;
            }

            /**
             * 获取ipcAlarmOutNum属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getIpcAlarmOutNum() {
                return ipcAlarmOutNum;
            }

            /**
             * 设置ipcAlarmOutNum属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setIpcAlarmOutNum(Integer value) {
                this.ipcAlarmOutNum = value;
            }

            /**
             * 获取alarmInChan属性的值。
             *
             * @return
             *     possible object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.AlarmInChan }
             *
             */
            public GetDevInfoResponseMessage.Pack.Dev.AlarmInChan getAlarmInChan() {
                return alarmInChan;
            }

            /**
             * 设置alarmInChan属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.AlarmInChan }
             *
             */
            public void setAlarmInChan(GetDevInfoResponseMessage.Pack.Dev.AlarmInChan value) {
                this.alarmInChan = value;
            }

            /**
             * 获取alarmOutChan属性的值。
             *
             * @return
             *     possible object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.AlarmOutChan }
             *
             */
            public GetDevInfoResponseMessage.Pack.Dev.AlarmOutChan getAlarmOutChan() {
                return alarmOutChan;
            }

            /**
             * 设置alarmOutChan属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link GetDevInfoResponseMessage.Pack.Dev.AlarmOutChan }
             *
             */
            public void setAlarmOutChan(GetDevInfoResponseMessage.Pack.Dev.AlarmOutChan value) {
                this.alarmOutChan = value;
            }


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
             *         &lt;element name="Chan" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            @XmlType(name = "", propOrder = {
                "chan"
            })
            public static class AlarmInChan {

                @XmlElement(name = "Chan", required = true)
                protected List<Chan> chan;

                /**
                 * Gets the value of the chan property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the chan property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChan().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GetDevInfoResponseMessage.Pack.Dev.AlarmInChan.Chan }
                 *
                 *
                 */
                public List<Chan> getChan() {
                    if (chan == null) {
                        chan = new ArrayList<Chan>();
                    }
                    return this.chan;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 *
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Chan {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "IPTalkChanId")
                    protected Integer ipTalkChanId;
                    @XmlAttribute(name = "enable", required = true)
                    protected Integer enable;
                    @XmlAttribute(name = "id", required = true)
                    protected Integer id;
                    @XmlAttribute(name = "indexcode", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String indexcode;
                    @XmlAttribute(name = "ipid")
                    protected Integer ipid;
                    @XmlAttribute(name = "ipv4")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String ipv4;
                    @XmlAttribute(name = "multistreamproto")
                    protected Integer multistreamproto;
                    @XmlAttribute(name = "type")
                    protected Integer type;

                    /**
                     * 获取content属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * 设置content属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * 获取ipTalkChanId属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getIPTalkChanId() {
                        return ipTalkChanId;
                    }

                    /**
                     * 设置ipTalkChanId属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setIPTalkChanId(Integer value) {
                        this.ipTalkChanId = value;
                    }

                    /**
                     * 获取enable属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getEnable() {
                        return enable;
                    }

                    /**
                     * 设置enable属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setEnable(Integer value) {
                        this.enable = value;
                    }

                    /**
                     * 获取id属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getId() {
                        return id;
                    }

                    /**
                     * 设置id属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setId(Integer value) {
                        this.id = value;
                    }

                    /**
                     * 获取indexcode属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIndexcode() {
                        return indexcode;
                    }

                    /**
                     * 设置indexcode属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIndexcode(String value) {
                        this.indexcode = value;
                    }

                    /**
                     * 获取ipid属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getIpid() {
                        return ipid;
                    }

                    /**
                     * 设置ipid属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setIpid(Integer value) {
                        this.ipid = value;
                    }

                    /**
                     * 获取ipv4属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIpv4() {
                        return ipv4;
                    }

                    /**
                     * 设置ipv4属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIpv4(String value) {
                        this.ipv4 = value;
                    }

                    /**
                     * 获取multistreamproto属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getMultistreamproto() {
                        return multistreamproto;
                    }

                    /**
                     * 设置multistreamproto属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setMultistreamproto(Integer value) {
                        this.multistreamproto = value;
                    }

                    /**
                     * 获取type属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getType() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setType(Integer value) {
                        this.type = value;
                    }

                }

            }


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
             *         &lt;element name="Chan" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            @XmlType(name = "", propOrder = {
                "chan"
            })
            public static class AlarmOutChan {

                @XmlElement(name = "Chan", required = true)
                protected List<Chan> chan;

                /**
                 * Gets the value of the chan property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the chan property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChan().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GetDevInfoResponseMessage.Pack.Dev.AlarmOutChan.Chan }
                 *
                 *
                 */
                public List<Chan> getChan() {
                    if (chan == null) {
                        chan = new ArrayList<Chan>();
                    }
                    return this.chan;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 *
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Chan {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "IPTalkChanId")
                    protected Integer ipTalkChanId;
                    @XmlAttribute(name = "enable", required = true)
                    protected Integer enable;
                    @XmlAttribute(name = "id", required = true)
                    protected Integer id;
                    @XmlAttribute(name = "indexcode", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String indexcode;
                    @XmlAttribute(name = "ipid")
                    protected Integer ipid;
                    @XmlAttribute(name = "ipv4")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String ipv4;
                    @XmlAttribute(name = "multistreamproto")
                    protected Integer multistreamproto;
                    @XmlAttribute(name = "type")
                    protected Integer type;

                    /**
                     * 获取content属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * 设置content属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * 获取ipTalkChanId属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getIPTalkChanId() {
                        return ipTalkChanId;
                    }

                    /**
                     * 设置ipTalkChanId属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setIPTalkChanId(Integer value) {
                        this.ipTalkChanId = value;
                    }

                    /**
                     * 获取enable属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getEnable() {
                        return enable;
                    }

                    /**
                     * 设置enable属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setEnable(Integer value) {
                        this.enable = value;
                    }

                    /**
                     * 获取id属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getId() {
                        return id;
                    }

                    /**
                     * 设置id属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setId(Integer value) {
                        this.id = value;
                    }

                    /**
                     * 获取indexcode属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIndexcode() {
                        return indexcode;
                    }

                    /**
                     * 设置indexcode属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIndexcode(String value) {
                        this.indexcode = value;
                    }

                    /**
                     * 获取ipid属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getIpid() {
                        return ipid;
                    }

                    /**
                     * 设置ipid属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setIpid(Integer value) {
                        this.ipid = value;
                    }

                    /**
                     * 获取ipv4属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIpv4() {
                        return ipv4;
                    }

                    /**
                     * 设置ipv4属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIpv4(String value) {
                        this.ipv4 = value;
                    }

                    /**
                     * 获取multistreamproto属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getMultistreamproto() {
                        return multistreamproto;
                    }

                    /**
                     * 设置multistreamproto属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setMultistreamproto(Integer value) {
                        this.multistreamproto = value;
                    }

                    /**
                     * 获取type属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getType() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setType(Integer value) {
                        this.type = value;
                    }

                }

            }


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
             *         &lt;element name="Chan" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            @XmlType(name = "", propOrder = {
                "chan"
            })
            public static class AnalogChan {

                @XmlElement(name = "Chan", required = true)
                protected List<Chan> chan;

                /**
                 * Gets the value of the chan property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the chan property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChan().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GetDevInfoResponseMessage.Pack.Dev.AnalogChan.Chan }
                 *
                 *
                 */
                public List<Chan> getChan() {
                    if (chan == null) {
                        chan = new ArrayList<Chan>();
                    }
                    return this.chan;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 *
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Chan {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "IPTalkChanId")
                    protected Integer ipTalkChanId;
                    @XmlAttribute(name = "enable", required = true)
                    protected Integer enable;
                    @XmlAttribute(name = "id", required = true)
                    protected Integer id;
                    @XmlAttribute(name = "indexcode", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String indexcode;
                    @XmlAttribute(name = "ipid")
                    protected Integer ipid;
                    @XmlAttribute(name = "ipv4")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String ipv4;
                    @XmlAttribute(name = "multistreamproto")
                    protected Integer multistreamproto;
                    @XmlAttribute(name = "type")
                    protected Integer type;

                    /**
                     * 获取content属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * 设置content属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * 获取ipTalkChanId属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getIPTalkChanId() {
                        return ipTalkChanId;
                    }

                    /**
                     * 设置ipTalkChanId属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setIPTalkChanId(Integer value) {
                        this.ipTalkChanId = value;
                    }

                    /**
                     * 获取enable属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getEnable() {
                        return enable;
                    }

                    /**
                     * 设置enable属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setEnable(Integer value) {
                        this.enable = value;
                    }

                    /**
                     * 获取id属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getId() {
                        return id;
                    }

                    /**
                     * 设置id属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setId(Integer value) {
                        this.id = value;
                    }

                    /**
                     * 获取indexcode属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIndexcode() {
                        return indexcode;
                    }

                    /**
                     * 设置indexcode属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIndexcode(String value) {
                        this.indexcode = value;
                    }

                    /**
                     * 获取ipid属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getIpid() {
                        return ipid;
                    }

                    /**
                     * 设置ipid属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setIpid(Integer value) {
                        this.ipid = value;
                    }

                    /**
                     * 获取ipv4属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIpv4() {
                        return ipv4;
                    }

                    /**
                     * 设置ipv4属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIpv4(String value) {
                        this.ipv4 = value;
                    }

                    /**
                     * 获取multistreamproto属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getMultistreamproto() {
                        return multistreamproto;
                    }

                    /**
                     * 设置multistreamproto属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setMultistreamproto(Integer value) {
                        this.multistreamproto = value;
                    }

                    /**
                     * 获取type属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getType() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setType(Integer value) {
                        this.type = value;
                    }

                }

            }


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
             *         &lt;element name="Chan" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            @XmlType(name = "", propOrder = {
                "chan"
            })
            public static class DigitChan {

                @XmlElement(name = "Chan", required = true)
                protected List<Chan> chan;

                /**
                 * Gets the value of the chan property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the chan property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChan().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GetDevInfoResponseMessage.Pack.Dev.DigitChan.Chan }
                 *
                 *
                 */
                public List<Chan> getChan() {
                    if (chan == null) {
                        chan = new ArrayList<Chan>();
                    }
                    return this.chan;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 *
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Chan {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "IPTalkChanId")
                    protected Integer ipTalkChanId;
                    @XmlAttribute(name = "enable", required = true)
                    protected Integer enable;
                    @XmlAttribute(name = "id", required = true)
                    protected Integer id;
                    @XmlAttribute(name = "indexcode", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String indexcode;
                    @XmlAttribute(name = "ipid")
                    protected Integer ipid;
                    @XmlAttribute(name = "ipv4")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String ipv4;
                    @XmlAttribute(name = "multistreamproto")
                    protected Integer multistreamproto;
                    @XmlAttribute(name = "type")
                    protected Integer type;

                    /**
                     * 获取content属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * 设置content属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * 获取ipTalkChanId属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getIPTalkChanId() {
                        return ipTalkChanId;
                    }

                    /**
                     * 设置ipTalkChanId属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setIPTalkChanId(Integer value) {
                        this.ipTalkChanId = value;
                    }

                    /**
                     * 获取enable属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getEnable() {
                        return enable;
                    }

                    /**
                     * 设置enable属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setEnable(Integer value) {
                        this.enable = value;
                    }

                    /**
                     * 获取id属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getId() {
                        return id;
                    }

                    /**
                     * 设置id属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setId(Integer value) {
                        this.id = value;
                    }

                    /**
                     * 获取indexcode属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIndexcode() {
                        return indexcode;
                    }

                    /**
                     * 设置indexcode属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIndexcode(String value) {
                        this.indexcode = value;
                    }

                    /**
                     * 获取ipid属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getIpid() {
                        return ipid;
                    }

                    /**
                     * 设置ipid属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setIpid(Integer value) {
                        this.ipid = value;
                    }

                    /**
                     * 获取ipv4属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIpv4() {
                        return ipv4;
                    }

                    /**
                     * 设置ipv4属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIpv4(String value) {
                        this.ipv4 = value;
                    }

                    /**
                     * 获取multistreamproto属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getMultistreamproto() {
                        return multistreamproto;
                    }

                    /**
                     * 设置multistreamproto属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setMultistreamproto(Integer value) {
                        this.multistreamproto = value;
                    }

                    /**
                     * 获取type属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getType() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setType(Integer value) {
                        this.type = value;
                    }

                }

            }


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
             *         &lt;element name="Chan" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            @XmlType(name = "", propOrder = {
                "chan"
            })
            public static class MirrorChan {

                @XmlElement(name = "Chan", required = true)
                protected List<Chan> chan;

                /**
                 * Gets the value of the chan property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the chan property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChan().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GetDevInfoResponseMessage.Pack.Dev.MirrorChan.Chan }
                 *
                 *
                 */
                public List<Chan> getChan() {
                    if (chan == null) {
                        chan = new ArrayList<Chan>();
                    }
                    return this.chan;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="IPTalkChanId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="enable" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="indexcode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="ipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="ipv4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="multistreamproto" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Chan {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "IPTalkChanId")
                    protected Integer ipTalkChanId;
                    @XmlAttribute(name = "enable", required = true)
                    protected Integer enable;
                    @XmlAttribute(name = "id", required = true)
                    protected Integer id;
                    @XmlAttribute(name = "indexcode", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String indexcode;
                    @XmlAttribute(name = "ipid")
                    protected Integer ipid;
                    @XmlAttribute(name = "ipv4")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String ipv4;
                    @XmlAttribute(name = "multistreamproto")
                    protected Integer multistreamproto;
                    @XmlAttribute(name = "type")
                    protected Integer type;

                    /**
                     * 获取content属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * 设置content属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * 获取ipTalkChanId属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getIPTalkChanId() {
                        return ipTalkChanId;
                    }

                    /**
                     * 设置ipTalkChanId属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setIPTalkChanId(Integer value) {
                        this.ipTalkChanId = value;
                    }

                    /**
                     * 获取enable属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getEnable() {
                        return enable;
                    }

                    /**
                     * 设置enable属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setEnable(Integer value) {
                        this.enable = value;
                    }

                    /**
                     * 获取id属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getId() {
                        return id;
                    }

                    /**
                     * 设置id属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setId(Integer value) {
                        this.id = value;
                    }

                    /**
                     * 获取indexcode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIndexcode() {
                        return indexcode;
                    }

                    /**
                     * 设置indexcode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIndexcode(String value) {
                        this.indexcode = value;
                    }

                    /**
                     * 获取ipid属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getIpid() {
                        return ipid;
                    }

                    /**
                     * 设置ipid属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setIpid(Integer value) {
                        this.ipid = value;
                    }

                    /**
                     * 获取ipv4属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIpv4() {
                        return ipv4;
                    }

                    /**
                     * 设置ipv4属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIpv4(String value) {
                        this.ipv4 = value;
                    }

                    /**
                     * 获取multistreamproto属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getMultistreamproto() {
                        return multistreamproto;
                    }

                    /**
                     * 设置multistreamproto属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setMultistreamproto(Integer value) {
                        this.multistreamproto = value;
                    }

                    /**
                     * 获取type属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getType() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setType(Integer value) {
                        this.type = value;
                    }

                }

            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ZeroChan {


            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExtInfo {


        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Result {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String value;
            @XmlAttribute(name = "id", required = true)
            protected Integer id;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * 获取id属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getId() {
                return id;
            }

            /**
             * 设置id属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setId(Integer value) {
                this.id = value;
            }

        }

    }

}
