
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 *         &lt;element name="PaymentMethodCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PaymentMethodCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentProcessingDetails" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PaymentProcessingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
    "paymentMethodCriteria",
    "paymentProcessingDetails"
})
public class PaymentFunctionsType {

    @XmlElement(name = "PaymentMethodCriteria")
    protected List<PaymentMethodCriteriaType> paymentMethodCriteria;
    @XmlElement(name = "PaymentProcessingDetails")
    protected List<PaymentProcessingDetailsType> paymentProcessingDetails;

    /**
     * Gets the value of the paymentMethodCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethodCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethodCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodCriteriaType }
     * 
     * 
     */
    public List<PaymentMethodCriteriaType> getPaymentMethodCriteria() {
        if (paymentMethodCriteria == null) {
            paymentMethodCriteria = new ArrayList<PaymentMethodCriteriaType>();
        }
        return this.paymentMethodCriteria;
    }

    /**
     * Gets the value of the paymentProcessingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentProcessingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentProcessingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentProcessingDetailsType }
     * 
     * 
     */
    public List<PaymentProcessingDetailsType> getPaymentProcessingDetails() {
        if (paymentProcessingDetails == null) {
            paymentProcessingDetails = new ArrayList<PaymentProcessingDetailsType>();
        }
        return this.paymentProcessingDetails;
    }

}
