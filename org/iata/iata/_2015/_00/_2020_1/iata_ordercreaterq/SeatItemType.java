
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 * Seat service information used for long sells.
 * 
 * <p>Java class for SeatItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ColumnID_Type" minOccurs="0"/>
 *         &lt;element name="DatedOperatingLegRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type"/>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PriceType" minOccurs="0"/>
 *         &lt;element name="RowNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}NaturalNumberType" minOccurs="0"/>
 *         &lt;element name="SeatProfileRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatItemType", propOrder = {
    "columnID",
    "datedOperatingLegRefID",
    "paxSegmentRefID",
    "price",
    "rowNumber",
    "seatProfileRefID"
})
public class SeatItemType {

    @XmlElement(name = "ColumnID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String columnID;
    @XmlElement(name = "DatedOperatingLegRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String datedOperatingLegRefID;
    @XmlElement(name = "PaxSegmentRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentRefID;
    @XmlElement(name = "Price")
    protected PriceType price;
    @XmlElement(name = "RowNumber")
    protected BigInteger rowNumber;
    @XmlElement(name = "SeatProfileRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> seatProfileRefID;

    /**
     * Gets the value of the columnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnID() {
        return columnID;
    }

    /**
     * Sets the value of the columnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnID(String value) {
        this.columnID = value;
    }

    /**
     * Gets the value of the datedOperatingLegRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedOperatingLegRefID() {
        return datedOperatingLegRefID;
    }

    /**
     * Sets the value of the datedOperatingLegRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedOperatingLegRefID(String value) {
        this.datedOperatingLegRefID = value;
    }

    /**
     * Gets the value of the paxSegmentRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSegmentRefID() {
        return paxSegmentRefID;
    }

    /**
     * Sets the value of the paxSegmentRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxSegmentRefID(String value) {
        this.paxSegmentRefID = value;
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
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowNumber(BigInteger value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the seatProfileRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatProfileRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatProfileRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatProfileRefID() {
        if (seatProfileRefID == null) {
            seatProfileRefID = new ArrayList<String>();
        }
        return this.seatProfileRefID;
    }

}
