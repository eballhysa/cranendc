
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The result of converting one currency into another currency. E.g. local currency to USD, air miles to monetary.
 * 
 * <p>Java class for CurConversionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurConversionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="ConversionRate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}RateType" minOccurs="0"/>
 *         &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurConversionType", propOrder = {
    "amount",
    "conversionRate",
    "localAmount"
})
public class CurConversionType {

    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "ConversionRate")
    protected RateType conversionRate;
    @XmlElement(name = "LocalAmount")
    protected AmountType localAmount;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setConversionRate(RateType value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the localAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLocalAmount() {
        return localAmount;
    }

    /**
     * Sets the value of the localAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLocalAmount(AmountType value) {
        this.localAmount = value;
    }

}
