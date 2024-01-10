
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Enables restriction of message payloads for selected objects.
 * 
 * <p>Java class for PayloadRestrictionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayloadRestrictionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Limit" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}QtyType" minOccurs="0"/>
 *         &lt;element name="ObjectName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ObjectNameCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadRestrictionsType", propOrder = {
    "limit",
    "objectName"
})
public class PayloadRestrictionsType {

    @XmlElement(name = "Limit")
    protected BigDecimal limit;
    @XmlElement(name = "ObjectName")
    @XmlSchemaType(name = "token")
    protected ObjectNameCodeContentType objectName;

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimit(BigDecimal value) {
        this.limit = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectNameCodeContentType }
     *     
     */
    public ObjectNameCodeContentType getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectNameCodeContentType }
     *     
     */
    public void setObjectName(ObjectNameCodeContentType value) {
        this.objectName = value;
    }

}
