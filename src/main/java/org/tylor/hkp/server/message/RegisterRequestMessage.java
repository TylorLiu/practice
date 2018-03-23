package org.tylor.hkp.server.message;

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.15 时间 03:29:27 PM CST 
//

import java.math.BigInteger;
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
 *         &lt;element name="Pack">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                   &lt;element name="SvrIndexCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                   &lt;element name="ServerCode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                   &lt;element name="LocalIp" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
public class RegisterRequestMessage {

    @XmlElement(name = "Pack", required = true)
    protected RegisterRequestMessage.Pack pack;

    /**
     * 获取pack属性的值。
     *
     * @return
     *     possible object is
     *     {@link RegisterRequestMessage.Pack }
     *
     */
    public RegisterRequestMessage.Pack getPack() {
        return pack;
    }

    /**
     * 设置pack属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link RegisterRequestMessage.Pack }
     *
     */
    public void setPack(RegisterRequestMessage.Pack value) {
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
     *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *         &lt;element name="SvrIndexCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *         &lt;element name="ServerCode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *         &lt;element name="LocalIp" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *       &lt;/sequence>
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "command",
        "svrIndexCode",
        "version",
        "serverCode",
        "localIp"
    })
    public static class Pack {

        @XmlElement(name = "Command", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String command;
        @XmlElement(name = "SvrIndexCode", required = true)
        protected String svrIndexCode;
        @XmlElement(name = "Version", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String version;
        @XmlElement(name = "ServerCode", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String serverCode;
        @XmlElement(name = "LocalIp", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String localIp;
        @XmlAttribute(name = "type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String type;

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
         * 获取svrIndexCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public String getSvrIndexCode() {
            return svrIndexCode;
        }

        /**
         * 设置svrIndexCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSvrIndexCode(String value) {
            this.svrIndexCode = value;
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
         * 获取serverCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServerCode() {
            return serverCode;
        }

        /**
         * 设置serverCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServerCode(String value) {
            this.serverCode = value;
        }

        /**
         * 获取localIp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalIp() {
            return localIp;
        }

        /**
         * 设置localIp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalIp(String value) {
            this.localIp = value;
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

    }

}
