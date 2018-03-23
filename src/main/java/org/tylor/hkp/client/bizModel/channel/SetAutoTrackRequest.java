package org.tylor.hkp.client.bizModel.channel;

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.02 时间 08:48:59 PM CST 
//


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="DevId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DevIndexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pack" minOccurs="0">
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
 *                             &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Params" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CameraType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SDIChanItems" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SDIChanConfig" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="SDIIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ProType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ZeroChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="DVRIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="DVRPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Online" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="TransProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="DirectLastTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ChanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
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
    "pack"
})
@XmlRootElement(name = "Message")
public class SetAutoTrackRequest {

    @XmlElement(name = "DevId")
    protected String devId;
    @XmlElement(name = "DevIndexCode")
    protected String devIndexCode;
    @XmlElement(name = "Pack")
    protected SetAutoTrackRequest.Pack pack;

    /**
     * 获取devId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDevId() {
        return devId;
    }

    /**
     * 设置devId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDevId(String value) {
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
     * 获取pack属性的值。
     *
     * @return
     *     possible object is
     *     {@link SetAutoTrackRequest.Pack }
     *
     */
    public SetAutoTrackRequest.Pack getPack() {
        return pack;
    }

    /**
     * 设置pack属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link SetAutoTrackRequest.Pack }
     *
     */
    public void setPack(SetAutoTrackRequest.Pack value) {
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
     *         &lt;element name="PPVSPMessage" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Params" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CameraType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SDIChanItems" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SDIChanConfig" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="SDIIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ProType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ZeroChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="DVRIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="DVRPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Online" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="TransProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="DirectLastTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ChanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected SetAutoTrackRequest.Pack.PPVSPMessage ppvspMessage;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * 获取ppvspMessage属性的值。
         *
         * @return
         *     possible object is
         *     {@link SetAutoTrackRequest.Pack.PPVSPMessage }
         *
         */
        public SetAutoTrackRequest.Pack.PPVSPMessage getPPVSPMessage() {
            return ppvspMessage;
        }

        /**
         * 设置ppvspMessage属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link SetAutoTrackRequest.Pack.PPVSPMessage }
         *
         */
        public void setPPVSPMessage(SetAutoTrackRequest.Pack.PPVSPMessage value) {
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
         *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Params" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CameraType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SDIChanItems" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SDIChanConfig" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="SDIIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ProType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ZeroChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="DVRIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="DVRPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Online" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="TransProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="DirectLastTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ChanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "command",
            "params"
        })
        public static class PPVSPMessage {

            @XmlElement(name = "Version")
            protected String version;
            @XmlElement(name = "Sequence")
            protected String sequence;
            @XmlElement(name = "CommandType")
            protected String commandType;
            @XmlElement(name = "Command")
            protected String command;
            @XmlElement(name = "Params")
            protected SetAutoTrackRequest.Pack.PPVSPMessage.Params params;

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
             * 获取params属性的值。
             *
             * @return
             *     possible object is
             *     {@link SetAutoTrackRequest.Pack.PPVSPMessage.Params }
             *
             */
            public SetAutoTrackRequest.Pack.PPVSPMessage.Params getParams() {
                return params;
            }

            /**
             * 设置params属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link SetAutoTrackRequest.Pack.PPVSPMessage.Params }
             *
             */
            public void setParams(SetAutoTrackRequest.Pack.PPVSPMessage.Params value) {
                this.params = value;
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
             *         &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CameraType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SDIChanItems" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SDIChanConfig" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="SDIIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ProType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ZeroChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="DVRIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="DVRPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Online" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="TransProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="DirectLastTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ChanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "configCmd",
                "channel",
                "cameraType",
                "sdiChanItems"
            })
            public static class Params {

                @XmlElement(name = "ConfigCmd")
                protected String configCmd;
                @XmlElement(name = "Channel")
                protected String channel;
                @XmlElement(name = "CameraType")
                protected String cameraType;
                @XmlElement(name = "SDIChanItems")
                protected SetAutoTrackRequest.Pack.PPVSPMessage.Params.SDIChanItems sdiChanItems;

