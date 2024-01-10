
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A seller followup action following involuntary change means a subsequent action required to an Order Item after a schedule change.
 * 
 * <p>Java class for SellerFollowUpActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerFollowUpActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}SellerFollowupActionCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ActionInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType"/>
 *         &lt;element name="ActionTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="AirlineContactURI" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}URI_Type" minOccurs="0"/>
 *         &lt;element name="ConsequenceOfInactionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ConsequenceOfInactionCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerFollowUpActionType", propOrder = {
    "actionCode",
    "actionInd",
    "actionTimeLimitDateTime",
    "airlineContactURI",
    "consequenceOfInactionCode"
})
public class SellerFollowUpActionType {

    @XmlElement(name = "ActionCode")
    @XmlSchemaType(name = "token")
    protected List<SellerFollowupActionCodeContentType> actionCode;
    @XmlElement(name = "ActionInd")
    protected boolean actionInd;
    @XmlElement(name = "ActionTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionTimeLimitDateTime;
    @XmlElement(name = "AirlineContactURI")
    @XmlSchemaType(name = "anyURI")
    protected String airlineContactURI;
    @XmlElement(name = "ConsequenceOfInactionCode")
    @XmlSchemaType(name = "token")
    protected ConsequenceOfInactionCodeContentType consequenceOfInactionCode;

    /**
     * Gets the value of the actionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellerFollowupActionCodeContentType }
     * 
     * 
     */
    public List<SellerFollowupActionCodeContentType> getActionCode() {
        if (actionCode == null) {
            actionCode = new ArrayList<SellerFollowupActionCodeContentType>();
        }
        return this.actionCode;
    }

    /**
     * Gets the value of the actionInd property.
     * 
     */
    public boolean isActionInd() {
        return actionInd;
    }

    /**
     * Sets the value of the actionInd property.
     * 
     */
    public void setActionInd(boolean value) {
        this.actionInd = value;
    }

    /**
     * Gets the value of the actionTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionTimeLimitDateTime() {
        return actionTimeLimitDateTime;
    }

    /**
     * Sets the value of the actionTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionTimeLimitDateTime(XMLGregorianCalendar value) {
        this.actionTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the airlineContactURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineContactURI() {
        return airlineContactURI;
    }

    /**
     * Sets the value of the airlineContactURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineContactURI(String value) {
        this.airlineContactURI = value;
    }

    /**
     * Gets the value of the consequenceOfInactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConsequenceOfInactionCodeContentType }
     *     
     */
    public ConsequenceOfInactionCodeContentType getConsequenceOfInactionCode() {
        return consequenceOfInactionCode;
    }

    /**
     * Sets the value of the consequenceOfInactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsequenceOfInactionCodeContentType }
     *     
     */
    public void setConsequenceOfInactionCode(ConsequenceOfInactionCodeContentType value) {
        this.consequenceOfInactionCode = value;
    }

}
