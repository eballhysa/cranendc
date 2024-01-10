
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Retrieve request.
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}OrderFilterCriteriaType"/>
 *         &lt;element name="OrderRetrieveParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ResponseParametersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "orderFilterCriteria",
    "orderRetrieveParameters"
})
public class RequestType {

    @XmlElement(name = "OrderFilterCriteria", required = true)
    protected OrderFilterCriteriaType orderFilterCriteria;
    @XmlElement(name = "OrderRetrieveParameters")
    protected ResponseParametersType orderRetrieveParameters;

    /**
     * Gets the value of the orderFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OrderFilterCriteriaType }
     *     
     */
    public OrderFilterCriteriaType getOrderFilterCriteria() {
        return orderFilterCriteria;
    }

    /**
     * Sets the value of the orderFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFilterCriteriaType }
     *     
     */
    public void setOrderFilterCriteria(OrderFilterCriteriaType value) {
        this.orderFilterCriteria = value;
    }

    /**
     * Gets the value of the orderRetrieveParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getOrderRetrieveParameters() {
        return orderRetrieveParameters;
    }

    /**
     * Sets the value of the orderRetrieveParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setOrderRetrieveParameters(ResponseParametersType value) {
        this.orderRetrieveParameters = value;
    }

}
