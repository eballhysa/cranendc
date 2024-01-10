
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage allowance data list definition
 * 
 * <p>Java class for BaggageAllowanceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageAllowanceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageAllowance" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}BaggageAllowanceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageAllowanceListType", propOrder = {
    "baggageAllowance"
})
public class BaggageAllowanceListType {

    @XmlElement(name = "BaggageAllowance", required = true)
    protected List<BaggageAllowanceType> baggageAllowance;

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageAllowanceType }
     * 
     * 
     */
    public List<BaggageAllowanceType> getBaggageAllowance() {
        if (baggageAllowance == null) {
            baggageAllowance = new ArrayList<BaggageAllowanceType>();
        }
        return this.baggageAllowance;
    }

}
