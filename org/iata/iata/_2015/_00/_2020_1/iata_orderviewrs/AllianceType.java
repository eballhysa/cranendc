
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

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
 * Two or more airlines participating in a commercial relationship or joint venture, where a joint and commonly identifiable product is marketed under a single commercial name or brand.
 * 
 * <p>Java class for AllianceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllianceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllianceCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AllianceCodeType" minOccurs="0"/>
 *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CarrierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ProperNameType" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllianceType", propOrder = {
    "allianceCode",
    "carrier",
    "name",
    "url"
})
public class AllianceType {

    @XmlElement(name = "AllianceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String allianceCode;
    @XmlElement(name = "Carrier")
    protected List<CarrierType> carrier;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Gets the value of the allianceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllianceCode() {
        return allianceCode;
    }

    /**
     * Sets the value of the allianceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllianceCode(String value) {
        this.allianceCode = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierType }
     * 
     * 
     */
    public List<CarrierType> getCarrier() {
        if (carrier == null) {
            carrier = new ArrayList<CarrierType>();
        }
        return this.carrier;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}
