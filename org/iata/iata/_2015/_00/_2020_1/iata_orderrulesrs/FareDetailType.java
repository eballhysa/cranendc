
package org.iata.iata._2015._00._2020_1.iata_orderrulesrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The amount charged by the carrier for the carriage of a passenger and his allowable free baggage.
 * 
 * <p>Java class for FareDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}CodeType" minOccurs="0"/>
 *         &lt;element name="FareIndCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}CodeType" minOccurs="0"/>
 *         &lt;element name="FareRefText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}TextType" minOccurs="0"/>
 *         &lt;element name="FiledFareInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}IndType" minOccurs="0"/>
 *         &lt;element name="NetReportingCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}TextType" minOccurs="0"/>
 *         &lt;element name="PricingSystemCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}TextType" minOccurs="0"/>
 *         &lt;element name="StatisticalCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}TextType" minOccurs="0"/>
 *         &lt;element name="TourCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailType", propOrder = {
    "accountCode",
    "fareIndCode",
    "fareRefText",
    "filedFareInd",
    "netReportingCodeText",
    "pricingSystemCodeText",
    "statisticalCodeText",
    "tourCode"
})
public class FareDetailType {

    @XmlElement(name = "AccountCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountCode;
    @XmlElement(name = "FareIndCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareIndCode;
    @XmlElement(name = "FareRefText")
    protected String fareRefText;
    @XmlElement(name = "FiledFareInd")
    protected Boolean filedFareInd;
    @XmlElement(name = "NetReportingCodeText")
    protected String netReportingCodeText;
    @XmlElement(name = "PricingSystemCodeText")
    protected String pricingSystemCodeText;
    @XmlElement(name = "StatisticalCodeText")
    protected String statisticalCodeText;
    @XmlElement(name = "TourCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tourCode;

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the fareIndCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareIndCode() {
        return fareIndCode;
    }

    /**
     * Sets the value of the fareIndCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareIndCode(String value) {
        this.fareIndCode = value;
    }

    /**
     * Gets the value of the fareRefText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRefText() {
        return fareRefText;
    }

    /**
     * Sets the value of the fareRefText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRefText(String value) {
        this.fareRefText = value;
    }

    /**
     * Gets the value of the filedFareInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiledFareInd() {
        return filedFareInd;
    }

    /**
     * Sets the value of the filedFareInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiledFareInd(Boolean value) {
        this.filedFareInd = value;
    }

    /**
     * Gets the value of the netReportingCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetReportingCodeText() {
        return netReportingCodeText;
    }

    /**
     * Sets the value of the netReportingCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetReportingCodeText(String value) {
        this.netReportingCodeText = value;
    }

    /**
     * Gets the value of the pricingSystemCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingSystemCodeText() {
        return pricingSystemCodeText;
    }

    /**
     * Sets the value of the pricingSystemCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingSystemCodeText(String value) {
        this.pricingSystemCodeText = value;
    }

    /**
     * Gets the value of the statisticalCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticalCodeText() {
        return statisticalCodeText;
    }

    /**
     * Sets the value of the statisticalCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticalCodeText(String value) {
        this.statisticalCodeText = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

}
