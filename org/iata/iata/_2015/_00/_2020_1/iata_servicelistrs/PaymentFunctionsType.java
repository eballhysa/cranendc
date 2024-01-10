
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Is the container of all payment relevant functions.
 * 
 * <p>Java class for PaymentFunctionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentFunctionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentSupportedMethod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}PaymentSupportedMethodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFunctionsType", propOrder = {
    "paymentSupportedMethod"
})
public class PaymentFunctionsType {

    @XmlElement(name = "PaymentSupportedMethod")
    protected PaymentSupportedMethodType paymentSupportedMethod;

    /**
     * Gets the value of the paymentSupportedMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSupportedMethodType }
     *     
     */
    public PaymentSupportedMethodType getPaymentSupportedMethod() {
        return paymentSupportedMethod;
    }

    /**
     * Sets the value of the paymentSupportedMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSupportedMethodType }
     *     
     */
    public void setPaymentSupportedMethod(PaymentSupportedMethodType value) {
        this.paymentSupportedMethod = value;
    }

}
