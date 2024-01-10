
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Reshop - information related to the response
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
 *         &lt;element name="ChangeFees" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PenaltyRefType" minOccurs="0"/>
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}DataListsType" minOccurs="0"/>
 *         &lt;element name="MarketingMessage" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}MarketingMessageType" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}MetadataType" minOccurs="0"/>
 *         &lt;element name="OrderReshopProcessing" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}OrderReshopProcessingType" minOccurs="0"/>
 *         &lt;element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PaxGroupType" minOccurs="0"/>
 *         &lt;element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PaymentFunctionsType" minOccurs="0"/>
 *         &lt;element name="ReshopResults" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ReshopResultsType"/>
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ShoppingResponseType" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}WarningType" maxOccurs="unbounded" minOccurs="0"/>
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
    "changeFees",
    "dataLists",
    "marketingMessage",
    "metadata",
    "orderReshopProcessing",
    "paxGroup",
    "paymentFunctions",
    "reshopResults",
    "shoppingResponse",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "ChangeFees")
    protected PenaltyRefType changeFees;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "MarketingMessage")
    protected MarketingMessageType marketingMessage;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "OrderReshopProcessing")
    protected OrderReshopProcessingType orderReshopProcessing;
    @XmlElement(name = "PaxGroup")
    protected PaxGroupType paxGroup;
    @XmlElement(name = "PaymentFunctions")
    protected PaymentFunctionsType paymentFunctions;
    @XmlElement(name = "ReshopResults", required = true)
    protected ReshopResultsType reshopResults;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    /**
     * Gets the value of the changeFees property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyRefType }
     *     
     */
    public PenaltyRefType getChangeFees() {
        return changeFees;
    }

    /**
     * Sets the value of the changeFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyRefType }
     *     
     */
    public void setChangeFees(PenaltyRefType value) {
        this.changeFees = value;
    }

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
     * Gets the value of the marketingMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingMessageType }
     *     
     */
    public MarketingMessageType getMarketingMessage() {
        return marketingMessage;
    }

    /**
     * Sets the value of the marketingMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingMessageType }
     *     
     */
    public void setMarketingMessage(MarketingMessageType value) {
        this.marketingMessage = value;
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
     * Gets the value of the orderReshopProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReshopProcessingType }
     *     
     */
    public OrderReshopProcessingType getOrderReshopProcessing() {
        return orderReshopProcessing;
    }

    /**
     * Sets the value of the orderReshopProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReshopProcessingType }
     *     
     */
    public void setOrderReshopProcessing(OrderReshopProcessingType value) {
        this.orderReshopProcessing = value;
    }

    /**
     * Gets the value of the paxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PaxGroupType }
     *     
     */
    public PaxGroupType getPaxGroup() {
        return paxGroup;
    }

    /**
     * Sets the value of the paxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxGroupType }
     *     
     */
    public void setPaxGroup(PaxGroupType value) {
        this.paxGroup = value;
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
     * Gets the value of the reshopResults property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopResultsType }
     *     
     */
    public ReshopResultsType getReshopResults() {
        return reshopResults;
    }

    /**
     * Sets the value of the reshopResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopResultsType }
     *     
     */
    public void setReshopResults(ReshopResultsType value) {
        this.reshopResults = value;
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
