
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BaggageAllowanceRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageAllowanceRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageAllowanceRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageAllowanceRefType", propOrder = {
    "baggageAllowanceRefID"
})
public class BaggageAllowanceRefType {

    @XmlElement(name = "BaggageAllowanceRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageAllowanceRefID;

    /**
     * Gets the value of the baggageAllowanceRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowanceRefID() {
        return baggageAllowanceRefID;
    }

    /**
     * Sets the value of the baggageAllowanceRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowanceRefID(String value) {
        this.baggageAllowanceRefID = value;
    }

}
