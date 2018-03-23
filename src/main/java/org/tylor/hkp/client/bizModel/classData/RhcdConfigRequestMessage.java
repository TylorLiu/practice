//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.06 at 06:20:41 PM CST 
//

package org.tylor.hkp.client.bizModel.classData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 课堂数据统计配置设置 请求
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DevId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DevIndexCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Params">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ConfigXML">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ClassDataControl">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "", propOrder = { "devId", "devIndexCode", "pack" })
@XmlRootElement(name = "Message")
public class RhcdConfigRequestMessage {

	@XmlElement(name = "DevId")
	protected long devId;
	@XmlElement(name = "DevIndexCode", required = true)
	protected String devIndexCode;
	@XmlElement(name = "Pack", required = true)
	protected RhcdConfigRequestMessage.Pack pack = new Pack();

	/**
	 * Gets the value of the devId property.
	 *
	 */
	public long getDevId() {
		return devId;
	}

	/**
	 * Sets the value of the devId property.
	 *
	 */
	public void setDevId(long value) {
		this.devId = value;
	}

	/**
	 * Gets the value of the devIndexCode property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDevIndexCode() {
		return devIndexCode;
	}

	/**
	 * Sets the value of the devIndexCode property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setDevIndexCode(String value) {
		this.devIndexCode = value;
	}

	/**
	 * Gets the value of the pack property.
	 *
	 * @return possible object is {@link RhcdConfigRequestMessage.Pack }
	 *
	 */
	public RhcdConfigRequestMessage.Pack getPack() {
		return pack;
	}

