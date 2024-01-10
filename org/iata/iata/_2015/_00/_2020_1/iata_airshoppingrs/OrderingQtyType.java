
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Minimum/Maximum Option Ordering Quantities.
 * 
 * <p>Java class for OrderingQtyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderingQtyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumQty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}QtyType" minOccurs="0"/>
 *         &lt;element name="MinimumQty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}QtyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderingQtyType", propOrder = {
    "maximumQty",
    "minimumQty"
})
public class OrderingQtyType {

    @XmlElement(name = "MaximumQty")
    protected BigDecimal maximumQty;
    @XmlElement(name = "MinimumQty")
    protected BigDecimal minimumQty;

    /**
     * Gets the value of the maximumQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumQty() {
        return maximumQty;
    }

    /**
     * Sets the value of the maximumQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumQty(BigDecimal value) {
        this.maximumQty = value;
    }

    /**
     * Gets the value of the minimumQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumQty() {
        return minimumQty;
    }

    /**
     * Sets the value of the minimumQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumQty(BigDecimal value) {
        this.minimumQty = value;
    }

}
