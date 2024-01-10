
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about surcharges for payment methods.
 * 
 * <p>Java class for SurchargeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurchargeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentFeeAmountRangeMaximumAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentFeeAmountRangeMinimumAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentFeePercentageRangeMaximumPercent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}PercentType"/>
 *         &lt;element name="PaymentFeePercentageRangeMinimumPercent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}PercentType" minOccurs="0"/>
 *         &lt;element name="PaymentFeeRoundingNumberOfDecimalsNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="PaymentFeeRoundingPrecisionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}RoundingPrecisionCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurchargeInfoType", propOrder = {
    "paymentFeeAmountRangeMaximumAmount",
    "paymentFeeAmountRangeMinimumAmount",
    "paymentFeePercentageRangeMaximumPercent",
    "paymentFeePercentageRangeMinimumPercent",
    "paymentFeeRoundingNumberOfDecimalsNumber",
    "paymentFeeRoundingPrecisionCode"
})
public class SurchargeInfoType {

    @XmlElement(name = "PaymentFeeAmountRangeMaximumAmount")
    protected AmountType paymentFeeAmountRangeMaximumAmount;
    @XmlElement(name = "PaymentFeeAmountRangeMinimumAmount")
    protected AmountType paymentFeeAmountRangeMinimumAmount;
    @XmlElement(name = "PaymentFeePercentageRangeMaximumPercent", required = true)
    protected BigDecimal paymentFeePercentageRangeMaximumPercent;
    @XmlElement(name = "PaymentFeePercentageRangeMinimumPercent")
    protected BigDecimal paymentFeePercentageRangeMinimumPercent;
    @XmlElement(name = "PaymentFeeRoundingNumberOfDecimalsNumber")
    protected BigDecimal paymentFeeRoundingNumberOfDecimalsNumber;
    @XmlElement(name = "PaymentFeeRoundingPrecisionCode")
    @XmlSchemaType(name = "token")
    protected RoundingPrecisionCodeContentType paymentFeeRoundingPrecisionCode;

    /**
     * Gets the value of the paymentFeeAmountRangeMaximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentFeeAmountRangeMaximumAmount() {
        return paymentFeeAmountRangeMaximumAmount;
    }

    /**
     * Sets the value of the paymentFeeAmountRangeMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentFeeAmountRangeMaximumAmount(AmountType value) {
        this.paymentFeeAmountRangeMaximumAmount = value;
    }

    /**
     * Gets the value of the paymentFeeAmountRangeMinimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentFeeAmountRangeMinimumAmount() {
        return paymentFeeAmountRangeMinimumAmount;
    }

    /**
     * Sets the value of the paymentFeeAmountRangeMinimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentFeeAmountRangeMinimumAmount(AmountType value) {
        this.paymentFeeAmountRangeMinimumAmount = value;
    }

    /**
     * Gets the value of the paymentFeePercentageRangeMaximumPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentFeePercentageRangeMaximumPercent() {
        return paymentFeePercentageRangeMaximumPercent;
    }

    /**
     * Sets the value of the paymentFeePercentageRangeMaximumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentFeePercentageRangeMaximumPercent(BigDecimal value) {
        this.paymentFeePercentageRangeMaximumPercent = value;
    }

    /**
     * Gets the value of the paymentFeePercentageRangeMinimumPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentFeePercentageRangeMinimumPercent() {
        return paymentFeePercentageRangeMinimumPercent;
    }

    /**
     * Sets the value of the paymentFeePercentageRangeMinimumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentFeePercentageRangeMinimumPercent(BigDecimal value) {
        this.paymentFeePercentageRangeMinimumPercent = value;
    }

    /**
     * Gets the value of the paymentFeeRoundingNumberOfDecimalsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentFeeRoundingNumberOfDecimalsNumber() {
        return paymentFeeRoundingNumberOfDecimalsNumber;
    }

    /**
     * Sets the value of the paymentFeeRoundingNumberOfDecimalsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentFeeRoundingNumberOfDecimalsNumber(BigDecimal value) {
        this.paymentFeeRoundingNumberOfDecimalsNumber = value;
    }

    /**
     * Gets the value of the paymentFeeRoundingPrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingPrecisionCodeContentType }
     *     
     */
    public RoundingPrecisionCodeContentType getPaymentFeeRoundingPrecisionCode() {
        return paymentFeeRoundingPrecisionCode;
    }

    /**
     * Sets the value of the paymentFeeRoundingPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingPrecisionCodeContentType }
     *     
     */
    public void setPaymentFeeRoundingPrecisionCode(RoundingPrecisionCodeContentType value) {
        this.paymentFeeRoundingPrecisionCode = value;
    }

}
