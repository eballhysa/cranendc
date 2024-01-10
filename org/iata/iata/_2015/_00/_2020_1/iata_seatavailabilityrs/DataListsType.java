
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data List definition for this message.
 * 
 * <p>Java class for DataListsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataListsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageAllowanceList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}BaggageAllowanceListType" minOccurs="0"/>
 *         &lt;element name="BaggageDisclosureList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}BaggageDisclosureListType" minOccurs="0"/>
 *         &lt;element name="ContactInfoList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ContactInfoListType" minOccurs="0"/>
 *         &lt;element name="DisclosureList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}DisclosureListType" minOccurs="0"/>
 *         &lt;element name="FareList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}FareListType" minOccurs="0"/>
 *         &lt;element name="MediaList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}MediaListType" minOccurs="0"/>
 *         &lt;element name="OriginDestList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}OriginDestListType" minOccurs="0"/>
 *         &lt;element name="PaxJourneyList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PaxJourneyListType" minOccurs="0"/>
 *         &lt;element name="PaxList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PaxListType" minOccurs="0"/>
 *         &lt;element name="PaxSegmentList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PaxSegmentListType" minOccurs="0"/>
 *         &lt;element name="PenaltyList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PenaltyListType" minOccurs="0"/>
 *         &lt;element name="PriceClassList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PriceClassListType" minOccurs="0"/>
 *         &lt;element name="SeatProfileList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}SeatProfileListType" minOccurs="0"/>
 *         &lt;element name="ServiceDefinitionList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ServiceDefinitionListType" minOccurs="0"/>
 *         &lt;element name="TermsList" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}TermsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataListsType", propOrder = {
    "baggageAllowanceList",
    "baggageDisclosureList",
    "contactInfoList",
    "disclosureList",
    "fareList",
    "mediaList",
    "originDestList",
    "paxJourneyList",
    "paxList",
    "paxSegmentList",
    "penaltyList",
    "priceClassList",
    "seatProfileList",
    "serviceDefinitionList",
    "termsList"
})
public class DataListsType {

    @XmlElement(name = "BaggageAllowanceList")
    protected BaggageAllowanceListType baggageAllowanceList;
    @XmlElement(name = "BaggageDisclosureList")
    protected BaggageDisclosureListType baggageDisclosureList;
    @XmlElement(name = "ContactInfoList")
    protected ContactInfoListType contactInfoList;
    @XmlElement(name = "DisclosureList")
    protected DisclosureListType disclosureList;
    @XmlElement(name = "FareList")
    protected FareListType fareList;
    @XmlElement(name = "MediaList")
    protected MediaListType mediaList;
    @XmlElement(name = "OriginDestList")
    protected OriginDestListType originDestList;
    @XmlElement(name = "PaxJourneyList")
    protected PaxJourneyListType paxJourneyList;
    @XmlElement(name = "PaxList")
    protected PaxListType paxList;
    @XmlElement(name = "PaxSegmentList")
    protected PaxSegmentListType paxSegmentList;
    @XmlElement(name = "PenaltyList")
    protected PenaltyListType penaltyList;
    @XmlElement(name = "PriceClassList")
    protected PriceClassListType priceClassList;
    @XmlElement(name = "SeatProfileList")
    protected SeatProfileListType seatProfileList;
    @XmlElement(name = "ServiceDefinitionList")
    protected ServiceDefinitionListType serviceDefinitionList;
    @XmlElement(name = "TermsList")
    protected TermsListType termsList;

    /**
     * Gets the value of the baggageAllowanceList property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceListType }
     *     
     */
    public BaggageAllowanceListType getBaggageAllowanceList() {
        return baggageAllowanceList;
    }

    /**
     * Sets the value of the baggageAllowanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceListType }
     *     
     */
    public void setBaggageAllowanceList(BaggageAllowanceListType value) {
        this.baggageAllowanceList = value;
    }

    /**
     * Gets the value of the baggageDisclosureList property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDisclosureListType }
     *     
     */
    public BaggageDisclosureListType getBaggageDisclosureList() {
        return baggageDisclosureList;
    }

    /**
     * Sets the value of the baggageDisclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDisclosureListType }
     *     
     */
    public void setBaggageDisclosureList(BaggageDisclosureListType value) {
        this.baggageDisclosureList = value;
    }

    /**
     * Gets the value of the contactInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoListType }
     *     
     */
    public ContactInfoListType getContactInfoList() {
        return contactInfoList;
    }

