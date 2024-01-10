
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Associations Choice
 * 
 * <p>Java class for ServiceAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAssociationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PaxJourneyRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}PaxJourneyRefType"/>
 *         &lt;element name="SeatAssignment" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}SeatAssignmentType"/>
 *         &lt;element name="ServiceDefinitionRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}ServiceDefinitionRefType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAssociationsType", propOrder = {
    "paxJourneyRef",
    "seatAssignment",
    "serviceDefinitionRef"
})
public class ServiceAssociationsType {

    @XmlElement(name = "PaxJourneyRef")
    protected PaxJourneyRefType paxJourneyRef;
    @XmlElement(name = "SeatAssignment")
    protected SeatAssignmentType seatAssignment;
    @XmlElement(name = "ServiceDefinitionRef")
    protected ServiceDefinitionRefType serviceDefinitionRef;

    /**
     * Gets the value of the paxJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaxJourneyRefType }
     *     
     */
    public PaxJourneyRefType getPaxJourneyRef() {
        return paxJourneyRef;
    }

    /**
     * Sets the value of the paxJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxJourneyRefType }
     *     
     */
    public void setPaxJourneyRef(PaxJourneyRefType value) {
        this.paxJourneyRef = value;
    }

    /**
     * Gets the value of the seatAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAssignmentType }
     *     
     */
    public SeatAssignmentType getSeatAssignment() {
        return seatAssignment;
    }

    /**
     * Sets the value of the seatAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAssignmentType }
     *     
     */
    public void setSeatAssignment(SeatAssignmentType value) {
        this.seatAssignment = value;
    }

    /**
     * Gets the value of the serviceDefinitionRef property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionRefType }
     *     
     */
    public ServiceDefinitionRefType getServiceDefinitionRef() {
        return serviceDefinitionRef;
    }

    /**
     * Sets the value of the serviceDefinitionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionRefType }
     *     
     */
    public void setServiceDefinitionRef(ServiceDefinitionRefType value) {
        this.serviceDefinitionRef = value;
    }

}
