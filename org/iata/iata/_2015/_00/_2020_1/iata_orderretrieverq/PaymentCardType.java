
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

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
 *         &lt;element name="CardHolderName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}NameType" minOccurs="0"/>
 *         &lt;element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}PaymentCardNumberType" minOccurs="0"/>
 *         &lt;element name="CardProductTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="CardSecurityCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="CardSeqNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="CardTypeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}TextType" minOccurs="0"/>
 *         &lt;element name="CreditCardVendorCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CreditCardVendorCodeType" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}PayCardDateTextType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}PayCardDateTextType" minOccurs="0"/>
 *         &lt;element name="MaskedCardID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}MaskedCardID_Type" minOccurs="0"/>
 *         &lt;element name="PaymentRedirectionInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}IndType" minOccurs="0"/>
 *         &lt;element name="ReconciliationID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="SellerOwnCardInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}IndType" minOccurs="0"/>
 *         &lt;element name="TokenizedCardID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="VerificationInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}IndType" minOccurs="0"/>
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
    "cardHolderName",
    "cardIssuingCountryCode",
    "cardNumber",
    "cardProductTypeCode",
    "cardSecurityCode",
    "cardSeqNumber",
    "cardTypeText",
    "creditCardVendorCode",
    "effectiveDate",
    "expirationDate",
    "maskedCardID",
    "paymentRedirectionInd",
    "reconciliationID",
    "sellerOwnCardInd",
    "tokenizedCardID",
    "verificationInd"
})
public class PaymentCardType {

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
    @XmlElement(name = "CreditCardVendorCode")
    protected String creditCardVendorCode;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "MaskedCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String maskedCardID;
    @XmlElement(name = "PaymentRedirectionInd")
    protected Boolean paymentRedirectionInd;
    @XmlElement(name = "ReconciliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reconciliationID;
    @XmlElement(name = "SellerOwnCardInd")
    protected Boolean sellerOwnCardInd;
    @XmlElement(name = "TokenizedCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tokenizedCardID;
    @XmlElement(name = "VerificationInd")
    protected Boolean verificationInd;

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
     * Gets the value of the creditCardVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardVendorCode() {
        return creditCardVendorCode;
    }

    /**
     * Sets the value of the creditCardVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardVendorCode(String value) {
        this.creditCardVendorCode = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
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
     * Gets the value of the maskedCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCardID() {
        return maskedCardID;
    }

    /**
     * Sets the value of the maskedCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCardID(String value) {
        this.maskedCardID = value;
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
     * Gets the value of the tokenizedCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenizedCardID() {
        return tokenizedCardID;
    }

    /**
     * Sets the value of the tokenizedCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenizedCardID(String value) {
        this.tokenizedCardID = value;
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
