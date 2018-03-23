//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.03 时间 02:54:28 PM CST 
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
 *         &lt;element name="Pack">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PPVSPMessage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="WhichCommand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Params">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="OneKeyDelayTime" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="DirectedMode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
    "pack"
})
@XmlRootElement(name = "Message")
public class GetRecordingHostInfoResponseMessage {

    @XmlElement(name = "Pack", required = true)
    protected GetRecordingHostInfoResponseMessage.Pack pack;

    /**
     * 获取pack属性的值。
     *
     * @return
     *     possible object is
     *     {@link GetRecordingHostInfoResponseMessage.Pack }
     *
     */
    public GetRecordingHostInfoResponseMessage.Pack getPack() {
        return pack;
    }

    /**
     * 设置pack属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link GetRecordingHostInfoResponseMessage.Pack }
     *
     */
    public void setPack(GetRecordingHostInfoResponseMessage.Pack value) {
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
     *         &lt;element name="PPVSPMessage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="WhichCommand" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Params">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="OneKeyDelayTime" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="DirectedMode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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

        @XmlElement(name = "PPVSPMessage", required = true)
        protected GetRecordingHostInfoResponseMessage.Pack.PPVSPMessage ppvspMessage;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * 获取ppvspMessage属性的值。
         *
         * @return
         *     possible object is
         *     {@link GetRecordingHostInfoResponseMessage.Pack.PPVSPMessage }
         *
         */
        public GetRecordingHostInfoResponseMessage.Pack.PPVSPMessage getPPVSPMessage() {
            return ppvspMessage;
        }

        /**
         * 设置ppvspMessage属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link GetRecordingHostInfoResponseMessage.Pack.PPVSPMessage }
         *
         */
        public void setPPVSPMessage(GetRecordingHostInfoResponseMessage.Pack.PPVSPMessage value) {
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
         *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="WhichCommand" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Params">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="OneKeyDelayTime" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="DirectedMode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
            protected float version;
            @XmlElement(name = "Sequence")
            protected byte sequence;
            @XmlElement(name = "CommandType", required = true)
            protected String commandType;
            @XmlElement(name = "WhichCommand", required = true)
            protected String whichCommand;
            @XmlElement(name = "Status")
            protected short status;
            @XmlElement(name = "Description", required = true)
            protected String description;
            @XmlElement(name = "Params", required = true)
            protected GetRecordingHostInfoResponseMessage.Pack.PPVSPMessage.Params params;

            /**
             * 获取version属性的值。
             *
             */
            public float getVersion() {
                return version;
            }

            /**
             * 设置version属性的值。
             *
             */
            public void setVersion(float value) {
                this.version = value;
            }

            /**
             * 获取sequence属性的值。
             *
             */
            public byte getSequence() {
                return sequence;
            }

            /**
             * 设置sequence属性的值。
             *
             */
            public void setSequence(byte value) {
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
             */
            public short getStatus() {
                return status;
            }

            /**
             * 设置status属性的值。
             *
             */
            public void setStatus(short value) {
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
             * 获取params属性的值。
             *
             * @return
             *     possible object is
             *     {@link GetRecordingHostInfoResponseMessage.Pack.PPVSPMessage.Params }
             *
             */
            public GetRecordingHostInfoResponseMessage.Pack.PPVSPMessage.Params getParams() {
                return params;
            }

            /**
             * 设置params属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link GetRecordingHostInfoResponseMessage.Pack.PPVSPMessage.Params }
             *
             */
            public void setParams(GetRecordingHostInfoResponseMessage.Pack.PPVSPMessage.Params value) {
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
             *         &lt;element name="OneKeyDelayTime" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="DirectedMode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
                "oneKeyDelayTime",
                "directedMode"
            })
            public static class Params {

                @XmlElement(name = "OneKeyDelayTime")
                protected byte oneKeyDelayTime;
                @XmlElement(name = "DirectedMode")
                protected byte directedMode;

                /**
                 * 获取oneKeyDelayTime属性的值。
                 * 
                 */
                public byte getOneKeyDelayTime() {
                    return oneKeyDelayTime;
                }

                /**
                 * 设置oneKeyDelayTime属性的值。
                 * 
                 */
                public void setOneKeyDelayTime(byte value) {
                    this.oneKeyDelayTime = value;
                }

                /**
                 * 获取directedMode属性的值。
                 * 
                 */
                public byte getDirectedMode() {
                    return directedMode;
                }

                /**
                 * 设置directedMode属性的值。
                 * 
                 */
                public void setDirectedMode(byte value) {
                    this.directedMode = value;
                }

            }

        }

    }

}
