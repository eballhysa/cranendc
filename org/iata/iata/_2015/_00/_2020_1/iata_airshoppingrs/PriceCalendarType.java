
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Calendar based Flight Price. This capability supports multi-day calendar shopping, e.g. returning priced flight offers for a specified period before and/or after the actual requested date.
 * 
 * <p>Java class for PriceCalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceCalendarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LeadPriceInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         &lt;element name="PriceCalendarDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}PriceCalendarDateType" maxOccurs="unbounded"/>
 *         &lt;element name="PricedPTC" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}PTC_OfferParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalPriceAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceCalendarType", propOrder = {
    "leadPriceInd",
    "priceCalendarDate",
    "pricedPTC",
    "totalPriceAmount"
})
public class PriceCalendarType {

    @XmlElement(name = "LeadPriceInd")
    protected Boolean leadPriceInd;
    @XmlElement(name = "PriceCalendarDate", required = true)
    protected List<PriceCalendarDateType> priceCalendarDate;
    @XmlElement(name = "PricedPTC")
    protected List<PTCOfferParametersType> pricedPTC;
    @XmlElement(name = "TotalPriceAmount")
    protected AmountType totalPriceAmount;

    /**
     * Gets the value of the leadPriceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadPriceInd() {
        return leadPriceInd;
    }

    /**
     * Sets the value of the leadPriceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadPriceInd(Boolean value) {
        this.leadPriceInd = value;
    }

    /**
     * Gets the value of the priceCalendarDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceCalendarDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceCalendarDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceCalendarDateType }
     * 
     * 
     */
    public List<PriceCalendarDateType> getPriceCalendarDate() {
        if (priceCalendarDate == null) {
            priceCalendarDate = new ArrayList<PriceCalendarDateType>();
        }
        return this.priceCalendarDate;
    }

    /**
     * Gets the value of the pricedPTC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedPTC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedPTC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCOfferParametersType }
     * 
     * 
     */
    public List<PTCOfferParametersType> getPricedPTC() {
        if (pricedPTC == null) {
            pricedPTC = new ArrayList<PTCOfferParametersType>();
        }
        return this.pricedPTC;
    }

    /**
     * Gets the value of the totalPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalPriceAmount() {
        return totalPriceAmount;
    }

    /**
     * Sets the value of the totalPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalPriceAmount(AmountType value) {
        this.totalPriceAmount = value;
    }

}
