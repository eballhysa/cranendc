
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

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
 * Carrier imposed fee detail, typically related to booking, ticketing, or servicing.
 * 
 * <p>Java class for CarrierFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AmountType"/>
 *         &lt;element name="AppCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType"/>
 *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CarrierType" minOccurs="0"/>
 *         &lt;element name="CarrierFeePaymentMethod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CarrierFeePaymentMethodType" minOccurs="0"/>
 *         &lt;element name="FareComponent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}FareComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginDest" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OriginDestType" minOccurs="0"/>
 *         &lt;element name="ReportingCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType"/>
 *         &lt;element name="TaxSummary" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TaxSummaryType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierFeeType", propOrder = {
    "amount",
    "appCode",
    "carrier",
    "carrierFeePaymentMethod",
    "fareComponent",
    "originDest",
    "reportingCodeText",
    "taxSummary",
    "typeCode"
})
public class CarrierFeeType {

    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "AppCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String appCode;
    @XmlElement(name = "Carrier")
    protected CarrierType carrier;
    @XmlElement(name = "CarrierFeePaymentMethod")
    protected CarrierFeePaymentMethodType carrierFeePaymentMethod;
    @XmlElement(name = "FareComponent")
    protected List<FareComponentType> fareComponent;
    @XmlElement(name = "OriginDest")
    protected OriginDestType originDest;
    @XmlElement(name = "ReportingCodeText", required = true)
    protected String reportingCodeText;
    @XmlElement(name = "TaxSummary")
    protected TaxSummaryType taxSummary;
    @XmlElement(name = "TypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the appCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * Sets the value of the appCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCode(String value) {
        this.appCode = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setCarrier(CarrierType value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the carrierFeePaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierFeePaymentMethodType }
     *     
     */
    public CarrierFeePaymentMethodType getCarrierFeePaymentMethod() {
        return carrierFeePaymentMethod;
    }

    /**
     * Sets the value of the carrierFeePaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierFeePaymentMethodType }
     *     
     */
    public void setCarrierFeePaymentMethod(CarrierFeePaymentMethodType value) {
        this.carrierFeePaymentMethod = value;
    }

    /**
     * Gets the value of the fareComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentType }
     * 
     * 
     */
    public List<FareComponentType> getFareComponent() {
        if (fareComponent == null) {
            fareComponent = new ArrayList<FareComponentType>();
        }
        return this.fareComponent;
    }

    /**
     * Gets the value of the originDest property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestType }
     *     
     */
    public OriginDestType getOriginDest() {
        return originDest;
    }

    /**
     * Sets the value of the originDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestType }
     *     
     */
    public void setOriginDest(OriginDestType value) {
        this.originDest = value;
    }

    /**
     * Gets the value of the reportingCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingCodeText() {
        return reportingCodeText;
    }

    /**
     * Sets the value of the reportingCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingCodeText(String value) {
        this.reportingCodeText = value;
    }

    /**
     * Gets the value of the taxSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getTaxSummary() {
        return taxSummary;
    }

    /**
     * Sets the value of the taxSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setTaxSummary(TaxSummaryType value) {
        this.taxSummary = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
