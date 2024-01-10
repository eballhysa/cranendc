
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

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
 * Contains one Service (excluding flights) or Service Bundle which is priced per unit. A La Carte Offer Items are optional, and the quantities of these can be selected for any of the eligible passengers and segments.
 *  
 * 
 * <p>Java class for ALaCarteOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ALaCarteOfferItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelRestrictions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}CancelRestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChangeRestrictions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ChangeRestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Eligibility" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}EligibilityType"/>
 *         &lt;element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ID_Type"/>
 *         &lt;element name="PaymentTimeLimit" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}PaymentTimeLimitType" minOccurs="0"/>
 *         &lt;element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ServiceType"/>
 *         &lt;element name="ServiceTaxonomy" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ServiceTaxonomyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}PriceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALaCarteOfferItemType", propOrder = {
    "cancelRestrictions",
    "changeRestrictions",
    "commission",
    "eligibility",
    "offerItemID",
    "paymentTimeLimit",
    "priceGuaranteeTimeLimitDateTime",
    "service",
    "serviceTaxonomy",
    "unitPrice"
})
public class ALaCarteOfferItemType {

    @XmlElement(name = "CancelRestrictions")
    protected List<CancelRestrictionsType> cancelRestrictions;
    @XmlElement(name = "ChangeRestrictions")
    protected List<ChangeRestrictionsType> changeRestrictions;
    @XmlElement(name = "Commission")
    protected List<CommissionType> commission;
    @XmlElement(name = "Eligibility", required = true)
    protected EligibilityType eligibility;
    @XmlElement(name = "OfferItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    @XmlElement(name = "PaymentTimeLimit")
    protected PaymentTimeLimitType paymentTimeLimit;
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar priceGuaranteeTimeLimitDateTime;
    @XmlElement(name = "Service", required = true)
    protected ServiceType service;
    @XmlElement(name = "ServiceTaxonomy")
    protected List<ServiceTaxonomyType> serviceTaxonomy;
    @XmlElement(name = "UnitPrice", required = true)
    protected PriceType unitPrice;

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
     * Gets the value of the eligibility property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityType }
     *     
     */
    public EligibilityType getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityType }
     *     
     */
    public void setEligibility(EligibilityType value) {
        this.eligibility = value;
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
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setService(ServiceType value) {
        this.service = value;
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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setUnitPrice(PriceType value) {
        this.unitPrice = value;
    }

}
