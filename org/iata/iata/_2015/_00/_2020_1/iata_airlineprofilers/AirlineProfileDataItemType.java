
package org.iata.iata._2015._00._2020_1.iata_airlineprofilers;

import java.math.BigDecimal;
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
 * Single set of data elements contained within the airline profile.
 * 
 * <p>Java class for AirlineProfileDataItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineProfileDataItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}CodeType"/>
 *         &lt;element name="OfferFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}OfferFilterCriteriaType" minOccurs="0"/>
 *         &lt;element name="POS_FilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}POS_FilterCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="POS_GeographicFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}GeographicFilterCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeqNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}NumberType"/>
 *         &lt;element name="ServiceCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}ServiceCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineProfileDataItemType", propOrder = {
    "actionTypeCode",
    "offerFilterCriteria",
    "posFilterCriteria",
    "posGeographicFilterCriteria",
    "seqNumber",
    "serviceCriteria"
})
public class AirlineProfileDataItemType {

    @XmlElement(name = "ActionTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String actionTypeCode;
    @XmlElement(name = "OfferFilterCriteria")
    protected OfferFilterCriteriaType offerFilterCriteria;
    @XmlElement(name = "POS_FilterCriteria")
    protected List<POSFilterCriteriaType> posFilterCriteria;
    @XmlElement(name = "POS_GeographicFilterCriteria")
    protected List<GeographicFilterCriteriaType> posGeographicFilterCriteria;
    @XmlElement(name = "SeqNumber", required = true)
    protected BigDecimal seqNumber;
    @XmlElement(name = "ServiceCriteria")
    protected List<ServiceCriteriaType> serviceCriteria;

    /**
     * Gets the value of the actionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTypeCode() {
        return actionTypeCode;
    }

    /**
     * Sets the value of the actionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTypeCode(String value) {
        this.actionTypeCode = value;
    }

    /**
     * Gets the value of the offerFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OfferFilterCriteriaType }
     *     
     */
    public OfferFilterCriteriaType getOfferFilterCriteria() {
        return offerFilterCriteria;
    }

    /**
     * Sets the value of the offerFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferFilterCriteriaType }
     *     
     */
    public void setOfferFilterCriteria(OfferFilterCriteriaType value) {
        this.offerFilterCriteria = value;
    }

    /**
     * Gets the value of the posFilterCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posFilterCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSFilterCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POSFilterCriteriaType }
     * 
     * 
     */
    public List<POSFilterCriteriaType> getPOSFilterCriteria() {
        if (posFilterCriteria == null) {
            posFilterCriteria = new ArrayList<POSFilterCriteriaType>();
        }
        return this.posFilterCriteria;
    }

    /**
     * Gets the value of the posGeographicFilterCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posGeographicFilterCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSGeographicFilterCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicFilterCriteriaType }
     * 
     * 
     */
    public List<GeographicFilterCriteriaType> getPOSGeographicFilterCriteria() {
        if (posGeographicFilterCriteria == null) {
            posGeographicFilterCriteria = new ArrayList<GeographicFilterCriteriaType>();
        }
        return this.posGeographicFilterCriteria;
    }

    /**
     * Gets the value of the seqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNumber() {
        return seqNumber;
    }

    /**
     * Sets the value of the seqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNumber(BigDecimal value) {
        this.seqNumber = value;
    }

    /**
     * Gets the value of the serviceCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCriteriaType }
     * 
     * 
     */
    public List<ServiceCriteriaType> getServiceCriteria() {
        if (serviceCriteria == null) {
            serviceCriteria = new ArrayList<ServiceCriteriaType>();
        }
        return this.serviceCriteria;
    }

}
