
package org.iata.iata._2015._00._2020_1.iata_airlineprofilers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The directional indicator text
 * 
 * <p>Java class for DirectionalIndTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectionalIndTextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DirectionalIndText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionalIndTextType", propOrder = {
    "directionalIndText"
})
public class DirectionalIndTextType {

    @XmlElement(name = "DirectionalIndText")
    protected String directionalIndText;

    /**
     * Gets the value of the directionalIndText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionalIndText() {
        return directionalIndText;
    }

    /**
     * Sets the value of the directionalIndText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionalIndText(String value) {
        this.directionalIndText = value;
    }

}
