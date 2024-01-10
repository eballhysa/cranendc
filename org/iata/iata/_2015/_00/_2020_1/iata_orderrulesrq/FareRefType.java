
package org.iata.iata._2015._00._2020_1.iata_orderrulesrq;

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
 * To be used when requesting filed fare information as part of this request.
 * 
 * <p>Java class for FareRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineDesigCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}AirlineDesigCodeType"/>
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}TransportArrivalType"/>
 *         &lt;element name="Dep" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}TransportDepType"/>
 *         &lt;element name="FareBasisAppCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}CodeType"/>
 *         &lt;element name="FareIndCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="FareQualifier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}ProgramCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareRefText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}TextType" minOccurs="0"/>
 *         &lt;element name="FareRule" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}FareRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRefType", propOrder = {
    "airlineDesigCode",
    "arrival",
    "dep",
    "fareBasisAppCode",
    "fareBasisCode",
    "fareIndCode",
    "fareQualifier",
    "fareRefText",
    "fareRule",
    "fareTypeCode"
})
public class FareRefType {

    @XmlElement(name = "AirlineDesigCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String airlineDesigCode;
    @XmlElement(name = "Arrival", required = true)
    protected TransportArrivalType arrival;
    @XmlElement(name = "Dep", required = true)
    protected TransportDepType dep;
    @XmlElement(name = "FareBasisAppCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareBasisAppCode;
    @XmlElement(name = "FareBasisCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareBasisCode;
    @XmlElement(name = "FareIndCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareIndCode;
    @XmlElement(name = "FareQualifier")
    protected List<ProgramCriteriaType> fareQualifier;
    @XmlElement(name = "FareRefText")
    protected String fareRefText;
    @XmlElement(name = "FareRule")
    protected List<FareRuleType> fareRule;
    @XmlElement(name = "FareTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareTypeCode;

    /**
     * Gets the value of the airlineDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesigCode() {
        return airlineDesigCode;
    }

    /**
     * Sets the value of the airlineDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDesigCode(String value) {
        this.airlineDesigCode = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link TransportArrivalType }
     *     
     */
    public TransportArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportArrivalType }
     *     
     */
    public void setArrival(TransportArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the dep property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDepType }
     *     
     */
    public TransportDepType getDep() {
        return dep;
    }

    /**
     * Sets the value of the dep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDepType }
     *     
     */
    public void setDep(TransportDepType value) {
        this.dep = value;
    }

    /**
     * Gets the value of the fareBasisAppCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisAppCode() {
        return fareBasisAppCode;
    }

    /**
     * Sets the value of the fareBasisAppCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisAppCode(String value) {
        this.fareBasisAppCode = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the fareIndCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareIndCode() {
        return fareIndCode;
    }

    /**
     * Sets the value of the fareIndCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareIndCode(String value) {
        this.fareIndCode = value;
    }

    /**
     * Gets the value of the fareQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramCriteriaType }
     * 
     * 
     */
    public List<ProgramCriteriaType> getFareQualifier() {
        if (fareQualifier == null) {
            fareQualifier = new ArrayList<ProgramCriteriaType>();
        }
        return this.fareQualifier;
    }

    /**
     * Gets the value of the fareRefText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRefText() {
        return fareRefText;
    }

    /**
     * Sets the value of the fareRefText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRefText(String value) {
        this.fareRefText = value;
    }

    /**
     * Gets the value of the fareRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleType }
     * 
     * 
     */
    public List<FareRuleType> getFareRule() {
        if (fareRule == null) {
            fareRule = new ArrayList<FareRuleType>();
        }
        return this.fareRule;
    }

    /**
     * Gets the value of the fareTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTypeCode() {
        return fareTypeCode;
    }

    /**
     * Sets the value of the fareTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareTypeCode(String value) {
        this.fareTypeCode = value;
    }

}
