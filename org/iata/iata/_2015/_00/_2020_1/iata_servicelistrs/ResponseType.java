
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service List - information related to the response
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
 *         &lt;element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}OfferType" minOccurs="0"/>
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}DataListsType" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}MetadataType" minOccurs="0"/>
 *         &lt;element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}PaymentFunctionsType" minOccurs="0"/>
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ResponseParametersType" minOccurs="0"/>
 *         &lt;element name="ServiceListProcessing" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ServiceListProcessingType" minOccurs="0"/>
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ShoppingResponseType" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}WarningType" maxOccurs="unbounded" minOccurs="0"/>
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
    "aLaCarteOffer",
    "dataLists",
    "metadata",
    "paymentFunctions",
    "responseParameters",
    "serviceListProcessing",
    "shoppingResponse",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "ALaCarteOffer")
    protected OfferType aLaCarteOffer;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "PaymentFunctions")
    protected PaymentFunctionsType paymentFunctions;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;
    @XmlElement(name = "ServiceListProcessing")
    protected ServiceListProcessingType serviceListProcessing;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    /**
     * Gets the value of the aLaCarteOffer property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getALaCarteOffer() {
        return aLaCarteOffer;
    }

    /**
     * Sets the value of the aLaCarteOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setALaCarteOffer(OfferType value) {
        this.aLaCarteOffer = value;
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
     * Gets the value of the serviceListProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceListProcessingType }
     *     
     */
    public ServiceListProcessingType getServiceListProcessing() {
        return serviceListProcessing;
    }

    /**
     * Sets the value of the serviceListProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceListProcessingType }
     *     
     */
    public void setServiceListProcessing(ServiceListProcessingType value) {
        this.serviceListProcessing = value;
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
