
package org.iata.iata._2015._00._2020_1.iata_airlineprofilers;

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
 * Reason for Issuance Group and Subgroup code(s) that specify the requested categories of Optional Services to be returned in the results.
 * 
 * <p>Java class for ServiceCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncludeInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}IndType" minOccurs="0"/>
 *         &lt;element name="RFIC" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}RFIC_CodeType" minOccurs="0"/>
 *         &lt;element name="RFISC" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}RFISC_CodeType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="TaxonomyCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCriteriaType", propOrder = {
    "includeInd",
    "rfic",
    "rfisc",
    "taxonomyCode"
})
public class ServiceCriteriaType {

    @XmlElement(name = "IncludeInd")
    protected Boolean includeInd;
    @XmlElement(name = "RFIC")
    protected String rfic;
    @XmlElement(name = "RFISC")
    protected List<String> rfisc;
    @XmlElement(name = "TaxonomyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> taxonomyCode;

    /**
     * Gets the value of the includeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeInd() {
        return includeInd;
    }

    /**
     * Sets the value of the includeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeInd(Boolean value) {
        this.includeInd = value;
    }

    /**
     * Gets the value of the rfic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

    /**
     * Gets the value of the rfisc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfisc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRFISC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRFISC() {
        if (rfisc == null) {
            rfisc = new ArrayList<String>();
        }
        return this.rfisc;
    }

    /**
     * Gets the value of the taxonomyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxonomyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxonomyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTaxonomyCode() {
        if (taxonomyCode == null) {
            taxonomyCode = new ArrayList<String>();
        }
        return this.taxonomyCode;
    }

}
