
package org.iata.iata._2015._00._2020_1.iata_orderrulesrq;

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
 *         &lt;element name="CurParameter" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}CurParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}DeviceType"/>
 *         &lt;element name="LangUsage" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}LangUsageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MeasurementSystemCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}MeasurementSystemCodeType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}CodeType" minOccurs="0"/>
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
    "curParameter",
    "device",
    "langUsage",
    "measurementSystemCode",
    "reasonCode"
})
public class ResponseParametersType {

    @XmlElement(name = "CurParameter")
    protected List<CurParameterType> curParameter;
    @XmlElement(name = "Device", required = true)
    protected DeviceType device;
    @XmlElement(name = "LangUsage")
    protected List<LangUsageType> langUsage;
    @XmlElement(name = "MeasurementSystemCode")
    @XmlSchemaType(name = "token")
    protected MeasurementSystemCodeContentType measurementSystemCode;
    @XmlElement(name = "ReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reasonCode;

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
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setDevice(DeviceType value) {
        this.device = value;
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
