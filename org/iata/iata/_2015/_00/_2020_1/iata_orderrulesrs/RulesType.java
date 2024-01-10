
package org.iata.iata._2015._00._2020_1.iata_orderrulesrs;

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
 * <p>Java class for RulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineDesigCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}AirlineDesigCodeType" minOccurs="0"/>
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}TransportArrivalType" minOccurs="0"/>
 *         &lt;element name="Dep" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}TransportDepType" minOccurs="0"/>
 *         &lt;element name="FareRule" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}FareRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}PenaltyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RulesType", propOrder = {
    "airlineDesigCode",
    "arrival",
    "dep",
    "fareRule",
    "penalty"
})
public class RulesType {

    @XmlElement(name = "AirlineDesigCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String airlineDesigCode;
    @XmlElement(name = "Arrival")
    protected TransportArrivalType arrival;
    @XmlElement(name = "Dep")
    protected TransportDepType dep;
    @XmlElement(name = "FareRule")
    protected List<FareRuleType> fareRule;
    @XmlElement(name = "Penalty")
    protected List<PenaltyType> penalty;

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
     * Gets the value of the penalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyType }
     * 
     * 
     */
    public List<PenaltyType> getPenalty() {
        if (penalty == null) {
            penalty = new ArrayList<PenaltyType>();
        }
        return this.penalty;
    }

}
