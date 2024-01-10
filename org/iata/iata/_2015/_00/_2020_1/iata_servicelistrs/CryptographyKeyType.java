
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographyKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptographyKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyNameText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}TextType"/>
 *         &lt;element name="KeyValue" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}KeyValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographyKeyType", propOrder = {
    "keyNameText",
    "keyValue"
})
public class CryptographyKeyType {

    @XmlElement(name = "KeyNameText", required = true)
    protected String keyNameText;
    @XmlElement(name = "KeyValue")
    protected KeyValueType keyValue;

    /**
     * Gets the value of the keyNameText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyNameText() {
        return keyNameText;
    }

    /**
     * Sets the value of the keyNameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyNameText(String value) {
        this.keyNameText = value;
    }

    /**
     * Gets the value of the keyValue property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValueType }
     *     
     */
    public KeyValueType getKeyValue() {
        return keyValue;
    }

    /**
     * Sets the value of the keyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValueType }
     *     
     */
    public void setKeyValue(KeyValueType value) {
        this.keyValue = value;
    }

}
