
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

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
 * A physical aircraft compartment where passenger seats are installed, classified by a given Cabin Type.
 *  
 * 
 * <p>Java class for CabinCompartmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinCompartmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinCompartmentID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="CabinComponent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}CabinComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}CabinTypeType" minOccurs="0"/>
 *         &lt;element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeckCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}DeckCodeType" minOccurs="0"/>
 *         &lt;element name="FirstRowNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NaturalNumberType" minOccurs="0"/>
 *         &lt;element name="LastRowNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NaturalNumberType" minOccurs="0"/>
 *         &lt;element name="SeatRow" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}SeatRowType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinCompartmentType", propOrder = {
    "cabinCompartmentID",
    "cabinComponent",
    "cabinType",
    "columnID",
    "deckCode",
    "firstRowNumber",
    "lastRowNumber",
    "seatRow"
})
public class CabinCompartmentType {

    @XmlElement(name = "CabinCompartmentID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinCompartmentID;
    @XmlElement(name = "CabinComponent")
    protected List<CabinComponentType> cabinComponent;
    @XmlElement(name = "CabinType")
    protected CabinTypeType cabinType;
    @XmlElement(name = "ColumnID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> columnID;
    @XmlElement(name = "DeckCode")
    @XmlSchemaType(name = "token")
    protected DeckCodeContentType deckCode;
    @XmlElement(name = "FirstRowNumber")
    protected BigInteger firstRowNumber;
    @XmlElement(name = "LastRowNumber")
    protected BigInteger lastRowNumber;
    @XmlElement(name = "SeatRow")
    protected List<SeatRowType> seatRow;

    /**
     * Gets the value of the cabinCompartmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCompartmentID() {
        return cabinCompartmentID;
    }

    /**
     * Sets the value of the cabinCompartmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCompartmentID(String value) {
        this.cabinCompartmentID = value;
    }

    /**
     * Gets the value of the cabinComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinComponentType }
     * 
     * 
     */
    public List<CabinComponentType> getCabinComponent() {
        if (cabinComponent == null) {
            cabinComponent = new ArrayList<CabinComponentType>();
        }
        return this.cabinComponent;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeType }
     *     
     */
    public CabinTypeType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeType }
     *     
     */
    public void setCabinType(CabinTypeType value) {
        this.cabinType = value;
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
     * Gets the value of the deckCode property.
     * 
     * @return
     *     possible object is
     *     {@link DeckCodeContentType }
     *     
     */
    public DeckCodeContentType getDeckCode() {
        return deckCode;
    }

    /**
     * Sets the value of the deckCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckCodeContentType }
     *     
     */
    public void setDeckCode(DeckCodeContentType value) {
        this.deckCode = value;
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
     * Gets the value of the seatRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatRowType }
     * 
     * 
     */
    public List<SeatRowType> getSeatRow() {
        if (seatRow == null) {
            seatRow = new ArrayList<SeatRowType>();
        }
        return this.seatRow;
    }

}
