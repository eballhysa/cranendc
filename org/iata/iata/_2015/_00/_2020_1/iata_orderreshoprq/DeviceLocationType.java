
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Location of device
 * 
 * <p>Java class for DeviceLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="City" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CityType" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CountryType" minOccurs="0"/>
 *         &lt;element name="GeospatialLocation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}GeospatialLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceLocationType", propOrder = {
    "city",
    "country",
    "geospatialLocation"
})
public class DeviceLocationType {

    @XmlElement(name = "City")
    protected CityType city;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "GeospatialLocation")
    protected GeospatialLocationType geospatialLocation;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCity(CityType value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the geospatialLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeospatialLocationType }
     *     
     */
    public GeospatialLocationType getGeospatialLocation() {
        return geospatialLocation;
    }

    /**
     * Sets the value of the geospatialLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeospatialLocationType }
     *     
     */
    public void setGeospatialLocation(GeospatialLocationType value) {
        this.geospatialLocation = value;
    }

}
