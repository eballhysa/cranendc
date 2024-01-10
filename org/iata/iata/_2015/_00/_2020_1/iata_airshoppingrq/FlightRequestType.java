
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight Request choice of Affinity Origin Destination or Journey flight information for this shopping request.
 * 
 * <p>Java class for FlightRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AffinityShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}AffinityShoppingCriteriaType"/>
 *         &lt;element name="OriginDestCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}OriginDestCriteriaType" maxOccurs="unbounded"/>
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ShoppingResponseType"/>
 *         &lt;element name="SpecificOriginDestCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}OriginDestType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRequestType", propOrder = {
    "affinityShoppingCriteria",
    "originDestCriteria",
    "shoppingResponse",
    "specificOriginDestCriteria"
})
public class FlightRequestType {

    @XmlElement(name = "AffinityShoppingCriteria")
    protected AffinityShoppingCriteriaType affinityShoppingCriteria;
    @XmlElement(name = "OriginDestCriteria")
    protected List<OriginDestCriteriaType> originDestCriteria;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "SpecificOriginDestCriteria")
    protected List<OriginDestType> specificOriginDestCriteria;

    /**
     * Gets the value of the affinityShoppingCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AffinityShoppingCriteriaType }
     *     
     */
    public AffinityShoppingCriteriaType getAffinityShoppingCriteria() {
        return affinityShoppingCriteria;
    }

    /**
     * Sets the value of the affinityShoppingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityShoppingCriteriaType }
     *     
     */
    public void setAffinityShoppingCriteria(AffinityShoppingCriteriaType value) {
        this.affinityShoppingCriteria = value;
    }

    /**
     * Gets the value of the originDestCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestCriteriaType }
     * 
     * 
     */
    public List<OriginDestCriteriaType> getOriginDestCriteria() {
        if (originDestCriteria == null) {
            originDestCriteria = new ArrayList<OriginDestCriteriaType>();
        }
        return this.originDestCriteria;
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
     * Gets the value of the specificOriginDestCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificOriginDestCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificOriginDestCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestType }
     * 
     * 
     */
    public List<OriginDestType> getSpecificOriginDestCriteria() {
        if (specificOriginDestCriteria == null) {
            specificOriginDestCriteria = new ArrayList<OriginDestType>();
        }
        return this.specificOriginDestCriteria;
    }

}
