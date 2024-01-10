
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Requested card issuer type and identification number.
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
 *         &lt;element name="CardBrandCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CreditCardVendorCodeType"/>
 *         &lt;element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CardProductTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="IssuerIdentificationNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="SecurePaymentAuthenticationVersion" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}SecurePaymentAuthenticationVersionType" minOccurs="0"/>
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
    "securePaymentAuthenticationVersion"
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
    protected BigDecimal issuerIdentificationNumber;
    @XmlElement(name = "SecurePaymentAuthenticationVersion")
    protected SecurePaymentAuthenticationVersionType securePaymentAuthenticationVersion;

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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIssuerIdentificationNumber() {
        return issuerIdentificationNumber;
    }

    /**
     * Sets the value of the issuerIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIssuerIdentificationNumber(BigDecimal value) {
        this.issuerIdentificationNumber = value;
    }

    /**
     * Gets the value of the securePaymentAuthenticationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAuthenticationVersionType }
     *     
     */
    public SecurePaymentAuthenticationVersionType getSecurePaymentAuthenticationVersion() {
        return securePaymentAuthenticationVersion;
    }

    /**
     * Sets the value of the securePaymentAuthenticationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAuthenticationVersionType }
     *     
     */
    public void setSecurePaymentAuthenticationVersion(SecurePaymentAuthenticationVersionType value) {
        this.securePaymentAuthenticationVersion = value;
    }

}
