
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
 * OrderItems which the Airline confirms can be deleted in a subsequent OrderChangeRQ. Optionally, a price differential (e.g. refund amounts) can be added to each OrderItem occurrence being deleted. Should not be used for 'replace' type functions. In the
 * 
 * <p>Java class for DeleteOrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteOrderItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExistingOrderItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ExistingOrderItemType" maxOccurs="unbounded"/>
 *         &lt;element name="MandatoryInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType" minOccurs="0"/>
 *         &lt;element name="ModificationProhibitedInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType" minOccurs="0"/>
 *         &lt;element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type"/>
 *         &lt;element name="PenaltyRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="PriceDifferential" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PriceDifferentialType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteOrderItemType", propOrder = {
    "existingOrderItem",
    "mandatoryInd",
    "modificationProhibitedInd",
    "offerItemID",
    "penaltyRefID",
    "priceDifferential"
})
public class DeleteOrderItemType {

    @XmlElement(name = "ExistingOrderItem", required = true)
    protected List<ExistingOrderItemType> existingOrderItem;
    @XmlElement(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlElement(name = "ModificationProhibitedInd")
    protected Boolean modificationProhibitedInd;
    @XmlElement(name = "OfferItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    @XmlElement(name = "PenaltyRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String penaltyRefID;
    @XmlElement(name = "PriceDifferential")
    protected PriceDifferentialType priceDifferential;

    /**
     * Gets the value of the existingOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the existingOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExistingOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExistingOrderItemType }
     * 
     * 
     */
    public List<ExistingOrderItemType> getExistingOrderItem() {
        if (existingOrderItem == null) {
            existingOrderItem = new ArrayList<ExistingOrderItemType>();
        }
        return this.existingOrderItem;
    }

    /**
     * Gets the value of the mandatoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Sets the value of the mandatoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * Gets the value of the modificationProhibitedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModificationProhibitedInd() {
        return modificationProhibitedInd;
    }

    /**
     * Sets the value of the modificationProhibitedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModificationProhibitedInd(Boolean value) {
        this.modificationProhibitedInd = value;
    }

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the penaltyRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyRefID() {
        return penaltyRefID;
    }

    /**
     * Sets the value of the penaltyRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyRefID(String value) {
        this.penaltyRefID = value;
    }

    /**
     * Gets the value of the priceDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDifferentialType }
     *     
     */
    public PriceDifferentialType getPriceDifferential() {
        return priceDifferential;
    }

    /**
     * Sets the value of the priceDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDifferentialType }
     *     
     */
    public void setPriceDifferential(PriceDifferentialType value) {
        this.priceDifferential = value;
    }

}
