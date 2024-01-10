
package org.iata.iata._2015._00._2020_1.iata_orderrulesrs;

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
 * Information related to a punishment imposed for breaking a law, rule, or contract.
 * 
 * <p>Java class for PenaltyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}PenaltyAppCodeType" minOccurs="0"/>
 *         &lt;element name="CancelFeeInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}IndType" minOccurs="0"/>
 *         &lt;element name="ChangeFeeInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}IndType" minOccurs="0"/>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}TextType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}FareDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NetInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}IndType" minOccurs="0"/>
 *         &lt;element name="PenaltyID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="PenaltyPercent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}PercentType" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}Price1Type" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}PenaltyTypeCodeType" minOccurs="0"/>
 *         &lt;element name="UpgradeFeeInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyType", propOrder = {
    "appCode",
    "cancelFeeInd",
    "changeFeeInd",
    "descText",
    "fareDetail",
    "netInd",
    "penaltyID",
    "penaltyPercent",
    "price",
    "typeCode",
    "upgradeFeeInd"
})
public class PenaltyType {

    @XmlElement(name = "AppCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String appCode;
    @XmlElement(name = "CancelFeeInd")
    protected Boolean cancelFeeInd;
    @XmlElement(name = "ChangeFeeInd")
    protected Boolean changeFeeInd;
    @XmlElement(name = "DescText")
    protected List<String> descText;
    @XmlElement(name = "FareDetail")
    protected List<FareDetailType> fareDetail;
    @XmlElement(name = "NetInd")
    protected Boolean netInd;
    @XmlElement(name = "PenaltyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String penaltyID;
    @XmlElement(name = "PenaltyPercent")
    protected BigDecimal penaltyPercent;
    @XmlElement(name = "Price")
    protected Price1Type price;
    @XmlElement(name = "TypeCode")
    @XmlSchemaType(name = "token")
    protected PenaltyTypeCodeContentType typeCode;
    @XmlElement(name = "UpgradeFeeInd")
    protected Boolean upgradeFeeInd;

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
     * Gets the value of the cancelFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelFeeInd() {
        return cancelFeeInd;
    }

    /**
     * Sets the value of the cancelFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelFeeInd(Boolean value) {
        this.cancelFeeInd = value;
    }

    /**
     * Gets the value of the changeFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeFeeInd() {
        return changeFeeInd;
    }

    /**
     * Sets the value of the changeFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeFeeInd(Boolean value) {
        this.changeFeeInd = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescText() {
        if (descText == null) {
            descText = new ArrayList<String>();
        }
        return this.descText;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType }
     * 
     * 
     */
    public List<FareDetailType> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<FareDetailType>();
        }
        return this.fareDetail;
    }

    /**
     * Gets the value of the netInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetInd() {
        return netInd;
    }

    /**
     * Sets the value of the netInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetInd(Boolean value) {
        this.netInd = value;
    }

    /**
     * Gets the value of the penaltyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyID() {
        return penaltyID;
    }

    /**
     * Sets the value of the penaltyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyID(String value) {
        this.penaltyID = value;
    }

    /**
     * Gets the value of the penaltyPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenaltyPercent() {
        return penaltyPercent;
    }

    /**
     * Sets the value of the penaltyPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenaltyPercent(BigDecimal value) {
        this.penaltyPercent = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price1Type }
     *     
     */
    public Price1Type getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1Type }
     *     
     */
    public void setPrice(Price1Type value) {
        this.price = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyTypeCodeContentType }
     *     
     */
    public PenaltyTypeCodeContentType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyTypeCodeContentType }
     *     
     */
    public void setTypeCode(PenaltyTypeCodeContentType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the upgradeFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgradeFeeInd() {
        return upgradeFeeInd;
    }

    /**
     * Sets the value of the upgradeFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgradeFeeInd(Boolean value) {
        this.upgradeFeeInd = value;
    }

}
