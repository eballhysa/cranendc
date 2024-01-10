
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data returned from the Directory Server/ACS containing the PAReq and the ACS URL that enable to cardholder to authenticate.
 *  
 *  Applicable for 3D Secure Version V 1.0.
 * 
 * <p>Java class for SecurePaymentAuthenticationInstructionsVersion1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurePaymentAuthenticationInstructionsVersion1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationTrxID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="MerchantDataText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}TextType" minOccurs="0"/>
 *         &lt;element name="PayerAuthenticationRequestText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}TextType" minOccurs="0"/>
 *         &lt;element name="RedirectionURI" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}URI_Type" minOccurs="0"/>
 *         &lt;element name="TerminationURI" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePaymentAuthenticationInstructionsVersion1Type", propOrder = {
    "authenticationTrxID",
    "merchantDataText",
    "payerAuthenticationRequestText",
    "redirectionURI",
    "terminationURI"
})
public class SecurePaymentAuthenticationInstructionsVersion1Type {

    @XmlElement(name = "AuthenticationTrxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authenticationTrxID;
    @XmlElement(name = "MerchantDataText")
    protected String merchantDataText;
    @XmlElement(name = "PayerAuthenticationRequestText")
    protected String payerAuthenticationRequestText;
    @XmlElement(name = "RedirectionURI")
    @XmlSchemaType(name = "anyURI")
    protected String redirectionURI;
    @XmlElement(name = "TerminationURI")
    @XmlSchemaType(name = "anyURI")
    protected String terminationURI;

    /**
     * Gets the value of the authenticationTrxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTrxID() {
        return authenticationTrxID;
    }

    /**
     * Sets the value of the authenticationTrxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTrxID(String value) {
        this.authenticationTrxID = value;
    }

    /**
     * Gets the value of the merchantDataText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDataText() {
        return merchantDataText;
    }

    /**
     * Sets the value of the merchantDataText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDataText(String value) {
        this.merchantDataText = value;
    }

    /**
     * Gets the value of the payerAuthenticationRequestText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthenticationRequestText() {
        return payerAuthenticationRequestText;
    }

    /**
     * Sets the value of the payerAuthenticationRequestText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthenticationRequestText(String value) {
        this.payerAuthenticationRequestText = value;
    }

    /**
     * Gets the value of the redirectionURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectionURI() {
        return redirectionURI;
    }

    /**
     * Sets the value of the redirectionURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectionURI(String value) {
        this.redirectionURI = value;
    }

    /**
     * Gets the value of the terminationURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationURI() {
        return terminationURI;
    }

    /**
     * Sets the value of the terminationURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationURI(String value) {
        this.terminationURI = value;
    }

}
