
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

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
 *         &lt;element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type"/>
 *         &lt;element name="OccupationStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}SeatStatusCodeType" minOccurs="0"/>
 *         &lt;element name="OfferItemRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatCharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}SeatCharacteristicCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatProfileRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
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
    "occupationStatusCode",
    "offerItemRefID",
    "seatCharacteristicCode",
    "seatProfileRefID"
})
public class SeatType {

    @XmlElement(name = "ColumnID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String columnID;
    @XmlElement(name = "OccupationStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String occupationStatusCode;
    @XmlElement(name = "OfferItemRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> offerItemRefID;
    @XmlElement(name = "SeatCharacteristicCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> seatCharacteristicCode;
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
     * Gets the value of the occupationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationStatusCode() {
        return occupationStatusCode;
    }

    /**
     * Sets the value of the occupationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationStatusCode(String value) {
        this.occupationStatusCode = value;
    }

    /**
     * Gets the value of the offerItemRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerItemRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferItemRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOfferItemRefID() {
        if (offerItemRefID == null) {
            offerItemRefID = new ArrayList<String>();
        }
        return this.offerItemRefID;
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
