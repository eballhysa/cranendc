
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

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
 * A sitting place for a passenger located in the cabin.
 *  
 * 
 * <p>Java class for SeatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ColumnID_Type"/>
 *         &lt;element name="RowNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}NaturalNumberType"/>
 *         &lt;element name="SeatCharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}SeatCharacteristicCodeType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="SeatProfileRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatType", propOrder = {
    "columnID",
    "rowNumber",
    "seatCharacteristicCode",
    "seatProfileRefID"
})
public class SeatType {

    @XmlElement(name = "ColumnID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String columnID;
    @XmlElement(name = "RowNumber", required = true)
    protected BigInteger rowNumber;
    @XmlElement(name = "SeatCharacteristicCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> seatCharacteristicCode;
    @XmlElement(name = "SeatProfileRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String seatProfileRefID;

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
     * Gets the value of the seatCharacteristicCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatCharacteristicCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatCharacteristicCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatCharacteristicCode() {
        if (seatCharacteristicCode == null) {
            seatCharacteristicCode = new ArrayList<String>();
        }
        return this.seatCharacteristicCode;
    }

    /**
     * Gets the value of the seatProfileRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatProfileRefID() {
        return seatProfileRefID;
    }

    /**
     * Sets the value of the seatProfileRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatProfileRefID(String value) {
        this.seatProfileRefID = value;
    }

}
