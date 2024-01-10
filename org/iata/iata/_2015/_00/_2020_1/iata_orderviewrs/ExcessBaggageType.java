
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Excess baggage information displayed on a coupon.
 * 
 * <p>Java class for ExcessBaggageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AmountType"/>
 *         &lt;element name="ExcessBaggageMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}MeasureType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageType", propOrder = {
    "amount",
    "excessBaggageMeasure"
})
public class ExcessBaggageType {

    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "ExcessBaggageMeasure", required = true)
    protected MeasureType excessBaggageMeasure;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the excessBaggageMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getExcessBaggageMeasure() {
        return excessBaggageMeasure;
    }

    /**
     * Sets the value of the excessBaggageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setExcessBaggageMeasure(MeasureType value) {
        this.excessBaggageMeasure = value;
    }

}
