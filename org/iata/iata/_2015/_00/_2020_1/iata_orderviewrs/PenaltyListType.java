
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Penalty data list definition.
 * 
 * <p>Java class for PenaltyListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PenaltyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyListType", propOrder = {
    "penalty"
})
public class PenaltyListType {

    @XmlElement(name = "Penalty", required = true)
    protected List<PenaltyType> penalty;

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
