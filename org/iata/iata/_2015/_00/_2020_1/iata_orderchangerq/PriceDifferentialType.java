
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * For each OfferItem, this function allows the airline to inform the seller about amount differential type if this OfferItem is chosen. 
 * 
 * <p>Java class for PriceDifferentialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceDifferentialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DifferentialTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DifferentialTypeCodeType"/>
 *         &lt;element name="GrandTotalAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceDifferentialType", propOrder = {
    "differentialTypeCode",
    "grandTotalAmount"
})
public class PriceDifferentialType {

    @XmlElement(name = "DifferentialTypeCode", required = true)
    @XmlSchemaType(name = "token")
    protected DifferentialTypeCodeContentType differentialTypeCode;
    @XmlElement(name = "GrandTotalAmount", required = true)
    protected AmountType grandTotalAmount;

    /**
     * Gets the value of the differentialTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DifferentialTypeCodeContentType }
     *     
     */
    public DifferentialTypeCodeContentType getDifferentialTypeCode() {
        return differentialTypeCode;
    }

    /**
     * Sets the value of the differentialTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DifferentialTypeCodeContentType }
     *     
     */
    public void setDifferentialTypeCode(DifferentialTypeCodeContentType value) {
        this.differentialTypeCode = value;
    }

    /**
     * Gets the value of the grandTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * Sets the value of the grandTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGrandTotalAmount(AmountType value) {
        this.grandTotalAmount = value;
    }

}
