
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoPriceChargeIndType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoPriceChargeIndType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoPriceChangeInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoPriceChargeIndType", propOrder = {
    "noPriceChangeInd"
})
public class NoPriceChargeIndType {

    @XmlElement(name = "NoPriceChangeInd")
    protected boolean noPriceChangeInd;

    /**
     * Gets the value of the noPriceChangeInd property.
     * 
     */
    public boolean isNoPriceChangeInd() {
        return noPriceChangeInd;
    }

    /**
     * Sets the value of the noPriceChangeInd property.
     * 
     */
    public void setNoPriceChangeInd(boolean value) {
        this.noPriceChangeInd = value;
    }

}
