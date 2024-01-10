
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Tax summary information.
 * 
 * <p>Java class for TaxSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllRefundableInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="ApproximateInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="CollectionInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="GuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RefundMethodText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NameType" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalRefundableTaxAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalTaxAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxSummaryType", propOrder = {
    "allRefundableInd",
    "approximateInd",
    "collectionInd",
    "guaranteeTimeLimitDateTime",
    "refundMethodText",
    "tax",
    "totalRefundableTaxAmount",
    "totalTaxAmount"
})
public class TaxSummaryType {

    @XmlElement(name = "AllRefundableInd")
    protected Boolean allRefundableInd;
    @XmlElement(name = "ApproximateInd")
    protected Boolean approximateInd;
    @XmlElement(name = "CollectionInd")
    protected Boolean collectionInd;
    @XmlElement(name = "GuaranteeTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guaranteeTimeLimitDateTime;
    @XmlElement(name = "RefundMethodText")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String refundMethodText;
    @XmlElement(name = "Tax")
    protected List<TaxType> tax;
    @XmlElement(name = "TotalRefundableTaxAmount")
    protected AmountType totalRefundableTaxAmount;
    @XmlElement(name = "TotalTaxAmount")
    protected AmountType totalTaxAmount;

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
     * Gets the value of the approximateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * Sets the value of the approximateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

    /**
     * Gets the value of the collectionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectionInd() {
        return collectionInd;
    }

    /**
     * Sets the value of the collectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectionInd(Boolean value) {
        this.collectionInd = value;
    }

    /**
     * Gets the value of the guaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuaranteeTimeLimitDateTime() {
        return guaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the guaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuaranteeTimeLimitDateTime(XMLGregorianCalendar value) {
        this.guaranteeTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the refundMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundMethodText() {
        return refundMethodText;
    }

    /**
     * Sets the value of the refundMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundMethodText(String value) {
        this.refundMethodText = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxType>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the totalRefundableTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalRefundableTaxAmount() {
        return totalRefundableTaxAmount;
    }

    /**
     * Sets the value of the totalRefundableTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalRefundableTaxAmount(AmountType value) {
        this.totalRefundableTaxAmount = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalTaxAmount(AmountType value) {
        this.totalTaxAmount = value;
    }

}
