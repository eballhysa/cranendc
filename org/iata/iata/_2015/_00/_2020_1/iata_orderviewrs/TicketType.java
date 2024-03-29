
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

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


/**
 * The accountable document issued by or on behalf of a carrier which includes notices and the flight and passenger coupons contained therein.
 * 
 * <p>Java class for TicketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectedDocNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NumberType" minOccurs="0"/>
 *         &lt;element name="Coupon" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CouponType" maxOccurs="4"/>
 *         &lt;element name="ExchReissueInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="FeeOwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AirlineDesigCodeType" minOccurs="0"/>
 *         &lt;element name="PresentCreditCardInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="PrimaryDocInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="RemarkText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="ReportingTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ReportingTypeCodeType"/>
 *         &lt;element name="RoutingCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="TaxOnEMD_Ind" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="TicketDocTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="TicketNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketType", propOrder = {
    "connectedDocNumber",
    "coupon",
    "exchReissueInd",
    "feeOwnerCode",
    "presentCreditCardInd",
    "primaryDocInd",
    "remarkText",
    "reportingTypeCode",
    "routingCode",
    "taxOnEMDInd",
    "ticketDocTypeCode",
    "ticketNumber"
})
public class TicketType {

    @XmlElement(name = "ConnectedDocNumber")
    protected BigDecimal connectedDocNumber;
    @XmlElement(name = "Coupon", required = true)
    protected List<CouponType> coupon;
    @XmlElement(name = "ExchReissueInd")
    protected Boolean exchReissueInd;
    @XmlElement(name = "FeeOwnerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String feeOwnerCode;
    @XmlElement(name = "PresentCreditCardInd")
    protected Boolean presentCreditCardInd;
    @XmlElement(name = "PrimaryDocInd")
    protected Boolean primaryDocInd;
    @XmlElement(name = "RemarkText")
    protected String remarkText;
    @XmlElement(name = "ReportingTypeCode", required = true)
    @XmlSchemaType(name = "token")
    protected ReportingTypeCodeContentType reportingTypeCode;
    @XmlElement(name = "RoutingCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String routingCode;
    @XmlElement(name = "TaxOnEMD_Ind")
    protected Boolean taxOnEMDInd;
    @XmlElement(name = "TicketDocTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ticketDocTypeCode;
    @XmlElement(name = "TicketNumber")
    protected String ticketNumber;

    /**
     * Gets the value of the connectedDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConnectedDocNumber() {
        return connectedDocNumber;
    }

    /**
     * Sets the value of the connectedDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConnectedDocNumber(BigDecimal value) {
        this.connectedDocNumber = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponType }
     * 
     * 
     */
    public List<CouponType> getCoupon() {
        if (coupon == null) {
            coupon = new ArrayList<CouponType>();
        }
        return this.coupon;
    }

    /**
     * Gets the value of the exchReissueInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchReissueInd() {
        return exchReissueInd;
    }

    /**
     * Sets the value of the exchReissueInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchReissueInd(Boolean value) {
        this.exchReissueInd = value;
    }

    /**
     * Gets the value of the feeOwnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeOwnerCode() {
        return feeOwnerCode;
    }

    /**
     * Sets the value of the feeOwnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeOwnerCode(String value) {
        this.feeOwnerCode = value;
    }

    /**
     * Gets the value of the presentCreditCardInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPresentCreditCardInd() {
        return presentCreditCardInd;
    }

    /**
     * Sets the value of the presentCreditCardInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPresentCreditCardInd(Boolean value) {
        this.presentCreditCardInd = value;
    }

    /**
     * Gets the value of the primaryDocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryDocInd() {
        return primaryDocInd;
    }

    /**
     * Sets the value of the primaryDocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryDocInd(Boolean value) {
        this.primaryDocInd = value;
    }

    /**
     * Gets the value of the remarkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkText() {
        return remarkText;
    }

    /**
     * Sets the value of the remarkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkText(String value) {
        this.remarkText = value;
    }

    /**
     * Gets the value of the reportingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingTypeCodeContentType }
     *     
     */
    public ReportingTypeCodeContentType getReportingTypeCode() {
        return reportingTypeCode;
    }

    /**
     * Sets the value of the reportingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingTypeCodeContentType }
     *     
     */
    public void setReportingTypeCode(ReportingTypeCodeContentType value) {
        this.reportingTypeCode = value;
    }

    /**
     * Gets the value of the routingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Sets the value of the routingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Gets the value of the taxOnEMDInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxOnEMDInd() {
        return taxOnEMDInd;
    }

    /**
     * Sets the value of the taxOnEMDInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxOnEMDInd(Boolean value) {
        this.taxOnEMDInd = value;
    }

    /**
     * Gets the value of the ticketDocTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDocTypeCode() {
        return ticketDocTypeCode;
    }

    /**
     * Sets the value of the ticketDocTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDocTypeCode(String value) {
        this.ticketDocTypeCode = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

}
