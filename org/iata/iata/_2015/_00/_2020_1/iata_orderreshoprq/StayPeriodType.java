
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Time constraints for an Affinity Shopping request including specific Dates, Seasons, Months, or Durations.
 * 
 * <p>Java class for StayPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StayPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}DateType" minOccurs="0"/>
 *         &lt;element name="MaximumStayNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="MinimumStayNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}DateType" minOccurs="0"/>
 *         &lt;element name="StayMonthName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}NameType" maxOccurs="12" minOccurs="0"/>
 *         &lt;element name="StayQuarterText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TextType" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayPeriodType", propOrder = {
    "endDate",
    "maximumStayNumber",
    "minimumStayNumber",
    "startDate",
    "stayMonthName",
    "stayQuarterText"
})
public class StayPeriodType {

    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "MaximumStayNumber")
    protected BigDecimal maximumStayNumber;
    @XmlElement(name = "MinimumStayNumber")
    protected BigDecimal minimumStayNumber;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "StayMonthName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> stayMonthName;
    @XmlElement(name = "StayQuarterText")
    protected List<String> stayQuarterText;

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the maximumStayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumStayNumber() {
        return maximumStayNumber;
    }

    /**
     * Sets the value of the maximumStayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumStayNumber(BigDecimal value) {
        this.maximumStayNumber = value;
    }

    /**
     * Gets the value of the minimumStayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumStayNumber() {
        return minimumStayNumber;
    }

    /**
     * Sets the value of the minimumStayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumStayNumber(BigDecimal value) {
        this.minimumStayNumber = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the stayMonthName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stayMonthName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStayMonthName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStayMonthName() {
        if (stayMonthName == null) {
            stayMonthName = new ArrayList<String>();
        }
        return this.stayMonthName;
    }

    /**
     * Gets the value of the stayQuarterText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stayQuarterText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStayQuarterText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStayQuarterText() {
        if (stayQuarterText == null) {
            stayQuarterText = new ArrayList<String>();
        }
        return this.stayQuarterText;
    }

}
