
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * Non-seat related cabin feature or facility (e.g. lavatory, galley, closet, stowage, etc.)
 *  
 * 
 * <p>Java class for CabinComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AbsoluteLengthMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}MeasureType" minOccurs="0"/>
 *         &lt;element name="AbsoluteWidthMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}MeasureType" minOccurs="0"/>
 *         &lt;element name="CabinComponentTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}CabinComponentTypeCodeType"/>
 *         &lt;element name="ColumnEquivWidthNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NumberType" minOccurs="0"/>
 *         &lt;element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FirstRowNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NaturalNumberType" minOccurs="0"/>
 *         &lt;element name="LastRowNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NaturalNumberType" minOccurs="0"/>
 *         &lt;element name="OrientationCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ComponentOrientationCodeType" minOccurs="0"/>
 *         &lt;element name="PositionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ComponentPositionCodeType" minOccurs="0"/>
 *         &lt;element name="RowEquivLengthNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinComponentType", propOrder = {
    "absoluteLengthMeasure",
    "absoluteWidthMeasure",
    "cabinComponentTypeCode",
    "columnEquivWidthNumber",
    "columnID",
    "firstRowNumber",
    "lastRowNumber",
    "orientationCode",
    "positionCode",
    "rowEquivLengthNumber"
})
public class CabinComponentType {

    @XmlElement(name = "AbsoluteLengthMeasure")
    protected MeasureType absoluteLengthMeasure;
    @XmlElement(name = "AbsoluteWidthMeasure")
    protected MeasureType absoluteWidthMeasure;
    @XmlElement(name = "CabinComponentTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinComponentTypeCode;
    @XmlElement(name = "ColumnEquivWidthNumber")
    protected BigDecimal columnEquivWidthNumber;
    @XmlElement(name = "ColumnID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> columnID;
    @XmlElement(name = "FirstRowNumber")
    protected BigInteger firstRowNumber;
    @XmlElement(name = "LastRowNumber")
    protected BigInteger lastRowNumber;
    @XmlElement(name = "OrientationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orientationCode;
    @XmlElement(name = "PositionCode")
    @XmlSchemaType(name = "token")
    protected ComponentPositionCodeContentType positionCode;
    @XmlElement(name = "RowEquivLengthNumber")
    protected BigDecimal rowEquivLengthNumber;

    /**
     * Gets the value of the absoluteLengthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAbsoluteLengthMeasure() {
        return absoluteLengthMeasure;
    }

    /**
     * Sets the value of the absoluteLengthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAbsoluteLengthMeasure(MeasureType value) {
        this.absoluteLengthMeasure = value;
    }

    /**
     * Gets the value of the absoluteWidthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAbsoluteWidthMeasure() {
        return absoluteWidthMeasure;
    }

    /**
     * Sets the value of the absoluteWidthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAbsoluteWidthMeasure(MeasureType value) {
        this.absoluteWidthMeasure = value;
    }

    /**
     * Gets the value of the cabinComponentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinComponentTypeCode() {
        return cabinComponentTypeCode;
    }

    /**
     * Sets the value of the cabinComponentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinComponentTypeCode(String value) {
        this.cabinComponentTypeCode = value;
    }

    /**
     * Gets the value of the columnEquivWidthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getColumnEquivWidthNumber() {
        return columnEquivWidthNumber;
    }

    /**
     * Sets the value of the columnEquivWidthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setColumnEquivWidthNumber(BigDecimal value) {
        this.columnEquivWidthNumber = value;
    }

    /**
     * Gets the value of the columnID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColumnID() {
        if (columnID == null) {
            columnID = new ArrayList<String>();
        }
        return this.columnID;
    }

    /**
     * Gets the value of the firstRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstRowNumber() {
        return firstRowNumber;
    }

    /**
     * Sets the value of the firstRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstRowNumber(BigInteger value) {
        this.firstRowNumber = value;
    }

    /**
     * Gets the value of the lastRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastRowNumber() {
        return lastRowNumber;
    }

    /**
     * Sets the value of the lastRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastRowNumber(BigInteger value) {
        this.lastRowNumber = value;
    }

    /**
     * Gets the value of the orientationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientationCode() {
        return orientationCode;
    }

    /**
     * Sets the value of the orientationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientationCode(String value) {
        this.orientationCode = value;
    }

    /**
     * Gets the value of the positionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentPositionCodeContentType }
     *     
     */
    public ComponentPositionCodeContentType getPositionCode() {
        return positionCode;
    }

    /**
     * Sets the value of the positionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentPositionCodeContentType }
     *     
     */
    public void setPositionCode(ComponentPositionCodeContentType value) {
        this.positionCode = value;
    }

    /**
     * Gets the value of the rowEquivLengthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRowEquivLengthNumber() {
        return rowEquivLengthNumber;
    }

    /**
     * Sets the value of the rowEquivLengthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRowEquivLengthNumber(BigDecimal value) {
        this.rowEquivLengthNumber = value;
    }

}
