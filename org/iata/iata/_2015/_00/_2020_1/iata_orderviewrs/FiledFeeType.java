
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Filed fee information relating to a coupon, including the Bankers Seller Rate used to convert the filed amount into the currency of payment.
 * 
 * <p>Java class for FiledFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiledFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankersSellerRate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}RateType"/>
 *         &lt;element name="FeeAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiledFeeType", propOrder = {
    "bankersSellerRate",
    "feeAmount"
})
public class FiledFeeType {

    @XmlElement(name = "BankersSellerRate", required = true)
    protected RateType bankersSellerRate;
    @XmlElement(name = "FeeAmount", required = true)
    protected AmountType feeAmount;

    /**
     * Gets the value of the bankersSellerRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getBankersSellerRate() {
        return bankersSellerRate;
    }

    /**
     * Sets the value of the bankersSellerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setBankersSellerRate(RateType value) {
        this.bankersSellerRate = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFeeAmount(AmountType value) {
        this.feeAmount = value;
    }

}
