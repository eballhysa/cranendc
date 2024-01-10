
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the indicators and fields that convey the result of the 3D Secure authentication transaction.
 *  
 *  Applicable for 3D Secure Version V 1.0.
 * 
 * <p>Java class for SecurePaymentVersion1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurePaymentVersion1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PayerAuthenticationResponseText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePaymentVersion1Type", propOrder = {
    "payerAuthenticationResponseText"
})
public class SecurePaymentVersion1Type {

    @XmlElement(name = "PayerAuthenticationResponseText")
    protected String payerAuthenticationResponseText;

    /**
     * Gets the value of the payerAuthenticationResponseText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthenticationResponseText() {
        return payerAuthenticationResponseText;
    }

    /**
     * Sets the value of the payerAuthenticationResponseText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthenticationResponseText(String value) {
        this.payerAuthenticationResponseText = value;
    }

}
