
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * contains all the instructions for the Seller on how to redirect the Payer to their hosted payment page.
 * 
 * <p>Java class for PaymentRedirectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRedirectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpirationDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PaymentRedirectionInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         &lt;element name="PaymentRedirectionURI" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRedirectionType", propOrder = {
    "expirationDateTime",
    "paymentRedirectionInd",
    "paymentRedirectionURI"
})
public class PaymentRedirectionType {

    @XmlElement(name = "ExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "PaymentRedirectionInd")
    protected Boolean paymentRedirectionInd;
    @XmlElement(name = "PaymentRedirectionURI")
    @XmlSchemaType(name = "anyURI")
    protected String paymentRedirectionURI;

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the paymentRedirectionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentRedirectionInd() {
        return paymentRedirectionInd;
    }

    /**
     * Sets the value of the paymentRedirectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentRedirectionInd(Boolean value) {
        this.paymentRedirectionInd = value;
    }

    /**
     * Gets the value of the paymentRedirectionURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRedirectionURI() {
        return paymentRedirectionURI;
    }

    /**
     * Sets the value of the paymentRedirectionURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRedirectionURI(String value) {
        this.paymentRedirectionURI = value;
    }

}
