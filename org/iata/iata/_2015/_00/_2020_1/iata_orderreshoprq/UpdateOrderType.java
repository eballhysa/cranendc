
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Update Order Option to Reshop or Reprice an Order.
 * 
 * <p>Java class for UpdateOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CancelOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CancelOrderType"/>
 *         &lt;element name="RepriceOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}RepriceOrderType"/>
 *         &lt;element name="ReshopOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ReshopOrderType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderType", propOrder = {
    "cancelOrder",
    "repriceOrder",
    "reshopOrder"
})
public class UpdateOrderType {

    @XmlElement(name = "CancelOrder")
    protected CancelOrderType cancelOrder;
    @XmlElement(name = "RepriceOrder")
    protected RepriceOrderType repriceOrder;
    @XmlElement(name = "ReshopOrder")
    protected ReshopOrderType reshopOrder;

    /**
     * Gets the value of the cancelOrder property.
     * 
     * @return
     *     possible object is
     *     {@link CancelOrderType }
     *     
     */
    public CancelOrderType getCancelOrder() {
        return cancelOrder;
    }

    /**
     * Sets the value of the cancelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelOrderType }
     *     
     */
    public void setCancelOrder(CancelOrderType value) {
        this.cancelOrder = value;
    }

    /**
     * Gets the value of the repriceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link RepriceOrderType }
     *     
     */
    public RepriceOrderType getRepriceOrder() {
        return repriceOrder;
    }

    /**
     * Sets the value of the repriceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepriceOrderType }
     *     
     */
    public void setRepriceOrder(RepriceOrderType value) {
        this.repriceOrder = value;
    }

    /**
     * Gets the value of the reshopOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopOrderType }
     *     
     */
    public ReshopOrderType getReshopOrder() {
        return reshopOrder;
    }

    /**
     * Sets the value of the reshopOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopOrderType }
     *     
     */
    public void setReshopOrder(ReshopOrderType value) {
        this.reshopOrder = value;
    }

}
