
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Function to Add, Remove or Update the Passenger Details. Providing the New and Previous values together implies an Update.
 * 
 * <p>Java class for UpdatePaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxSharingPref" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PaxSharingPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePaxType", propOrder = {
    "paxSharingPref"
})
public class UpdatePaxType {

    @XmlElement(name = "PaxSharingPref")
    protected List<PaxSharingPrefType> paxSharingPref;

    /**
     * Gets the value of the paxSharingPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSharingPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSharingPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSharingPrefType }
     * 
     * 
     */
    public List<PaxSharingPrefType> getPaxSharingPref() {
        if (paxSharingPref == null) {
            paxSharingPref = new ArrayList<PaxSharingPrefType>();
        }
        return this.paxSharingPref;
    }

}
