
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines implementation specific fields which should be populated.
 * 
 * <p>Java class for FieldMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MandatoryInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         &lt;element name="PathText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldMetadataType", propOrder = {
    "mandatoryInd",
    "pathText"
})
public class FieldMetadataType {

    @XmlElement(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlElement(name = "PathText")
    protected String pathText;

    /**
     * Gets the value of the mandatoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Sets the value of the mandatoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * Gets the value of the pathText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathText() {
        return pathText;
    }

    /**
     * Sets the value of the pathText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathText(String value) {
        this.pathText = value;
    }

}
