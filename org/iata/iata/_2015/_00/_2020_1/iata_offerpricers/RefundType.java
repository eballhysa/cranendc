
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Contains refund type, payment type and amount attributes for a specific product, purpose, or service.
 * 
 * <p>Java class for RefundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}TextType"/>
 *         &lt;element name="FixedAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}AmountType" minOccurs="0"/>
 *         &lt;element name="LevelTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}RefundLevelTypeCodeType" minOccurs="0"/>
 *         &lt;element name="MaximumAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}AmountType" minOccurs="0"/>
 *         &lt;element name="MinimumAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}PaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="Percent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}PercentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundType", propOrder = {
    "descText",
    "fixedAmount",
    "levelTypeCode",
    "maximumAmount",
    "minimumAmount",
    "paymentTypeCode",
    "percent"
})
public class RefundType {

    @XmlElement(name = "DescText", required = true)
    protected String descText;
    @XmlElement(name = "FixedAmount")
    protected AmountType fixedAmount;
    @XmlElement(name = "LevelTypeCode")
    @XmlSchemaType(name = "token")
    protected RefundLevelTypeCodeContentType levelTypeCode;
    @XmlElement(name = "MaximumAmount")
    protected AmountType maximumAmount;
    @XmlElement(name = "MinimumAmount")
    protected AmountType minimumAmount;
    @XmlElement(name = "PaymentTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentTypeCode;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the fixedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixedAmount() {
        return fixedAmount;
    }

    /**
     * Sets the value of the fixedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFixedAmount(AmountType value) {
        this.fixedAmount = value;
    }

    /**
     * Gets the value of the levelTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RefundLevelTypeCodeContentType }
     *     
     */
    public RefundLevelTypeCodeContentType getLevelTypeCode() {
        return levelTypeCode;
    }

    /**
     * Sets the value of the levelTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundLevelTypeCodeContentType }
     *     
     */
    public void setLevelTypeCode(RefundLevelTypeCodeContentType value) {
        this.levelTypeCode = value;
    }

    /**
     * Gets the value of the maximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Sets the value of the maximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumAmount(AmountType value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the minimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Sets the value of the minimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumAmount(AmountType value) {
        this.minimumAmount = value;
    }

    /**
     * Gets the value of the paymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeCode(String value) {
        this.paymentTypeCode = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

}
