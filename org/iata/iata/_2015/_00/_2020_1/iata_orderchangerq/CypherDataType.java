
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CypherDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CypherDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CypherValue" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}BinaryObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CypherDataType", propOrder = {
    "cypherValue"
})
public class CypherDataType {

    @XmlElement(name = "CypherValue", required = true)
    protected BinaryObjectType cypherValue;

    /**
     * Gets the value of the cypherValue property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getCypherValue() {
        return cypherValue;
    }

    /**
     * Sets the value of the cypherValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setCypherValue(BinaryObjectType value) {
        this.cypherValue = value;
    }

}
