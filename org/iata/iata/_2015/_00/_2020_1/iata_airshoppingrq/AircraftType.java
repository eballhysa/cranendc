
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Any machine that can derive support in the atmosphere from the reactions of the air other than the reactions of the air against the earth's surface. It must be certified as airworthy by a competent aeronautical authority.
 * 
 * <p>Java class for AircraftType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AircraftRegistrationID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}AircraftRegistrationID_Type" minOccurs="0"/>
 *         &lt;element name="TailNumberText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftType", propOrder = {
    "aircraftRegistrationID",
    "tailNumberText"
})
public class AircraftType {

    @XmlElement(name = "AircraftRegistrationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String aircraftRegistrationID;
    @XmlElement(name = "TailNumberText")
    protected String tailNumberText;

    /**
     * Gets the value of the aircraftRegistrationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftRegistrationID() {
        return aircraftRegistrationID;
    }

    /**
     * Sets the value of the aircraftRegistrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftRegistrationID(String value) {
        this.aircraftRegistrationID = value;
    }

    /**
     * Gets the value of the tailNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailNumberText() {
        return tailNumberText;
    }

    /**
     * Sets the value of the tailNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailNumberText(String value) {
        this.tailNumberText = value;
    }

}
