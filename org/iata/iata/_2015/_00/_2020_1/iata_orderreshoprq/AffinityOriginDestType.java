
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

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
 * Origin and Destination information for affinity shopping requests.
 * 
 * <p>Java class for AffinityOriginDestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityOriginDestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffinityArrivalRequest" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}AffinityArrivalRequestType" minOccurs="0"/>
 *         &lt;element name="AffinityDepRequest" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}AffinityDepRequestType" minOccurs="0"/>
 *         &lt;element name="ConnectionPrefRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="PreferredCabinType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityOriginDestType", propOrder = {
    "affinityArrivalRequest",
    "affinityDepRequest",
    "connectionPrefRefID",
    "preferredCabinType"
})
public class AffinityOriginDestType {

    @XmlElement(name = "AffinityArrivalRequest")
    protected AffinityArrivalRequestType affinityArrivalRequest;
    @XmlElement(name = "AffinityDepRequest")
    protected AffinityDepRequestType affinityDepRequest;
    @XmlElement(name = "ConnectionPrefRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionPrefRefID;
    @XmlElement(name = "PreferredCabinType")
    protected List<CabinTypeType> preferredCabinType;

    /**
     * Gets the value of the affinityArrivalRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AffinityArrivalRequestType }
     *     
     */
    public AffinityArrivalRequestType getAffinityArrivalRequest() {
        return affinityArrivalRequest;
    }

    /**
     * Sets the value of the affinityArrivalRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityArrivalRequestType }
     *     
     */
    public void setAffinityArrivalRequest(AffinityArrivalRequestType value) {
        this.affinityArrivalRequest = value;
    }

    /**
     * Gets the value of the affinityDepRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AffinityDepRequestType }
     *     
     */
    public AffinityDepRequestType getAffinityDepRequest() {
        return affinityDepRequest;
    }

    /**
     * Sets the value of the affinityDepRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityDepRequestType }
     *     
     */
    public void setAffinityDepRequest(AffinityDepRequestType value) {
        this.affinityDepRequest = value;
    }

    /**
     * Gets the value of the connectionPrefRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionPrefRefID() {
        return connectionPrefRefID;
    }

    /**
     * Sets the value of the connectionPrefRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionPrefRefID(String value) {
        this.connectionPrefRefID = value;
    }

    /**
     * Gets the value of the preferredCabinType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredCabinType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredCabinType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * 
     * 
     */
    public List<CabinTypeType> getPreferredCabinType() {
        if (preferredCabinType == null) {
            preferredCabinType = new ArrayList<CabinTypeType>();
        }
        return this.preferredCabinType;
    }

}
