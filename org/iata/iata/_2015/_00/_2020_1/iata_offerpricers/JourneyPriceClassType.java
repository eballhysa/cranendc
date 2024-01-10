
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Price class information per Journey.
 * 
 * <p>Java class for JourneyPriceClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyPriceClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ID_Type"/>
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
@XmlType(name = "JourneyPriceClassType", propOrder = {
    "paxJourneyRefID",
    "priceClassRefID"
})
public class JourneyPriceClassType {

    @XmlElement(name = "PaxJourneyRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxJourneyRefID;
    @XmlElement(name = "PriceClassRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priceClassRefID;

    /**
     * Gets the value of the paxJourneyRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxJourneyRefID() {
        return paxJourneyRefID;
    }

    /**
     * Sets the value of the paxJourneyRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxJourneyRefID(String value) {
        this.paxJourneyRefID = value;
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
