
package org.iata.iata._2015._00._2020_1.iata_orderrulesrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Rules - information related to the response
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
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}MetadataType" minOccurs="0"/>
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}PolicyType" minOccurs="0"/>
 *         &lt;element name="Processing" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}ResponseParametersType" minOccurs="0"/>
 *         &lt;element name="Rules" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}RulesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}WarningType" minOccurs="0"/>
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
    "metadata",
    "policy",
    "processing",
    "rules",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "Policy")
    protected PolicyType policy;
    @XmlElement(name = "Processing")
    protected ResponseParametersType processing;
    @XmlElement(name = "Rules")
    protected List<RulesType> rules;
    @XmlElement(name = "Warning")
    protected WarningType warning;

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
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setPolicy(PolicyType value) {
        this.policy = value;
    }

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setProcessing(ResponseParametersType value) {
        this.processing = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RulesType }
     * 
     * 
     */
    public List<RulesType> getRules() {
        if (rules == null) {
            rules = new ArrayList<RulesType>();
        }
        return this.rules;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link WarningType }
     *     
     */
    public WarningType getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningType }
     *     
     */
    public void setWarning(WarningType value) {
        this.warning = value;
    }

}
