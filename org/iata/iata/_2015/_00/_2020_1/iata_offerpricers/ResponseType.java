
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer Price - information related to the response
 *  
 * 
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}DataListsType" minOccurs="0"/>
 *         &lt;element name="MessageProcessing" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}MessageProcessingType" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}MetadataType" minOccurs="0"/>
 *         &lt;element name="OtherOffers" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}CarrierOffersType" minOccurs="0"/>
 *         &lt;element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}PaymentFunctionsType" minOccurs="0"/>
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}PolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PricedOffer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}OfferType"/>
 *         &lt;element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}PromotionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ResponseParametersType" minOccurs="0"/>
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ShoppingResponseType" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}WarningType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "dataLists",
    "messageProcessing",
    "metadata",
    "otherOffers",
    "paymentFunctions",
    "policy",
    "pricedOffer",
    "promotion",
    "responseParameters",
    "shoppingResponse",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "MessageProcessing")
    protected MessageProcessingType messageProcessing;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "OtherOffers")
    protected CarrierOffersType otherOffers;
    @XmlElement(name = "PaymentFunctions")
    protected PaymentFunctionsType paymentFunctions;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlElement(name = "PricedOffer", required = true)
    protected OfferType pricedOffer;
    @XmlElement(name = "Promotion")
    protected List<PromotionType> promotion;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

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
     * Gets the value of the messageProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link MessageProcessingType }
     *     
     */
    public MessageProcessingType getMessageProcessing() {
        return messageProcessing;
    }

    /**
     * Sets the value of the messageProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageProcessingType }
     *     
     */
    public void setMessageProcessing(MessageProcessingType value) {
        this.messageProcessing = value;
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
     * Gets the value of the otherOffers property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierOffersType }
     *     
     */
    public CarrierOffersType getOtherOffers() {
        return otherOffers;
    }

    /**
     * Sets the value of the otherOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierOffersType }
     *     
     */
    public void setOtherOffers(CarrierOffersType value) {
        this.otherOffers = value;
    }

    /**
     * Gets the value of the paymentFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFunctionsType }
     *     
     */
    public PaymentFunctionsType getPaymentFunctions() {
        return paymentFunctions;
    }

    /**
     * Sets the value of the paymentFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFunctionsType }
     *     
     */
    public void setPaymentFunctions(PaymentFunctionsType value) {
        this.paymentFunctions = value;
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
     *     {@link OfferType }
     *     
     */
    public OfferType getPricedOffer() {
        return pricedOffer;
    }

    /**
     * Sets the value of the pricedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setPricedOffer(OfferType value) {
        this.pricedOffer = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionType }
     * 
     * 
     */
    public List<PromotionType> getPromotion() {
        if (promotion == null) {
            promotion = new ArrayList<PromotionType>();
        }
        return this.promotion;
    }

    /**
     * Gets the value of the responseParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setResponseParameters(ResponseParametersType value) {
        this.responseParameters = value;
    }

    /**
     * Gets the value of the shoppingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseType }
     *     
     */
    public ShoppingResponseType getShoppingResponse() {
        return shoppingResponse;
    }

    /**
     * Sets the value of the shoppingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseType }
     *     
     */
    public void setShoppingResponse(ShoppingResponseType value) {
        this.shoppingResponse = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * 
     * 
     */
    public List<WarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<WarningType>();
        }
        return this.warning;
    }

}
