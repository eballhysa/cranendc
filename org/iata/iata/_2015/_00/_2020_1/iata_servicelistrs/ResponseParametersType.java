
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

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
 * Information related to how response results should be returned.
 * 
 * <p>Java class for ResponseParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BDC" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}BDC_Type" minOccurs="0"/>
 *         &lt;element name="CurParameter" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}CurParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InventoryGuaranteeInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}IndType" minOccurs="0"/>
 *         &lt;element name="LangUsage" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}LangUsageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketingMessage" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}MarketingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MeasurementSystemCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}MeasurementSystemCodeType" minOccurs="0"/>
 *         &lt;element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}PaxGroupType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseParametersType", propOrder = {
    "bdc",
    "curParameter",
    "inventoryGuaranteeInd",
    "langUsage",
    "marketingMessage",
    "measurementSystemCode",
    "paxGroup",
    "reasonCode"
})
public class ResponseParametersType {

    @XmlElement(name = "BDC")
    protected BDCType bdc;
    @XmlElement(name = "CurParameter")
    protected List<CurParameterType> curParameter;
    @XmlElement(name = "InventoryGuaranteeInd")
    protected Boolean inventoryGuaranteeInd;
    @XmlElement(name = "LangUsage")
    protected List<LangUsageType> langUsage;
    @XmlElement(name = "MarketingMessage")
    protected List<MarketingMessageType> marketingMessage;
    @XmlElement(name = "MeasurementSystemCode")
    @XmlSchemaType(name = "token")
    protected MeasurementSystemCodeContentType measurementSystemCode;
    @XmlElement(name = "PaxGroup")
    protected PaxGroupType paxGroup;
    @XmlElement(name = "ReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reasonCode;

    /**
     * Gets the value of the bdc property.
     * 
     * @return
     *     possible object is
     *     {@link BDCType }
     *     
     */
    public BDCType getBDC() {
        return bdc;
    }

    /**
     * Sets the value of the bdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDCType }
     *     
     */
    public void setBDC(BDCType value) {
        this.bdc = value;
    }

    /**
     * Gets the value of the curParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurParameterType }
     * 
     * 
     */
    public List<CurParameterType> getCurParameter() {
        if (curParameter == null) {
            curParameter = new ArrayList<CurParameterType>();
        }
        return this.curParameter;
    }

    /**
     * Gets the value of the inventoryGuaranteeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInventoryGuaranteeInd() {
        return inventoryGuaranteeInd;
    }

    /**
     * Sets the value of the inventoryGuaranteeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInventoryGuaranteeInd(Boolean value) {
        this.inventoryGuaranteeInd = value;
    }

    /**
     * Gets the value of the langUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the langUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLangUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LangUsageType }
     * 
     * 
     */
    public List<LangUsageType> getLangUsage() {
        if (langUsage == null) {
            langUsage = new ArrayList<LangUsageType>();
        }
        return this.langUsage;
    }

    /**
     * Gets the value of the marketingMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingMessageType }
     * 
     * 
     */
    public List<MarketingMessageType> getMarketingMessage() {
        if (marketingMessage == null) {
            marketingMessage = new ArrayList<MarketingMessageType>();
        }
        return this.marketingMessage;
    }

    /**
     * Gets the value of the measurementSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSystemCodeContentType }
     *     
     */
    public MeasurementSystemCodeContentType getMeasurementSystemCode() {
        return measurementSystemCode;
    }

    /**
     * Sets the value of the measurementSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSystemCodeContentType }
     *     
     */
    public void setMeasurementSystemCode(MeasurementSystemCodeContentType value) {
        this.measurementSystemCode = value;
    }

    /**
     * Gets the value of the paxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PaxGroupType }
     *     
     */
    public PaxGroupType getPaxGroup() {
        return paxGroup;
    }

    /**
     * Sets the value of the paxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxGroupType }
     *     
     */
    public void setPaxGroup(PaxGroupType value) {
        this.paxGroup = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

}
