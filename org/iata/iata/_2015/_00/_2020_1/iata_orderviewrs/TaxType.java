
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
 * A compulsory contribution to state revenue, levied by the government on workers' income and business profits or added to the cost of some goods, services, and transactions.
 * 
 * <p>Java class for TaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddlFiledTaxCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TaxCodeType" minOccurs="0"/>
 *         &lt;element name="AddlTaxCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TaxCodeType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AmountType"/>
 *         &lt;element name="ApproximateInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="AppTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="CollectionInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="CollectionPointTax" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CollectionPointTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CountryType" minOccurs="0"/>
 *         &lt;element name="CountrySubDivision" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CountrySubDivisionType" minOccurs="0"/>
 *         &lt;element name="CurConversion" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CurConversionType" minOccurs="0"/>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="FiledAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AmountType" minOccurs="0"/>
 *         &lt;element name="FiledTaxCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TaxCodeType" minOccurs="0"/>
 *         &lt;element name="QualifierCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TaxQualifierCodeType" minOccurs="0"/>
 *         &lt;element name="RefundInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TaxCodeType" minOccurs="0"/>
 *         &lt;element name="TaxName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NameType" minOccurs="0"/>
 *         &lt;element name="TaxTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TaxTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "addlFiledTaxCode",
    "addlTaxCode",
    "amount",
    "approximateInd",
    "appTypeCode",
    "collectionInd",
    "collectionPointTax",
    "country",
    "countrySubDivision",
    "curConversion",
    "descText",
    "filedAmount",
    "filedTaxCode",
    "qualifierCode",
    "refundInd",
    "taxCode",
    "taxName",
    "taxTypeCode"
})
public class TaxType {

    @XmlElement(name = "AddlFiledTaxCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addlFiledTaxCode;
    @XmlElement(name = "AddlTaxCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addlTaxCode;
    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "ApproximateInd")
    protected Boolean approximateInd;
    @XmlElement(name = "AppTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String appTypeCode;
    @XmlElement(name = "CollectionInd")
    protected Boolean collectionInd;
    @XmlElement(name = "CollectionPointTax")
    protected List<CollectionPointTaxType> collectionPointTax;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "CountrySubDivision")
    protected CountrySubDivisionType countrySubDivision;
    @XmlElement(name = "CurConversion")
    protected CurConversionType curConversion;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "FiledAmount")
    protected AmountType filedAmount;
    @XmlElement(name = "FiledTaxCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String filedTaxCode;
    @XmlElement(name = "QualifierCode")
    protected String qualifierCode;
    @XmlElement(name = "RefundInd")
    protected Boolean refundInd;
    @XmlElement(name = "TaxCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxCode;
    @XmlElement(name = "TaxName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxName;
    @XmlElement(name = "TaxTypeCode")
    @XmlSchemaType(name = "token")
    protected TaxTypeCodeContentType taxTypeCode;

    /**
     * Gets the value of the addlFiledTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlFiledTaxCode() {
        return addlFiledTaxCode;
    }

    /**
     * Sets the value of the addlFiledTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddlFiledTaxCode(String value) {
        this.addlFiledTaxCode = value;
    }

    /**
     * Gets the value of the addlTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlTaxCode() {
        return addlTaxCode;
    }

    /**
     * Sets the value of the addlTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddlTaxCode(String value) {
        this.addlTaxCode = value;
    }

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
     * Gets the value of the approximateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * Sets the value of the approximateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

    /**
     * Gets the value of the appTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppTypeCode() {
        return appTypeCode;
    }

    /**
     * Sets the value of the appTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppTypeCode(String value) {
        this.appTypeCode = value;
    }

    /**
     * Gets the value of the collectionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectionInd() {
        return collectionInd;
    }

    /**
     * Sets the value of the collectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectionInd(Boolean value) {
        this.collectionInd = value;
    }

    /**
     * Gets the value of the collectionPointTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionPointTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionPointTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionPointTaxType }
     * 
     * 
     */
    public List<CollectionPointTaxType> getCollectionPointTax() {
        if (collectionPointTax == null) {
            collectionPointTax = new ArrayList<CollectionPointTaxType>();
        }
        return this.collectionPointTax;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the countrySubDivision property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubDivisionType }
     *     
     */
    public CountrySubDivisionType getCountrySubDivision() {
        return countrySubDivision;
    }

    /**
     * Sets the value of the countrySubDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubDivisionType }
     *     
     */
    public void setCountrySubDivision(CountrySubDivisionType value) {
        this.countrySubDivision = value;
    }

    /**
     * Gets the value of the curConversion property.
     * 
     * @return
     *     possible object is
     *     {@link CurConversionType }
     *     
     */
    public CurConversionType getCurConversion() {
        return curConversion;
    }

    /**
     * Sets the value of the curConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurConversionType }
     *     
     */
    public void setCurConversion(CurConversionType value) {
        this.curConversion = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the filedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFiledAmount() {
        return filedAmount;
    }

    /**
     * Sets the value of the filedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFiledAmount(AmountType value) {
        this.filedAmount = value;
    }

    /**
     * Gets the value of the filedTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledTaxCode() {
        return filedTaxCode;
    }

    /**
     * Sets the value of the filedTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledTaxCode(String value) {
        this.filedTaxCode = value;
    }

    /**
     * Gets the value of the qualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifierCode() {
        return qualifierCode;
    }

    /**
     * Sets the value of the qualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifierCode(String value) {
        this.qualifierCode = value;
    }

    /**
     * Gets the value of the refundInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundInd() {
        return refundInd;
    }

    /**
     * Sets the value of the refundInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundInd(Boolean value) {
        this.refundInd = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * Sets the value of the taxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    /**
     * Gets the value of the taxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCodeContentType }
     *     
     */
    public TaxTypeCodeContentType getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Sets the value of the taxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCodeContentType }
     *     
     */
    public void setTaxTypeCode(TaxTypeCodeContentType value) {
        this.taxTypeCode = value;
    }

}
