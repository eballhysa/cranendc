
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

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
 *         &lt;element name="AccountCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         &lt;element name="FareComponent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}FareComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareIndCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         &lt;element name="FarePriceType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}FarePriceTypeType" maxOccurs="3"/>
 *         &lt;element name="FareRefText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         &lt;element name="FiledFareInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         &lt;element name="NetReportingCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}PriceType" minOccurs="0"/>
 *         &lt;element name="PricingSystemCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         &lt;element name="StatisticalCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         &lt;element name="TourCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
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
    "fareComponent",
    "fareIndCode",
    "farePriceType",
    "fareRefText",
    "filedFareInd",
    "netReportingCodeText",
    "paxRefID",
    "price",
    "pricingSystemCodeText",
    "statisticalCodeText",
    "tourCode"
})
public class FareDetailType {

    @XmlElement(name = "AccountCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountCode;
    @XmlElement(name = "FareComponent")
    protected List<FareComponentType> fareComponent;
    @XmlElement(name = "FareIndCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareIndCode;
    @XmlElement(name = "FarePriceType", required = true)
    protected List<FarePriceTypeType> farePriceType;
    @XmlElement(name = "FareRefText")
    protected String fareRefText;
    @XmlElement(name = "FiledFareInd")
    protected Boolean filedFareInd;
    @XmlElement(name = "NetReportingCodeText")
    protected String netReportingCodeText;
    @XmlElement(name = "PaxRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;
    @XmlElement(name = "Price")
    protected PriceType price;
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
     * Gets the value of the farePriceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePriceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarePriceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePriceTypeType }
     * 
     * 
     */
    public List<FarePriceTypeType> getFarePriceType() {
        if (farePriceType == null) {
            farePriceType = new ArrayList<FarePriceTypeType>();
        }
        return this.farePriceType;
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
     * Gets the value of the paxRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<String>();
        }
        return this.paxRefID;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
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
