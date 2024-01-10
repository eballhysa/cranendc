
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests the airline to additionally include a preview of the Offer price for the same Shopping Criteria for the specified date range.
 * 
 * <p>Java class for CalendarDateCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarDateCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DaysAfterNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="DaysBeforeNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarDateCriteriaType", propOrder = {
    "daysAfterNumber",
    "daysBeforeNumber"
})
public class CalendarDateCriteriaType {

    @XmlElement(name = "DaysAfterNumber")
    protected BigDecimal daysAfterNumber;
    @XmlElement(name = "DaysBeforeNumber")
    protected BigDecimal daysBeforeNumber;

    /**
     * Gets the value of the daysAfterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysAfterNumber() {
        return daysAfterNumber;
    }

    /**
     * Sets the value of the daysAfterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysAfterNumber(BigDecimal value) {
        this.daysAfterNumber = value;
    }

    /**
     * Gets the value of the daysBeforeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysBeforeNumber() {
        return daysBeforeNumber;
    }

    /**
     * Sets the value of the daysBeforeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysBeforeNumber(BigDecimal value) {
        this.daysBeforeNumber = value;
    }

}
