
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides Payment Card details and commits the payment for the Offer(s) they wish to purchase. The Payment can take place either before or after the Order has been created.
 * 
 * <p>Java class for PayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Individual" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}IndividualType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerType", propOrder = {
    "individual"
})
public class PayerType {

    @XmlElement(name = "Individual", required = true)
    protected IndividualType individual;

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setIndividual(IndividualType value) {
        this.individual = value;
    }

}
