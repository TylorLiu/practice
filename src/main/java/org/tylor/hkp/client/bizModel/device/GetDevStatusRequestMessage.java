package org.tylor.hkp.client.bizModel.device;

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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DevIndexCode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="Pack">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *                   &lt;element name="Params">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="WorkStatusType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "devIndexCode",
    "pack"
})
@XmlRootElement(name = "Message")
public class GetDevStatusRequestMessage {

    @XmlElement(name = "DevIndexCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String devIndexCode;
    @XmlElement(name = "Pack", required = true)
    protected GetDevStatusRequestMessage.Pack pack;

    /**
     * Gets the value of the devIndexCode property.
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
     * Sets the value of the devIndexCode property.
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
     * Gets the value of the pack property.
     *
     * @return
     *     possible object is
     *     {@link GetDevStatusRequestMessage.Pack }
     *
     */
    public GetDevStatusRequestMessage.Pack getPack() {
        return pack;
    }

    /**
     * Sets the value of the pack property.
     *
     * @param value
     *     allowed object is
     *     {@link GetDevStatusRequestMessage.Pack }
     *
     */
    public void setPack(GetDevStatusRequestMessage.Pack value) {
        this.pack = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
     *         &lt;element name="Params">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="WorkStatusType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "version",
        "sequence",
        "commandType",
        "command",
        "params"
    })
    public static class Pack {

        @XmlElement(name = "Version", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String version;
        @XmlElement(name = "Sequence", required = true)
        protected Integer sequence;
        @XmlElement(name = "CommandType", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String commandType;
        @XmlElement(name = "Command", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String command;
        @XmlElement(name = "Params", required = true)
        protected GetDevStatusRequestMessage.Pack.Params params;
        @XmlAttribute(name = "type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String type;

        /**
         * Gets the value of the version property.
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
         * Sets the value of the version property.
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
         * Gets the value of the sequence property.
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the commandType property.
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
         * Sets the value of the commandType property.
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
         * Gets the value of the command property.
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
         * Sets the value of the command property.
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
         * Gets the value of the params property.
         *
         * @return
         *     possible object is
         *     {@link GetDevStatusRequestMessage.Pack.Params }
         *
         */
        public GetDevStatusRequestMessage.Pack.Params getParams() {
            return params;
        }

        /**
         * Sets the value of the params property.
         *
         * @param value
         *     allowed object is
         *     {@link GetDevStatusRequestMessage.Pack.Params }
         *
         */
        public void setParams(GetDevStatusRequestMessage.Pack.Params value) {
            this.params = value;
        }

        /**
         * Gets the value of the type property.
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
         * Sets the value of the type property.
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="WorkStatusType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            "workStatusType"
        })
        public static class Params {

            @XmlElement(name = "WorkStatusType", required = true)
            protected Integer workStatusType;

            /**
             * Gets the value of the workStatusType property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getWorkStatusType() {
                return workStatusType;
            }

            /**
             * Sets the value of the workStatusType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setWorkStatusType(Integer value) {
                this.workStatusType = value;
            }

        }

    }

}
