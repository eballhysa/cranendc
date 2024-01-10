
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import java.math.BigDecimal;
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
 * A number of individual passengers traveling under one commercial name that associates them. E.g. a Tour group or a group for sales allotment from airline to agency.
 *  
 * 
 * <p>Java class for PaxGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfoRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="IntendedPaxQty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}QtyType" minOccurs="0"/>
 *         &lt;element name="PaxGroupID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="PaxGroupName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PaxGroupNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxGroupType", propOrder = {
    "contactInfoRefID",
    "intendedPaxQty",
    "paxGroupID",
    "paxGroupName"
})
public class PaxGroupType {

    @XmlElement(name = "ContactInfoRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> contactInfoRefID;
    @XmlElement(name = "IntendedPaxQty")
    protected BigDecimal intendedPaxQty;
    @XmlElement(name = "PaxGroupID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxGroupID;
    @XmlElement(name = "PaxGroupName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxGroupName;

    /**
     * Gets the value of the contactInfoRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfoRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfoRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactInfoRefID() {
        if (contactInfoRefID == null) {
            contactInfoRefID = new ArrayList<String>();
        }
        return this.contactInfoRefID;
    }

    /**
     * Gets the value of the intendedPaxQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntendedPaxQty() {
        return intendedPaxQty;
    }

    /**
     * Sets the value of the intendedPaxQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntendedPaxQty(BigDecimal value) {
        this.intendedPaxQty = value;
    }

    /**
     * Gets the value of the paxGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxGroupID() {
        return paxGroupID;
    }

    /**
     * Sets the value of the paxGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxGroupID(String value) {
        this.paxGroupID = value;
    }

    /**
     * Gets the value of the paxGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxGroupName() {
        return paxGroupName;
    }

    /**
     * Sets the value of the paxGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxGroupName(String value) {
        this.paxGroupName = value;
    }

}
