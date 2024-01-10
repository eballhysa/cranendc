
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
 * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order. 
 *  
 * 
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterlineSettlementInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}InterlineSettlementInfoType" minOccurs="0"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}ID_Type" maxOccurs="unbounded"/>
 *         &lt;element name="ServiceAssociations" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}ServiceAssociationsType"/>
 *         &lt;element name="ServiceID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}ID_Type"/>
 *         &lt;element name="ServiceRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="ValidatingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}AirlineDesigCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "interlineSettlementInfo",
    "paxRefID",
    "serviceAssociations",
    "serviceID",
    "serviceRefID",
    "validatingCarrierCode"
})
public class ServiceType {

    @XmlElement(name = "InterlineSettlementInfo")
    protected InterlineSettlementInfoType interlineSettlementInfo;
    @XmlElement(name = "PaxRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;
    @XmlElement(name = "ServiceAssociations", required = true)
    protected ServiceAssociationsType serviceAssociations;
    @XmlElement(name = "ServiceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceID;
    @XmlElement(name = "ServiceRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceRefID;
    @XmlElement(name = "ValidatingCarrierCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validatingCarrierCode;

    /**
     * Gets the value of the interlineSettlementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    public InterlineSettlementInfoType getInterlineSettlementInfo() {
        return interlineSettlementInfo;
    }

    /**
     * Sets the value of the interlineSettlementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    public void setInterlineSettlementInfo(InterlineSettlementInfoType value) {
        this.interlineSettlementInfo = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<String>();
        }
        return this.paxRefID;
    }

    /**
     * Gets the value of the serviceAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssociationsType }
     *     
     */
    public ServiceAssociationsType getServiceAssociations() {
        return serviceAssociations;
    }

    /**
     * Sets the value of the serviceAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssociationsType }
     *     
     */
    public void setServiceAssociations(ServiceAssociationsType value) {
        this.serviceAssociations = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the serviceRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRefID() {
        return serviceRefID;
    }

    /**
     * Sets the value of the serviceRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRefID(String value) {
        this.serviceRefID = value;
    }

    /**
     * Gets the value of the validatingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    /**
     * Sets the value of the validatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrierCode(String value) {
        this.validatingCarrierCode = value;
    }

}
