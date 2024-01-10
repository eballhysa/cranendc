
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Action to request new Offer Items for the specified Order. If used in conjunction with a 'Delete' function, the intention is to replace the deleted item with whatever has been requested in this Add function's shopping query.
 * 
 * <p>Java class for AddOfferItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOfferItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightRequest" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}FlightRequestType"/>
 *         &lt;element name="Paxs" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PaxsType" minOccurs="0"/>
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ResponseParametersType" minOccurs="0"/>
 *         &lt;element name="ShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ShoppingCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOfferItemsType", propOrder = {
    "flightRequest",
    "paxs",
    "responseParameters",
    "shoppingCriteria"
})
public class AddOfferItemsType {

    @XmlElement(name = "FlightRequest", required = true)
    protected FlightRequestType flightRequest;
    @XmlElement(name = "Paxs")
    protected PaxsType paxs;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;
    @XmlElement(name = "ShoppingCriteria")
    protected ShoppingCriteriaType shoppingCriteria;

    /**
     * Gets the value of the flightRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRequestType }
     *     
     */
    public FlightRequestType getFlightRequest() {
        return flightRequest;
    }

    /**
     * Sets the value of the flightRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRequestType }
     *     
     */
    public void setFlightRequest(FlightRequestType value) {
        this.flightRequest = value;
    }

    /**
     * Gets the value of the paxs property.
     * 
     * @return
     *     possible object is
     *     {@link PaxsType }
     *     
     */
    public PaxsType getPaxs() {
        return paxs;
    }

    /**
     * Sets the value of the paxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxsType }
     *     
     */
    public void setPaxs(PaxsType value) {
        this.paxs = value;
    }

    /**
     * Gets the value of the responseParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setResponseParameters(ResponseParametersType value) {
        this.responseParameters = value;
    }

    /**
     * Gets the value of the shoppingCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCriteriaType }
     *     
     */
    public ShoppingCriteriaType getShoppingCriteria() {
        return shoppingCriteria;
    }

    /**
     * Sets the value of the shoppingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCriteriaType }
     *     
     */
    public void setShoppingCriteria(ShoppingCriteriaType value) {
        this.shoppingCriteria = value;
    }

}
