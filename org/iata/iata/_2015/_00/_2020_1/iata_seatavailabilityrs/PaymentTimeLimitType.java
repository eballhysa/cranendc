
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This node is used to indicate by when payment commitment must be received for confirmed Order Item in an Order.
 *  
 *  To indicate instant payment, the duration field should be populated with a value of 0.
 *  
 *  If no value is returned, then no advice has been given.
 * 
 * <p>Java class for PaymentTimeLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTimeLimitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PaymentTimeLimitDuration" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}DurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTimeLimitType", propOrder = {
    "paymentTimeLimitDateTime",
    "paymentTimeLimitDuration"
})
public class PaymentTimeLimitType {

    @XmlElement(name = "PaymentTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentTimeLimitDateTime;
    @XmlElement(name = "PaymentTimeLimitDuration")
    protected Duration paymentTimeLimitDuration;

    /**
     * Gets the value of the paymentTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentTimeLimitDateTime() {
        return paymentTimeLimitDateTime;
    }

    /**
     * Sets the value of the paymentTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentTimeLimitDateTime(XMLGregorianCalendar value) {
        this.paymentTimeLimitDateTime = value;
    }

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
