
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BaggageAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageAssociationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageAllowanceRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type"/>
 *         &lt;element name="BaggageFlightAssociations" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}BaggageFlightAssociationsType" minOccurs="0"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageAssociationsType", propOrder = {
    "baggageAllowanceRefID",
    "baggageFlightAssociations",
    "paxRefID"
})
public class BaggageAssociationsType {

    @XmlElement(name = "BaggageAllowanceRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageAllowanceRefID;
    @XmlElement(name = "BaggageFlightAssociations")
    protected BaggageFlightAssociationsType baggageFlightAssociations;
    @XmlElement(name = "PaxRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;

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

    /**
     * Gets the value of the baggageFlightAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageFlightAssociationsType }
     *     
     */
    public BaggageFlightAssociationsType getBaggageFlightAssociations() {
        return baggageFlightAssociations;
    }

    /**
     * Sets the value of the baggageFlightAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageFlightAssociationsType }
     *     
     */
    public void setBaggageFlightAssociations(BaggageFlightAssociationsType value) {
        this.baggageFlightAssociations = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<String>();
        }
        return this.paxRefID;
    }

}
