//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.27 时间 11:27:33 AM CST 
//


package org.tylor.hkp.client.bizModel.mcu;

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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="terminalName">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
 *                 &lt;attribute name="max" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OSDName">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
 *                 &lt;attribute name="max" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="protocolType">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
 *                 &lt;attribute name="opt" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TerminalAddress">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addressingFormatType">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
 *                           &lt;attribute name="opt" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                   &lt;element name="IpAddress">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ipVersion">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
 *                                     &lt;attribute name="opt" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                             &lt;element name="ipv6Address" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="portNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
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
    "enabled",
    "terminalName",
    "osdName",
    "protocolType",
    "terminalAddress",
    "userName",
    "password"
})
@XmlRootElement(name = "Terminal")
public class Terminal {

    @XmlElement(required = true)
    protected Integer id;
    @XmlElement(required = true)
    protected String enabled;
    @XmlElement(required = true)
    protected String terminalName;
    @XmlElement(name = "OSDName", required = true)
    protected String osdName;
    @XmlElement(required = true)
    protected String protocolType;
    @XmlElement(name = "TerminalAddress", required = true)
    protected TerminalAddress terminalAddress;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String userName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String password;
    @XmlAttribute(name = "version", required = true)
    protected String version;

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
     * 获取enabled属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * 获取terminalName属性的值。
     *
     * @return
     *     possible object is
     *     {@link TerminalName }
     *
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * 设置terminalName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TerminalName }
     *
     */
    public void setTerminalName(String value) {
        this.terminalName = value;
    }

    /**
     * 获取osdName属性的值。
     *
     * @return
     *     possible object is
     *
     */
    public String getOSDName() {
        return osdName;
    }

    /**
     * 设置osdName属性的值。
     *
     * @param value
     *     allowed object is
     *
     */
    public void setOSDName(String value) {
        this.osdName = value;
    }

    /**
     * 获取protocolType属性的值。
     *
     * @return
     *     possible object is
     *
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * 设置protocolType属性的值。
     *
     * @param value
     *     allowed object is
     *
     */
    public void setProtocolType(String value) {
        this.protocolType = value;
    }

    /**
     * 获取terminalAddress属性的值。
     *
     * @return
     *     possible object is
     *     {@link TerminalAddress }
     *
     */
    public TerminalAddress getTerminalAddress() {
        return terminalAddress;
    }

    /**
     * 设置terminalAddress属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TerminalAddress }
     *
     */
    public void setTerminalAddress(TerminalAddress value) {
        this.terminalAddress = value;
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
     *         &lt;element name="addressingFormatType">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
     *                 &lt;attribute name="opt" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *         &lt;element name="IpAddress">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ipVersion">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
     *                           &lt;attribute name="opt" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *                   &lt;element name="ipv6Address" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="portNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "addressingFormatType",
        "hostName",
        "ipAddress",
        "portNo"
    })
    public static class TerminalAddress {

        @XmlElement(required = true)
        protected String addressingFormatType;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String hostName;
        @XmlElement(name = "IpAddress", required = true)
        protected IpAddress ipAddress;
        @XmlElement(required = true)
        protected Integer portNo;

        /**
         * 获取addressingFormatType属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAddressingFormatType() {
            return addressingFormatType;
        }

        /**
         * 设置addressingFormatType属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAddressingFormatType(String value) {
            this.addressingFormatType = value;
        }

        /**
         * 获取hostName属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHostName() {
            return hostName;
        }

        /**
         * 设置hostName属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHostName(String value) {
            this.hostName = value;
        }

        /**
         * 获取ipAddress属性的值。
         *
         * @return
         *     possible object is
         *     {@link IpAddress }
         *
         */
        public IpAddress getIpAddress() {
            return ipAddress;
        }

        /**
         * 设置ipAddress属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link IpAddress }
         *
         */
        public void setIpAddress(IpAddress value) {
            this.ipAddress = value;
        }

        /**
         * 获取portNo属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getPortNo() {
            return portNo;
        }

        /**
         * 设置portNo属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setPortNo(Integer value) {
            this.portNo = value;
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
         *         &lt;element name="ipVersion">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
         *                 &lt;attribute name="opt" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
         *         &lt;element name="ipv6Address" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
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
            "ipVersion",
            "ipAddress",
            "ipv6Address"
        })
        public static class IpAddress {

            @XmlElement(required = true)
            protected String ipVersion;
            @XmlElement(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String ipAddress;
            @XmlElement(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String ipv6Address;

            /**
             * 获取ipVersion属性的值。
             *
             * @return
             *     possible object is
             *     {@link IpVersion }
             *
             */
            public String getIpVersion() {
                return ipVersion;
            }

            /**
             * 设置ipVersion属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link IpVersion }
             *
             */
            public void setIpVersion(String value) {
                this.ipVersion = value;
            }

            /**
             * 获取ipAddress属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIpAddress() {
                return ipAddress;
            }

            /**
             * 设置ipAddress属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIpAddress(String value) {
                this.ipAddress = value;
            }

            /**
             * 获取ipv6Address属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIpv6Address() {
                return ipv6Address;
            }

            /**
             * 设置ipv6Address属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIpv6Address(String value) {
                this.ipv6Address = value;
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
             *       &lt;attribute name="opt" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            public static class IpVersion {

                @XmlValue
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String value;
                @XmlAttribute(name = "opt", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String opt;

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
                 * 获取opt属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getOpt() {
                    return opt;
                }

                /**
                 * 设置opt属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setOpt(String value) {
                    this.opt = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
     *       &lt;attribute name="max" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    public static class TerminalName {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String value;
        @XmlAttribute(name = "max", required = true)
        @XmlSchemaType(name = "anySimpleType")
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
