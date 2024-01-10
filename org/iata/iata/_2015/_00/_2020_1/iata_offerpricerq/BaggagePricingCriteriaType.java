
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
 * Baggage pricing specific filter criteria for shopping requests, including baggage type, charges, and settlement information.
 * 
 * <p>Java class for BaggagePricingCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggagePricingCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageOptionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}BaggageTypeCodeType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="CommercialAgreementID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="DeferralInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         &lt;element name="FixedPrepaidInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         &lt;element name="IncludeSettlementInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         &lt;element name="OptionalChargesCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="RequestedActionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}MessageFunctionCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggagePricingCriteriaType", propOrder = {
    "baggageOptionCode",
    "commercialAgreementID",
    "deferralInd",
    "fixedPrepaidInd",
    "includeSettlementInd",
    "optionalChargesCode",
    "requestedActionCode"
})
public class BaggagePricingCriteriaType {

    @XmlElement(name = "BaggageOptionCode")
    @XmlSchemaType(name = "string")
    protected List<BaggageTypeCodeContentType> baggageOptionCode;
    @XmlElement(name = "CommercialAgreementID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commercialAgreementID;
    @XmlElement(name = "DeferralInd")
    protected Boolean deferralInd;
    @XmlElement(name = "FixedPrepaidInd")
    protected Boolean fixedPrepaidInd;
    @XmlElement(name = "IncludeSettlementInd")
    protected Boolean includeSettlementInd;
    @XmlElement(name = "OptionalChargesCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String optionalChargesCode;
    @XmlElement(name = "RequestedActionCode")
    protected String requestedActionCode;

    /**
     * Gets the value of the baggageOptionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageOptionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageOptionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageTypeCodeContentType }
     * 
     * 
     */
    public List<BaggageTypeCodeContentType> getBaggageOptionCode() {
        if (baggageOptionCode == null) {
            baggageOptionCode = new ArrayList<BaggageTypeCodeContentType>();
        }
        return this.baggageOptionCode;
    }

    /**
     * Gets the value of the commercialAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialAgreementID() {
        return commercialAgreementID;
    }

    /**
     * Sets the value of the commercialAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialAgreementID(String value) {
        this.commercialAgreementID = value;
    }

    /**
     * Gets the value of the deferralInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeferralInd() {
        return deferralInd;
    }

    /**
     * Sets the value of the deferralInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeferralInd(Boolean value) {
        this.deferralInd = value;
    }

    /**
     * Gets the value of the fixedPrepaidInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedPrepaidInd() {
        return fixedPrepaidInd;
    }

    /**
     * Sets the value of the fixedPrepaidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedPrepaidInd(Boolean value) {
        this.fixedPrepaidInd = value;
    }

    /**
     * Gets the value of the includeSettlementInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSettlementInd() {
        return includeSettlementInd;
    }

    /**
     * Sets the value of the includeSettlementInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSettlementInd(Boolean value) {
        this.includeSettlementInd = value;
    }

    /**
     * Gets the value of the optionalChargesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalChargesCode() {
        return optionalChargesCode;
    }

    /**
     * Sets the value of the optionalChargesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalChargesCode(String value) {
        this.optionalChargesCode = value;
    }

    /**
     * Gets the value of the requestedActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedActionCode() {
        return requestedActionCode;
    }

    /**
     * Sets the value of the requestedActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedActionCode(String value) {
        this.requestedActionCode = value;
    }

}
