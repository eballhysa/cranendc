
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

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
 *         &lt;element name="IATA_EasyPay" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}IATA_EasyPayType" minOccurs="0"/>
 *         &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}PaymentCardType" minOccurs="0"/>
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
    "iataEasyPay",
    "paymentCard"
})
public class PaymentMethodType {

    @XmlElement(name = "IATA_EasyPay")
    protected IATAEasyPayType iataEasyPay;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;

    /**
     * Gets the value of the iataEasyPay property.
     * 
     * @return
     *     possible object is
     *     {@link IATAEasyPayType }
     *     
     */
    public IATAEasyPayType getIATAEasyPay() {
        return iataEasyPay;
    }

    /**
     * Sets the value of the iataEasyPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAEasyPayType }
     *     
     */
    public void setIATAEasyPay(IATAEasyPayType value) {
        this.iataEasyPay = value;
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

}
