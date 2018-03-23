package org.tylor.hkp.codec;

/**
 * @author liubin10
 *		   2017年5月15日
 */
//
//此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
//请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//在重新编译源模式时, 对此文件的所有修改都将丢失。
//生成时间: 2017.05.15 时间 03:46:18 PM CST 
//


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
*         &lt;element name="Pack">
*           &lt;complexType>
*             &lt;complexContent>
*               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*                 &lt;sequence>
*                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
*                   &lt;element name="Result">
*                     &lt;complexType>
*                       &lt;simpleContent>
*                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
*                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
*                         &lt;/extension>
*                       &lt;/simpleContent>
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
 "pack"
})
@XmlRootElement(name = "Message")
public class ResponseMessage {

 @XmlElement(name = "Pack", required = true)
 protected ResponseMessage.Pack pack;

 /**
  * 获取pack属性的值。
  *
  * @return
  *     possible object is
  *     {@link ResponseMessage.Pack }
  *
  */
 public ResponseMessage.Pack getPack() {
     return pack;
 }

 /**
  * 设置pack属性的值。
  *
  * @param value
  *     allowed object is
  *     {@link ResponseMessage.Pack }
  *
  */
 public void setPack(ResponseMessage.Pack value) {
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
  *         &lt;element name="Result">
  *           &lt;complexType>
  *             &lt;simpleContent>
  *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
  *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
  *               &lt;/extension>
  *             &lt;/simpleContent>
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
     "command",
     "result"
 })
 public static class Pack {

     @XmlElement(name = "Command", required = true)
     @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
     @XmlSchemaType(name = "NCName")
     protected String command;
     @XmlElement(name = "Result", required = true)
     protected ResponseMessage.Pack.Result result;
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
      * 获取result属性的值。
      *
      * @return
      *     possible object is
      *     {@link ResponseMessage.Pack.Result }
      *
      */
     public ResponseMessage.Pack.Result getResult() {
         return result;
     }

     /**
      * 设置result属性的值。
      *
      * @param value
      *     allowed object is
      *     {@link ResponseMessage.Pack.Result }
      *
      */
     public void setResult(ResponseMessage.Pack.Result value) {
         this.result = value;
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
      *   &lt;simpleContent>
      *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
      *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
     public static class Result {

         @XmlValue
         @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
         @XmlSchemaType(name = "NCName")
         protected String value;
         @XmlAttribute(name = "id", required = true)
         @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
         @XmlSchemaType(name = "NCName")
         protected String id;

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

     }

 }

}
