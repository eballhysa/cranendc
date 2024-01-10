
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AlaCarteOfferItemPaymentTimeLimit
 * 
 * <p>Java class for AlaCarteOfferItemPaymentTimeLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlaCarteOfferItemPaymentTimeLimitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PaymentTimeLimitDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PaymentTimeLimitDateType"/>
 *         &lt;element name="PaymentTimeLimitDuration" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PaymentTimeLimitDurationType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlaCarteOfferItemPaymentTimeLimitType", propOrder = {
    "paymentTimeLimitDate",
    "paymentTimeLimitDuration"
})
public class AlaCarteOfferItemPaymentTimeLimitType {

    @XmlElement(name = "PaymentTimeLimitDate")
    protected PaymentTimeLimitDateType paymentTimeLimitDate;
    @XmlElement(name = "PaymentTimeLimitDuration")
    protected PaymentTimeLimitDurationType paymentTimeLimitDuration;

    /**
     * Gets the value of the paymentTimeLimitDate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTimeLimitDateType }
     *     
     */
    public PaymentTimeLimitDateType getPaymentTimeLimitDate() {
        return paymentTimeLimitDate;
    }

    /**
     * Sets the value of the paymentTimeLimitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTimeLimitDateType }
     *     
     */
    public void setPaymentTimeLimitDate(PaymentTimeLimitDateType value) {
        this.paymentTimeLimitDate = value;
    }

    /**
     * Gets the value of the paymentTimeLimitDuration property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTimeLimitDurationType }
     *     
     */
    public PaymentTimeLimitDurationType getPaymentTimeLimitDuration() {
        return paymentTimeLimitDuration;
    }

    /**
     * Sets the value of the paymentTimeLimitDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTimeLimitDurationType }
     *     
     */
    public void setPaymentTimeLimitDuration(PaymentTimeLimitDurationType value) {
        this.paymentTimeLimitDuration = value;
    }

}
