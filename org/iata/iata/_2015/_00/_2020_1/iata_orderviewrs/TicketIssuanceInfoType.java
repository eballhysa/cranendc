
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The issuing carrier and issuing location of a ticket.
 * 
 * <p>Java class for TicketIssuanceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketIssuanceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IATA_LocationCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IATA_LocationCodeType" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateType" minOccurs="0"/>
 *         &lt;element name="IssuingAgencyID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="IssuingAirlineDesigCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AirlineDesigCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketIssuanceInfoType", propOrder = {
    "iataLocationCode",
    "issueDate",
    "issuingAgencyID",
    "issuingAirlineDesigCode"
})
public class TicketIssuanceInfoType {

    @XmlElement(name = "IATA_LocationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iataLocationCode;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "IssuingAgencyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String issuingAgencyID;
    @XmlElement(name = "IssuingAirlineDesigCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String issuingAirlineDesigCode;

    /**
     * Gets the value of the iataLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATALocationCode() {
        return iataLocationCode;
    }

    /**
     * Sets the value of the iataLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATALocationCode(String value) {
        this.iataLocationCode = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issuingAgencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingAgencyID() {
        return issuingAgencyID;
    }

    /**
     * Sets the value of the issuingAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingAgencyID(String value) {
        this.issuingAgencyID = value;
    }

    /**
     * Gets the value of the issuingAirlineDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingAirlineDesigCode() {
        return issuingAirlineDesigCode;
    }

    /**
     * Sets the value of the issuingAirlineDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingAirlineDesigCode(String value) {
        this.issuingAirlineDesigCode = value;
    }

}
