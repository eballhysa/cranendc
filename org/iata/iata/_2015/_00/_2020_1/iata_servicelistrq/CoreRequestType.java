
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Core Request
 * 
 * <p>Java class for CoreRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Offer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}OfferType" maxOccurs="unbounded"/>
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}OrderType"/>
 *         &lt;element name="OriginDest" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}OriginDestType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreRequestType", propOrder = {
    "offer",
    "order",
    "originDest"
})
public class CoreRequestType {

    @XmlElement(name = "Offer")
    protected List<OfferType> offer;
    @XmlElement(name = "Order")
    protected OrderType order;
    @XmlElement(name = "OriginDest")
    protected List<OriginDestType> originDest;

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferType }
     * 
     * 
     */
    public List<OfferType> getOffer() {
        if (offer == null) {
            offer = new ArrayList<OfferType>();
        }
        return this.offer;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the originDest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestType }
     * 
     * 
     */
    public List<OriginDestType> getOriginDest() {
        if (originDest == null) {
            originDest = new ArrayList<OriginDestType>();
        }
        return this.originDest;
    }

}
