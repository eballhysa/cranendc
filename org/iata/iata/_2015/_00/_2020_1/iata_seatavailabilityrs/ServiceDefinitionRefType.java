
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Airline specific definition of a product or service (excluding flights) that can be separately sold and delivered. e.g. bag, seat, meal on a flight
 * 
 * <p>Java class for ServiceDefinitionRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDefinitionRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceDefinitionFlightAssociations" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ServiceDefinitionFlightAssociationsType" minOccurs="0"/>
 *         &lt;element name="ServiceDefinitionRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionRefType", propOrder = {
    "serviceDefinitionFlightAssociations",
    "serviceDefinitionRefID"
})
public class ServiceDefinitionRefType {

    @XmlElement(name = "ServiceDefinitionFlightAssociations")
    protected ServiceDefinitionFlightAssociationsType serviceDefinitionFlightAssociations;
    @XmlElement(name = "ServiceDefinitionRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDefinitionRefID;

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

    /**
     * Gets the value of the serviceDefinitionRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDefinitionRefID() {
        return serviceDefinitionRefID;
    }

    /**
     * Sets the value of the serviceDefinitionRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDefinitionRefID(String value) {
        this.serviceDefinitionRefID = value;
    }

}
