
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
 * <p>Java class for FareGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType"/>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}FareDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareGroupID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareGroupType", propOrder = {
    "fareCode",
    "fareDetail",
    "fareGroupID"
})
public class FareGroupType {

    @XmlElement(name = "FareCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareCode;
    @XmlElement(name = "FareDetail")
    protected List<FareDetailType> fareDetail;
    @XmlElement(name = "FareGroupID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareGroupID;

    /**
     * Gets the value of the fareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCode() {
        return fareCode;
    }

    /**
     * Sets the value of the fareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCode(String value) {
        this.fareCode = value;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType }
     * 
     * 
     */
    public List<FareDetailType> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<FareDetailType>();
        }
        return this.fareDetail;
    }

    /**
     * Gets the value of the fareGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareGroupID() {
        return fareGroupID;
    }

    /**
     * Sets the value of the fareGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareGroupID(String value) {
        this.fareGroupID = value;
    }

}
