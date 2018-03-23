//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.26 时间 07:34:47 PM CST 
//


package org.tylor.hkp.client.bizModel.mcu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConferenceBasicInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conferenceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="conferenceTimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ConferenceTime">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="conferenceContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="memberNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="MemberList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Member" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *                                       &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="isChairman" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="conferenceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="autoRemindTime" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="SoundIntensityPriority">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="timeDelay" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;sequence>
 *                               &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                               &lt;element name="winNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;/sequence>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ConferenceLayout">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="windowMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SoundIntensityPriority">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="timeDelay" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;sequence>
 *                               &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                               &lt;element name="winNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;/sequence>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="WinTerminalList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="WinTerminal" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="winNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *                 &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MemberViewList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MemberView" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *                             &lt;element name="viewMode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                             &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "enabled",
    "conferenceBasicInfo",
    "conferenceLayout",
    "memberViewList"
})
@XmlRootElement(name = "Conference")
public class Conference {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    protected boolean enabled;
    @XmlElement(name = "ConferenceBasicInfo", required = true)
    protected ConferenceBasicInfo conferenceBasicInfo;
    @XmlElement(name = "ConferenceLayout", required = true)
    protected ConferenceLayout conferenceLayout;
    @XmlElement(name = "MemberViewList", required = true)
    protected MemberViewList memberViewList;
    @XmlAttribute(name = "version", required = true)
    protected String version;

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
     * 获取enabled属性的值。
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * 获取conferenceBasicInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConferenceBasicInfo }
     *     
     */
    public ConferenceBasicInfo getConferenceBasicInfo() {
        return conferenceBasicInfo;
    }

    /**
     * 设置conferenceBasicInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceBasicInfo }
     *     
     */
    public void setConferenceBasicInfo(ConferenceBasicInfo value) {
        this.conferenceBasicInfo = value;
    }

    /**
     * 获取conferenceLayout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConferenceLayout }
     *     
     */
    public ConferenceLayout getConferenceLayout() {
        return conferenceLayout;
    }

    /**
     * 设置conferenceLayout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceLayout }
     *     
     */
    public void setConferenceLayout(ConferenceLayout value) {
        this.conferenceLayout = value;
    }

    /**
     * 获取memberViewList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemberViewList }
     *     
     */
    public MemberViewList getMemberViewList() {
        return memberViewList;
    }

    /**
     * 设置memberViewList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemberViewList }
     *     
     */
    public void setMemberViewList(MemberViewList value) {
        this.memberViewList = value;
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
     *         &lt;element name="conferenceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="conferenceTimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ConferenceTime">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="conferenceContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="memberNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="MemberList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Member" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
     *                             &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="isChairman" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="conferenceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="autoRemindTime" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="SoundIntensityPriority">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="timeDelay" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;sequence>
     *                     &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                     &lt;element name="winNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;/sequence>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conferenceName",
        "conferenceTimeType",
        "conferenceTime",
        "conferenceContent",
        "memberNum",
        "memberList",
        "conferenceType",
        "notification",
        "autoRemindTime",
        "soundIntensityPriority",
        "encrptEnabled",
        "caption",
        "ctrlType",
        "fecEnabled",
        "notDisturbEnabled"

    })
    public static class ConferenceBasicInfo {

        @XmlElement(required = true)
        protected String conferenceName;
        @XmlElement(required = true)
        protected String conferenceTimeType;
        @XmlElement(name = "ConferenceTime", required = true)
        protected ConferenceTime conferenceTime;
        @XmlElement(required = true)
        protected String conferenceContent;
        @XmlElement(required = true)
		    protected String memberNum;
        @XmlElement(name = "MemberList", required = true)
        protected MemberList memberList;
        @XmlElement(required = true)
        protected String conferenceType;
        @XmlElement(required = true)
        protected String notification;
        @XmlElement(required = true)
	    	protected String autoRemindTime;
        @XmlElement(name = "SoundIntensityPriority", required = true)
        protected SoundIntensityPriority soundIntensityPriority;
        @XmlAttribute(name = "version", required = true)
        protected String version;

        @XmlElement(name = "encrptEnabled", required = true)
        protected String encrptEnabled;

        @XmlElement(name = "caption", required = true)
        protected String caption;
        @XmlElement(name = "ctrlType", required = true)
        protected String ctrlType;
        @XmlElement(name = "fecEnabled", required = true)
        protected String fecEnabled;
        @XmlElement(name = "notDisturbEnabled", required = true)
        protected String notDisturbEnabled;


      public String getEncrptEnabled() {
        return encrptEnabled;
      }

      public void setEncrptEnabled(String encrptEnabled) {
        this.encrptEnabled = encrptEnabled;
      }

      public String getCaption() {
        return caption;
      }

      public void setCaption(String caption) {
        this.caption = caption;
      }

      public String getCtrlType() {
        return ctrlType;
      }

      public void setCtrlType(String ctrlType) {
        this.ctrlType = ctrlType;
      }

      public String getFecEnabled() {
        return fecEnabled;
      }

      public void setFecEnabled(String fecEnabled) {
        this.fecEnabled = fecEnabled;
      }

      public String getNotDisturbEnabled() {
        return notDisturbEnabled;
      }

      public void setNotDisturbEnabled(String notDisturbEnabled) {
        this.notDisturbEnabled = notDisturbEnabled;
      }

      /**
         * 获取conferenceName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConferenceName() {
            return conferenceName;
        }

        /**
         * 设置conferenceName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConferenceName(String value) {
            this.conferenceName = value;
        }

        /**
         * 获取conferenceTimeType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConferenceTimeType() {
            return conferenceTimeType;
        }

        /**
         * 设置conferenceTimeType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConferenceTimeType(String value) {
            this.conferenceTimeType = value;
        }

        /**
         * 获取conferenceTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ConferenceTime }
         *     
         */
        public ConferenceTime getConferenceTime() {
            return conferenceTime;
        }

        /**
         * 设置conferenceTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ConferenceTime }
         *     
         */
        public void setConferenceTime(ConferenceTime value) {
            this.conferenceTime = value;
        }

        /**
         * 获取conferenceContent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConferenceContent() {
            return conferenceContent;
        }

        /**
         * 设置conferenceContent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConferenceContent(String value) {
            this.conferenceContent = value;
        }

        /**
		 * 获取memberNum属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMemberNum() {
            return memberNum;
        }

        /**
		 * 设置memberNum属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMemberNum(String value) {
            this.memberNum = value;
        }

        /**
         * 获取memberList属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MemberList }
         *     
         */
        public MemberList getMemberList() {
            return memberList;
        }

        /**
         * 设置memberList属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MemberList }
         *     
         */
        public void setMemberList(MemberList value) {
            this.memberList = value;
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
         * 获取notification属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotification() {
            return notification;
        }

        /**
         * 设置notification属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotification(String value) {
            this.notification = value;
        }

        /**
		 * 获取autoRemindTime属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAutoRemindTime() {
            return autoRemindTime;
        }

        /**
		 * 设置autoRemindTime属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAutoRemindTime(String value) {
            this.autoRemindTime = value;
        }

        /**
         * 获取soundIntensityPriority属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SoundIntensityPriority }
         *     
         */
        public SoundIntensityPriority getSoundIntensityPriority() {
            return soundIntensityPriority;
        }

        /**
         * 设置soundIntensityPriority属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SoundIntensityPriority }
         *     
         */
        public void setSoundIntensityPriority(SoundIntensityPriority value) {
            this.soundIntensityPriority = value;
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
         *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "startTime",
            "endTime"
        })
        public static class ConferenceTime {

            @XmlElement(required = true)
            protected String startTime;
            @XmlElement(required = true)
            protected String endTime;

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
         *         &lt;element name="Member" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
         *                   &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="isChairman" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "member"
        })
        public static class MemberList {

            @XmlElement(name = "Member", required = true)
            protected List<Member> member;
            @XmlAttribute(name = "size", required = true)
			protected String size;

            /**
             * Gets the value of the member property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the member property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMember().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Member }
             * 
             * 
             */
            public List<Member> getMember() {
                if (member == null) {
                    member = new ArrayList<Member>();
                }
                return this.member;
            }

            /**
			 * 获取size属性的值。
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getSize() {
                return size;
            }

            /**
			 * 设置size属性的值。
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setSize(String value) {
                this.size = value;
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
             *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
             *         &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="isChairman" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                "terminalNo",
                "isChairman",
                "memberType"
            })
            public static class Member {

                @XmlElement(required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NMTOKEN")
                protected String id;
                @XmlElement(required = true)
                protected String terminalNo;
                protected boolean isChairman;

                protected String memberType;


                public String getMemberType() {
                  return memberType;
                }

                public void setMemberType(String memberType) {
                  this.memberType = memberType;
                }

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
                 * 获取terminalNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTerminalNo() {
                    return terminalNo;
                }

                /**
                 * 设置terminalNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTerminalNo(String value) {
                    this.terminalNo = value;
                }

                /**
                 * 获取isChairman属性的值。
                 * 
                 */
                public boolean isIsChairman() {
                    return isChairman;
                }

                /**
                 * 设置isChairman属性的值。
                 * 
                 */
                public void setIsChairman(boolean value) {
                    this.isChairman = value;
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
         *       &lt;choice>
         *         &lt;element name="timeDelay" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;sequence>
         *           &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *           &lt;element name="winNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;/sequence>
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
            "timeDelay",
            "enabled",
            "winNo"
        })
        public static class SoundIntensityPriority {

			protected String timeDelay;
            protected Boolean enabled;
			protected String winNo;

            /**
			 * 获取timeDelay属性的值。
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getTimeDelay() {
                return timeDelay;
            }

            /**
			 * 设置timeDelay属性的值。
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setTimeDelay(String value) {
                this.timeDelay = value;
            }

            /**
             * 获取enabled属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEnabled() {
                return enabled;
            }

            /**
             * 设置enabled属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEnabled(Boolean value) {
                this.enabled = value;
            }

            /**
			 * 获取winNo属性的值。
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWinNo() {
                return winNo;
            }

            /**
			 * 设置winNo属性的值。
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWinNo(String value) {
                this.winNo = value;
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
     *         &lt;element name="windowMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SoundIntensityPriority">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="timeDelay" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;sequence>
     *                     &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                     &lt;element name="winNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;/sequence>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="WinTerminalList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="WinTerminal" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="winNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                             &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
     *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "windowMode",
        "soundIntensityPriority",
        "winTerminalList"
    })
    public static class ConferenceLayout {

        @XmlElement(required = true)
        protected String windowMode;
        @XmlElement(name = "SoundIntensityPriority", required = true)
        protected SoundIntensityPriority soundIntensityPriority;
        @XmlElement(name = "WinTerminalList", required = true)
        protected WinTerminalList winTerminalList;
        @XmlAttribute(name = "version", required = true)
        protected String version;

        /**
         * 获取windowMode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWindowMode() {
            return windowMode;
        }

        /**
         * 设置windowMode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWindowMode(String value) {
            this.windowMode = value;
        }

        /**
         * 获取soundIntensityPriority属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SoundIntensityPriority }
         *     
         */
        public SoundIntensityPriority getSoundIntensityPriority() {
            return soundIntensityPriority;
        }

        /**
         * 设置soundIntensityPriority属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SoundIntensityPriority }
         *     
         */
        public void setSoundIntensityPriority(SoundIntensityPriority value) {
            this.soundIntensityPriority = value;
        }

        /**
         * 获取winTerminalList属性的值。
         * 
         * @return
         *     possible object is
         *     {@link WinTerminalList }
         *     
         */
        public WinTerminalList getWinTerminalList() {
            return winTerminalList;
        }

        /**
         * 设置winTerminalList属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link WinTerminalList }
         *     
         */
        public void setWinTerminalList(WinTerminalList value) {
            this.winTerminalList = value;
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
         *       &lt;choice>
         *         &lt;element name="timeDelay" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;sequence>
         *           &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *           &lt;element name="winNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;/sequence>
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
            "timeDelay",
            "enabled",
            "winNo"
        })
        public static class SoundIntensityPriority {

			protected String timeDelay;
            protected Boolean enabled;
			protected String winNo;

            /**
			 * 获取timeDelay属性的值。
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getTimeDelay() {
                return timeDelay;
            }

            /**
			 * 设置timeDelay属性的值。
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setTimeDelay(String value) {
                this.timeDelay = value;
            }

            /**
             * 获取enabled属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEnabled() {
                return enabled;
            }

            /**
             * 设置enabled属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEnabled(Boolean value) {
                this.enabled = value;
            }

            /**
			 * 获取winNo属性的值。
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWinNo() {
                return winNo;
            }

            /**
			 * 设置winNo属性的值。
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWinNo(String value) {
                this.winNo = value;
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
         *         &lt;element name="WinTerminal" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="winNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                   &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "winTerminal"
        })
        public static class WinTerminalList {

            @XmlElement(name = "WinTerminal", required = true)
            protected List<WinTerminal> winTerminal;

            /**
             * Gets the value of the winTerminal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the winTerminal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWinTerminal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link WinTerminal }
             * 
             * 
             */
            public List<WinTerminal> getWinTerminal() {
                if (winTerminal == null) {
                    winTerminal = new ArrayList<WinTerminal>();
                }
                return this.winTerminal;
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
             *         &lt;element name="winNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *         &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                "winNo",
                "terminalNo",
                "fixed"
            })
            public static class WinTerminal {

                @XmlElement(required = true)
				protected String winNo;
                @XmlElement(required = true)
                protected String terminalNo;
                protected boolean fixed;

                /**
				 * 获取winNo属性的值。
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getWinNo() {
                    return winNo;
                }

                /**
				 * 设置winNo属性的值。
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setWinNo(String value) {
                    this.winNo = value;
                }

                /**
                 * 获取terminalNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTerminalNo() {
                    return terminalNo;
                }

                /**
                 * 设置terminalNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTerminalNo(String value) {
                    this.terminalNo = value;
                }

                /**
                 * 获取fixed属性的值。
                 * 
                 */
                public boolean isFixed() {
                    return fixed;
                }

                /**
                 * 设置fixed属性的值。
                 * 
                 */
                public void setFixed(boolean value) {
                    this.fixed = value;
                }

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
     *         &lt;element name="MemberView" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
     *                   &lt;element name="viewMode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *                   &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "memberView"
    })
    public static class MemberViewList {

        @XmlElement(name = "MemberView", required = true)
        protected List<MemberView> memberView;
        @XmlAttribute(name = "version", required = true)
		protected String version;

        /**
         * Gets the value of the memberView property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberView property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberView().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MemberView }
         * 
         * 
         */
        public List<MemberView> getMemberView() {
            if (memberView == null) {
                memberView = new ArrayList<MemberView>();
            }
            return this.memberView;
        }

        /**
		 * 获取version属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVersion() {
            return version;
        }

        /**
		 * 设置version属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link String }
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
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
         *         &lt;element name="viewMode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
         *         &lt;element name="terminalNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
            "viewMode",
            "terminalNo"
        })
        public static class MemberView {

            @XmlElement(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NMTOKEN")
            protected String id;
            @XmlElement(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String viewMode;
            @XmlElement(required = true)
            protected String terminalNo;
            @XmlAttribute(name = "version", required = true)
			protected String version;

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
             * 获取viewMode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViewMode() {
                return viewMode;
            }

            /**
             * 设置viewMode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViewMode(String value) {
                this.viewMode = value;
            }

            /**
             * 获取terminalNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminalNo() {
                return terminalNo;
            }

            /**
             * 设置terminalNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminalNo(String value) {
                this.terminalNo = value;
            }

            /**
			 * 获取version属性的值。
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVersion() {
                return version;
            }

            /**
			 * 设置version属性的值。
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVersion(String value) {
                this.version = value;
            }

        }

    }

}
