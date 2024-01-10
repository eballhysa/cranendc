
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="PaymentSupportedMethod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PaymentSupportedMethodType" maxOccurs="unbounded" minOccurs="0"/>
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
    protected List<PaymentSupportedMethodType> paymentSupportedMethod;

    /**
     * Gets the value of the paymentSupportedMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentSupportedMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentSupportedMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentSupportedMethodType }
     * 
     * 
     */
    public List<PaymentSupportedMethodType> getPaymentSupportedMethod() {
        if (paymentSupportedMethod == null) {
            paymentSupportedMethod = new ArrayList<PaymentSupportedMethodType>();
        }
        return this.paymentSupportedMethod;
    }

}
