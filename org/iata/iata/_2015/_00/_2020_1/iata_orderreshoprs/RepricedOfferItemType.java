
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Offers presented in response to a reprice request in the OrderReshopRQ. If there is a change in the price of the Order, these Offers may be subsequently accepted in the OrderChangeRQ and the repriced OrderItems (returned as OfferItems) will then replace
 * 
 * <p>Java class for RepricedOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepricedOfferItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}FareDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OfferItemRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="OriginalOrderItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}OriginalOrderItemType"/>
 *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PriceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepricedOfferItemType", propOrder = {
    "fareDetail",
    "offerItemRefID",
    "originalOrderItem",
    "totalPrice"
})
public class RepricedOfferItemType {

    @XmlElement(name = "FareDetail")
    protected List<FareDetailType> fareDetail;
    @XmlElement(name = "OfferItemRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemRefID;
    @XmlElement(name = "OriginalOrderItem", required = true)
    protected OriginalOrderItemType originalOrderItem;
    @XmlElement(name = "TotalPrice", required = true)
    protected PriceType totalPrice;

    /**
     * Gets the value of the fareDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType }
     * 
     * 
     */
    public List<FareDetailType> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<FareDetailType>();
        }
        return this.fareDetail;
    }

    /**
     * Gets the value of the offerItemRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemRefID() {
        return offerItemRefID;
    }

    /**
     * Sets the value of the offerItemRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemRefID(String value) {
        this.offerItemRefID = value;
    }

    /**
     * Gets the value of the originalOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalOrderItemType }
     *     
     */
    public OriginalOrderItemType getOriginalOrderItem() {
        return originalOrderItem;
    }

    /**
     * Sets the value of the originalOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalOrderItemType }
     *     
     */
    public void setOriginalOrderItem(OriginalOrderItemType value) {
        this.originalOrderItem = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setTotalPrice(PriceType value) {
        this.totalPrice = value;
    }

}
