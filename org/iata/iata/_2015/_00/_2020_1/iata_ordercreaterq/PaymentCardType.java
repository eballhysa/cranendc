
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 *         &lt;element name="CardBrandCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CreditCardVendorCodeType" minOccurs="0"/>
 *         &lt;element name="CardHolderName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}NameType" minOccurs="0"/>
 *         &lt;element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PaymentCardNumberType" minOccurs="0"/>
 *         &lt;element name="CardProductTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="CardSecurityCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="CardSeqNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="CardTypeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="EncryptedData" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}EncryptedDataType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PayCardDateTextType" minOccurs="0"/>
 *         &lt;element name="PaymentRedirectionInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}IndType" minOccurs="0"/>
 *         &lt;element name="ProtectedCardID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="ReconciliationID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="SecurePaymentAuthenticationInstructionsVersion1" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SecurePaymentAuthenticationInstructionsVersion1Type" minOccurs="0"/>
 *         &lt;element name="SecurePaymentVersion1" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SecurePaymentVersion1Type" minOccurs="0"/>
 *         &lt;element name="SecurePaymentVersion2" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SecurePaymentVersion2Type" minOccurs="0"/>
 *         &lt;element name="SecureProgram" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SecureProgramType" minOccurs="0"/>
 *         &lt;element name="SellerOwnCardInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}IndType" minOccurs="0"/>
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
    "encryptedData",
    "expirationDate",
    "paymentRedirectionInd",
    "protectedCardID",
    "reconciliationID",
    "securePaymentAuthenticationInstructionsVersion1",
    "securePaymentVersion1",
    "securePaymentVersion2",
    "secureProgram",
    "sellerOwnCardInd"
})
public class PaymentCardType {

    @XmlElement(name = "CardBrandCode")
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
    @XmlElement(name = "EncryptedData")
    protected EncryptedDataType encryptedData;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "PaymentRedirectionInd")
    protected Boolean paymentRedirectionInd;
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
    @XmlElement(name = "SecurePaymentVersion1")
    protected SecurePaymentVersion1Type securePaymentVersion1;
    @XmlElement(name = "SecurePaymentVersion2")
    protected SecurePaymentVersion2Type securePaymentVersion2;
    @XmlElement(name = "SecureProgram")
    protected SecureProgramType secureProgram;
    @XmlElement(name = "SellerOwnCardInd")
    protected Boolean sellerOwnCardInd;

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
     * Gets the value of the encryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataType }
     *     
     */
    public EncryptedDataType getEncryptedData() {
        return encryptedData;
    }

    /**
     * Sets the value of the encryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataType }
     *     
     */
    public void setEncryptedData(EncryptedDataType value) {
        this.encryptedData = value;
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
     * Gets the value of the securePaymentVersion1 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentVersion1Type }
     *     
     */
    public SecurePaymentVersion1Type getSecurePaymentVersion1() {
        return securePaymentVersion1;
    }

    /**
     * Sets the value of the securePaymentVersion1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentVersion1Type }
     *     
     */
    public void setSecurePaymentVersion1(SecurePaymentVersion1Type value) {
        this.securePaymentVersion1 = value;
    }

    /**
     * Gets the value of the securePaymentVersion2 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentVersion2Type }
     *     
     */
    public SecurePaymentVersion2Type getSecurePaymentVersion2() {
        return securePaymentVersion2;
    }

    /**
     * Sets the value of the securePaymentVersion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentVersion2Type }
     *     
     */
    public void setSecurePaymentVersion2(SecurePaymentVersion2Type value) {
        this.securePaymentVersion2 = value;
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

}
