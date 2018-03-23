//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.03 时间 07:15:59 PM CST 
//


package org.tylor.hkp.client.bizModel.channel;

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
 *                                       &lt;element name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BaseChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BackChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PIPMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PipCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PicShowMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PipPosParaItems" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PipPosPara" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="PipChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="TopLeftX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="TopLeftY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
public class SetPipStatusRequest {

    @XmlElement(name = "DevId")
    protected String devId;
    @XmlElement(name = "DevIndexCode")
    protected String devIndexCode;
    @XmlElement(name = "Pack")
    protected SetPipStatusRequest.Pack pack;

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
     *     {@link SetPipStatusRequest.Pack }
     *
     */
    public SetPipStatusRequest.Pack getPack() {
        return pack;
    }

    /**
     * 设置pack属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link SetPipStatusRequest.Pack }
     *
     */
    public void setPack(SetPipStatusRequest.Pack value) {
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
     *                             &lt;element name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BaseChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BackChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PIPMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PipCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PicShowMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PipPosParaItems" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PipPosPara" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="PipChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="TopLeftX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="TopLeftY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected SetPipStatusRequest.Pack.PPVSPMessage ppvspMessage;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * 获取ppvspMessage属性的值。
         *
         * @return
         *     possible object is
         *     {@link SetPipStatusRequest.Pack.PPVSPMessage }
         *
         */
        public SetPipStatusRequest.Pack.PPVSPMessage getPPVSPMessage() {
            return ppvspMessage;
        }

        /**
         * 设置ppvspMessage属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link SetPipStatusRequest.Pack.PPVSPMessage }
         *
         */
        public void setPPVSPMessage(SetPipStatusRequest.Pack.PPVSPMessage value) {
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
         *                   &lt;element name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BaseChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BackChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PIPMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PipCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PicShowMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PipPosParaItems" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PipPosPara" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="PipChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="TopLeftX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="TopLeftY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            protected SetPipStatusRequest.Pack.PPVSPMessage.Params params;

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
             *     {@link SetPipStatusRequest.Pack.PPVSPMessage.Params }
             *
             */
            public SetPipStatusRequest.Pack.PPVSPMessage.Params getParams() {
                return params;
            }

            /**
             * 设置params属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link SetPipStatusRequest.Pack.PPVSPMessage.Params }
             *
             */
            public void setParams(SetPipStatusRequest.Pack.PPVSPMessage.Params value) {
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
             *         &lt;element name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BaseChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BackChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PIPMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PipCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PicShowMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PipPosParaItems" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PipPosPara" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="PipChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="TopLeftX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="TopLeftY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "roomIndex",
                "baseChan",
                "backChan",
                "pipMode",
                "pipCount",
                "picShowMode",
                "pipPosParaItems"
            })
            public static class Params {

                @XmlElement(name = "ConfigCmd")
                protected String configCmd;
                @XmlElement(name = "RoomIndex")
                protected String roomIndex;
                @XmlElement(name = "BaseChan")
                protected String baseChan;
                @XmlElement(name = "BackChan")
                protected String backChan;
                @XmlElement(name = "PIPMode")
                protected String pipMode;
                @XmlElement(name = "PipCount")
                protected String pipCount;
                @XmlElement(name = "PicShowMode")
                protected String picShowMode;
                @XmlElement(name = "PipPosParaItems")
                protected SetPipStatusRequest.Pack.PPVSPMessage.Params.PipPosParaItems pipPosParaItems;

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
                 * 获取roomIndex属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getRoomIndex() {
                    return roomIndex;
                }

                /**
                 * 设置roomIndex属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setRoomIndex(String value) {
                    this.roomIndex = value;
                }

                /**
                 * 获取baseChan属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBaseChan() {
                    return baseChan;
                }

                /**
                 * 设置baseChan属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBaseChan(String value) {
                    this.baseChan = value;
                }

                /**
                 * 获取backChan属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBackChan() {
                    return backChan;
                }

                /**
                 * 设置backChan属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBackChan(String value) {
                    this.backChan = value;
                }

                /**
                 * 获取pipMode属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getPIPMode() {
                    return pipMode;
                }

                /**
                 * 设置pipMode属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setPIPMode(String value) {
                    this.pipMode = value;
                }

                /**
                 * 获取pipCount属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getPipCount() {
                    return pipCount;
                }

                /**
                 * 设置pipCount属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setPipCount(String value) {
                    this.pipCount = value;
                }

                /**
                 * 获取picShowMode属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getPicShowMode() {
                    return picShowMode;
                }

                /**
                 * 设置picShowMode属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setPicShowMode(String value) {
                    this.picShowMode = value;
                }

                /**
                 * 获取pipPosParaItems属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link SetPipStatusRequest.Pack.PPVSPMessage.Params.PipPosParaItems }
                 *
                 */
                public SetPipStatusRequest.Pack.PPVSPMessage.Params.PipPosParaItems getPipPosParaItems() {
                    return pipPosParaItems;
                }

                /**
                 * 设置pipPosParaItems属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link SetPipStatusRequest.Pack.PPVSPMessage.Params.PipPosParaItems }
                 *
                 */
                public void setPipPosParaItems(SetPipStatusRequest.Pack.PPVSPMessage.Params.PipPosParaItems value) {
                    this.pipPosParaItems = value;
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
                 *         &lt;element name="PipPosPara" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="PipChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="TopLeftX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="TopLeftY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "pipPosPara"
                })
                public static class PipPosParaItems {

                    @XmlElement(name = "PipPosPara")
                    protected List<PipPosPara> pipPosPara;

                    /**
                     * Gets the value of the pipPosPara property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the pipPosPara property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPipPosPara().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link SetPipStatusRequest.Pack.PPVSPMessage.Params.PipPosParaItems.PipPosPara }
                     *
                     *
                     */
                    public List<PipPosPara> getPipPosPara() {
                        if (pipPosPara == null) {
                            pipPosPara = new ArrayList<PipPosPara>();
                        }
                        return this.pipPosPara;
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
                     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="PipChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="TopLeftX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="TopLeftY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "id",
                        "pipChan",
                        "topLeftX",
                        "topLeftY",
                        "height",
                        "width"
                    })
                    public static class PipPosPara {
                    	
                    	public PipPosPara(){
                    		
                    	}
                    	public PipPosPara(String id,String pipChan,String topLeftX,String topLeftY,String height,String width){
                    		this.id = id;
                    		this.pipChan = pipChan;
                    		this.topLeftX = topLeftX;
                    		this.topLeftY = topLeftY;
                    		this.height = height;
                    		this.width = width;
                    	}

                        @XmlElement(name = "Id")
                        protected String id;
                        @XmlElement(name = "PipChan")
                        protected String pipChan;
                        @XmlElement(name = "TopLeftX")
                        protected String topLeftX;
                        @XmlElement(name = "TopLeftY")
                        protected String topLeftY;
                        @XmlElement(name = "Height")
                        protected String height;
                        @XmlElement(name = "Width")
                        protected String width;

                        /**
                         * 获取id属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getId() {
                            return id;
                        }

                        /**
                         * 设置id属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setId(String value) {
                            this.id = value;
                        }

                        /**
                         * 获取pipChan属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPipChan() {
                            return pipChan;
                        }

                        /**
                         * 设置pipChan属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPipChan(String value) {
                            this.pipChan = value;
                        }

                        /**
                         * 获取topLeftX属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTopLeftX() {
                            return topLeftX;
                        }

                        /**
                         * 设置topLeftX属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTopLeftX(String value) {
                            this.topLeftX = value;
                        }

                        /**
                         * 获取topLeftY属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTopLeftY() {
                            return topLeftY;
                        }

                        /**
                         * 设置topLeftY属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTopLeftY(String value) {
                            this.topLeftY = value;
                        }

                        /**
                         * 获取height属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getHeight() {
                            return height;
                        }

                        /**
                         * 设置height属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setHeight(String value) {
                            this.height = value;
                        }

                        /**
                         * 获取width属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getWidth() {
                            return width;
                        }

                        /**
                         * 设置width属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setWidth(String value) {
                            this.width = value;
                        }

                    }

                }

            }

        }

    }

}
