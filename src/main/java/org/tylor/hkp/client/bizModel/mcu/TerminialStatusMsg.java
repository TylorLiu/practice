//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.30 时间 05:25:11 PM CST 
//


package org.tylor.hkp.client.bizModel.mcu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Pack">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PPVSPMessage" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WhichCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Params" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ConfigXML" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TerminialConferenceStatus" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="workStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="conferenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="videoInputNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="dualStreamEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="micPowerEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ConferenceInfo" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="conferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="stopTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="AudioStatus" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="mute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="audioInputDisabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="volume" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                             &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="audioInputVolume" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                             &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
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
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
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
public class TerminialStatusMsg {

    @XmlElement(name = "Pack")
    protected List<Pack> pack;

    /**
     * Gets the value of the pack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pack }
     * 
     * 
     */
    public List<Pack> getPack() {
        if (pack == null) {
            pack = new ArrayList<Pack>();
        }
        return this.pack;
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
     *         &lt;element name="PPVSPMessage" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WhichCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Params" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ConfigXML" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TerminialConferenceStatus" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="workStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="conferenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="videoInputNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="dualStreamEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="micPowerEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ConferenceInfo" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="conferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="stopTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="AudioStatus" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="mute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="audioInputDisabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="volume" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                   &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="audioInputVolume" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                   &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "ppvspMessage"
    })
    public static class Pack {

        @XmlElement(name = "PPVSPMessage")
        protected PPVSPMessage ppvspMessage;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * 获取ppvspMessage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PPVSPMessage }
         *     
         */
        public PPVSPMessage getPPVSPMessage() {
            return ppvspMessage;
        }

        /**
         * 设置ppvspMessage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PPVSPMessage }
         *     
         */
        public void setPPVSPMessage(PPVSPMessage value) {
            this.ppvspMessage = value;
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
         *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WhichCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Params" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ConfigXML" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TerminialConferenceStatus" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="workStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="conferenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="videoInputNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="dualStreamEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="micPowerEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ConferenceInfo" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="conferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="stopTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="AudioStatus" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="mute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="audioInputDisabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="volume" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                         &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="audioInputVolume" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                         &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "version",
            "sequence",
            "commandType",
            "whichCommand",
            "status",
            "description",
            "params"
        })
        public static class PPVSPMessage {

            @XmlElement(name = "Version")
            protected String version;
            @XmlElement(name = "Sequence")
            protected String sequence;
            @XmlElement(name = "CommandType")
            protected String commandType;
            @XmlElement(name = "WhichCommand")
            protected String whichCommand;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "Params")
            protected List<Params> params;

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

            /**
             * 获取sequence属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSequence() {
                return sequence;
            }

            /**
             * 设置sequence属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSequence(String value) {
                this.sequence = value;
            }

            /**
             * 获取commandType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommandType() {
                return commandType;
            }

            /**
             * 设置commandType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommandType(String value) {
                this.commandType = value;
            }

            /**
             * 获取whichCommand属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWhichCommand() {
                return whichCommand;
            }

            /**
             * 设置whichCommand属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWhichCommand(String value) {
                this.whichCommand = value;
            }

            /**
             * 获取status属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * 设置status属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the params property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the params property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParams().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Params }
             * 
             * 
             */
            public List<Params> getParams() {
                if (params == null) {
                    params = new ArrayList<Params>();
                }
                return this.params;
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
             *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ConfigXML" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TerminialConferenceStatus" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="workStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="conferenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="videoInputNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="dualStreamEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="micPowerEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ConferenceInfo" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="conferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="stopTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="AudioStatus" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="mute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="audioInputDisabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="volume" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                               &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="audioInputVolume" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                               &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "status",
                "configXML"
            })
            public static class Params {

                @XmlElement(name = "Status")
                protected String status;
                @XmlElement(name = "ConfigXML")
                protected ConfigXML configXML;

                /**
                 * 获取status属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * 设置status属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
                }

                /**
                 * 获取configXML属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConfigXML }
                 *     
                 */
                public ConfigXML getConfigXML() {
                    return configXML;
                }

                /**
                 * 设置configXML属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConfigXML }
                 *     
                 */
                public void setConfigXML(ConfigXML value) {
                    this.configXML = value;
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
                 *         &lt;element name="TerminialConferenceStatus" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="workStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="conferenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="videoInputNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="dualStreamEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="micPowerEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ConferenceInfo" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="conferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="stopTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="AudioStatus" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="mute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="audioInputDisabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="volume" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                     &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="audioInputVolume" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                     &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "terminialConferenceStatus"
                })
                public static class ConfigXML {

                    @XmlElement(name = "TerminialConferenceStatus")
                    protected TerminialConferenceStatus terminialConferenceStatus;

                    /**
                     * 获取terminialConferenceStatus属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link TerminialConferenceStatus }
                     *     
                     */
                    public TerminialConferenceStatus getTerminialConferenceStatus() {
                        return terminialConferenceStatus;
                    }

                    /**
                     * 设置terminialConferenceStatus属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TerminialConferenceStatus }
                     *     
                     */
                    public void setTerminialConferenceStatus(TerminialConferenceStatus value) {
                        this.terminialConferenceStatus = value;
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
                     *         &lt;element name="workStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="conferenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="videoInputNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="dualStreamEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="micPowerEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ConferenceInfo" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="conferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="stopTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="AudioStatus" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="mute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="audioInputDisabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="volume" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                           &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="audioInputVolume" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                           &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
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
                    @XmlType(name = "", propOrder = {
                        "workStatus",
                        "conferenceType",
                        "url",
                        "videoInputNo",
                        "dualStreamEnabled",
                        "micPowerEnabled",
                        "conferenceInfo",
                        "audioStatus"
                    })
                    public static class TerminialConferenceStatus {

                        protected String workStatus;
                        protected String conferenceType;
                        @XmlElement(name = "URL")
                        protected String url;
                        protected String videoInputNo;
                        protected String dualStreamEnabled;
                        protected String micPowerEnabled;
                        @XmlElement(name = "ConferenceInfo")
                        protected ConferenceInfo conferenceInfo;
                        @XmlElement(name = "AudioStatus")
                        protected AudioStatus audioStatus;
                        @XmlAttribute(name = "version")
                        protected String version;

                        /**
                         * 获取workStatus属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getWorkStatus() {
                            return workStatus;
                        }

                        /**
                         * 设置workStatus属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setWorkStatus(String value) {
                            this.workStatus = value;
                        }

                        /**
                         * 获取conferenceType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getConferenceType() {
                            return conferenceType;
                        }

                        /**
                         * 设置conferenceType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setConferenceType(String value) {
                            this.conferenceType = value;
                        }

                        /**
                         * 获取url属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getURL() {
                            return url;
                        }

                        /**
                         * 设置url属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setURL(String value) {
                            this.url = value;
                        }

                        /**
                         * 获取videoInputNo属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVideoInputNo() {
                            return videoInputNo;
                        }

                        /**
                         * 设置videoInputNo属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVideoInputNo(String value) {
                            this.videoInputNo = value;
                        }

                        /**
                         * 获取dualStreamEnabled属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDualStreamEnabled() {
                            return dualStreamEnabled;
                        }

                        /**
                         * 设置dualStreamEnabled属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDualStreamEnabled(String value) {
                            this.dualStreamEnabled = value;
                        }

                        /**
                         * 获取micPowerEnabled属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMicPowerEnabled() {
                            return micPowerEnabled;
                        }

                        /**
                         * 设置micPowerEnabled属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMicPowerEnabled(String value) {
                            this.micPowerEnabled = value;
                        }

                        /**
                         * 获取conferenceInfo属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link ConferenceInfo }
                         *     
                         */
                        public ConferenceInfo getConferenceInfo() {
                            return conferenceInfo;
                        }

                        /**
                         * 设置conferenceInfo属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ConferenceInfo }
                         *     
                         */
                        public void setConferenceInfo(ConferenceInfo value) {
                            this.conferenceInfo = value;
                        }

                        /**
                         * 获取audioStatus属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link AudioStatus }
                         *     
                         */
                        public AudioStatus getAudioStatus() {
                            return audioStatus;
                        }

                        /**
                         * 设置audioStatus属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AudioStatus }
                         *     
                         */
                        public void setAudioStatus(AudioStatus value) {
                            this.audioStatus = value;
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
                         *         &lt;element name="mute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="audioInputDisabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="volume" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="audioInputVolume" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
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
                            "mute",
                            "audioInputDisabled",
                            "volume",
                            "audioInputVolume"
                        })
                        public static class AudioStatus {

                            protected String mute;
                            protected String audioInputDisabled;
                            @XmlElementRef(name = "volume", type = JAXBElement.class, required = false)
                            protected JAXBElement<Volume> volume;
                            @XmlElementRef(name = "audioInputVolume", type = JAXBElement.class, required = false)
                            protected JAXBElement<AudioInputVolume> audioInputVolume;

                            /**
                             * 获取mute属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getMute() {
                                return mute;
                            }

                            /**
                             * 设置mute属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setMute(String value) {
                                this.mute = value;
                            }

                            /**
                             * 获取audioInputDisabled属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAudioInputDisabled() {
                                return audioInputDisabled;
                            }

                            /**
                             * 设置audioInputDisabled属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAudioInputDisabled(String value) {
                                this.audioInputDisabled = value;
                            }

                            /**
                             * 获取volume属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link Volume }{@code >}
                             *     
                             */
                            public JAXBElement<Volume> getVolume() {
                                return volume;
                            }

                            /**
                             * 设置volume属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link Volume }{@code >}
                             *     
                             */
                            public void setVolume(JAXBElement<Volume> value) {
                                this.volume = value;
                            }

                            /**
                             * 获取audioInputVolume属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link AudioInputVolume }{@code >}
                             *     
                             */
                            public JAXBElement<AudioInputVolume> getAudioInputVolume() {
                                return audioInputVolume;
                            }

                            /**
                             * 设置audioInputVolume属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link AudioInputVolume }{@code >}
                             *     
                             */
                            public void setAudioInputVolume(JAXBElement<AudioInputVolume> value) {
                                this.audioInputVolume = value;
                            }


                            /**
                             * <p>anonymous complex type的 Java 类。
                             * 
                             * <p>以下模式片段指定包含在此类中的预期内容。
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            public static class AudioInputVolume {

                                @XmlValue
                                protected String value;
                                @XmlAttribute(name = "min")
                                protected String min;
                                @XmlAttribute(name = "max")
                                protected String max;

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
                                 * 获取min属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMin() {
                                    return min;
                                }

                                /**
                                 * 设置min属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMin(String value) {
                                    this.min = value;
                                }

                                /**
                                 * 获取max属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMax() {
                                    return max;
                                }

                                /**
                                 * 设置max属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMax(String value) {
                                    this.max = value;
                                }

                            }


                            /**
                             * <p>anonymous complex type的 Java 类。
                             * 
                             * <p>以下模式片段指定包含在此类中的预期内容。
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            public static class Volume {

                                @XmlValue
                                protected String value;
                                @XmlAttribute(name = "min")
                                protected String min;
                                @XmlAttribute(name = "max")
                                protected String max;

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
                                 * 获取min属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMin() {
                                    return min;
                                }

                                /**
                                 * 设置min属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMin(String value) {
                                    this.min = value;
                                }

                                /**
                                 * 获取max属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMax() {
                                    return max;
                                }

                                /**
                                 * 设置max属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMax(String value) {
                                    this.max = value;
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
                         *         &lt;element name="conferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="stopTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                            "conferenceID",
                            "startTime",
                            "stopTime"
                        })
                        public static class ConferenceInfo {

                            protected String conferenceID;
                            protected String startTime;
                            protected String stopTime;

                            /**
                             * 获取conferenceID属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getConferenceID() {
                                return conferenceID;
                            }

                            /**
                             * 设置conferenceID属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setConferenceID(String value) {
                                this.conferenceID = value;
                            }

                            /**
                             * 获取startTime属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStartTime() {
                                return startTime;
                            }

                            /**
                             * 设置startTime属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStartTime(String value) {
                                this.startTime = value;
                            }

                            /**
                             * 获取stopTime属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStopTime() {
                                return stopTime;
                            }

                            /**
                             * 设置stopTime属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStopTime(String value) {
                                this.stopTime = value;
                            }

                        }

                    }

                }

            }

        }

    }

}
