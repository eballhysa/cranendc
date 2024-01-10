
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A device that enables its owner (the cardholder) to make a payment by electronic funds transfer.
 * 
 * <p>Java class for PaymentCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardBrandCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CreditCardVendorCodeType"/>
 *         &lt;element name="CardHolderName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NameType" minOccurs="0"/>
 *         &lt;element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaymentCardNumberType" minOccurs="0"/>
 *         &lt;element name="CardProductTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="CardSecurityCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="CardSeqNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NumberType" minOccurs="0"/>
 *         &lt;element name="CardTypeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="CryptographyKey" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CryptographyKeyType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PayCardDateTextType" minOccurs="0"/>
 *         &lt;element name="Last4DigitsText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}Last4DigitsTextType" minOccurs="0"/>
 *         &lt;element name="ProtectedCardID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="ReconciliationID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="SecurePaymentAuthenticationInstructionsVersion1" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}SecurePaymentAuthenticationInstructionsVersion1Type" minOccurs="0"/>
 *         &lt;element name="SecurePaymentAuthenticationInstructionsVersion2" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}SecurePaymentAuthenticationInstructionsVersion2Type" minOccurs="0"/>
 *         &lt;element name="SecureProgram" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}SecureProgramType" minOccurs="0"/>
 *         &lt;element name="SellerOwnCardInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="VerificationInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardType", propOrder = {
    "cardBrandCode",
    "cardHolderName",
    "cardIssuingCountryCode",
    "cardNumber",
    "cardProductTypeCode",
    "cardSecurityCode",
    "cardSeqNumber",
    "cardTypeText",
    "cryptographyKey",
    "expirationDate",
    "last4DigitsText",
    "protectedCardID",
    "reconciliationID",
    "securePaymentAuthenticationInstructionsVersion1",
    "securePaymentAuthenticationInstructionsVersion2",
    "secureProgram",
    "sellerOwnCardInd",
    "verificationInd"
})
public class PaymentCardType {

    @XmlElement(name = "CardBrandCode", required = true)
    protected String cardBrandCode;
    @XmlElement(name = "CardHolderName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardHolderName;
    @XmlElement(name = "CardIssuingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardIssuingCountryCode;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "CardProductTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardProductTypeCode;
    @XmlElement(name = "CardSecurityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardSecurityCode;
    @XmlElement(name = "CardSeqNumber")
    protected BigDecimal cardSeqNumber;
    @XmlElement(name = "CardTypeText")
    protected String cardTypeText;
    @XmlElement(name = "CryptographyKey")
    protected CryptographyKeyType cryptographyKey;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "Last4DigitsText")
    protected String last4DigitsText;
    @XmlElement(name = "ProtectedCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String protectedCardID;
    @XmlElement(name = "ReconciliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reconciliationID;
    @XmlElement(name = "SecurePaymentAuthenticationInstructionsVersion1")
    protected SecurePaymentAuthenticationInstructionsVersion1Type securePaymentAuthenticationInstructionsVersion1;
    @XmlElement(name = "SecurePaymentAuthenticationInstructionsVersion2")
    protected SecurePaymentAuthenticationInstructionsVersion2Type securePaymentAuthenticationInstructionsVersion2;
    @XmlElement(name = "SecureProgram")
    protected SecureProgramType secureProgram;
    @XmlElement(name = "SellerOwnCardInd")
    protected Boolean sellerOwnCardInd;
    @XmlElement(name = "VerificationInd")
    protected Boolean verificationInd;

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
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
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
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
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
     * Gets the value of the cardSecurityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    /**
     * Sets the value of the cardSecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSecurityCode(String value) {
        this.cardSecurityCode = value;
    }

    /**
     * Gets the value of the cardSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardSeqNumber() {
        return cardSeqNumber;
    }

    /**
     * Sets the value of the cardSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCardSeqNumber(BigDecimal value) {
        this.cardSeqNumber = value;
    }

    /**
     * Gets the value of the cardTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeText() {
        return cardTypeText;
    }

    /**
     * Sets the value of the cardTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeText(String value) {
        this.cardTypeText = value;
    }

    /**
     * Gets the value of the cryptographyKey property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographyKeyType }
     *     
     */
    public CryptographyKeyType getCryptographyKey() {
        return cryptographyKey;
    }

    /**
     * Sets the value of the cryptographyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographyKeyType }
     *     
     */
    public void setCryptographyKey(CryptographyKeyType value) {
        this.cryptographyKey = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the last4DigitsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast4DigitsText() {
        return last4DigitsText;
    }

    /**
     * Sets the value of the last4DigitsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast4DigitsText(String value) {
        this.last4DigitsText = value;
    }

    /**
     * Gets the value of the protectedCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedCardID() {
        return protectedCardID;
    }

    /**
     * Sets the value of the protectedCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedCardID(String value) {
        this.protectedCardID = value;
    }

    /**
     * Gets the value of the reconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Sets the value of the reconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

    /**
     * Gets the value of the securePaymentAuthenticationInstructionsVersion1 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAuthenticationInstructionsVersion1Type }
     *     
     */
    public SecurePaymentAuthenticationInstructionsVersion1Type getSecurePaymentAuthenticationInstructionsVersion1() {
        return securePaymentAuthenticationInstructionsVersion1;
    }

    /**
     * Sets the value of the securePaymentAuthenticationInstructionsVersion1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAuthenticationInstructionsVersion1Type }
     *     
     */
    public void setSecurePaymentAuthenticationInstructionsVersion1(SecurePaymentAuthenticationInstructionsVersion1Type value) {
        this.securePaymentAuthenticationInstructionsVersion1 = value;
    }

    /**
     * Gets the value of the securePaymentAuthenticationInstructionsVersion2 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAuthenticationInstructionsVersion2Type }
     *     
     */
    public SecurePaymentAuthenticationInstructionsVersion2Type getSecurePaymentAuthenticationInstructionsVersion2() {
        return securePaymentAuthenticationInstructionsVersion2;
    }

    /**
     * Sets the value of the securePaymentAuthenticationInstructionsVersion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAuthenticationInstructionsVersion2Type }
     *     
     */
    public void setSecurePaymentAuthenticationInstructionsVersion2(SecurePaymentAuthenticationInstructionsVersion2Type value) {
        this.securePaymentAuthenticationInstructionsVersion2 = value;
    }

    /**
     * Gets the value of the secureProgram property.
     * 
     * @return
     *     possible object is
     *     {@link SecureProgramType }
     *     
     */
    public SecureProgramType getSecureProgram() {
        return secureProgram;
    }

    /**
     * Sets the value of the secureProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecureProgramType }
     *     
     */
    public void setSecureProgram(SecureProgramType value) {
        this.secureProgram = value;
    }

    /**
     * Gets the value of the sellerOwnCardInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerOwnCardInd() {
        return sellerOwnCardInd;
    }

    /**
     * Sets the value of the sellerOwnCardInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerOwnCardInd(Boolean value) {
        this.sellerOwnCardInd = value;
    }

    /**
     * Gets the value of the verificationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificationInd() {
        return verificationInd;
    }

    /**
     * Sets the value of the verificationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerificationInd(Boolean value) {
        this.verificationInd = value;
    }

}
