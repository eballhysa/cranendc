
package org.iata.iata._2015._00._2020_1.iata_orderrulesrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Core Request Allows for the querying of rules based on Order information or Filed Fare information.
 * 
 * <p>Java class for CoreRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="FareRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}FareRefType"/>
 *         &lt;element name="OrderRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}OrderRefType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreRequestType", propOrder = {
    "fareRef",
    "orderRef"
})
public class CoreRequestType {

    @XmlElement(name = "FareRef")
    protected FareRefType fareRef;
    @XmlElement(name = "OrderRef")
    protected OrderRefType orderRef;

    /**
     * Gets the value of the fareRef property.
     * 
     * @return
     *     possible object is
     *     {@link FareRefType }
     *     
     */
    public FareRefType getFareRef() {
        return fareRef;
    }

    /**
     * Sets the value of the fareRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRefType }
     *     
     */
    public void setFareRef(FareRefType value) {
        this.fareRef = value;
    }

    /**
     * Gets the value of the orderRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrderRefType }
     *     
     */
    public OrderRefType getOrderRef() {
        return orderRef;
    }

    /**
     * Sets the value of the orderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRefType }
     *     
     */
    public void setOrderRef(OrderRefType value) {
        this.orderRef = value;
    }

}
