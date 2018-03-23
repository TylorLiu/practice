//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.08 时间 04:56:49 PM CST 
//


package org.tylor.hkp.client.bizModel.nvr;

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
 *       &lt;choice minOccurs="0">
 *         &lt;element name="Pack">
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
 *                             &lt;element name="ChanIndexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WeekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RecType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
public class GetRecordConfigRequest {

    @XmlElement(name = "Pack")
    protected GetRecordConfigRequest.Pack pack;

    /**
     * 获取pack属性的值。
     *
     * @return
     *     possible object is
     *     {@link GetRecordConfigRequest.Pack }
     *
     */
    public GetRecordConfigRequest.Pack getPack() {
        return pack;
    }

    /**
     * 设置pack属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link GetRecordConfigRequest.Pack }
     *
     */
    public void setPack(GetRecordConfigRequest.Pack value) {
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
     *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Params" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ChanIndexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WeekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RecType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "version",
        "sequence",
        "commandType",
        "command",
        "params"
    })
    public static class Pack {

        @XmlElement(name = "Version")
        protected String version;
        @XmlElement(name = "Sequence")
        protected String sequence;
        @XmlElement(name = "CommandType")
        protected String commandType;
        @XmlElement(name = "Command")
        protected String command;
        @XmlElement(name = "Params")
        protected GetRecordConfigRequest.Pack.Params params;
        @XmlAttribute(name = "type")
        protected String type;

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
         *     {@link GetRecordConfigRequest.Pack.Params }
         *
         */
        public GetRecordConfigRequest.Pack.Params getParams() {
            return params;
        }

        /**
         * 设置params属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link GetRecordConfigRequest.Pack.Params }
         *
         */
        public void setParams(GetRecordConfigRequest.Pack.Params value) {
            this.params = value;
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
         *         &lt;element name="ChanIndexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WeekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RecType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "chanIndexCode",
            "weekDay",
            "beginTime",
            "endTime",
            "recType"
        })
        public static class Params {

            @XmlElement(name = "ChanIndexCode")
            protected String chanIndexCode;
            @XmlElement(name = "WeekDay")
            protected String weekDay;
            @XmlElement(name = "BeginTime")
            protected String beginTime;
            @XmlElement(name = "EndTime")
            protected String endTime;
            @XmlElement(name = "RecType")
            protected String recType;

            /**
             * 获取chanIndexCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChanIndexCode() {
                return chanIndexCode;
            }

            /**
             * 设置chanIndexCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChanIndexCode(String value) {
                this.chanIndexCode = value;
            }

            /**
             * 获取weekDay属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWeekDay() {
                return weekDay;
            }

            /**
             * 设置weekDay属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWeekDay(String value) {
                this.weekDay = value;
            }

            /**
             * 获取beginTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeginTime() {
                return beginTime;
            }

            /**
             * 设置beginTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeginTime(String value) {
                this.beginTime = value;
            }

            /**
             * 获取endTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndTime() {
                return endTime;
            }

            /**
             * 设置endTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndTime(String value) {
                this.endTime = value;
            }

            /**
             * 获取recType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecType() {
                return recType;
            }

            /**
             * 设置recType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecType(String value) {
                this.recType = value;
            }

        }

    }

}
