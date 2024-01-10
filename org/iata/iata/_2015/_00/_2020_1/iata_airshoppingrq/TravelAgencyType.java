
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

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
 * A private retailer or public service that provides travel and tourism related services to the public on behalf of suppliers such as activities, airlines, car rentals, cruise lines, hotels, railways, travel insurance, and package tours.
 * 
 * <p>Java class for TravelAgencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelAgencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ID_Type"/>
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ProperNameType" minOccurs="0"/>
 *         &lt;element name="PseudoCityID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="TravelAgent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}TravelAgentType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}TravelAgencyTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgencyType", propOrder = {
    "agencyID",
    "contactInfo",
    "iataNumber",
    "name",
    "pseudoCityID",
    "travelAgent",
    "typeCode"
})
public class TravelAgencyType {

    @XmlElement(name = "AgencyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String agencyID;
    @XmlElement(name = "ContactInfo")
    protected List<ContactInfoType> contactInfo;
    @XmlElement(name = "IATA_Number")
    protected BigDecimal iataNumber;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "PseudoCityID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pseudoCityID;
    @XmlElement(name = "TravelAgent")
    protected TravelAgentType travelAgent;
    @XmlElement(name = "TypeCode")
    @XmlSchemaType(name = "token")
    protected TravelAgencyTypeCodeContentType typeCode;

    /**
     * Gets the value of the agencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyID(String value) {
        this.agencyID = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoType }
     * 
     * 
     */
    public List<ContactInfoType> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContactInfoType>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIATANumber(BigDecimal value) {
        this.iataNumber = value;
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
     * Gets the value of the pseudoCityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityID() {
        return pseudoCityID;
    }

    /**
     * Sets the value of the pseudoCityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityID(String value) {
        this.pseudoCityID = value;
    }

    /**
     * Gets the value of the travelAgent property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgentType }
     *     
     */
    public TravelAgentType getTravelAgent() {
        return travelAgent;
    }

    /**
     * Sets the value of the travelAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgentType }
     *     
     */
    public void setTravelAgent(TravelAgentType value) {
        this.travelAgent = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyTypeCodeContentType }
     *     
     */
    public TravelAgencyTypeCodeContentType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyTypeCodeContentType }
     *     
     */
    public void setTypeCode(TravelAgencyTypeCodeContentType value) {
        this.typeCode = value;
    }

}
