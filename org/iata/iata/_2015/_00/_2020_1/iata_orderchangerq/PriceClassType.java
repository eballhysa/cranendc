
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
 * A price point within a particular Cabin Type (sometimes referred to as 'Fare Families').
 * 
 * <p>Java class for PriceClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisplayOrderText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}TextType" minOccurs="0"/>
 *         &lt;element name="FareBasisAppText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}TextType" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ProperNameType"/>
 *         &lt;element name="PriceClassID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceClassType", propOrder = {
    "cabinType",
    "code",
    "desc",
    "displayOrderText",
    "fareBasisAppText",
    "fareBasisCode",
    "name",
    "priceClassID"
})
public class PriceClassType {

    @XmlElement(name = "CabinType")
    protected List<CabinTypeType> cabinType;
    @XmlElement(name = "Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String code;
    @XmlElement(name = "Desc")
    protected List<DescType> desc;
    @XmlElement(name = "DisplayOrderText")
    protected String displayOrderText;
    @XmlElement(name = "FareBasisAppText")
    protected String fareBasisAppText;
    @XmlElement(name = "FareBasisCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareBasisCode;
    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "PriceClassID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priceClassID;

    /**
     * Gets the value of the cabinType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * 
     * 
     */
    public List<CabinTypeType> getCabinType() {
        if (cabinType == null) {
            cabinType = new ArrayList<CabinTypeType>();
        }
        return this.cabinType;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the displayOrderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayOrderText() {
        return displayOrderText;
    }

    /**
     * Sets the value of the displayOrderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayOrderText(String value) {
        this.displayOrderText = value;
    }

    /**
     * Gets the value of the fareBasisAppText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisAppText() {
        return fareBasisAppText;
    }

    /**
     * Sets the value of the fareBasisAppText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisAppText(String value) {
        this.fareBasisAppText = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the priceClassID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceClassID() {
        return priceClassID;
    }

    /**
     * Sets the value of the priceClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceClassID(String value) {
        this.priceClassID = value;
    }

}
