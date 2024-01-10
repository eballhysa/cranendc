
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 *         &lt;element name="AuthenticationTransactionIdentifier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="MerchantData" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="PayerAuthenticationRequestText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="RedirectionURL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}URI_Type" minOccurs="0"/>
 *         &lt;element name="TerminationURL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}URI_Type" minOccurs="0"/>
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
    "authenticationTransactionIdentifier",
    "merchantData",
    "payerAuthenticationRequestText",
    "redirectionURL",
    "terminationURL"
})
public class SecurePaymentAuthenticationInstructionsVersion1Type {

    @XmlElement(name = "AuthenticationTransactionIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authenticationTransactionIdentifier;
    @XmlElement(name = "MerchantData")
    protected String merchantData;
    @XmlElement(name = "PayerAuthenticationRequestText")
    protected String payerAuthenticationRequestText;
    @XmlElement(name = "RedirectionURL")
    @XmlSchemaType(name = "anyURI")
    protected String redirectionURL;
    @XmlElement(name = "TerminationURL")
    @XmlSchemaType(name = "anyURI")
    protected String terminationURL;

    /**
     * Gets the value of the authenticationTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTransactionIdentifier() {
        return authenticationTransactionIdentifier;
    }

    /**
     * Sets the value of the authenticationTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTransactionIdentifier(String value) {
        this.authenticationTransactionIdentifier = value;
    }

    /**
     * Gets the value of the merchantData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantData() {
        return merchantData;
    }

    /**
     * Sets the value of the merchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantData(String value) {
        this.merchantData = value;
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
     * Gets the value of the redirectionURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectionURL() {
        return redirectionURL;
    }

    /**
     * Sets the value of the redirectionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectionURL(String value) {
        this.redirectionURL = value;
    }

    /**
     * Gets the value of the terminationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationURL() {
        return terminationURL;
    }

    /**
     * Sets the value of the terminationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationURL(String value) {
        this.terminationURL = value;
    }

}
