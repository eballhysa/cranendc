
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A priced grouping of one or more services within an Offer. 
 *  
 * 
 * <p>Java class for OfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelRestrictions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}CancelRestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChangeRestrictions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ChangeRestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}Desc1Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}FareDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MandatoryInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *         &lt;element name="ModificationProhibitedInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *         &lt;element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ID_Type"/>
 *         &lt;element name="OfferItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}CodeType" minOccurs="0"/>
 *         &lt;element name="PaymentTimeLimit" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}PaymentTimeLimitType" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}PriceType"/>
 *         &lt;element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ServiceType" maxOccurs="unbounded"/>
 *         &lt;element name="ServiceTaxonomy" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ServiceTaxonomyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopOverRestrictions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}StopOverRestrictionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemType", propOrder = {
    "cancelRestrictions",
    "changeRestrictions",
    "commission",
    "desc",
    "fareDetail",
    "mandatoryInd",
    "modificationProhibitedInd",
    "offerItemID",
    "offerItemTypeCode",
    "paymentTimeLimit",
    "price",
    "priceGuaranteeTimeLimitDateTime",
    "service",
    "serviceTaxonomy",
    "stopOverRestrictions"
})
public class OfferItemType {

    @XmlElement(name = "CancelRestrictions")
    protected List<CancelRestrictionsType> cancelRestrictions;
    @XmlElement(name = "ChangeRestrictions")
    protected List<ChangeRestrictionsType> changeRestrictions;
    @XmlElement(name = "Commission")
    protected List<CommissionType> commission;
    @XmlElement(name = "Desc")
    protected List<Desc1Type> desc;
    @XmlElement(name = "FareDetail")
    protected List<FareDetailType> fareDetail;
    @XmlElement(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlElement(name = "ModificationProhibitedInd")
    protected Boolean modificationProhibitedInd;
    @XmlElement(name = "OfferItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    @XmlElement(name = "OfferItemTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemTypeCode;
    @XmlElement(name = "PaymentTimeLimit")
    protected PaymentTimeLimitType paymentTimeLimit;
    @XmlElement(name = "Price", required = true)
    protected PriceType price;
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar priceGuaranteeTimeLimitDateTime;
    @XmlElement(name = "Service", required = true)
    protected List<ServiceType> service;
    @XmlElement(name = "ServiceTaxonomy")
    protected List<ServiceTaxonomyType> serviceTaxonomy;
    @XmlElement(name = "StopOverRestrictions")
    protected StopOverRestrictionsType stopOverRestrictions;

    /**
     * Gets the value of the cancelRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelRestrictionsType }
     * 
     * 
     */
    public List<CancelRestrictionsType> getCancelRestrictions() {
        if (cancelRestrictions == null) {
            cancelRestrictions = new ArrayList<CancelRestrictionsType>();
        }
        return this.cancelRestrictions;
    }

    /**
     * Gets the value of the changeRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeRestrictionsType }
     * 
     * 
     */
    public List<ChangeRestrictionsType> getChangeRestrictions() {
        if (changeRestrictions == null) {
            changeRestrictions = new ArrayList<ChangeRestrictionsType>();
        }
        return this.changeRestrictions;
    }

    /**
     * Gets the value of the commission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionType }
     * 
     * 
     */
    public List<CommissionType> getCommission() {
        if (commission == null) {
            commission = new ArrayList<CommissionType>();
        }
        return this.commission;
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
     * {@link Desc1Type }
     * 
     * 
     */
    public List<Desc1Type> getDesc() {
        if (desc == null) {
            desc = new ArrayList<Desc1Type>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType }
     * 
     * 
     */
    public List<FareDetailType> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<FareDetailType>();
        }
        return this.fareDetail;
    }

    /**
     * Gets the value of the mandatoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Sets the value of the mandatoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * Gets the value of the modificationProhibitedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModificationProhibitedInd() {
        return modificationProhibitedInd;
    }

    /**
     * Sets the value of the modificationProhibitedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModificationProhibitedInd(Boolean value) {
        this.modificationProhibitedInd = value;
    }

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the offerItemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemTypeCode() {
        return offerItemTypeCode;
    }

    /**
     * Sets the value of the offerItemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemTypeCode(String value) {
        this.offerItemTypeCode = value;
    }

    /**
     * Gets the value of the paymentTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTimeLimitType }
     *     
     */
    public PaymentTimeLimitType getPaymentTimeLimit() {
        return paymentTimeLimit;
    }

    /**
     * Sets the value of the paymentTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTimeLimitType }
     *     
     */
    public void setPaymentTimeLimit(PaymentTimeLimitType value) {
        this.paymentTimeLimit = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceGuaranteeTimeLimitDateTime() {
        return priceGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceGuaranteeTimeLimitDateTime(XMLGregorianCalendar value) {
        this.priceGuaranteeTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<ServiceType>();
        }
        return this.service;
    }

    /**
     * Gets the value of the serviceTaxonomy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTaxonomy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceTaxonomy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTaxonomyType }
     * 
     * 
     */
    public List<ServiceTaxonomyType> getServiceTaxonomy() {
        if (serviceTaxonomy == null) {
            serviceTaxonomy = new ArrayList<ServiceTaxonomyType>();
        }
        return this.serviceTaxonomy;
    }

    /**
     * Gets the value of the stopOverRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StopOverRestrictionsType }
     *     
     */
    public StopOverRestrictionsType getStopOverRestrictions() {
        return stopOverRestrictions;
    }

    /**
     * Sets the value of the stopOverRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopOverRestrictionsType }
     *     
     */
    public void setStopOverRestrictions(StopOverRestrictionsType value) {
        this.stopOverRestrictions = value;
    }

}
