
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Payment card specific filter criteria for shopping requests, including card issuer type and identification number.
 * 
 * <p>Java class for PaymentCardCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardBrandCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CreditCardVendorCodeType"/>
 *         &lt;element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CardProductTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="IssuerIdentificationNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IIN_NumberType" minOccurs="0"/>
 *         &lt;element name="SecurePayerAuthenticationVersion" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}SecurePayerAuthenticationVersionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardCriteriaType", propOrder = {
    "cardBrandCode",
    "cardIssuingCountryCode",
    "cardProductTypeCode",
    "issuerIdentificationNumber",
    "securePayerAuthenticationVersion"
})
public class PaymentCardCriteriaType {

    @XmlElement(name = "CardBrandCode", required = true)
    protected String cardBrandCode;
    @XmlElement(name = "CardIssuingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardIssuingCountryCode;
    @XmlElement(name = "CardProductTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardProductTypeCode;
    @XmlElement(name = "IssuerIdentificationNumber")
    protected String issuerIdentificationNumber;
    @XmlElement(name = "SecurePayerAuthenticationVersion")
    protected SecurePayerAuthenticationVersionType securePayerAuthenticationVersion;

    /**
     * Gets the value of the cardBrandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrandCode() {
        return cardBrandCode;
    }

    /**
     * Sets the value of the cardBrandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBrandCode(String value) {
        this.cardBrandCode = value;
    }

    /**
     * Gets the value of the cardIssuingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuingCountryCode() {
        return cardIssuingCountryCode;
    }

    /**
     * Sets the value of the cardIssuingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuingCountryCode(String value) {
        this.cardIssuingCountryCode = value;
    }

    /**
     * Gets the value of the cardProductTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProductTypeCode() {
        return cardProductTypeCode;
    }

    /**
     * Sets the value of the cardProductTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProductTypeCode(String value) {
        this.cardProductTypeCode = value;
    }

    /**
     * Gets the value of the issuerIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerIdentificationNumber() {
        return issuerIdentificationNumber;
    }

    /**
     * Sets the value of the issuerIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerIdentificationNumber(String value) {
        this.issuerIdentificationNumber = value;
    }

    /**
     * Gets the value of the securePayerAuthenticationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePayerAuthenticationVersionType }
     *     
     */
    public SecurePayerAuthenticationVersionType getSecurePayerAuthenticationVersion() {
        return securePayerAuthenticationVersion;
    }

    /**
     * Sets the value of the securePayerAuthenticationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePayerAuthenticationVersionType }
     *     
     */
    public void setSecurePayerAuthenticationVersion(SecurePayerAuthenticationVersionType value) {
        this.securePayerAuthenticationVersion = value;
    }

}
