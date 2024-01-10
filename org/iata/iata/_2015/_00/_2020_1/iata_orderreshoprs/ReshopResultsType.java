
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reshop Results
 * 
 * <p>Java class for ReshopResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReshopResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="NoPriceChargeInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}NoPriceChargeIndType"/>
 *         &lt;element name="RepricedOffer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}RepricedOfferType"/>
 *         &lt;element name="ReshopOffers" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ReshopOffersType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReshopResultsType", propOrder = {
    "noPriceChargeInd",
    "repricedOffer",
    "reshopOffers"
})
public class ReshopResultsType {

    @XmlElement(name = "NoPriceChargeInd")
    protected NoPriceChargeIndType noPriceChargeInd;
    @XmlElement(name = "RepricedOffer")
    protected RepricedOfferType repricedOffer;
    @XmlElement(name = "ReshopOffers")
    protected ReshopOffersType reshopOffers;

    /**
     * Gets the value of the noPriceChargeInd property.
     * 
     * @return
     *     possible object is
     *     {@link NoPriceChargeIndType }
     *     
     */
    public NoPriceChargeIndType getNoPriceChargeInd() {
        return noPriceChargeInd;
    }

    /**
     * Sets the value of the noPriceChargeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoPriceChargeIndType }
     *     
     */
    public void setNoPriceChargeInd(NoPriceChargeIndType value) {
        this.noPriceChargeInd = value;
    }

    /**
     * Gets the value of the repricedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link RepricedOfferType }
     *     
     */
    public RepricedOfferType getRepricedOffer() {
        return repricedOffer;
    }

    /**
     * Sets the value of the repricedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepricedOfferType }
     *     
     */
    public void setRepricedOffer(RepricedOfferType value) {
        this.repricedOffer = value;
    }

    /**
     * Gets the value of the reshopOffers property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopOffersType }
     *     
     */
    public ReshopOffersType getReshopOffers() {
        return reshopOffers;
    }

    /**
     * Sets the value of the reshopOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopOffersType }
     *     
     */
    public void setReshopOffers(ReshopOffersType value) {
        this.reshopOffers = value;
    }

}
