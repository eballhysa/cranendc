
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReshopOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReshopOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReshopOrderChoice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ReshopOrderChoiceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReshopOrderType", propOrder = {
    "reshopOrderChoice"
})
public class ReshopOrderType {

    @XmlElement(name = "ReshopOrderChoice", required = true)
    protected ReshopOrderChoiceType reshopOrderChoice;

    /**
     * Gets the value of the reshopOrderChoice property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopOrderChoiceType }
     *     
     */
    public ReshopOrderChoiceType getReshopOrderChoice() {
        return reshopOrderChoice;
    }

    /**
     * Sets the value of the reshopOrderChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopOrderChoiceType }
     *     
     */
    public void setReshopOrderChoice(ReshopOrderChoiceType value) {
        this.reshopOrderChoice = value;
    }

}
