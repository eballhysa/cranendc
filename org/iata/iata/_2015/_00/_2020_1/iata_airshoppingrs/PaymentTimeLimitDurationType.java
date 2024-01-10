
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for PaymentTimeLimitDurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTimeLimitDurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentTimeLimitDuration" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}DurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTimeLimitDurationType", propOrder = {
    "paymentTimeLimitDuration"
})
public class PaymentTimeLimitDurationType {

    @XmlElement(name = "PaymentTimeLimitDuration")
    protected Duration paymentTimeLimitDuration;

    /**
     * Gets the value of the paymentTimeLimitDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPaymentTimeLimitDuration() {
        return paymentTimeLimitDuration;
    }

    /**
     * Sets the value of the paymentTimeLimitDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPaymentTimeLimitDuration(Duration value) {
        this.paymentTimeLimitDuration = value;
    }

}
