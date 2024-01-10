
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An operation between board point and any subsequent off point within the same flight designator. Could be one or more legs. Could also be used for other transport vehicles such as train or bus etc. 
 * 
 * <p>Java class for DatedOperatingSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatedOperatingSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierDesigCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}AirlineDesigCodeType" minOccurs="0"/>
 *         &lt;element name="CarrierName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}NameType" minOccurs="0"/>
 *         &lt;element name="DisclosureRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="OperatingCarrierFlightNumberText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}FlightNumberTextType" minOccurs="0"/>
 *         &lt;element name="OperationalSuffixText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}OperationalSuffixTextType" minOccurs="0"/>
 *         &lt;element name="RBD_Code" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}RBD_CodeType" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedOperatingSegmentType", propOrder = {
    "carrierDesigCode",
    "carrierName",
    "disclosureRefID",
    "operatingCarrierFlightNumberText",
    "operationalSuffixText",
    "rbdCode",
    "statusCode"
})
public class DatedOperatingSegmentType {

    @XmlElement(name = "CarrierDesigCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierDesigCode;
    @XmlElement(name = "CarrierName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierName;
    @XmlElement(name = "DisclosureRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String disclosureRefID;
    @XmlElement(name = "OperatingCarrierFlightNumberText")
    protected String operatingCarrierFlightNumberText;
    @XmlElement(name = "OperationalSuffixText")
    protected String operationalSuffixText;
    @XmlElement(name = "RBD_Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rbdCode;
    @XmlElement(name = "StatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusCode;

    /**
     * Gets the value of the carrierDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierDesigCode() {
        return carrierDesigCode;
    }

    /**
     * Sets the value of the carrierDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierDesigCode(String value) {
        this.carrierDesigCode = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the disclosureRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureRefID() {
        return disclosureRefID;
    }

    /**
     * Sets the value of the disclosureRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureRefID(String value) {
        this.disclosureRefID = value;
    }

    /**
     * Gets the value of the operatingCarrierFlightNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrierFlightNumberText() {
        return operatingCarrierFlightNumberText;
    }

    /**
     * Sets the value of the operatingCarrierFlightNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrierFlightNumberText(String value) {
        this.operatingCarrierFlightNumberText = value;
    }

    /**
     * Gets the value of the operationalSuffixText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalSuffixText() {
        return operationalSuffixText;
    }

    /**
     * Sets the value of the operationalSuffixText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalSuffixText(String value) {
        this.operationalSuffixText = value;
    }

    /**
     * Gets the value of the rbdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBDCode() {
        return rbdCode;
    }

    /**
     * Sets the value of the rbdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBDCode(String value) {
        this.rbdCode = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

}
