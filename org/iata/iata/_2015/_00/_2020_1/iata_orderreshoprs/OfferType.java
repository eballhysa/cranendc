
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import java.math.BigDecimal;
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
 * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request. 
 *  
 * 
 * <p>Java class for OfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddOfferItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}OfferItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BaggageAssociations" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}BaggageAssociationsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BaggageDisclosureRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeleteOrderItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}DeleteOrderItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisclosureRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="JourneyOverview" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}JourneyOverviewType" minOccurs="0"/>
 *         &lt;element name="MatchAppText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}TextType" minOccurs="0"/>
 *         &lt;element name="MatchPercent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PercentType" minOccurs="0"/>
 *         &lt;element name="MatchTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}MatchTypeCodeType" minOccurs="0"/>
 *         &lt;element name="NameChangeOfferItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}NameChangeOfferItemType" minOccurs="0"/>
 *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}AirlineDesigCodeType"/>
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}OwnerTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PenaltyRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PTC_OfferParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PTC_OfferParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RedemptionInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType" minOccurs="0"/>
 *         &lt;element name="RequestedDateInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PriceType" minOccurs="0"/>
 *         &lt;element name="ValidatingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}AirlineDesigCodeType" minOccurs="0"/>
 *         &lt;element name="WebAddressURL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType", propOrder = {
    "addOfferItem",
    "baggageAssociations",
    "baggageDisclosureRefID",
    "deleteOrderItem",
    "desc",
    "disclosureRefID",
    "journeyOverview",
    "matchAppText",
    "matchPercent",
    "matchTypeCode",
    "nameChangeOfferItem",
    "offerID",
    "ownerCode",
    "ownerTypeCode",
    "penaltyRefID",
    "ptcOfferParameters",
    "redemptionInd",
    "requestedDateInd",
    "totalPrice",
    "validatingCarrierCode",
    "webAddressURL"
})
public class OfferType {

