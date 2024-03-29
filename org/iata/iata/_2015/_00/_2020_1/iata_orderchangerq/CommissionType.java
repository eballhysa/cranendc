
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
 * 
 * <p>Java class for CommissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="CommissionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="Percentage" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}PercentType" minOccurs="0"/>
 *         &lt;element name="PercentageAppliedToAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxableInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionType", propOrder = {
    "amount",
    "commissionCode",
    "percentage",
    "percentageAppliedToAmount",
    "taxableInd"
})
public class CommissionType {

    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "CommissionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commissionCode;
    @XmlElement(name = "Percentage")
    protected BigDecimal percentage;
    @XmlElement(name = "PercentageAppliedToAmount")
    protected AmountType percentageAppliedToAmount;
    @XmlElement(name = "TaxableInd")
    protected Boolean taxableInd;

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
     * Gets the value of the commissionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionCode() {
        return commissionCode;
    }

    /**
     * Sets the value of the commissionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionCode(String value) {
        this.commissionCode = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the percentageAppliedToAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPercentageAppliedToAmount() {
        return percentageAppliedToAmount;
    }

    /**
     * Sets the value of the percentageAppliedToAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPercentageAppliedToAmount(AmountType value) {
        this.percentageAppliedToAmount = value;
    }

    /**
     * Gets the value of the taxableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxableInd() {
        return taxableInd;
    }

    /**
     * Sets the value of the taxableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxableInd(Boolean value) {
        this.taxableInd = value;
    }

}
