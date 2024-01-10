
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Amount added on to a usual charge for a specific product, purpose, or service.
 * 
 * <p>Java class for SurchargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurchargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllRefundableInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}IndType" minOccurs="0"/>
 *         &lt;element name="Breakdown" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}FeeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurchargeType", propOrder = {
    "allRefundableInd",
    "breakdown",
    "totalAmount"
})
public class SurchargeType {

    @XmlElement(name = "AllRefundableInd")
    protected Boolean allRefundableInd;
    @XmlElement(name = "Breakdown")
    protected List<FeeType> breakdown;
    @XmlElement(name = "TotalAmount")
    protected AmountType totalAmount;

    /**
     * Gets the value of the allRefundableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllRefundableInd() {
        return allRefundableInd;
    }

    /**
     * Sets the value of the allRefundableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllRefundableInd(Boolean value) {
        this.allRefundableInd = value;
    }

    /**
     * Gets the value of the breakdown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakdown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBreakdown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getBreakdown() {
        if (breakdown == null) {
            breakdown = new ArrayList<FeeType>();
        }
        return this.breakdown;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

}