	/**
	 * Sets the value of the pack property.
	 *
	 * @param value
	 *            allowed object is {@link RhcdConfigRequestMessage.Pack }
	 *
	 */
	public void setPack(RhcdConfigRequestMessage.Pack value) {
		this.pack = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 *
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
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
	 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="Params">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                             &lt;element name="ConfigXML">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="ClassDataControl">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;sequence>
	 *                                                 &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *                                               &lt;/sequence>
	 *                                               &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
	@XmlType(name = "", propOrder = { "ppvspMessage" })
	public static class Pack {

		@XmlElement(name = "PPVSPMessage", required = true)
		protected RhcdConfigRequestMessage.Pack.PPVSPMessage ppvspMessage = new PPVSPMessage();
		@XmlAttribute(name = "type")
		protected String type = "PPVSP";

		/**
		 * Gets the value of the ppvspMessage property.
		 *
		 * @return possible object is
		 *         {@link RhcdConfigRequestMessage.Pack.PPVSPMessage }
		 *
		 */
		public RhcdConfigRequestMessage.Pack.PPVSPMessage getPPVSPMessage() {
			return ppvspMessage;
		}

		/**
		 * Sets the value of the ppvspMessage property.
		 *
		 * @param value
		 *            allowed object is
		 *            {@link RhcdConfigRequestMessage.Pack.PPVSPMessage }
		 *
		 */
		public void setPPVSPMessage(RhcdConfigRequestMessage.Pack.PPVSPMessage value) {
			this.ppvspMessage = value;
		}

		/**
		 * Gets the value of the type property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getType() {
			return type;
		}

		/**
		 * Sets the value of the type property.
		 *
		 * @param value
		 *            allowed object is {@link String }
		 *
		 */
		public void setType(String value) {
			this.type = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 *
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 *
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="Params">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *                   &lt;element name="ConfigXML">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="ClassDataControl">
		 *                               &lt;complexType>
		 *                                 &lt;complexContent>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                     &lt;sequence>
		 *                                       &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
		 *                                     &lt;/sequence>
		 *                                     &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
		@XmlType(name = "", propOrder = { "version", "sequence", "commandType", "command", "params" })
		public static class PPVSPMessage {

			@XmlElement(name = "Version", required = true)
			protected String version = "2.0";
			@XmlElement(name = "Sequence")
			protected int sequence = 0;
			@XmlElement(name = "CommandType", required = true)
			protected String commandType = "REQUEST";
			@XmlElement(name = "Command", required = true)
			protected String command = "TRANSSTDCONFIG";
			@XmlElement(name = "Params", required = true)
			protected RhcdConfigRequestMessage.Pack.PPVSPMessage.Params params = new Params();

			/**
			 * Gets the value of the version property.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getVersion() {
				return version;
			}

			/**
			 * Sets the value of the version property.
			 *
			 * @param value
			 *            allowed object is {@link String }
			 *
			 */
			public void setVersion(String value) {
				this.version = value;
			}

			/**
			 * Gets the value of the sequence property.
			 *
			 */
			public int getSequence() {
				return sequence;
			}

			/**
			 * Sets the value of the sequence property.
			 *
			 */
			public void setSequence(int value) {
				this.sequence = value;
			}

			/**
			 * Gets the value of the commandType property.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getCommandType() {
				return commandType;
			}

			/**
			 * Sets the value of the commandType property.
			 *
			 * @param value
			 *            allowed object is {@link String }
			 *
			 */
			public void setCommandType(String value) {
				this.commandType = value;
			}

			/**
			 * Gets the value of the command property.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getCommand() {
				return command;
			}

			/**
			 * Sets the value of the command property.
			 *
			 * @param value
			 *            allowed object is {@link String }
			 *
			 */
			public void setCommand(String value) {
				this.command = value;
			}

			/**
			 * Gets the value of the params property.
			 *
			 * @return possible object is
			 *         {@link RhcdConfigRequestMessage.Pack.PPVSPMessage.Params }
			 *
			 */
			public RhcdConfigRequestMessage.Pack.PPVSPMessage.Params getParams() {
				return params;
			}

			/**
			 * Sets the value of the params property.
			 *
			 * @param value
			 *            allowed object is
			 *            {@link RhcdConfigRequestMessage.Pack.PPVSPMessage.Params }
			 *
			 */
			public void setParams(RhcdConfigRequestMessage.Pack.PPVSPMessage.Params value) {
				this.params = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 *
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="ConfigCmd" type="{http://www.w3.org/2001/XMLSchema}string"/>
			 *         &lt;element name="ConfigXML">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="ClassDataControl">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
			 *                           &lt;/sequence>
			 *                           &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
			@XmlType(name = "", propOrder = { "configCmd", "configXML" })
			public static class Params {

				@XmlElement(name = "ConfigCmd", required = true)
				protected String configCmd = "PUT /ISAPI/ContentMgmt/RecordingHost/ClassDataControl";
				@XmlElement(name = "ConfigXML", required = true)
				protected RhcdConfigRequestMessage.Pack.PPVSPMessage.Params.ConfigXML configXML = new ConfigXML();

				/**
				 * Gets the value of the configCmd property.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getConfigCmd() {
					return configCmd;
				}

				/**
				 * Sets the value of the configCmd property.
				 *
				 * @param value
				 *            allowed object is {@link String }
				 *
				 */
				public void setConfigCmd(String value) {
					this.configCmd = value;
				}

				/**
				 * Gets the value of the configXML property.
				 *
				 * @return possible object is
				 *         {@link RhcdConfigRequestMessage.Pack.PPVSPMessage.Params.ConfigXML }
				 *
				 */
				public RhcdConfigRequestMessage.Pack.PPVSPMessage.Params.ConfigXML getConfigXML() {
					return configXML;
				}

				/**
				 * Sets the value of the configXML property.
				 *
				 * @param value
				 *            allowed object is
				 *            {@link RhcdConfigRequestMessage.Pack.PPVSPMessage.Params.ConfigXML }
				 *
				 */
				public void setConfigXML(RhcdConfigRequestMessage.Pack.PPVSPMessage.Params.ConfigXML value) {
					this.configXML = value;
				}

				/**
				 * <p>
				 * Java class for anonymous complex type.
				 *
				 * <p>
				 * The following schema fragment specifies the expected content
				 * contained within this class.
				 *
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="ClassDataControl">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
				 *                 &lt;/sequence>
				 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
				@XmlType(name = "", propOrder = { "classDataControl" })
				public static class ConfigXML {

					@XmlElement(name = "ClassDataControl", required = true)
					protected RhcdConfigRequestMessage.Pack.PPVSPMessage.Params.ConfigXML.ClassDataControl classDataControl = new ClassDataControl();

					/**
					 * Gets the value of the classDataControl property.
					 *
					 * @return possible object is
					 *         {@link RhcdConfigRequestMessage.Pack.PPVSPMessage.Params.ConfigXML.ClassDataControl }
					 *
					 */
					public RhcdConfigRequestMessage.Pack.PPVSPMessage.Params.ConfigXML.ClassDataControl getClassDataControl() {
						return classDataControl;
					}

					/**
					 * Sets the value of the classDataControl property.
					 *
					 * @param value
					 *            allowed object is
					 *            {@link RhcdConfigRequestMessage.Pack.PPVSPMessage.Params.ConfigXML.ClassDataControl }
					 *
					 */
					public void setClassDataControl(RhcdConfigRequestMessage.Pack.PPVSPMessage.Params.ConfigXML.ClassDataControl value) {
						this.classDataControl = value;
					}

					/**
					 * <p>
					 * Java class for anonymous complex type.
					 * 
					 * <p>
					 * The following schema fragment specifies the expected
					 * content contained within this class.
					 * 
					 * <pre>
					 * &lt;complexType>
					 *   &lt;complexContent>
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
					 *       &lt;sequence>
					 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
					 *       &lt;/sequence>
					 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
					 *     &lt;/restriction>
					 *   &lt;/complexContent>
					 * &lt;/complexType>
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "enabled" })
					public static class ClassDataControl {

						protected boolean enabled;
						@XmlAttribute(name = "version")
						protected String version = "2.0";

						/**
						 * Gets the value of the enabled property.
						 * 
						 */
						public boolean isEnabled() {
							return enabled;
						}

						/**
						 * Sets the value of the enabled property.
						 * 
						 */
						public void setEnabled(boolean value) {
							this.enabled = value;
						}

						/**
						 * Gets the value of the version property.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getVersion() {
							return version;
						}

						/**
						 * Sets the value of the version property.
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

		}

	}

}