                /**
                 * 获取configCmd属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getConfigCmd() {
                    return configCmd;
                }

                /**
                 * 设置configCmd属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setConfigCmd(String value) {
                    this.configCmd = value;
                }

                /**
                 * 获取channel属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getChannel() {
                    return channel;
                }

                /**
                 * 设置channel属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setChannel(String value) {
                    this.channel = value;
                }

                /**
                 * 获取cameraType属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCameraType() {
                    return cameraType;
                }

                /**
                 * 设置cameraType属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCameraType(String value) {
                    this.cameraType = value;
                }

                /**
                 * 获取sdiChanItems属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link SetAutoTrackRequest.Pack.PPVSPMessage.Params.SDIChanItems }
                 *
                 */
                public SetAutoTrackRequest.Pack.PPVSPMessage.Params.SDIChanItems getSDIChanItems() {
                    return sdiChanItems;
                }

                /**
                 * 设置sdiChanItems属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link SetAutoTrackRequest.Pack.PPVSPMessage.Params.SDIChanItems }
                 *
                 */
                public void setSDIChanItems(SetAutoTrackRequest.Pack.PPVSPMessage.Params.SDIChanItems value) {
                    this.sdiChanItems = value;
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
                 *         &lt;element name="SDIChanConfig" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="SDIIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ProType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ZeroChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="DVRIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="DVRPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Online" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="TransProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="DirectLastTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ChanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "sdiChanConfig"
                })
                public static class SDIChanItems {

                    @XmlElement(name = "SDIChanConfig")
                    protected List<SDIChanConfig> sdiChanConfig;

                    /**
                     * Gets the value of the sdiChanConfig property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the sdiChanConfig property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSDIChanConfig().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link SetAutoTrackRequest.Pack.PPVSPMessage.Params.SDIChanItems.SDIChanConfig }
                     *
                     *
                     */
                    public List<SDIChanConfig> getSDIChanConfig() {
                        if (sdiChanConfig == null) {
                            sdiChanConfig = new ArrayList<SDIChanConfig>();
                        }
                        return this.sdiChanConfig;
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
                     *         &lt;element name="SDIIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ProType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ZeroChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="DVRIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="DVRPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Online" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="TransProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="DirectLastTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ChanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "sdiIndex",
                        "enable",
                        "proType",
                        "zeroChan",
                        "userName",
                        "password",
                        "domain",
                        "dvrip",
                        "dvrPort",
                        "streamType",
                        "online",
                        "channel",
                        "transProtocol",
                        "priority",
                        "directLastTime",
                        "chanNo"
                    })
                    public static class SDIChanConfig {

                        /**
						 * @return the sdiIndex
						 */
						public String getSdiIndex() {
							return sdiIndex;
						}

						/**
						 * @param sdiIndex the sdiIndex to set
						 */
						public void setSdiIndex(String sdiIndex) {
							this.sdiIndex = sdiIndex;
						}

						/**
						 * @return the dvrip
						 */
						public String getDvrip() {
							return dvrip;
						}

						/**
						 * @param dvrip the dvrip to set
						 */
						public void setDvrip(String dvrip) {
							this.dvrip = dvrip;
						}

						/**
						 * @return the dvrPort
						 */
						public String getDvrPort() {
							return dvrPort;
						}

						/**
						 * @param dvrPort the dvrPort to set
						 */
						public void setDvrPort(String dvrPort) {
							this.dvrPort = dvrPort;
						}

