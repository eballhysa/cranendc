
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

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
 * Fare criteria used to filter shopping results.
 * 
 * <p>Java class for FareCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareBasisCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GroupFareCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}GroupFareCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NoAdvancePurchaseInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IndType" minOccurs="0"/>
 *         &lt;element name="NoMaxStayInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IndType" minOccurs="0"/>
 *         &lt;element name="NoMinStayInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IndType" minOccurs="0"/>
 *         &lt;element name="NoPenaltyInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IndType" minOccurs="0"/>
 *         &lt;element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PrefLevelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareCriteriaType", propOrder = {
    "fareBasisCode",
    "fareTypeCode",
    "groupFareCriteria",
    "noAdvancePurchaseInd",
    "noMaxStayInd",
    "noMinStayInd",
    "noPenaltyInd",
    "prefLevel"
})
public class FareCriteriaType {

    @XmlElement(name = "FareBasisCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> fareBasisCode;
    @XmlElement(name = "FareTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> fareTypeCode;
    @XmlElement(name = "GroupFareCriteria")
    protected List<GroupFareCriteriaType> groupFareCriteria;
    @XmlElement(name = "NoAdvancePurchaseInd")
    protected Boolean noAdvancePurchaseInd;
    @XmlElement(name = "NoMaxStayInd")
    protected Boolean noMaxStayInd;
    @XmlElement(name = "NoMinStayInd")
    protected Boolean noMinStayInd;
    @XmlElement(name = "NoPenaltyInd")
    protected Boolean noPenaltyInd;
    @XmlElement(name = "PrefLevel", required = true)
    protected PrefLevelType prefLevel;

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareBasisCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareBasisCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFareBasisCode() {
        if (fareBasisCode == null) {
            fareBasisCode = new ArrayList<String>();
        }
        return this.fareBasisCode;
    }

    /**
     * Gets the value of the fareTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFareTypeCode() {
        if (fareTypeCode == null) {
            fareTypeCode = new ArrayList<String>();
        }
        return this.fareTypeCode;
    }

    /**
     * Gets the value of the groupFareCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupFareCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupFareCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupFareCriteriaType }
     * 
     * 
     */
    public List<GroupFareCriteriaType> getGroupFareCriteria() {
        if (groupFareCriteria == null) {
            groupFareCriteria = new ArrayList<GroupFareCriteriaType>();
        }
        return this.groupFareCriteria;
    }

    /**
     * Gets the value of the noAdvancePurchaseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoAdvancePurchaseInd() {
        return noAdvancePurchaseInd;
    }

    /**
     * Sets the value of the noAdvancePurchaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoAdvancePurchaseInd(Boolean value) {
        this.noAdvancePurchaseInd = value;
    }

    /**
     * Gets the value of the noMaxStayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoMaxStayInd() {
        return noMaxStayInd;
    }

    /**
     * Sets the value of the noMaxStayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoMaxStayInd(Boolean value) {
        this.noMaxStayInd = value;
    }

    /**
     * Gets the value of the noMinStayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoMinStayInd() {
        return noMinStayInd;
    }

    /**
     * Sets the value of the noMinStayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoMinStayInd(Boolean value) {
        this.noMinStayInd = value;
    }

    /**
     * Gets the value of the noPenaltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoPenaltyInd() {
        return noPenaltyInd;
    }

    /**
     * Sets the value of the noPenaltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoPenaltyInd(Boolean value) {
        this.noPenaltyInd = value;
    }

    /**
     * Gets the value of the prefLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
    }

}
