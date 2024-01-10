
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Amounts that define the funds to be cleared as a result of the payment commitment and the selected payment method, and the date when the funds must be remitted. 
 * 
 * <p>Java class for SettlementDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetClearanceAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}AmountType"/>
 *         &lt;element name="RemittanceDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDataType", propOrder = {
    "netClearanceAmount",
    "remittanceDate"
})
public class SettlementDataType {

    @XmlElement(name = "NetClearanceAmount", required = true)
    protected AmountType netClearanceAmount;
    @XmlElement(name = "RemittanceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar remittanceDate;

    /**
     * Gets the value of the netClearanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetClearanceAmount() {
        return netClearanceAmount;
    }

    /**
     * Sets the value of the netClearanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetClearanceAmount(AmountType value) {
        this.netClearanceAmount = value;
    }

    /**
     * Gets the value of the remittanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRemittanceDate() {
        return remittanceDate;
    }

    /**
     * Sets the value of the remittanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRemittanceDate(XMLGregorianCalendar value) {
        this.remittanceDate = value;
    }

}
