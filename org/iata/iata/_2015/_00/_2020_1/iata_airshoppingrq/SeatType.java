
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

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
 * A sitting place for a passenger or crew in a cabin compartment on a transport vehicle.
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
 *         &lt;element name="CharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}SeatCharacteristicCodeType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="OccupationStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}SeatStatusCodeType" minOccurs="0"/>
 *         &lt;element name="SeatProfile" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}SeatProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatRowNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}NaturalNumberType" minOccurs="0"/>
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
    "characteristicCode",
    "columnID",
    "occupationStatusCode",
    "seatProfile",
    "seatRowNumber"
})
public class SeatType {

    @XmlElement(name = "CharacteristicCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> characteristicCode;
    @XmlElement(name = "ColumnID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String columnID;
    @XmlElement(name = "OccupationStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String occupationStatusCode;
    @XmlElement(name = "SeatProfile")
    protected List<SeatProfileType> seatProfile;
    @XmlElement(name = "SeatRowNumber")
    protected BigInteger seatRowNumber;

    /**
     * Gets the value of the characteristicCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCharacteristicCode() {
        if (characteristicCode == null) {
            characteristicCode = new ArrayList<String>();
        }
        return this.characteristicCode;
    }

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
     * Gets the value of the seatProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatProfileType }
     * 
     * 
     */
    public List<SeatProfileType> getSeatProfile() {
        if (seatProfile == null) {
            seatProfile = new ArrayList<SeatProfileType>();
        }
        return this.seatProfile;
    }

    /**
     * Gets the value of the seatRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatRowNumber() {
        return seatRowNumber;
    }

    /**
     * Sets the value of the seatRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeatRowNumber(BigInteger value) {
        this.seatRowNumber = value;
    }

}
