
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage disclosure data list definition.
 * 
 * <p>Java class for BaggageDisclosureListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDisclosureListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageDisclosure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}BaggageDisclosureType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDisclosureListType", propOrder = {
    "baggageDisclosure"
})
public class BaggageDisclosureListType {

    @XmlElement(name = "BaggageDisclosure", required = true)
    protected List<BaggageDisclosureType> baggageDisclosure;

    /**
     * Gets the value of the baggageDisclosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageDisclosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageDisclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageDisclosureType }
     * 
     * 
     */
    public List<BaggageDisclosureType> getBaggageDisclosure() {
        if (baggageDisclosure == null) {
            baggageDisclosure = new ArrayList<BaggageDisclosureType>();
        }
        return this.baggageDisclosure;
    }

}
