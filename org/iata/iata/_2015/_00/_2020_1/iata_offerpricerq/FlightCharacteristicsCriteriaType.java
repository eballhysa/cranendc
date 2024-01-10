
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight characteristics filter criteria for shopping requests, including non-stop, red eye, etc.
 * 
 * <p>Java class for FlightCharacteristicsCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightCharacteristicsCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}FlightCharacteristicsCodeType" minOccurs="0"/>
 *         &lt;element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}PrefLevelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCharacteristicsCriteriaType", propOrder = {
    "characteristicCode",
    "prefLevel"
})
public class FlightCharacteristicsCriteriaType {

    @XmlElement(name = "CharacteristicCode")
    @XmlSchemaType(name = "string")
    protected FlightCharacteristicsCodeContentType characteristicCode;
    @XmlElement(name = "PrefLevel", required = true)
    protected PrefLevelType prefLevel;

    /**
     * Gets the value of the characteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCharacteristicsCodeContentType }
     *     
     */
    public FlightCharacteristicsCodeContentType getCharacteristicCode() {
        return characteristicCode;
    }

    /**
     * Sets the value of the characteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCharacteristicsCodeContentType }
     *     
     */
    public void setCharacteristicCode(FlightCharacteristicsCodeContentType value) {
        this.characteristicCode = value;
    }

    /**
     * Gets the value of the prefLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
    }

}
