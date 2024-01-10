
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

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
 *         &lt;element name="CurParameter" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CurParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DeviceType" minOccurs="0"/>
 *         &lt;element name="DeviceLocation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DeviceLocationType" minOccurs="0"/>
 *         &lt;element name="InventoryGuaranteeInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IndType" minOccurs="0"/>
 *         &lt;element name="MeasurementSystemCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}MeasurementSystemCodeType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="RefundFOPPref" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}RefundFOPPrefType" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
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
    "deviceLocation",
    "inventoryGuaranteeInd",
    "measurementSystemCode",
    "reasonCode",
    "refundFOPPref",
    "remark"
})
public class ResponseParametersType {

    @XmlElement(name = "CurParameter")
    protected List<CurParameterType> curParameter;
    @XmlElement(name = "Device")
    protected DeviceType device;
    @XmlElement(name = "DeviceLocation")
    protected DeviceLocationType deviceLocation;
    @XmlElement(name = "InventoryGuaranteeInd")
    protected Boolean inventoryGuaranteeInd;
    @XmlElement(name = "MeasurementSystemCode")
    @XmlSchemaType(name = "token")
    protected MeasurementSystemCodeContentType measurementSystemCode;
    @XmlElement(name = "ReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reasonCode;
    @XmlElement(name = "RefundFOPPref")
    protected RefundFOPPrefType refundFOPPref;
    @XmlElement(name = "Remark")
    protected List<RemarkType> remark;

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
     * Gets the value of the deviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceLocationType }
     *     
     */
    public DeviceLocationType getDeviceLocation() {
        return deviceLocation;
    }

    /**
     * Sets the value of the deviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceLocationType }
     *     
     */
    public void setDeviceLocation(DeviceLocationType value) {
        this.deviceLocation = value;
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

    /**
     * Gets the value of the refundFOPPref property.
     * 
     * @return
     *     possible object is
     *     {@link RefundFOPPrefType }
     *     
     */
    public RefundFOPPrefType getRefundFOPPref() {
        return refundFOPPref;
    }

    /**
     * Sets the value of the refundFOPPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundFOPPrefType }
     *     
     */
    public void setRefundFOPPref(RefundFOPPrefType value) {
        this.refundFOPPref = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<RemarkType>();
        }
        return this.remark;
    }

}
