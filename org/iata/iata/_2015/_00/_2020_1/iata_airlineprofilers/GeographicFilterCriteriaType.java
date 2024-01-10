
package org.iata.iata._2015._00._2020_1.iata_airlineprofilers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Criteria used to filter results based on geographic preferences, including Area, State, City, Airport, or Geospatial information.
 * 
 * <p>Java class for GeographicFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicFilterCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}TextType" minOccurs="0"/>
 *         &lt;element name="CoordRadiusMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}MeasureType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CountrySubDivisionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}CountrySubDivisionCodeType" minOccurs="0"/>
 *         &lt;element name="GeospatialLocation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}GeospatialLocationType" minOccurs="0"/>
 *         &lt;element name="IATA_LocationCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}IATA_LocationCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicFilterCriteriaType", propOrder = {
    "areaCodeText",
    "coordRadiusMeasure",
    "countryCode",
    "countrySubDivisionCode",
    "geospatialLocation",
    "iataLocationCode"
})
public class GeographicFilterCriteriaType {

    @XmlElement(name = "AreaCodeText")
    protected String areaCodeText;
    @XmlElement(name = "CoordRadiusMeasure")
    protected MeasureType coordRadiusMeasure;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "CountrySubDivisionCode")
    protected String countrySubDivisionCode;
    @XmlElement(name = "GeospatialLocation")
    protected GeospatialLocationType geospatialLocation;
    @XmlElement(name = "IATA_LocationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iataLocationCode;

    /**
     * Gets the value of the areaCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCodeText() {
        return areaCodeText;
    }

    /**
     * Sets the value of the areaCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCodeText(String value) {
        this.areaCodeText = value;
    }

    /**
     * Gets the value of the coordRadiusMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCoordRadiusMeasure() {
        return coordRadiusMeasure;
    }

    /**
     * Sets the value of the coordRadiusMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCoordRadiusMeasure(MeasureType value) {
        this.coordRadiusMeasure = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countrySubDivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubDivisionCode() {
        return countrySubDivisionCode;
    }

    /**
     * Sets the value of the countrySubDivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubDivisionCode(String value) {
        this.countrySubDivisionCode = value;
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

    /**
     * Gets the value of the iataLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATALocationCode() {
        return iataLocationCode;
    }

    /**
     * Sets the value of the iataLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATALocationCode(String value) {
        this.iataLocationCode = value;
    }

}
