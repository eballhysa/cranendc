
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Individual agent who solicits and procures business from potential customers on behalf of one or more principals, usually against payment of a percentage of the realized sales revenue as commission.
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
 *         &lt;element name="TravelAgentID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}ID_Type"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}TravelAgencyTypeCodeType" minOccurs="0"/>
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
    "travelAgentID",
    "typeCode"
})
public class TravelAgentType {

    @XmlElement(name = "TravelAgentID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String travelAgentID;
    @XmlElement(name = "TypeCode")
    @XmlSchemaType(name = "token")
    protected TravelAgencyTypeCodeContentType typeCode;

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
