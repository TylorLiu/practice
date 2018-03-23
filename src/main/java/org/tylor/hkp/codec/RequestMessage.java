package org.tylor.hkp.codec;

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
*         &lt;element name="DevId" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
*         &lt;element name="DevIndexCode" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
*         &lt;element name="Pack">
*           &lt;complexType>
*             &lt;complexContent>
*               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*                 &lt;sequence>
*                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
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
/**
 * @author liubin10
 *		   2017年5月15日
 */
@XmlRootElement(name = "Message")
public class RequestMessage {

 @XmlElement(name = "Pack", required = true)
 protected RequestMessage.Pack pack;

 /**
  * 获取pack属性的值。
  *
  * @return
  *     possible object is
  *     {@link RequestMessage.Pack }
  *
  */
 public RequestMessage.Pack getPack() {
     return pack;
 }

 /**
  * 设置pack属性的值。
  *
  * @param value
  *     allowed object is
  *     {@link RequestMessage.Pack }
  *
  */
 public void setPack(RequestMessage.Pack value) {
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
     "command"
 })
 public static class Pack {

     @XmlElement(name = "Command", required = true)
     @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
     @XmlSchemaType(name = "NCName")
     protected String command;
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
