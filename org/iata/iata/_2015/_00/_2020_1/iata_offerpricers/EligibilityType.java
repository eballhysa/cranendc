
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

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
 * Refers to the Passengers, Price class or segments for which this offer item is eligible.
 * 
 * <p>Java class for EligibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EligibilityFlightAssociations" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}EligibilityFlightAssociationsType"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PriceClassRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibilityType", propOrder = {
    "eligibilityFlightAssociations",
    "paxRefID",
    "priceClassRefID"
})
public class EligibilityType {

    @XmlElement(name = "EligibilityFlightAssociations", required = true)
    protected EligibilityFlightAssociationsType eligibilityFlightAssociations;
    @XmlElement(name = "PaxRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;
    @XmlElement(name = "PriceClassRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> priceClassRefID;

    /**
     * Gets the value of the eligibilityFlightAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityFlightAssociationsType }
     *     
     */
    public EligibilityFlightAssociationsType getEligibilityFlightAssociations() {
        return eligibilityFlightAssociations;
    }

    /**
     * Sets the value of the eligibilityFlightAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityFlightAssociationsType }
     *     
     */
    public void setEligibilityFlightAssociations(EligibilityFlightAssociationsType value) {
        this.eligibilityFlightAssociations = value;
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

    /**
     * Gets the value of the priceClassRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceClassRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceClassRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPriceClassRefID() {
        if (priceClassRefID == null) {
            priceClassRefID = new ArrayList<String>();
        }
        return this.priceClassRefID;
    }

}
