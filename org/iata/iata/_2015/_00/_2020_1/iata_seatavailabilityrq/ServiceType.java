
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order. 
 *  
 * 
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InventoryGuaranteeDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ResponsibleAirline" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}CarrierType" minOccurs="0"/>
 *         &lt;element name="ServiceID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}ID_Type"/>
 *         &lt;element name="UnchangedInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}IndType" minOccurs="0"/>
 *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}CarrierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "inventoryGuaranteeDateTime",
    "responsibleAirline",
    "serviceID",
    "unchangedInd",
    "validatingCarrier"
})
public class ServiceType {

    @XmlElement(name = "InventoryGuaranteeDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inventoryGuaranteeDateTime;
    @XmlElement(name = "ResponsibleAirline")
    protected CarrierType responsibleAirline;
    @XmlElement(name = "ServiceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceID;
    @XmlElement(name = "UnchangedInd")
    protected Boolean unchangedInd;
    @XmlElement(name = "ValidatingCarrier")
    protected CarrierType validatingCarrier;

    /**
     * Gets the value of the inventoryGuaranteeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInventoryGuaranteeDateTime() {
        return inventoryGuaranteeDateTime;
    }

    /**
     * Sets the value of the inventoryGuaranteeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInventoryGuaranteeDateTime(XMLGregorianCalendar value) {
        this.inventoryGuaranteeDateTime = value;
    }

    /**
     * Gets the value of the responsibleAirline property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getResponsibleAirline() {
        return responsibleAirline;
    }

    /**
     * Sets the value of the responsibleAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setResponsibleAirline(CarrierType value) {
        this.responsibleAirline = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the unchangedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnchangedInd() {
        return unchangedInd;
    }

    /**
     * Sets the value of the unchangedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnchangedInd(Boolean value) {
        this.unchangedInd = value;
    }

    /**
     * Gets the value of the validatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setValidatingCarrier(CarrierType value) {
        this.validatingCarrier = value;
    }

}
