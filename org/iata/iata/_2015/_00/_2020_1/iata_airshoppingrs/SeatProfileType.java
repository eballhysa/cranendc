
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

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
 * Airline defined characteristics shared by a group of seats.
 *  
 * 
 * <p>Java class for SeatProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}SeatCharacteristicCodeType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="MarketingInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatKeywords" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatPitchMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}MeasureType" minOccurs="0"/>
 *         &lt;element name="SeatProfileID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}ID_Type"/>
 *         &lt;element name="SeatWidthMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatProfileType", propOrder = {
    "characteristicCode",
    "marketingInfo",
    "seatKeywords",
    "seatPitchMeasure",
    "seatProfileID",
    "seatWidthMeasure"
})
public class SeatProfileType {

    @XmlElement(name = "CharacteristicCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> characteristicCode;
    @XmlElement(name = "MarketingInfo")
    protected List<DescType> marketingInfo;
    @XmlElement(name = "SeatKeywords")
    protected List<KeyValuePropertyType> seatKeywords;
    @XmlElement(name = "SeatPitchMeasure")
    protected MeasureType seatPitchMeasure;
    @XmlElement(name = "SeatProfileID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String seatProfileID;
    @XmlElement(name = "SeatWidthMeasure")
    protected MeasureType seatWidthMeasure;

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
     * Gets the value of the marketingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getMarketingInfo() {
        if (marketingInfo == null) {
            marketingInfo = new ArrayList<DescType>();
        }
        return this.marketingInfo;
    }

    /**
     * Gets the value of the seatKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getSeatKeywords() {
        if (seatKeywords == null) {
            seatKeywords = new ArrayList<KeyValuePropertyType>();
        }
        return this.seatKeywords;
    }

    /**
     * Gets the value of the seatPitchMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSeatPitchMeasure() {
        return seatPitchMeasure;
    }

    /**
     * Sets the value of the seatPitchMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSeatPitchMeasure(MeasureType value) {
        this.seatPitchMeasure = value;
    }

    /**
     * Gets the value of the seatProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatProfileID() {
        return seatProfileID;
    }

    /**
     * Sets the value of the seatProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatProfileID(String value) {
        this.seatProfileID = value;
    }

    /**
     * Gets the value of the seatWidthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSeatWidthMeasure() {
        return seatWidthMeasure;
    }

    /**
     * Sets the value of the seatWidthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSeatWidthMeasure(MeasureType value) {
        this.seatWidthMeasure = value;
    }

}
