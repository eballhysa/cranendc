
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contextual information to further describe something using a key-value pair.
 * 
 * <p>Java class for KeyValuePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}TextType"/>
 *         &lt;element name="ValueText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}TextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePropertyType", propOrder = {
    "keyText",
    "valueText"
})
public class KeyValuePropertyType {

    @XmlElement(name = "KeyText", required = true)
    protected String keyText;
    @XmlElement(name = "ValueText", required = true)
    protected String valueText;

    /**
     * Gets the value of the keyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyText() {
        return keyText;
    }

    /**
     * Sets the value of the keyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyText(String value) {
        this.keyText = value;
    }

    /**
     * Gets the value of the valueText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueText() {
        return valueText;
    }

    /**
     * Sets the value of the valueText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueText(String value) {
        this.valueText = value;
    }

}
