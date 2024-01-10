
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 *         &lt;element name="AmountRangeMaximumAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountRangeMinimumAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="PercentageRangeMaximumPercent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PercentType" minOccurs="0"/>
 *         &lt;element name="PercentageRangeMinimumPercent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PercentType" minOccurs="0"/>
 *         &lt;element name="RoundingNumberOfDecimalsNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="RoundingPrecisionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}RoundingPrecisionCodeType" minOccurs="0"/>
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
    "amountRangeMaximumAmount",
    "amountRangeMinimumAmount",
    "percentageRangeMaximumPercent",
    "percentageRangeMinimumPercent",
    "roundingNumberOfDecimalsNumber",
    "roundingPrecisionCode"
})
public class SurchargeInfoType {

    @XmlElement(name = "AmountRangeMaximumAmount")
    protected AmountType amountRangeMaximumAmount;
    @XmlElement(name = "AmountRangeMinimumAmount")
    protected AmountType amountRangeMinimumAmount;
    @XmlElement(name = "PercentageRangeMaximumPercent")
    protected BigDecimal percentageRangeMaximumPercent;
    @XmlElement(name = "PercentageRangeMinimumPercent")
    protected BigDecimal percentageRangeMinimumPercent;
    @XmlElement(name = "RoundingNumberOfDecimalsNumber")
    protected BigDecimal roundingNumberOfDecimalsNumber;
    @XmlElement(name = "RoundingPrecisionCode")
    @XmlSchemaType(name = "token")
    protected RoundingPrecisionCodeContentType roundingPrecisionCode;

    /**
     * Gets the value of the amountRangeMaximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountRangeMaximumAmount() {
        return amountRangeMaximumAmount;
    }

    /**
     * Sets the value of the amountRangeMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountRangeMaximumAmount(AmountType value) {
        this.amountRangeMaximumAmount = value;
    }

    /**
     * Gets the value of the amountRangeMinimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountRangeMinimumAmount() {
        return amountRangeMinimumAmount;
    }

    /**
     * Sets the value of the amountRangeMinimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountRangeMinimumAmount(AmountType value) {
        this.amountRangeMinimumAmount = value;
    }

    /**
     * Gets the value of the percentageRangeMaximumPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageRangeMaximumPercent() {
        return percentageRangeMaximumPercent;
    }

    /**
     * Sets the value of the percentageRangeMaximumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageRangeMaximumPercent(BigDecimal value) {
        this.percentageRangeMaximumPercent = value;
    }

    /**
     * Gets the value of the percentageRangeMinimumPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageRangeMinimumPercent() {
        return percentageRangeMinimumPercent;
    }

    /**
     * Sets the value of the percentageRangeMinimumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageRangeMinimumPercent(BigDecimal value) {
        this.percentageRangeMinimumPercent = value;
    }

    /**
     * Gets the value of the roundingNumberOfDecimalsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundingNumberOfDecimalsNumber() {
        return roundingNumberOfDecimalsNumber;
    }

    /**
     * Sets the value of the roundingNumberOfDecimalsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoundingNumberOfDecimalsNumber(BigDecimal value) {
        this.roundingNumberOfDecimalsNumber = value;
    }

    /**
     * Gets the value of the roundingPrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingPrecisionCodeContentType }
     *     
     */
    public RoundingPrecisionCodeContentType getRoundingPrecisionCode() {
        return roundingPrecisionCode;
    }

    /**
     * Sets the value of the roundingPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingPrecisionCodeContentType }
     *     
     */
    public void setRoundingPrecisionCode(RoundingPrecisionCodeContentType value) {
        this.roundingPrecisionCode = value;
    }

}