    @XmlElement(name = "AddOfferItem")
    protected List<OfferItemType> addOfferItem;
    @XmlElement(name = "BaggageAssociations")
    protected List<BaggageAssociationsType> baggageAssociations;
    @XmlElement(name = "BaggageDisclosureRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> baggageDisclosureRefID;
    @XmlElement(name = "DeleteOrderItem")
    protected List<DeleteOrderItemType> deleteOrderItem;
    @XmlElement(name = "Desc")
    protected List<DescType> desc;
    @XmlElement(name = "DisclosureRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String disclosureRefID;
    @XmlElement(name = "JourneyOverview")
    protected JourneyOverviewType journeyOverview;
    @XmlElement(name = "MatchAppText")
    protected String matchAppText;
    @XmlElement(name = "MatchPercent")
    protected BigDecimal matchPercent;
    @XmlElement(name = "MatchTypeCode")
    @XmlSchemaType(name = "token")
    protected MatchTypeCodeContentType matchTypeCode;
    @XmlElement(name = "NameChangeOfferItem")
    protected NameChangeOfferItemType nameChangeOfferItem;
    @XmlElement(name = "OfferID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerID;
    @XmlElement(name = "OwnerCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "OwnerTypeCode")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    @XmlElement(name = "PenaltyRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> penaltyRefID;
    @XmlElement(name = "PTC_OfferParameters")
    protected List<PTCOfferParametersType> ptcOfferParameters;
    @XmlElement(name = "RedemptionInd")
    protected Boolean redemptionInd;
    @XmlElement(name = "RequestedDateInd")
    protected Boolean requestedDateInd;
    @XmlElement(name = "TotalPrice")
    protected PriceType totalPrice;
    @XmlElement(name = "ValidatingCarrierCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validatingCarrierCode;
    @XmlElement(name = "WebAddressURL")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURL;

    /**
     * Gets the value of the addOfferItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addOfferItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddOfferItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemType }
     * 
     * 
     */
    public List<OfferItemType> getAddOfferItem() {
        if (addOfferItem == null) {
            addOfferItem = new ArrayList<OfferItemType>();
        }
        return this.addOfferItem;
    }

    /**
     * Gets the value of the baggageAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageAssociationsType }
     * 
     * 
     */
    public List<BaggageAssociationsType> getBaggageAssociations() {
        if (baggageAssociations == null) {
            baggageAssociations = new ArrayList<BaggageAssociationsType>();
        }
        return this.baggageAssociations;
    }

    /**
     * Gets the value of the baggageDisclosureRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageDisclosureRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageDisclosureRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBaggageDisclosureRefID() {
        if (baggageDisclosureRefID == null) {
            baggageDisclosureRefID = new ArrayList<String>();
        }
        return this.baggageDisclosureRefID;
    }

    /**
     * Gets the value of the deleteOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteOrderItemType }
     * 
     * 
     */
    public List<DeleteOrderItemType> getDeleteOrderItem() {
        if (deleteOrderItem == null) {
            deleteOrderItem = new ArrayList<DeleteOrderItemType>();
        }
        return this.deleteOrderItem;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the disclosureRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureRefID() {
        return disclosureRefID;
    }

    /**
     * Sets the value of the disclosureRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureRefID(String value) {
        this.disclosureRefID = value;
    }

    /**
     * Gets the value of the journeyOverview property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyOverviewType }
     *     
     */
    public JourneyOverviewType getJourneyOverview() {
        return journeyOverview;
    }

    /**
     * Sets the value of the journeyOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyOverviewType }
     *     
     */
    public void setJourneyOverview(JourneyOverviewType value) {
        this.journeyOverview = value;
    }

    /**
     * Gets the value of the matchAppText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchAppText() {
        return matchAppText;
    }

    /**
     * Sets the value of the matchAppText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchAppText(String value) {
        this.matchAppText = value;
    }

    /**
     * Gets the value of the matchPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchPercent() {
        return matchPercent;
    }

    /**
     * Sets the value of the matchPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchPercent(BigDecimal value) {
        this.matchPercent = value;
    }

    /**
     * Gets the value of the matchTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MatchTypeCodeContentType }
     *     
     */
    public MatchTypeCodeContentType getMatchTypeCode() {
        return matchTypeCode;
    }

    /**
     * Sets the value of the matchTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchTypeCodeContentType }
     *     
     */
    public void setMatchTypeCode(MatchTypeCodeContentType value) {
        this.matchTypeCode = value;
    }

    /**
     * Gets the value of the nameChangeOfferItem property.
     * 
     * @return
     *     possible object is
     *     {@link NameChangeOfferItemType }
     *     
     */
    public NameChangeOfferItemType getNameChangeOfferItem() {
        return nameChangeOfferItem;
    }

    /**
     * Sets the value of the nameChangeOfferItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameChangeOfferItemType }
     *     
     */
    public void setNameChangeOfferItem(NameChangeOfferItemType value) {
        this.nameChangeOfferItem = value;
    }

    /**
     * Gets the value of the offerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferID() {
        return offerID;
    }

    /**
     * Sets the value of the offerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferID(String value) {
        this.offerID = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the ownerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public OwnerTypeCodeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public void setOwnerTypeCode(OwnerTypeCodeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Gets the value of the penaltyRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPenaltyRefID() {
        if (penaltyRefID == null) {
            penaltyRefID = new ArrayList<String>();
        }
        return this.penaltyRefID;
    }

    /**
     * Gets the value of the ptcOfferParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcOfferParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPTCOfferParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCOfferParametersType }
     * 
     * 
     */
    public List<PTCOfferParametersType> getPTCOfferParameters() {
        if (ptcOfferParameters == null) {
            ptcOfferParameters = new ArrayList<PTCOfferParametersType>();
        }
        return this.ptcOfferParameters;
    }

    /**
     * Gets the value of the redemptionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedemptionInd() {
        return redemptionInd;
    }

    /**
     * Sets the value of the redemptionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedemptionInd(Boolean value) {
        this.redemptionInd = value;
    }

    /**
     * Gets the value of the requestedDateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedDateInd() {
        return requestedDateInd;
    }

    /**
     * Sets the value of the requestedDateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestedDateInd(Boolean value) {
        this.requestedDateInd = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setTotalPrice(PriceType value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the validatingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    /**
     * Sets the value of the validatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrierCode(String value) {
        this.validatingCarrierCode = value;
    }

    /**
     * Gets the value of the webAddressURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressURL() {
        return webAddressURL;
    }

    /**
     * Sets the value of the webAddressURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddressURL(String value) {
        this.webAddressURL = value;
    }

}
