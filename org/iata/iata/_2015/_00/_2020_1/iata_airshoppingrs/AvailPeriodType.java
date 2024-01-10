
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Earliest and Latest Period than an option is available or may be used.
 * 
 * <p>Java class for AvailPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarliestAvailablePeriodDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LatestAvailablePeriodDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailPeriodType", propOrder = {
    "earliestAvailablePeriodDateTime",
    "latestAvailablePeriodDateTime"
})
public class AvailPeriodType {

    @XmlElement(name = "EarliestAvailablePeriodDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestAvailablePeriodDateTime;
    @XmlElement(name = "LatestAvailablePeriodDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestAvailablePeriodDateTime;

    /**
     * Gets the value of the earliestAvailablePeriodDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestAvailablePeriodDateTime() {
        return earliestAvailablePeriodDateTime;
    }

    /**
     * Sets the value of the earliestAvailablePeriodDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestAvailablePeriodDateTime(XMLGregorianCalendar value) {
        this.earliestAvailablePeriodDateTime = value;
    }

    /**
     * Gets the value of the latestAvailablePeriodDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestAvailablePeriodDateTime() {
        return latestAvailablePeriodDateTime;
    }

    /**
     * Sets the value of the latestAvailablePeriodDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestAvailablePeriodDateTime(XMLGregorianCalendar value) {
        this.latestAvailablePeriodDateTime = value;
    }

}
