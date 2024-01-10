
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSAKeyValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSAKeyValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exponent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}BinaryObjectType"/>
 *         &lt;element name="Modulus" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}BinaryObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSAKeyValueType", propOrder = {
    "exponent",
    "modulus"
})
public class RSAKeyValueType {

    @XmlElement(name = "Exponent", required = true)
    protected BinaryObjectType exponent;
    @XmlElement(name = "Modulus", required = true)
    protected BinaryObjectType modulus;

    /**
     * Gets the value of the exponent property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getExponent() {
        return exponent;
    }

    /**
     * Sets the value of the exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setExponent(BinaryObjectType value) {
        this.exponent = value;
    }

    /**
     * Gets the value of the modulus property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getModulus() {
        return modulus;
    }

    /**
     * Sets the value of the modulus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setModulus(BinaryObjectType value) {
        this.modulus = value;
    }

}
