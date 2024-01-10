
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare List definition
 * 
 * <p>Java class for FareListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareGroup" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}FareGroupType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareListType", propOrder = {
    "fareGroup"
})
public class FareListType {

    @XmlElement(name = "FareGroup", required = true)
    protected List<FareGroupType> fareGroup;

    /**
     * Gets the value of the fareGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareGroupType }
     * 
     * 
     */
    public List<FareGroupType> getFareGroup() {
        if (fareGroup == null) {
            fareGroup = new ArrayList<FareGroupType>();
        }
        return this.fareGroup;
    }

}
