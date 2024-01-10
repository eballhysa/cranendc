
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Grouping of aircrafts with the same form, function and specification, currently flown, or soon to be flown. Possible types are defined in the IATA SSIM. 
 * 
 * <p>Java class for IATA_AircraftTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IATA_AircraftTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IATA_AircraftTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}IATA_AircraftTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_AircraftTypeType", propOrder = {
    "iataAircraftTypeCode"
})
public class IATAAircraftTypeType {

    @XmlElement(name = "IATA_AircraftTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iataAircraftTypeCode;

    /**
     * Gets the value of the iataAircraftTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATAAircraftTypeCode() {
        return iataAircraftTypeCode;
    }

    /**
     * Sets the value of the iataAircraftTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATAAircraftTypeCode(String value) {
        this.iataAircraftTypeCode = value;
    }

}
