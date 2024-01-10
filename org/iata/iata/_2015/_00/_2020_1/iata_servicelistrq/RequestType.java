
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service List request.
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
 *         &lt;element name="CoreRequest" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}CoreRequestType"/>
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}MetadataType" minOccurs="0"/>
 *         &lt;element name="OriginDest" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}OriginDestType" minOccurs="0"/>
 *         &lt;element name="Pax" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}PaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}PolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}ResponseParametersType" minOccurs="0"/>
 *         &lt;element name="ShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}ShoppingCriteriaType" minOccurs="0"/>
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}ShoppingResponseType" minOccurs="0"/>
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
    "coreRequest",
    "metadata",
    "originDest",
    "pax",
    "policy",
    "responseParameters",
    "shoppingCriteria",
    "shoppingResponse"
})
public class RequestType {

    @XmlElement(name = "CoreRequest", required = true)
    protected CoreRequestType coreRequest;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "OriginDest")
    protected OriginDestType originDest;
    @XmlElement(name = "Pax")
    protected List<PaxType> pax;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;
    @XmlElement(name = "ShoppingCriteria")
    protected ShoppingCriteriaType shoppingCriteria;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;

    /**
     * Gets the value of the coreRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CoreRequestType }
     *     
     */
    public CoreRequestType getCoreRequest() {
        return coreRequest;
    }

    /**
     * Sets the value of the coreRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreRequestType }
     *     
     */
    public void setCoreRequest(CoreRequestType value) {
        this.coreRequest = value;
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
     * Gets the value of the originDest property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestType }
     *     
     */
    public OriginDestType getOriginDest() {
        return originDest;
    }

    /**
     * Sets the value of the originDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestType }
     *     
     */
    public void setOriginDest(OriginDestType value) {
        this.originDest = value;
    }

    /**
     * Gets the value of the pax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxType }
     * 
     * 
     */
    public List<PaxType> getPax() {
        if (pax == null) {
            pax = new ArrayList<PaxType>();
        }
        return this.pax;
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

}
