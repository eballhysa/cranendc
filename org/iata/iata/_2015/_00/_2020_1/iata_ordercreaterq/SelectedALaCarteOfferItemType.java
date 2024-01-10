
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Use to select the quantity of Offer Items from the A La Carte Offer Items.
 * 
 * <p>Java class for SelectedALaCarteOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedALaCarteOfferItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Qty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}QtyType"/>
 *         &lt;element name="ServiceDefinitionFlightAssociations" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ServiceDefinitionFlightAssociationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedALaCarteOfferItemType", propOrder = {
    "qty",
    "serviceDefinitionFlightAssociations"
})
public class SelectedALaCarteOfferItemType {

    @XmlElement(name = "Qty", required = true)
    protected BigDecimal qty;
    @XmlElement(name = "ServiceDefinitionFlightAssociations")
    protected ServiceDefinitionFlightAssociationsType serviceDefinitionFlightAssociations;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the serviceDefinitionFlightAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionFlightAssociationsType }
     *     
     */
    public ServiceDefinitionFlightAssociationsType getServiceDefinitionFlightAssociations() {
        return serviceDefinitionFlightAssociations;
    }

    /**
     * Sets the value of the serviceDefinitionFlightAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionFlightAssociationsType }
     *     
     */
    public void setServiceDefinitionFlightAssociations(ServiceDefinitionFlightAssociationsType value) {
        this.serviceDefinitionFlightAssociations = value;
    }

}
