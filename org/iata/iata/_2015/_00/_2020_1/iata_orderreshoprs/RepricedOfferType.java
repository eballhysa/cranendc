
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
 * Function used to request the repricing of an existing Order, possibly as a consequence of expired TimeLimits. Airline returns Offers/OfferItems that describe the changes incurred from the reprice request.
 * 
 * <p>Java class for RepricedOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepricedOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}AirlineDesigCodeType"/>
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}OwnerTypeCodeType" minOccurs="0"/>
 *         &lt;element name="RepricedOfferItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}RepricedOfferItemType" maxOccurs="unbounded"/>
 *         &lt;element name="RequestedDateInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepricedOfferType", propOrder = {
    "offerRefID",
    "ownerCode",
    "ownerTypeCode",
    "repricedOfferItem",
    "requestedDateInd"
})
public class RepricedOfferType {

    @XmlElement(name = "OfferRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerRefID;
    @XmlElement(name = "OwnerCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "OwnerTypeCode")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    @XmlElement(name = "RepricedOfferItem", required = true)
    protected List<RepricedOfferItemType> repricedOfferItem;
    @XmlElement(name = "RequestedDateInd")
    protected Boolean requestedDateInd;

    /**
     * Gets the value of the offerRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferRefID() {
        return offerRefID;
    }

    /**
     * Sets the value of the offerRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferRefID(String value) {
        this.offerRefID = value;
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
     * Gets the value of the ownerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public OwnerTypeCodeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public void setOwnerTypeCode(OwnerTypeCodeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Gets the value of the repricedOfferItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repricedOfferItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepricedOfferItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepricedOfferItemType }
     * 
     * 
     */
    public List<RepricedOfferItemType> getRepricedOfferItem() {
        if (repricedOfferItem == null) {
            repricedOfferItem = new ArrayList<RepricedOfferItemType>();
        }
        return this.repricedOfferItem;
    }

    /**
     * Gets the value of the requestedDateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedDateInd() {
        return requestedDateInd;
    }

    /**
     * Sets the value of the requestedDateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestedDateInd(Boolean value) {
        this.requestedDateInd = value;
    }

}
