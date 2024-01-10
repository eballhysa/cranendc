
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A location with a spatial attribute, probably on the surface of the earth. For example: Longitude and Latitude
 * 
 * <p>Java class for GeospatialLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeospatialLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NaturalAreaGeocode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="PointElevationNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="PointLatitudeNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="PointLongitudeNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}NumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeospatialLocationType", propOrder = {
    "naturalAreaGeocode",
    "pointElevationNumber",
    "pointLatitudeNumber",
    "pointLongitudeNumber"
})
public class GeospatialLocationType {

    @XmlElement(name = "NaturalAreaGeocode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String naturalAreaGeocode;
    @XmlElement(name = "PointElevationNumber")
    protected BigDecimal pointElevationNumber;
    @XmlElement(name = "PointLatitudeNumber")
    protected BigDecimal pointLatitudeNumber;
    @XmlElement(name = "PointLongitudeNumber")
    protected BigDecimal pointLongitudeNumber;

    /**
     * Gets the value of the naturalAreaGeocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalAreaGeocode() {
        return naturalAreaGeocode;
    }

    /**
     * Sets the value of the naturalAreaGeocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalAreaGeocode(String value) {
        this.naturalAreaGeocode = value;
    }

    /**
     * Gets the value of the pointElevationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointElevationNumber() {
        return pointElevationNumber;
    }

    /**
     * Sets the value of the pointElevationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointElevationNumber(BigDecimal value) {
        this.pointElevationNumber = value;
    }

    /**
     * Gets the value of the pointLatitudeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointLatitudeNumber() {
        return pointLatitudeNumber;
    }

    /**
     * Sets the value of the pointLatitudeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointLatitudeNumber(BigDecimal value) {
        this.pointLatitudeNumber = value;
    }

    /**
     * Gets the value of the pointLongitudeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointLongitudeNumber() {
        return pointLongitudeNumber;
    }

    /**
     * Sets the value of the pointLongitudeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointLongitudeNumber(BigDecimal value) {
        this.pointLongitudeNumber = value;
    }

}
