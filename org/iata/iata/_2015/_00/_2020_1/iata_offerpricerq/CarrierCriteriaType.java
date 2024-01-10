
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Airline preferences for a shopping request.
 * 
 * <p>Java class for CarrierCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightHaulTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}FlightHaulCodeType" minOccurs="0"/>
 *         &lt;element name="GeographicalIndTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ProductDetailsCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierCriteriaType", propOrder = {
    "flightHaulTypeCode",
    "geographicalIndTypeCode"
})
public class CarrierCriteriaType {

    @XmlElement(name = "FlightHaulTypeCode")
    protected String flightHaulTypeCode;
    @XmlElement(name = "GeographicalIndTypeCode")
    protected String geographicalIndTypeCode;

    /**
     * Gets the value of the flightHaulTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightHaulTypeCode() {
        return flightHaulTypeCode;
    }

    /**
     * Sets the value of the flightHaulTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightHaulTypeCode(String value) {
        this.flightHaulTypeCode = value;
    }

    /**
     * Gets the value of the geographicalIndTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicalIndTypeCode() {
        return geographicalIndTypeCode;
    }

    /**
     * Sets the value of the geographicalIndTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicalIndTypeCode(String value) {
        this.geographicalIndTypeCode = value;
    }

}
