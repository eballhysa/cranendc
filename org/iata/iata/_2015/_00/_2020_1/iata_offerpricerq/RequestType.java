
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

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
 * Offer Price request.
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}DataListsType" minOccurs="0"/>
 *         &lt;element name="InExchForTicket" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}PenaltyRefType" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}MetadataType" minOccurs="0"/>
 *         &lt;element name="OfferPriceParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ResponseParametersType" minOccurs="0"/>
 *         &lt;element name="OriginDestRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}PolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PricedOffer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}PricedOfferType"/>
 *         &lt;element name="ShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ShoppingCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "dataLists",
    "inExchForTicket",
    "metadata",
    "offerPriceParameters",
    "originDestRefID",
    "policy",
    "pricedOffer",
    "shoppingCriteria"
})
public class RequestType {

    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "InExchForTicket")
    protected PenaltyRefType inExchForTicket;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "OfferPriceParameters")
    protected ResponseParametersType offerPriceParameters;
    @XmlElement(name = "OriginDestRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> originDestRefID;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlElement(name = "PricedOffer", required = true)
    protected PricedOfferType pricedOffer;
    @XmlElement(name = "ShoppingCriteria")
    protected ShoppingCriteriaType shoppingCriteria;

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link DataListsType }
     *     
     */
    public DataListsType getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListsType }
     *     
     */
    public void setDataLists(DataListsType value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the inExchForTicket property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyRefType }
     *     
     */
    public PenaltyRefType getInExchForTicket() {
        return inExchForTicket;
    }

    /**
     * Sets the value of the inExchForTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyRefType }
     *     
     */
    public void setInExchForTicket(PenaltyRefType value) {
        this.inExchForTicket = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the offerPriceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getOfferPriceParameters() {
        return offerPriceParameters;
    }

    /**
     * Sets the value of the offerPriceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setOfferPriceParameters(ResponseParametersType value) {
        this.offerPriceParameters = value;
    }

    /**
     * Gets the value of the originDestRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOriginDestRefID() {
        if (originDestRefID == null) {
            originDestRefID = new ArrayList<String>();
        }
        return this.originDestRefID;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyType }
     * 
     * 
     */
    public List<PolicyType> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PolicyType>();
        }
        return this.policy;
    }

    /**
     * Gets the value of the pricedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link PricedOfferType }
     *     
     */
    public PricedOfferType getPricedOffer() {
        return pricedOffer;
    }

    /**
     * Sets the value of the pricedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedOfferType }
     *     
     */
    public void setPricedOffer(PricedOfferType value) {
        this.pricedOffer = value;
    }

    /**
     * Gets the value of the shoppingCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCriteriaType }
     *     
     */
    public ShoppingCriteriaType getShoppingCriteria() {
        return shoppingCriteria;
    }

    /**
     * Sets the value of the shoppingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCriteriaType }
     *     
     */
    public void setShoppingCriteria(ShoppingCriteriaType value) {
        this.shoppingCriteria = value;
    }

}
