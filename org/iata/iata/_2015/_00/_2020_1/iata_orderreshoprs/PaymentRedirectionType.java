
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

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
 *         &lt;element name="ExpirationDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PaymentRedirectionURI" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}URI_Type" minOccurs="0"/>
 *         &lt;element name="RedirectionAcceptanceInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType"/>
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
    "paymentRedirectionURI",
    "redirectionAcceptanceInd"
})
public class PaymentRedirectionType {

    @XmlElement(name = "ExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "PaymentRedirectionURI")
    @XmlSchemaType(name = "anyURI")
    protected String paymentRedirectionURI;
    @XmlElement(name = "RedirectionAcceptanceInd")
    protected boolean redirectionAcceptanceInd;

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

    /**
     * Gets the value of the redirectionAcceptanceInd property.
     * 
     */
    public boolean isRedirectionAcceptanceInd() {
        return redirectionAcceptanceInd;
    }

    /**
     * Sets the value of the redirectionAcceptanceInd property.
     * 
     */
    public void setRedirectionAcceptanceInd(boolean value) {
        this.redirectionAcceptanceInd = value;
    }

}
