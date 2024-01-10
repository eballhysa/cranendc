
package org.iata.iata._2015._00._2020_1.iata_airlineprofilerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Distribution profile of an airline which describes which types of shopping requests may be processed by a particular carrier.
 * 
 * <p>Java class for AirlineProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineProfileURL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRQ}URI_Type" minOccurs="0"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRQ}AirlineDesigCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineProfileType", propOrder = {
    "airlineProfileURL",
    "ownerCode"
})
public class AirlineProfileType {

    @XmlElement(name = "AirlineProfileURL")
    @XmlSchemaType(name = "anyURI")
    protected String airlineProfileURL;
    @XmlElement(name = "OwnerCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;

    /**
     * Gets the value of the airlineProfileURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineProfileURL() {
        return airlineProfileURL;
    }

    /**
     * Sets the value of the airlineProfileURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineProfileURL(String value) {
        this.airlineProfileURL = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

}
