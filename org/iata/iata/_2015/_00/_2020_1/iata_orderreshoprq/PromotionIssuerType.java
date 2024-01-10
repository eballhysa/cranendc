
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Promotion Issuer
 * 
 * <p>Java class for PromotionIssuerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionIssuerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CarrierType"/>
 *         &lt;element name="Org" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}OrgType"/>
 *         &lt;element name="TravelAgency" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TravelAgencyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionIssuerType", propOrder = {
    "carrier",
    "org",
    "travelAgency"
})
public class PromotionIssuerType {

    @XmlElement(name = "Carrier")
    protected CarrierType carrier;
    @XmlElement(name = "Org")
    protected OrgType org;
    @XmlElement(name = "TravelAgency")
    protected TravelAgencyType travelAgency;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setCarrier(CarrierType value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link OrgType }
     *     
     */
    public OrgType getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgType }
     *     
     */
    public void setOrg(OrgType value) {
        this.org = value;
    }

    /**
     * Gets the value of the travelAgency property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyType }
     *     
     */
    public TravelAgencyType getTravelAgency() {
        return travelAgency;
    }

    /**
     * Sets the value of the travelAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyType }
     *     
     */
    public void setTravelAgency(TravelAgencyType value) {
        this.travelAgency = value;
    }

}
