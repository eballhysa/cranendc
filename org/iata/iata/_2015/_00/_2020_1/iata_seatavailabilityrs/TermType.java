
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Condition under which an agreement is reached.
 * 
 * <p>Java class for TermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailPeriod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}AvailPeriodType" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}DescType" minOccurs="0"/>
 *         &lt;element name="OrderingQty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}OrderingQtyType" minOccurs="0"/>
 *         &lt;element name="TermID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermType", propOrder = {
    "availPeriod",
    "desc",
    "orderingQty",
    "termID"
})
public class TermType {

    @XmlElement(name = "AvailPeriod")
    protected AvailPeriodType availPeriod;
    @XmlElement(name = "Desc")
    protected DescType desc;
    @XmlElement(name = "OrderingQty")
    protected OrderingQtyType orderingQty;
    @XmlElement(name = "TermID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String termID;

    /**
     * Gets the value of the availPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AvailPeriodType }
     *     
     */
    public AvailPeriodType getAvailPeriod() {
        return availPeriod;
    }

    /**
     * Sets the value of the availPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailPeriodType }
     *     
     */
    public void setAvailPeriod(AvailPeriodType value) {
        this.availPeriod = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link DescType }
     *     
     */
    public DescType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescType }
     *     
     */
    public void setDesc(DescType value) {
        this.desc = value;
    }

    /**
     * Gets the value of the orderingQty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderingQtyType }
     *     
     */
    public OrderingQtyType getOrderingQty() {
        return orderingQty;
    }

    /**
     * Sets the value of the orderingQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderingQtyType }
     *     
     */
    public void setOrderingQty(OrderingQtyType value) {
        this.orderingQty = value;
    }

    /**
     * Gets the value of the termID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermID() {
        return termID;
    }

    /**
     * Sets the value of the termID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermID(String value) {
        this.termID = value;
    }

}
