//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.02 时间 08:34:10 PM CST 
//


package org.tylor.hkp.client.bizModel.channel;

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
 *                                       &lt;element name="ConfigParam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ConfigParam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ConfigXML" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="COMPRESSINFO" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="PicQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="BitRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="VideoBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="MaxBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="VideoFrameRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="IntervalBPFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="IntervalFrameI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
public class SetMultiStreamCompressionCfgRequest {

    @XmlElement(name = "DevId")
    protected String devId;
    @XmlElement(name = "DevIndexCode")
    protected String devIndexCode;
    @XmlElement(name = "Pack")
    protected SetMultiStreamCompressionCfgRequest.Pack pack;

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
     *     {@link SetMultiStreamCompressionCfgRequest.Pack }
     *
     */
    public SetMultiStreamCompressionCfgRequest.Pack getPack() {
        return pack;
    }

    /**
     * 设置pack属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link SetMultiStreamCompressionCfgRequest.Pack }
     *
     */
    public void setPack(SetMultiStreamCompressionCfgRequest.Pack value) {
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
     *                             &lt;element name="ConfigParam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ConfigParam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ConfigXML" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="COMPRESSINFO" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="PicQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="BitRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="VideoBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="MaxBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="VideoFrameRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="IntervalBPFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="IntervalFrameI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage ppvspMessage;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * 获取ppvspMessage属性的值。
         *
         * @return
         *     possible object is
         *     {@link SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage }
         *
         */
        public SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage getPPVSPMessage() {
            return ppvspMessage;
        }

        /**
         * 设置ppvspMessage属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage }
         *
         */
        public void setPPVSPMessage(SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage value) {
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
         *                   &lt;element name="ConfigParam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ConfigParam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ConfigXML" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="COMPRESSINFO" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="PicQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="BitRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="VideoBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="MaxBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="VideoFrameRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="IntervalBPFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="IntervalFrameI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            protected SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params params;

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
             *     {@link SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params }
             *
             */
            public SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params getParams() {
                return params;
            }

            /**
             * 设置params属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params }
             *
             */
            public void setParams(SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params value) {
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
             *         &lt;element name="ConfigParam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ConfigParam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ConfigXML" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="COMPRESSINFO" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="PicQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="BitRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="VideoBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="MaxBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="VideoFrameRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="IntervalBPFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="IntervalFrameI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "configParam1",
                "configParam2",
                "configXML"
            })
            public static class Params {

                @XmlElement(name = "ConfigCmd")
                protected String configCmd;
                @XmlElement(name = "ConfigParam1")
                protected String configParam1;
                @XmlElement(name = "ConfigParam2")
                protected String configParam2;
                @XmlElement(name = "ConfigXML")
                protected SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params.ConfigXML configXML;

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
                 * 获取configParam1属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getConfigParam1() {
                    return configParam1;
                }

                /**
                 * 设置configParam1属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setConfigParam1(String value) {
                    this.configParam1 = value;
                }

                /**
                 * 获取configParam2属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getConfigParam2() {
                    return configParam2;
                }

                /**
                 * 设置configParam2属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setConfigParam2(String value) {
                    this.configParam2 = value;
                }

                /**
                 * 获取configXML属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params.ConfigXML }
                 *
                 */
                public SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params.ConfigXML getConfigXML() {
                    return configXML;
                }

                /**
                 * 设置configXML属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params.ConfigXML }
                 *
                 */
                public void setConfigXML(SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params.ConfigXML value) {
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
                 *         &lt;element name="COMPRESSINFO" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="PicQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="BitRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="VideoBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="MaxBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="VideoFrameRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="IntervalBPFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="IntervalFrameI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "compressinfo"
                })
                public static class ConfigXML {

                    @XmlElement(name = "COMPRESSINFO")
                    protected SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params.ConfigXML.COMPRESSINFO compressinfo;

                    /**
                     * 获取compressinfo属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params.ConfigXML.COMPRESSINFO }
                     *
                     */
                    public SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params.ConfigXML.COMPRESSINFO getCOMPRESSINFO() {
                        return compressinfo;
                    }

                    /**
                     * 设置compressinfo属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params.ConfigXML.COMPRESSINFO }
                     *
                     */
                    public void setCOMPRESSINFO(SetMultiStreamCompressionCfgRequest.Pack.PPVSPMessage.Params.ConfigXML.COMPRESSINFO value) {
                        this.compressinfo = value;
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
                   *         &lt;element name="StreamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                   *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                   *         &lt;element name="PicQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                   *         &lt;element name="BitRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                   *         &lt;element name="VideoBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                   *         &lt;element name="MaxBitRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                   *         &lt;element name="VideoFrameRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                   *         &lt;element name="IntervalBPFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                   *         &lt;element name="IntervalFrameI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                   *         &lt;element name="VideoEncType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                   *         &lt;element name="AudioEncType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                      "streamType",
                      "resolution",
                      "picQuality",
                      "bitRateType",
                      "videoBitRate",
                      "maxBitRate",
                      "videoFrameRate",
                      "intervalBPFrame",
                      "intervalFrameI",
                      "videoEncType",
                      "audioEncType"
                  })
                  public static class COMPRESSINFO {

                    @XmlElement(name = "StreamType")
                    protected String streamType;
                    @XmlElement(name = "Resolution")
                    protected String resolution;
                    @XmlElement(name = "PicQuality")
                    protected String picQuality;
                    @XmlElement(name = "BitRateType")
                    protected String bitRateType;
                    @XmlElement(name = "VideoBitRate")
                    protected String videoBitRate;
                    @XmlElement(name = "MaxBitRate")
                    protected String maxBitRate;
                    @XmlElement(name = "VideoFrameRate")
                    protected String videoFrameRate;
                    @XmlElement(name = "IntervalBPFrame")
                    protected String intervalBPFrame;
                    @XmlElement(name = "IntervalFrameI")
                    protected String intervalFrameI;
                    @XmlElement(name = "VideoEncType")
                    protected String videoEncType;
                    @XmlElement(name = "AudioEncType")
                    protected String audioEncType;

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
                     * 获取resolution属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getResolution() {
                      return resolution;
                    }

                    /**
                     * 设置resolution属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setResolution(String value) {
                      this.resolution = value;
                    }

                    /**
                     * 获取picQuality属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPicQuality() {
                      return picQuality;
                    }

                    /**
                     * 设置picQuality属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPicQuality(String value) {
                      this.picQuality = value;
                    }

                    /**
                     * 获取bitRateType属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getBitRateType() {
                      return bitRateType;
                    }

                    /**
                     * 设置bitRateType属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setBitRateType(String value) {
                      this.bitRateType = value;
                    }

                    /**
                     * 获取videoBitRate属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getVideoBitRate() {
                      return videoBitRate;
                    }

                    /**
                     * 设置videoBitRate属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setVideoBitRate(String value) {
                      this.videoBitRate = value;
                    }

                    /**
                     * 获取maxBitRate属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getMaxBitRate() {
                      return maxBitRate;
                    }

                    /**
                     * 设置maxBitRate属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setMaxBitRate(String value) {
                      this.maxBitRate = value;
                    }

                    /**
                     * 获取videoFrameRate属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getVideoFrameRate() {
                      return videoFrameRate;
                    }

                    /**
                     * 设置videoFrameRate属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setVideoFrameRate(String value) {
                      this.videoFrameRate = value;
                    }

                    /**
                     * 获取intervalBPFrame属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIntervalBPFrame() {
                      return intervalBPFrame;
                    }

                    /**
                     * 设置intervalBPFrame属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIntervalBPFrame(String value) {
                      this.intervalBPFrame = value;
                    }

                    /**
                     * 获取intervalFrameI属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIntervalFrameI() {
                      return intervalFrameI;
                    }

                    /**
                     * 设置intervalFrameI属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIntervalFrameI(String value) {
                      this.intervalFrameI = value;
                    }

                    /**
                     * 获取videoEncType属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getVideoEncType() {
                      return videoEncType;
                    }

                    /**
                     * 设置videoEncType属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setVideoEncType(String value) {
                      this.videoEncType = value;
                    }

                    /**
                     * 获取audioEncType属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAudioEncType() {
                      return audioEncType;
                    }

                    /**
                     * 设置audioEncType属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAudioEncType(String value) {
                      this.audioEncType = value;
                    }

                  }

                }


            }

        }

    }

}
