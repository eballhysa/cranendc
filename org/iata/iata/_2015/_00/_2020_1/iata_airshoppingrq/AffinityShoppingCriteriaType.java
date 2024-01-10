
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Affinity search includes a wide range of criteria including generic origin/destination information, trip time periods, as well as travel budget.
 * 
 * <p>Java class for AffinityShoppingCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityShoppingCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffinityOriginDest" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}AffinityOriginDestType" maxOccurs="unbounded"/>
 *         &lt;element name="BudgetAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="JourneyDistanceCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}JourneyDistanceCriteriaType" minOccurs="0"/>
 *         &lt;element name="JourneyDurationCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}JourneyDurationCriteriaType" minOccurs="0"/>
 *         &lt;element name="KeywordPref" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ShoppingResponseType" minOccurs="0"/>
 *         &lt;element name="StayPeriod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}StayPeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityShoppingCriteriaType", propOrder = {
    "affinityOriginDest",
    "budgetAmount",
    "journeyDistanceCriteria",
    "journeyDurationCriteria",
    "keywordPref",
    "shoppingResponse",
    "stayPeriod"
})
public class AffinityShoppingCriteriaType {

    @XmlElement(name = "AffinityOriginDest", required = true)
    protected List<AffinityOriginDestType> affinityOriginDest;
    @XmlElement(name = "BudgetAmount")
    protected AmountType budgetAmount;
    @XmlElement(name = "JourneyDistanceCriteria")
    protected JourneyDistanceCriteriaType journeyDistanceCriteria;
    @XmlElement(name = "JourneyDurationCriteria")
    protected JourneyDurationCriteriaType journeyDurationCriteria;
    @XmlElement(name = "KeywordPref")
    protected List<KeyValuePropertyType> keywordPref;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "StayPeriod")
    protected StayPeriodType stayPeriod;

    /**
     * Gets the value of the affinityOriginDest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affinityOriginDest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffinityOriginDest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffinityOriginDestType }
     * 
     * 
     */
    public List<AffinityOriginDestType> getAffinityOriginDest() {
        if (affinityOriginDest == null) {
            affinityOriginDest = new ArrayList<AffinityOriginDestType>();
        }
        return this.affinityOriginDest;
    }

    /**
     * Gets the value of the budgetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBudgetAmount() {
        return budgetAmount;
    }

    /**
     * Sets the value of the budgetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBudgetAmount(AmountType value) {
        this.budgetAmount = value;
    }

    /**
     * Gets the value of the journeyDistanceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDistanceCriteriaType }
     *     
     */
    public JourneyDistanceCriteriaType getJourneyDistanceCriteria() {
        return journeyDistanceCriteria;
    }

    /**
     * Sets the value of the journeyDistanceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDistanceCriteriaType }
     *     
     */
    public void setJourneyDistanceCriteria(JourneyDistanceCriteriaType value) {
        this.journeyDistanceCriteria = value;
    }

    /**
     * Gets the value of the journeyDurationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public JourneyDurationCriteriaType getJourneyDurationCriteria() {
        return journeyDurationCriteria;
    }

    /**
     * Sets the value of the journeyDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public void setJourneyDurationCriteria(JourneyDurationCriteriaType value) {
        this.journeyDurationCriteria = value;
    }

    /**
     * Gets the value of the keywordPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getKeywordPref() {
        if (keywordPref == null) {
            keywordPref = new ArrayList<KeyValuePropertyType>();
        }
        return this.keywordPref;
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
     * Gets the value of the stayPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StayPeriodType }
     *     
     */
    public StayPeriodType getStayPeriod() {
        return stayPeriod;
    }

    /**
     * Sets the value of the stayPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayPeriodType }
     *     
     */
    public void setStayPeriod(StayPeriodType value) {
        this.stayPeriod = value;
    }

}
