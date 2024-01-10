
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 * Description and characteristics of a non-flight product or service that can be separately sold and delivered. E.g. bag, seat, meal on a flight.
 *  
 * 
 * <p>Java class for ServiceDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BilateralTimeLimit" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}BilateralTimeLimitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BookingInstructions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}BookingInstructionsType" minOccurs="0"/>
 *         &lt;element name="DepositTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}DescType" maxOccurs="unbounded"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}NameType"/>
 *         &lt;element name="NamingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}AirlineDesigCodeType" minOccurs="0"/>
 *         &lt;element name="RFIC" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}RFIC_CodeType" minOccurs="0"/>
 *         &lt;element name="RFISC" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}RFISC_CodeType" minOccurs="0"/>
 *         &lt;element name="ServiceCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="ServiceDefinitionAssociation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ServiceDefinitionAssociationType" minOccurs="0"/>
 *         &lt;element name="ServiceDefinitionID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type"/>
 *         &lt;element name="SpecialService" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SpecialServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValidatingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}AirlineDesigCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionType", propOrder = {
    "bilateralTimeLimit",
    "bookingInstructions",
    "depositTimeLimitDateTime",
    "desc",
    "name",
    "namingTimeLimitDateTime",
    "ownerCode",
    "rfic",
    "rfisc",
    "serviceCode",
    "serviceDefinitionAssociation",
    "serviceDefinitionID",
    "specialService",
    "validatingCarrierCode"
})
public class ServiceDefinitionType {

    @XmlElement(name = "BilateralTimeLimit")
    protected List<BilateralTimeLimitType> bilateralTimeLimit;
    @XmlElement(name = "BookingInstructions")
    protected BookingInstructionsType bookingInstructions;
    @XmlElement(name = "DepositTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depositTimeLimitDateTime;
    @XmlElement(name = "Desc", required = true)
    protected List<DescType> desc;
    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "NamingTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar namingTimeLimitDateTime;
    @XmlElement(name = "OwnerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "RFIC")
    protected String rfic;
    @XmlElement(name = "RFISC")
    protected String rfisc;
    @XmlElement(name = "ServiceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceCode;
    @XmlElement(name = "ServiceDefinitionAssociation")
    protected ServiceDefinitionAssociationType serviceDefinitionAssociation;
    @XmlElement(name = "ServiceDefinitionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDefinitionID;
    @XmlElement(name = "SpecialService")
    protected List<SpecialServiceType> specialService;
    @XmlElement(name = "ValidatingCarrierCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validatingCarrierCode;

    /**
     * Gets the value of the bilateralTimeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilateralTimeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilateralTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilateralTimeLimitType }
     * 
     * 
     */
    public List<BilateralTimeLimitType> getBilateralTimeLimit() {
        if (bilateralTimeLimit == null) {
            bilateralTimeLimit = new ArrayList<BilateralTimeLimitType>();
        }
        return this.bilateralTimeLimit;
    }

    /**
     * Gets the value of the bookingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link BookingInstructionsType }
     *     
     */
    public BookingInstructionsType getBookingInstructions() {
        return bookingInstructions;
    }

    /**
     * Sets the value of the bookingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingInstructionsType }
     *     
     */
    public void setBookingInstructions(BookingInstructionsType value) {
        this.bookingInstructions = value;
    }

    /**
     * Gets the value of the depositTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositTimeLimitDateTime() {
        return depositTimeLimitDateTime;
    }

    /**
     * Sets the value of the depositTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositTimeLimitDateTime(XMLGregorianCalendar value) {
        this.depositTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the namingTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNamingTimeLimitDateTime() {
        return namingTimeLimitDateTime;
    }

    /**
     * Sets the value of the namingTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNamingTimeLimitDateTime(XMLGregorianCalendar value) {
        this.namingTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the rfic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

    /**
     * Gets the value of the rfisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFISC() {
        return rfisc;
    }

    /**
     * Sets the value of the rfisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFISC(String value) {
        this.rfisc = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceDefinitionAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionAssociationType }
     *     
     */
    public ServiceDefinitionAssociationType getServiceDefinitionAssociation() {
        return serviceDefinitionAssociation;
    }

    /**
     * Sets the value of the serviceDefinitionAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionAssociationType }
     *     
     */
    public void setServiceDefinitionAssociation(ServiceDefinitionAssociationType value) {
        this.serviceDefinitionAssociation = value;
    }

    /**
     * Gets the value of the serviceDefinitionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDefinitionID() {
        return serviceDefinitionID;
    }

    /**
     * Sets the value of the serviceDefinitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDefinitionID(String value) {
        this.serviceDefinitionID = value;
    }

    /**
     * Gets the value of the specialService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceType }
     * 
     * 
     */
    public List<SpecialServiceType> getSpecialService() {
        if (specialService == null) {
            specialService = new ArrayList<SpecialServiceType>();
        }
        return this.specialService;
    }

    /**
     * Gets the value of the validatingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    /**
     * Sets the value of the validatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrierCode(String value) {
        this.validatingCarrierCode = value;
    }

}
