
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RSAKeyValue" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}RSAKeyValueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValueType", propOrder = {
    "rsaKeyValue"
})
public class KeyValueType {

    @XmlElement(name = "RSAKeyValue", required = true)
    protected RSAKeyValueType rsaKeyValue;

    /**
     * Gets the value of the rsaKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link RSAKeyValueType }
     *     
     */
    public RSAKeyValueType getRSAKeyValue() {
        return rsaKeyValue;
    }

    /**
     * Sets the value of the rsaKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSAKeyValueType }
     *     
     */
    public void setRSAKeyValue(RSAKeyValueType value) {
        this.rsaKeyValue = value;
    }

}
