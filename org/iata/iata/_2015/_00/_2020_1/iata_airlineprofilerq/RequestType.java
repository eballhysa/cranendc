
package org.iata.iata._2015._00._2020_1.iata_airlineprofilerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Airline Profile request.
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineProfileFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRQ}AirlineProfileFilterCriteriaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "airlineProfileFilterCriteria"
})
public class RequestType {

    @XmlElement(name = "AirlineProfileFilterCriteria", required = true)
    protected AirlineProfileFilterCriteriaType airlineProfileFilterCriteria;

    /**
     * Gets the value of the airlineProfileFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineProfileFilterCriteriaType }
     *     
     */
    public AirlineProfileFilterCriteriaType getAirlineProfileFilterCriteria() {
        return airlineProfileFilterCriteria;
    }

    /**
     * Sets the value of the airlineProfileFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineProfileFilterCriteriaType }
     *     
     */
    public void setAirlineProfileFilterCriteria(AirlineProfileFilterCriteriaType value) {
        this.airlineProfileFilterCriteria = value;
    }

}
