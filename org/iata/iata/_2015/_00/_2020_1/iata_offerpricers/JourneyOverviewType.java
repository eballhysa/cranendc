
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
 * Summary of proposed Journey information in the context of this specific Offer.
 * 
 * <p>Java class for JourneyOverviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyOverviewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JourneyPriceClass" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}JourneyPriceClassType" maxOccurs="unbounded"/>
 *         &lt;element name="PriceClassRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyOverviewType", propOrder = {
    "journeyPriceClass",
    "priceClassRefID"
})
public class JourneyOverviewType {

    @XmlElement(name = "JourneyPriceClass", required = true)
    protected List<JourneyPriceClassType> journeyPriceClass;
    @XmlElement(name = "PriceClassRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priceClassRefID;

    /**
     * Gets the value of the journeyPriceClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyPriceClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyPriceClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyPriceClassType }
     * 
     * 
     */
    public List<JourneyPriceClassType> getJourneyPriceClass() {
        if (journeyPriceClass == null) {
            journeyPriceClass = new ArrayList<JourneyPriceClassType>();
        }
        return this.journeyPriceClass;
    }

    /**
     * Gets the value of the priceClassRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceClassRefID() {
        return priceClassRefID;
    }

    /**
     * Sets the value of the priceClassRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceClassRefID(String value) {
        this.priceClassRefID = value;
    }

}