    /**
     * Sets the value of the contactInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoListType }
     *     
     */
    public void setContactInfoList(ContactInfoListType value) {
        this.contactInfoList = value;
    }

    /**
     * Gets the value of the disclosureList property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureListType }
     *     
     */
    public DisclosureListType getDisclosureList() {
        return disclosureList;
    }

    /**
     * Sets the value of the disclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureListType }
     *     
     */
    public void setDisclosureList(DisclosureListType value) {
        this.disclosureList = value;
    }

    /**
     * Gets the value of the fareList property.
     * 
     * @return
     *     possible object is
     *     {@link FareListType }
     *     
     */
    public FareListType getFareList() {
        return fareList;
    }

    /**
     * Sets the value of the fareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareListType }
     *     
     */
    public void setFareList(FareListType value) {
        this.fareList = value;
    }

    /**
     * Gets the value of the mediaList property.
     * 
     * @return
     *     possible object is
     *     {@link MediaListType }
     *     
     */
    public MediaListType getMediaList() {
        return mediaList;
    }

    /**
     * Sets the value of the mediaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaListType }
     *     
     */
    public void setMediaList(MediaListType value) {
        this.mediaList = value;
    }

    /**
     * Gets the value of the originDestList property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestListType }
     *     
     */
    public OriginDestListType getOriginDestList() {
        return originDestList;
    }

    /**
     * Sets the value of the originDestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestListType }
     *     
     */
    public void setOriginDestList(OriginDestListType value) {
        this.originDestList = value;
    }

    /**
     * Gets the value of the paxJourneyList property.
     * 
     * @return
     *     possible object is
     *     {@link PaxJourneyListType }
     *     
     */
    public PaxJourneyListType getPaxJourneyList() {
        return paxJourneyList;
    }

    /**
     * Sets the value of the paxJourneyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxJourneyListType }
     *     
     */
    public void setPaxJourneyList(PaxJourneyListType value) {
        this.paxJourneyList = value;
    }

    /**
     * Gets the value of the paxList property.
     * 
     * @return
     *     possible object is
     *     {@link PaxListType }
     *     
     */
    public PaxListType getPaxList() {
        return paxList;
    }

    /**
     * Sets the value of the paxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxListType }
     *     
     */
    public void setPaxList(PaxListType value) {
        this.paxList = value;
    }

    /**
     * Gets the value of the paxSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentListType }
     *     
     */
    public PaxSegmentListType getPaxSegmentList() {
        return paxSegmentList;
    }

    /**
     * Sets the value of the paxSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentListType }
     *     
     */
    public void setPaxSegmentList(PaxSegmentListType value) {
        this.paxSegmentList = value;
    }

    /**
     * Gets the value of the penaltyList property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyListType }
     *     
     */
    public PenaltyListType getPenaltyList() {
        return penaltyList;
    }

    /**
     * Sets the value of the penaltyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyListType }
     *     
     */
    public void setPenaltyList(PenaltyListType value) {
        this.penaltyList = value;
    }

    /**
     * Gets the value of the priceClassList property.
     * 
     * @return
     *     possible object is
     *     {@link PriceClassListType }
     *     
     */
    public PriceClassListType getPriceClassList() {
        return priceClassList;
    }

    /**
     * Sets the value of the priceClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceClassListType }
     *     
     */
    public void setPriceClassList(PriceClassListType value) {
        this.priceClassList = value;
    }

    /**
     * Gets the value of the seatProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link SeatProfileListType }
     *     
     */
    public SeatProfileListType getSeatProfileList() {
        return seatProfileList;
    }

    /**
     * Sets the value of the seatProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatProfileListType }
     *     
     */
    public void setSeatProfileList(SeatProfileListType value) {
        this.seatProfileList = value;
    }

    /**
     * Gets the value of the serviceDefinitionList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionListType }
     *     
     */
    public ServiceDefinitionListType getServiceDefinitionList() {
        return serviceDefinitionList;
    }

    /**
     * Sets the value of the serviceDefinitionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionListType }
     *     
     */
    public void setServiceDefinitionList(ServiceDefinitionListType value) {
        this.serviceDefinitionList = value;
    }

    /**
     * Gets the value of the termsList property.
     * 
     * @return
     *     possible object is
     *     {@link TermsListType }
     *     
     */
    public TermsListType getTermsList() {
        return termsList;
    }

    /**
     * Sets the value of the termsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsListType }
     *     
     */
    public void setTermsList(TermsListType value) {
        this.termsList = value;
    }

}