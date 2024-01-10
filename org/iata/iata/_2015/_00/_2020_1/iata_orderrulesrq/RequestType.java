
package org.iata.iata._2015._00._2020_1.iata_orderrulesrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Rules request
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
 *         &lt;element name="CoreRequest" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}CoreRequestType"/>
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}MetadataType" minOccurs="0"/>
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}PolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}ResponseParametersType" minOccurs="0"/>
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
    "policy",
    "responseParameters"
})
public class RequestType {

    @XmlElement(name = "CoreRequest", required = true)
    protected CoreRequestType coreRequest;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;

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

}
