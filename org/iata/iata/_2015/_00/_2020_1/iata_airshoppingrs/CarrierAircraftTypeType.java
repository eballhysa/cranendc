
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Carrier defined internal grouping of aircrafts with the same form, function and specification.
 * 
 * <p>Java class for CarrierAircraftTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierAircraftTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierAircraftTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         &lt;element name="CarrierAircraftTypeName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierAircraftTypeType", propOrder = {
    "carrierAircraftTypeCode",
    "carrierAircraftTypeName"
})
public class CarrierAircraftTypeType {

    @XmlElement(name = "CarrierAircraftTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierAircraftTypeCode;
    @XmlElement(name = "CarrierAircraftTypeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierAircraftTypeName;

    /**
     * Gets the value of the carrierAircraftTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierAircraftTypeCode() {
        return carrierAircraftTypeCode;
    }

    /**
     * Sets the value of the carrierAircraftTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierAircraftTypeCode(String value) {
        this.carrierAircraftTypeCode = value;
    }

    /**
     * Gets the value of the carrierAircraftTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierAircraftTypeName() {
        return carrierAircraftTypeName;
    }

    /**
     * Sets the value of the carrierAircraftTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierAircraftTypeName(String value) {
        this.carrierAircraftTypeName = value;
    }

}
