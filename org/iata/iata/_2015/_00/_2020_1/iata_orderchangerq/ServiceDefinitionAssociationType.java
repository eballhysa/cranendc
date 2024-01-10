
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Choice to determine if the information of this ServiceDefinition needs to be extended with specific Bag or Seat characteristics or whether the ServiceDefinition is used as a bundle of further ServiceDefinitions.
 * 
 * <p>Java class for ServiceDefinitionAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDefinitionAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="BaggageAllowanceRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}BaggageAllowanceRefType"/>
 *         &lt;element name="SeatProfileRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}SeatProfileRefType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionAssociationType", propOrder = {
    "baggageAllowanceRef",
    "seatProfileRef"
})
public class ServiceDefinitionAssociationType {

    @XmlElement(name = "BaggageAllowanceRef")
    protected BaggageAllowanceRefType baggageAllowanceRef;
    @XmlElement(name = "SeatProfileRef")
    protected SeatProfileRefType seatProfileRef;

    /**
     * Gets the value of the baggageAllowanceRef property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceRefType }
     *     
     */
    public BaggageAllowanceRefType getBaggageAllowanceRef() {
        return baggageAllowanceRef;
    }

    /**
     * Sets the value of the baggageAllowanceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceRefType }
     *     
     */
    public void setBaggageAllowanceRef(BaggageAllowanceRefType value) {
        this.baggageAllowanceRef = value;
    }

    /**
     * Gets the value of the seatProfileRef property.
     * 
     * @return
     *     possible object is
     *     {@link SeatProfileRefType }
     *     
     */
    public SeatProfileRefType getSeatProfileRef() {
        return seatProfileRef;
    }

    /**
     * Sets the value of the seatProfileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatProfileRefType }
     *     
     */
    public void setSeatProfileRef(SeatProfileRefType value) {
        this.seatProfileRef = value;
    }

}
