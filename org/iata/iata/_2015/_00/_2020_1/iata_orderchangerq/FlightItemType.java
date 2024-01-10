
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
 * Flight service information used for long sells.
 * 
 * <p>Java class for FlightItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}FareDetailType" minOccurs="0"/>
 *         &lt;element name="OriginDestRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" maxOccurs="unbounded"/>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}PriceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightItemType", propOrder = {
    "fareDetail",
    "originDestRefID",
    "price"
})
public class FlightItemType {

    @XmlElement(name = "FareDetail")
    protected FareDetailType fareDetail;
    @XmlElement(name = "OriginDestRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> originDestRefID;
    @XmlElement(name = "Price")
    protected PriceType price;

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
    }

    /**
     * Gets the value of the originDestRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOriginDestRefID() {
        if (originDestRefID == null) {
            originDestRefID = new ArrayList<String>();
        }
        return this.originDestRefID;
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

}
