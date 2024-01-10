
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The carrier whose baggage allowances and charges apply. 
 * 
 * <p>Java class for BDC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BDC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BagRuleCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}BagRuleCodeType" minOccurs="0"/>
 *         &lt;element name="BDC_AnalysisResultCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}BDC_AnalysisResultCodeType" minOccurs="0"/>
 *         &lt;element name="BDC_ReasonText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="CarrierDesigCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AirlineDesigCodeType"/>
 *         &lt;element name="CarrierName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BDC_Type", propOrder = {
    "bagRuleCode",
    "bdcAnalysisResultCode",
    "bdcReasonText",
    "carrierDesigCode",
    "carrierName"
})
public class BDCType {

    @XmlElement(name = "BagRuleCode")
    @XmlSchemaType(name = "token")
    protected BagRuleCodeContentType bagRuleCode;
    @XmlElement(name = "BDC_AnalysisResultCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bdcAnalysisResultCode;
    @XmlElement(name = "BDC_ReasonText")
    protected String bdcReasonText;
    @XmlElement(name = "CarrierDesigCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierDesigCode;
    @XmlElement(name = "CarrierName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierName;

    /**
     * Gets the value of the bagRuleCode property.
     * 
     * @return
     *     possible object is
     *     {@link BagRuleCodeContentType }
     *     
     */
    public BagRuleCodeContentType getBagRuleCode() {
        return bagRuleCode;
    }

    /**
     * Sets the value of the bagRuleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagRuleCodeContentType }
     *     
     */
    public void setBagRuleCode(BagRuleCodeContentType value) {
        this.bagRuleCode = value;
    }

    /**
     * Gets the value of the bdcAnalysisResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCAnalysisResultCode() {
        return bdcAnalysisResultCode;
    }

    /**
     * Sets the value of the bdcAnalysisResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDCAnalysisResultCode(String value) {
        this.bdcAnalysisResultCode = value;
    }

    /**
     * Gets the value of the bdcReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCReasonText() {
        return bdcReasonText;
    }

    /**
     * Sets the value of the bdcReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDCReasonText(String value) {
        this.bdcReasonText = value;
    }

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

}
