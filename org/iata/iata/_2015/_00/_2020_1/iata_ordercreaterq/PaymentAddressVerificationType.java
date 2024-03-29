
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Secure Payment-related Processing information, including AVS/ CVV Verification Results and Secure Payment Processing Results.
 * 
 * <p>Java class for PaymentAddressVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentAddressVerificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressVerificationInvalidInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}IndType" minOccurs="0"/>
 *         &lt;element name="AddressVerificationNoMatchInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}IndType" minOccurs="0"/>
 *         &lt;element name="AddressVerificationStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="AddressVerificationText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAddressVerificationType", propOrder = {
    "addressVerificationInvalidInd",
    "addressVerificationNoMatchInd",
    "addressVerificationStatusCode",
    "addressVerificationText"
})
public class PaymentAddressVerificationType {

    @XmlElement(name = "AddressVerificationInvalidInd")
    protected Boolean addressVerificationInvalidInd;
    @XmlElement(name = "AddressVerificationNoMatchInd")
    protected Boolean addressVerificationNoMatchInd;
    @XmlElement(name = "AddressVerificationStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addressVerificationStatusCode;
    @XmlElement(name = "AddressVerificationText")
    protected String addressVerificationText;

    /**
     * Gets the value of the addressVerificationInvalidInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressVerificationInvalidInd() {
        return addressVerificationInvalidInd;
    }

    /**
     * Sets the value of the addressVerificationInvalidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressVerificationInvalidInd(Boolean value) {
        this.addressVerificationInvalidInd = value;
    }

    /**
     * Gets the value of the addressVerificationNoMatchInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressVerificationNoMatchInd() {
        return addressVerificationNoMatchInd;
    }

    /**
     * Sets the value of the addressVerificationNoMatchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressVerificationNoMatchInd(Boolean value) {
        this.addressVerificationNoMatchInd = value;
    }

    /**
     * Gets the value of the addressVerificationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerificationStatusCode() {
        return addressVerificationStatusCode;
    }

    /**
     * Sets the value of the addressVerificationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerificationStatusCode(String value) {
        this.addressVerificationStatusCode = value;
    }

    /**
     * Gets the value of the addressVerificationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerificationText() {
        return addressVerificationText;
    }

    /**
     * Sets the value of the addressVerificationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerificationText(String value) {
        this.addressVerificationText = value;
    }

}