						@XmlElement(name = "SDIIndex")
                        protected String sdiIndex;
                        @XmlElement(name = "Enable")
                        protected String enable;
                        @XmlElement(name = "ProType")
                        protected String proType;
                        @XmlElement(name = "ZeroChan")
                        protected String zeroChan;
                        @XmlElement(name = "UserName")
                        protected String userName;
                        @XmlElement(name = "Password")
                        protected String password;
                        @XmlElement(name = "Domain")
                        protected String domain;
                        @XmlElement(name = "DVRIP")
                        protected String dvrip;
                        @XmlElement(name = "DVRPort")
                        protected String dvrPort;
                        @XmlElement(name = "StreamType")
                        protected String streamType;
                        @XmlElement(name = "Online")
                        protected String online;
                        @XmlElement(name = "Channel")
                        protected String channel;
                        @XmlElement(name = "TransProtocol")
                        protected String transProtocol;
                        @XmlElement(name = "Priority")
                        protected String priority;
                        @XmlElement(name = "DirectLastTime")
                        protected String directLastTime;
                        @XmlElement(name = "ChanNo")
                        protected String chanNo;

                        /**
                         * 获取sdiIndex属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSDIIndex() {
                            return sdiIndex;
                        }

                        /**
                         * 设置sdiIndex属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSDIIndex(String value) {
                            this.sdiIndex = value;
                        }

                        /**
                         * 获取enable属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEnable() {
                            return enable;
                        }

                        /**
                         * 设置enable属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEnable(String value) {
                            this.enable = value;
                        }

                        /**
                         * 获取proType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getProType() {
                            return proType;
                        }

                        /**
                         * 设置proType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setProType(String value) {
                            this.proType = value;
                        }

                        /**
                         * 获取zeroChan属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getZeroChan() {
                            return zeroChan;
                        }

                        /**
                         * 设置zeroChan属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setZeroChan(String value) {
                            this.zeroChan = value;
                        }

                        /**
                         * 获取userName属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUserName() {
                            return userName;
                        }

                        /**
                         * 设置userName属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUserName(String value) {
                            this.userName = value;
                        }

                        /**
                         * 获取password属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPassword() {
                            return password;
                        }

                        /**
                         * 设置password属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPassword(String value) {
                            this.password = value;
                        }

                        /**
                         * 获取domain属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDomain() {
                            return domain;
                        }

                        /**
                         * 设置domain属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDomain(String value) {
                            this.domain = value;
                        }

                        /**
                         * 获取dvrip属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDVRIP() {
                            return dvrip;
                        }

                        /**
                         * 设置dvrip属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDVRIP(String value) {
                            this.dvrip = value;
                        }

                        /**
                         * 获取dvrPort属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDVRPort() {
                            return dvrPort;
                        }

                        /**
                         * 设置dvrPort属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDVRPort(String value) {
                            this.dvrPort = value;
                        }

                        /**
                         * 获取streamType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getStreamType() {
                            return streamType;
                        }

                        /**
                         * 设置streamType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setStreamType(String value) {
                            this.streamType = value;
                        }

                        /**
                         * 获取online属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOnline() {
                            return online;
                        }

                        /**
                         * 设置online属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOnline(String value) {
                            this.online = value;
                        }

                        /**
                         * 获取channel属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getChannel() {
                            return channel;
                        }

                        /**
                         * 设置channel属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setChannel(String value) {
                            this.channel = value;
                        }

                        /**
                         * 获取transProtocol属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTransProtocol() {
                            return transProtocol;
                        }

                        /**
                         * 设置transProtocol属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTransProtocol(String value) {
                            this.transProtocol = value;
                        }

                        /**
                         * 获取priority属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPriority() {
                            return priority;
                        }

                        /**
                         * 设置priority属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPriority(String value) {
                            this.priority = value;
                        }

                        /**
                         * 获取directLastTime属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDirectLastTime() {
                            return directLastTime;
                        }

                        /**
                         * 设置directLastTime属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDirectLastTime(String value) {
                            this.directLastTime = value;
                        }

                        /**
                         * 获取chanNo属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getChanNo() {
                            return chanNo;
                        }

                        /**
                         * 设置chanNo属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setChanNo(String value) {
                            this.chanNo = value;
                        }

                    }

                }

            }

        }

    }

}
