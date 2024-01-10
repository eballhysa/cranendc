
package org.iata.iata._2015._00._2020_1.iata_airlineprofilers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A private retailer or public service individual that provides travel and tourism related services to the public on behalf of suppliers such as activities, airlines, car rentals, cruise lines, hotels, railways, travel insurance, and package tours.
 * 
 * <p>Java class for TravelAgentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelAgentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelAgencyTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}TravelAgencyTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TravelAgentID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}ID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgentType", propOrder = {
    "travelAgencyTypeCode",
    "travelAgentID"
})
public class TravelAgentType {

    @XmlElement(name = "TravelAgencyTypeCode")
    @XmlSchemaType(name = "token")
    protected TravelAgencyTypeCodeContentType travelAgencyTypeCode;
    @XmlElement(name = "TravelAgentID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String travelAgentID;

    /**
     * Gets the value of the travelAgencyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyTypeCodeContentType }
     *     
     */
    public TravelAgencyTypeCodeContentType getTravelAgencyTypeCode() {
        return travelAgencyTypeCode;
    }

    /**
     * Sets the value of the travelAgencyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyTypeCodeContentType }
     *     
     */
    public void setTravelAgencyTypeCode(TravelAgencyTypeCodeContentType value) {
        this.travelAgencyTypeCode = value;
    }

    /**
     * Gets the value of the travelAgentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgentID() {
        return travelAgentID;
    }

    /**
     * Sets the value of the travelAgentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgentID(String value) {
        this.travelAgentID = value;
    }

}
