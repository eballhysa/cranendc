
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Associations
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
 *         &lt;element name="PaxSegmentRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}PaxSegmentRefType"/>
 *         &lt;element name="SelectedSeat" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}SeatonLegType"/>
 *         &lt;element name="ServiceDefinitionRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ServiceDefinitionRefType"/>
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
    "paxSegmentRef",
    "selectedSeat",
    "serviceDefinitionRef"
})
public class ServiceAssociationsType {

    @XmlElement(name = "PaxSegmentRef")
    protected PaxSegmentRefType paxSegmentRef;
    @XmlElement(name = "SelectedSeat")
    protected SeatonLegType selectedSeat;
    @XmlElement(name = "ServiceDefinitionRef")
    protected ServiceDefinitionRefType serviceDefinitionRef;

    /**
     * Gets the value of the paxSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public PaxSegmentRefType getPaxSegmentRef() {
        return paxSegmentRef;
    }

    /**
     * Sets the value of the paxSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public void setPaxSegmentRef(PaxSegmentRefType value) {
        this.paxSegmentRef = value;
    }

    /**
     * Gets the value of the selectedSeat property.
     * 
     * @return
     *     possible object is
     *     {@link SeatonLegType }
     *     
     */
    public SeatonLegType getSelectedSeat() {
        return selectedSeat;
    }

    /**
     * Sets the value of the selectedSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatonLegType }
     *     
     */
    public void setSelectedSeat(SeatonLegType value) {
        this.selectedSeat = value;
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
