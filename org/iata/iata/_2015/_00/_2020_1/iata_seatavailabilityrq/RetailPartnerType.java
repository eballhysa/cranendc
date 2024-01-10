
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Retail Partner
 * 
 * <p>Java class for RetailPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailPartnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}ContactInfoType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}NameType" minOccurs="0"/>
 *         &lt;element name="RetailPartnerID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}ID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailPartnerType", propOrder = {
    "contactInfo",
    "name",
    "retailPartnerID"
})
public class RetailPartnerType {

    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "RetailPartnerID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String retailPartnerID;

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the retailPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailPartnerID() {
        return retailPartnerID;
    }

    /**
     * Sets the value of the retailPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailPartnerID(String value) {
        this.retailPartnerID = value;
    }

}
