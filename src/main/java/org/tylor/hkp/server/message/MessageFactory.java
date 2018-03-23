//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.15 时间 03:46:18 PM CST 
//


package org.tylor.hkp.server.message;

import javax.xml.bind.annotation.XmlRegistry;
import org.tylor.hkp.HkpPackType;
import org.tylor.hkp.codec.MessageConst;
import org.tylor.hkp.codec.ResponseMessage;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.funnyYish package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class MessageFactory {

    /**
     * Create an instance of {@link ResponseMessage }
     */
    public static ResponseMessage createResponseMessage(String command) {
        ResponseMessage response = new ResponseMessage();
        response.setPack(new ResponseMessage.Pack());
        response.getPack().setCommand(command);
        response.getPack().setResult(new ResponseMessage.Pack.Result());
        response.getPack().setType(HkpPackType.HKP.getPackType());
        response.getPack().getResult().setId(MessageConst.SUCCESS_ID);
        response.getPack().getResult().setValue(MessageConst.SUCCESS_DESC);
        return new ResponseMessage();
    }

}
