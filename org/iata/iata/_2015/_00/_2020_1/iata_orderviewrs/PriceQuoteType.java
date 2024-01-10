
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Pricing history information for a given Order.
 * 
 * <p>Java class for PriceQuoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceQuoteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AmountType"/>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CommissionType"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AirlineDesigCodeType" minOccurs="0"/>
 *         &lt;element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType"/>
 *         &lt;element name="QuoteDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="SourceText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceQuoteType", propOrder = {
    "amount",
    "commission",
    "ownerCode",
    "priceGuaranteeTimeLimitDateTime",
    "quoteDateTime",
    "sourceText"
})
public class PriceQuoteType {

    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "Commission", required = true)
    protected CommissionType commission;
    @XmlElement(name = "OwnerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar priceGuaranteeTimeLimitDateTime;
    @XmlElement(name = "QuoteDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar quoteDateTime;
    @XmlElement(name = "SourceText")
    protected String sourceText;

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
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceGuaranteeTimeLimitDateTime() {
        return priceGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceGuaranteeTimeLimitDateTime(XMLGregorianCalendar value) {
        this.priceGuaranteeTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the quoteDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuoteDateTime() {
        return quoteDateTime;
    }

    /**
     * Sets the value of the quoteDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuoteDateTime(XMLGregorianCalendar value) {
        this.quoteDateTime = value;
    }

    /**
     * Gets the value of the sourceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceText() {
        return sourceText;
    }

    /**
     * Sets the value of the sourceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceText(String value) {
        this.sourceText = value;
    }

}
