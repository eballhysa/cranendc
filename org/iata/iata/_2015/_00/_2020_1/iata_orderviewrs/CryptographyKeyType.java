
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

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
 *         &lt;element name="KeyName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType"/>
 *         &lt;element name="KeyValue" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}KeyValueType" minOccurs="0"/>
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
    "keyName",
    "keyValue"
})
public class CryptographyKeyType {

    @XmlElement(name = "KeyName", required = true)
    protected String keyName;
    @XmlElement(name = "KeyValue")
    protected KeyValueType keyValue;

    /**
     * Gets the value of the keyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * Sets the value of the keyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyName(String value) {
        this.keyName = value;
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
