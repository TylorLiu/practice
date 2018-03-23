//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.08 时间 05:07:38 PM CST 
//


package org.tylor.hkp.client.bizModel.nvr;

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
 *                             &lt;element name="QueryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SegmentCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SegmentList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RecordSegment" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="MediaDataLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="VodUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ListNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="EndFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
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
public class QueryRecordResponse {

    @XmlElement(name = "Pack")
    protected QueryRecordResponse.Pack pack;

    /**
     * 获取pack属性的值。
     *
     * @return
     *     possible object is
     *     {@link QueryRecordResponse.Pack }
     *
     */
    public QueryRecordResponse.Pack getPack() {
        return pack;
    }

    /**
     * 设置pack属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link QueryRecordResponse.Pack }
     *
     */
    public void setPack(QueryRecordResponse.Pack value) {
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
     *                   &lt;element name="QueryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SegmentCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SegmentList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RecordSegment" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="MediaDataLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="VodUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ListNum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="EndFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        protected QueryRecordResponse.Pack.Params params;
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
         *     {@link QueryRecordResponse.Pack.Params }
         *
         */
        public QueryRecordResponse.Pack.Params getParams() {
            return params;
        }

        /**
         * 设置params属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link QueryRecordResponse.Pack.Params }
         *
         */
        public void setParams(QueryRecordResponse.Pack.Params value) {
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
         *         &lt;element name="QueryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SegmentCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SegmentList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RecordSegment" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="MediaDataLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="VodUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ListNum" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="EndFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "queryType",
            "segmentCount",
            "segmentList"
        })
        public static class Params {

            @XmlElement(name = "QueryType")
            protected String queryType;
            @XmlElement(name = "SegmentCount")
            protected String segmentCount;
            @XmlElement(name = "SegmentList")
            protected QueryRecordResponse.Pack.Params.SegmentList segmentList;

            /**
             * 获取queryType属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getQueryType() {
                return queryType;
            }

            /**
             * 设置queryType属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setQueryType(String value) {
                this.queryType = value;
            }

            /**
             * 获取segmentCount属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSegmentCount() {
                return segmentCount;
            }

            /**
             * 设置segmentCount属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSegmentCount(String value) {
                this.segmentCount = value;
            }

            /**
             * 获取segmentList属性的值。
             *
             * @return
             *     possible object is
             *     {@link QueryRecordResponse.Pack.Params.SegmentList }
             *
             */
            public QueryRecordResponse.Pack.Params.SegmentList getSegmentList() {
                return segmentList;
            }

            /**
             * 设置segmentList属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link QueryRecordResponse.Pack.Params.SegmentList }
             *
             */
            public void setSegmentList(QueryRecordResponse.Pack.Params.SegmentList value) {
                this.segmentList = value;
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
             *         &lt;element name="RecordSegment" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="MediaDataLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="VodUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="ListNum" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="EndFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "recordSegment"
            })
            public static class SegmentList {

                @XmlElement(name = "RecordSegment")
                protected List<RecordSegment> recordSegment;
                @XmlAttribute(name = "ListNum")
                protected String listNum;
                @XmlAttribute(name = "EndFlag")
                protected String endFlag;

                /**
                 * Gets the value of the recordSegment property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the recordSegment property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRecordSegment().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link QueryRecordResponse.Pack.Params.SegmentList.RecordSegment }
                 *
                 *
                 */
                public List<RecordSegment> getRecordSegment() {
                    if (recordSegment == null) {
                        recordSegment = new ArrayList<RecordSegment>();
                    }
                    return this.recordSegment;
                }

                /**
                 * 获取listNum属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getListNum() {
                    return listNum;
                }

                /**
                 * 设置listNum属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setListNum(String value) {
                    this.listNum = value;
                }

                /**
                 * 获取endFlag属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEndFlag() {
                    return endFlag;
                }

                /**
                 * 设置endFlag属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEndFlag(String value) {
                    this.endFlag = value;
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
                 *         &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="MediaDataLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="VodUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "beginTime",
                    "endTime",
                    "recordType",
                    "mediaDataLen",
                    "fileName",
                    "vodUrl"
                })
                public static class RecordSegment {

                    @XmlElement(name = "BeginTime")
                    protected String beginTime;
                    @XmlElement(name = "EndTime")
                    protected String endTime;
                    @XmlElement(name = "RecordType")
                    protected String recordType;
                    @XmlElement(name = "MediaDataLen")
                    protected String mediaDataLen;
                    @XmlElement(name = "FileName")
                    protected String fileName;
                    @XmlElement(name = "VodUrl")
                    protected String vodUrl;

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
                     * 获取recordType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecordType() {
                        return recordType;
                    }

                    /**
                     * 设置recordType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecordType(String value) {
                        this.recordType = value;
                    }

                    /**
                     * 获取mediaDataLen属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMediaDataLen() {
                        return mediaDataLen;
                    }

                    /**
                     * 设置mediaDataLen属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMediaDataLen(String value) {
                        this.mediaDataLen = value;
                    }

                    /**
                     * 获取fileName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFileName() {
                        return fileName;
                    }

                    /**
                     * 设置fileName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFileName(String value) {
                        this.fileName = value;
                    }

                    /**
                     * 获取vodUrl属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVodUrl() {
                        return vodUrl;
                    }

                    /**
                     * 设置vodUrl属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVodUrl(String value) {
                        this.vodUrl = value;
                    }

                }

            }

        }

    }

}
