
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Shopping session (message response) ID.
 * 
 * <p>Java class for ShoppingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}AirlineDesigCodeType" minOccurs="0"/>
 *         &lt;element name="ShoppingResponseRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}ID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingResponseType", propOrder = {
    "offerRefID",
    "ownerCode",
    "shoppingResponseRefID"
})
public class ShoppingResponseType {

    @XmlElement(name = "OfferRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerRefID;
    @XmlElement(name = "OwnerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "ShoppingResponseRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shoppingResponseRefID;

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
     * Gets the value of the shoppingResponseRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingResponseRefID() {
        return shoppingResponseRefID;
    }

    /**
     * Sets the value of the shoppingResponseRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingResponseRefID(String value) {
        this.shoppingResponseRefID = value;
    }

}
