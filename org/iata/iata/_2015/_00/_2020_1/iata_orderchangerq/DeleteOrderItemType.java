
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Function to accept the deletion of an OrderItem from the existing Order.
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
 *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="OfferRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" minOccurs="0"/>
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
    "offerID",
    "offerRefID"
})
public class DeleteOrderItemType {

    @XmlElement(name = "OfferID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerID;
    @XmlElement(name = "OfferRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerRefID;

    /**
     * Gets the value of the offerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferID() {
        return offerID;
    }

    /**
     * Sets the value of the offerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferID(String value) {
        this.offerID = value;
    }

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

}
