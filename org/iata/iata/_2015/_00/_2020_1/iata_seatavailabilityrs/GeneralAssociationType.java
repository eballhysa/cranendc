
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GeneralAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssociatedObjectID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="AssociatedObjectName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NameType" minOccurs="0"/>
 *         &lt;element name="AssociatedObjectPath" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralAssociationType", propOrder = {
    "associatedObjectID",
    "associatedObjectName",
    "associatedObjectPath"
})
public class GeneralAssociationType {

    @XmlElement(name = "AssociatedObjectID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String associatedObjectID;
    @XmlElement(name = "AssociatedObjectName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String associatedObjectName;
    @XmlElement(name = "AssociatedObjectPath")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String associatedObjectPath;

    /**
     * Gets the value of the associatedObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedObjectID() {
        return associatedObjectID;
    }

    /**
     * Sets the value of the associatedObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedObjectID(String value) {
        this.associatedObjectID = value;
    }

    /**
     * Gets the value of the associatedObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedObjectName() {
        return associatedObjectName;
    }

    /**
     * Sets the value of the associatedObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedObjectName(String value) {
        this.associatedObjectName = value;
    }

    /**
     * Gets the value of the associatedObjectPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedObjectPath() {
        return associatedObjectPath;
    }

    /**
     * Sets the value of the associatedObjectPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedObjectPath(String value) {
        this.associatedObjectPath = value;
    }

}
