
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Program Owner information.
 * 
 * <p>Java class for ProgramOwnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramOwnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}CarrierType"/>
 *         &lt;element name="Org" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}OrgType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramOwnerType", propOrder = {
    "carrier",
    "org"
})
public class ProgramOwnerType {

    @XmlElement(name = "Carrier", required = true)
    protected CarrierType carrier;
    @XmlElement(name = "Org", required = true)
    protected OrgType org;

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

}
