
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
 * 
 * <p>Java class for PaymentMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherPaymentMethod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}OtherPaymentMethodType" minOccurs="0"/>
 *         &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PaymentCardType" minOccurs="0"/>
 *         &lt;element name="PaymentRedirection" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PaymentRedirectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodType", propOrder = {
    "otherPaymentMethod",
    "paymentCard",
    "paymentRedirection"
})
public class PaymentMethodType {

    @XmlElement(name = "OtherPaymentMethod")
    protected OtherPaymentMethodType otherPaymentMethod;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "PaymentRedirection")
    protected PaymentRedirectionType paymentRedirection;

    /**
     * Gets the value of the otherPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public OtherPaymentMethodType getOtherPaymentMethod() {
        return otherPaymentMethod;
    }

    /**
     * Sets the value of the otherPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public void setOtherPaymentMethod(OtherPaymentMethodType value) {
        this.otherPaymentMethod = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the paymentRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRedirectionType }
     *     
     */
    public PaymentRedirectionType getPaymentRedirection() {
        return paymentRedirection;
    }

    /**
     * Sets the value of the paymentRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRedirectionType }
     *     
     */
    public void setPaymentRedirection(PaymentRedirectionType value) {
        this.paymentRedirection = value;
    }

}
