
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The IATA_PayloadStdAttributes defines the standard attributes that appear on the root element for all IATA payloads.
 * 
 * <p>Java class for IATA_PayloadStandardAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IATA_PayloadStandardAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AltLangID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="CorrelationID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="EchoTokenText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}TextType" minOccurs="0"/>
 *         &lt;element name="PrimaryLangID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="RetransmissionInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}IndType" minOccurs="0"/>
 *         &lt;element name="SeqNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}NumberType" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="TrxID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="TrxStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}CodeType" minOccurs="0"/>
 *         &lt;element name="VersionNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}NumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_PayloadStandardAttributesType", propOrder = {
    "altLangID",
    "correlationID",
    "echoTokenText",
    "primaryLangID",
    "retransmissionInd",
    "seqNumber",
    "timestamp",
    "trxID",
    "trxStatusCode",
    "versionNumber"
})
public class IATAPayloadStandardAttributesType {

    @XmlElement(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String altLangID;
    @XmlElement(name = "CorrelationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String correlationID;
    @XmlElement(name = "EchoTokenText")
    protected String echoTokenText;
    @XmlElement(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String primaryLangID;
    @XmlElement(name = "RetransmissionInd")
    protected Boolean retransmissionInd;
    @XmlElement(name = "SeqNumber")
    protected BigDecimal seqNumber;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "TrxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trxID;
    @XmlElement(name = "TrxStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trxStatusCode;
    @XmlElement(name = "VersionNumber")
    protected BigDecimal versionNumber;

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the echoTokenText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoTokenText() {
        return echoTokenText;
    }

    /**
     * Sets the value of the echoTokenText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoTokenText(String value) {
        this.echoTokenText = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the retransmissionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionInd() {
        return retransmissionInd;
    }

    /**
     * Sets the value of the retransmissionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionInd(Boolean value) {
        this.retransmissionInd = value;
    }

    /**
     * Gets the value of the seqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNumber() {
        return seqNumber;
    }

    /**
     * Sets the value of the seqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNumber(BigDecimal value) {
        this.seqNumber = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the trxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxID() {
        return trxID;
    }

    /**
     * Sets the value of the trxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxID(String value) {
        this.trxID = value;
    }

    /**
     * Gets the value of the trxStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxStatusCode() {
        return trxStatusCode;
    }

    /**
     * Sets the value of the trxStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxStatusCode(String value) {
        this.trxStatusCode = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersionNumber(BigDecimal value) {
        this.versionNumber = value;
    }

}
