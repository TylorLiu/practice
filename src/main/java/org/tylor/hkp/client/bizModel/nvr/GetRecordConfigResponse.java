//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.08 时间 05:11:37 PM CST 
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
 *                   &lt;element name="WhichCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Params" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Record" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PostRecordTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PreRecordTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RecorderDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RedundancyRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AllDayRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AllDayRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AudioRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
public class GetRecordConfigResponse {

    @XmlElement(name = "Pack")
    protected GetRecordConfigResponse.Pack pack;

    /**
     * 获取pack属性的值。
     *
     * @return
     *     possible object is
     *     {@link GetRecordConfigResponse.Pack }
     *
     */
    public GetRecordConfigResponse.Pack getPack() {
        return pack;
    }

    /**
     * 设置pack属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link GetRecordConfigResponse.Pack }
     *
     */
    public void setPack(GetRecordConfigResponse.Pack value) {
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
     *         &lt;element name="WhichCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Params" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Record" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PostRecordTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PreRecordTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RecorderDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RedundancyRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AllDayRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AllDayRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AudioRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "whichCommand",
        "status",
        "description",
        "params"
    })
    public static class Pack {

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
        protected GetRecordConfigResponse.Pack.Params params;
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
         * 获取params属性的值。
         *
         * @return
         *     possible object is
         *     {@link GetRecordConfigResponse.Pack.Params }
         *
         */
        public GetRecordConfigResponse.Pack.Params getParams() {
            return params;
        }

        /**
         * 设置params属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link GetRecordConfigResponse.Pack.Params }
         *
         */
        public void setParams(GetRecordConfigResponse.Pack.Params value) {
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
         *         &lt;element name="Record" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PostRecordTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PreRecordTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RecorderDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RedundancyRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AllDayRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AllDayRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AudioRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "record",
            "plan",
            "postRecordTime",
            "preRecordTime",
            "recorderDuration",
            "redundancyRec",
            "allDayRecord",
            "allDayRecordType",
            "audioRec"
        })
        public static class Params {

            @XmlElement(name = "Record")
            protected String record;
            @XmlElement(name = "Plan")
            protected String plan;
            @XmlElement(name = "PostRecordTime")
            protected String postRecordTime;
            @XmlElement(name = "PreRecordTime")
            protected String preRecordTime;
            @XmlElement(name = "RecorderDuration")
            protected String recorderDuration;
            @XmlElement(name = "RedundancyRec")
            protected String redundancyRec;
            @XmlElement(name = "AllDayRecord")
            protected String allDayRecord;
            @XmlElement(name = "AllDayRecordType")
            protected String allDayRecordType;
            @XmlElement(name = "AudioRec")
            protected String audioRec;
            
            @XmlElement(name = "StreamType")
            protected String streamType;

            /**
			 * @return the streamType
			 */
			public String getStreamType() {
				return streamType;
			}

			/**
			 * @param streamType the streamType to set
			 */
			public void setStreamType(String streamType) {
				this.streamType = streamType;
			}

			/**
             * 获取record属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecord() {
                return record;
            }

            /**
             * 设置record属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecord(String value) {
                this.record = value;
            }

            /**
             * 获取plan属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlan() {
                return plan;
            }

            /**
             * 设置plan属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlan(String value) {
                this.plan = value;
            }

            /**
             * 获取postRecordTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostRecordTime() {
                return postRecordTime;
            }

            /**
             * 设置postRecordTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostRecordTime(String value) {
                this.postRecordTime = value;
            }

            /**
             * 获取preRecordTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreRecordTime() {
                return preRecordTime;
            }

            /**
             * 设置preRecordTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreRecordTime(String value) {
                this.preRecordTime = value;
            }

            /**
             * 获取recorderDuration属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecorderDuration() {
                return recorderDuration;
            }

            /**
             * 设置recorderDuration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecorderDuration(String value) {
                this.recorderDuration = value;
            }

            /**
             * 获取redundancyRec属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRedundancyRec() {
                return redundancyRec;
            }

            /**
             * 设置redundancyRec属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRedundancyRec(String value) {
                this.redundancyRec = value;
            }

            /**
             * 获取allDayRecord属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAllDayRecord() {
                return allDayRecord;
            }

            /**
             * 设置allDayRecord属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAllDayRecord(String value) {
                this.allDayRecord = value;
            }

            /**
             * 获取allDayRecordType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAllDayRecordType() {
                return allDayRecordType;
            }

            /**
             * 设置allDayRecordType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAllDayRecordType(String value) {
                this.allDayRecordType = value;
            }

            /**
             * 获取audioRec属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAudioRec() {
                return audioRec;
            }

            /**
             * 设置audioRec属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAudioRec(String value) {
                this.audioRec = value;
            }

        }

    }

}
