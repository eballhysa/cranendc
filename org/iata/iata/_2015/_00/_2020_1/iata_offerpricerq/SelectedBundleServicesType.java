
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

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
 * For service bundle selection - only to be used for bundles with optional choices (e.g. pick 2 out of 4)
 * 
 * <p>Java class for SelectedBundleServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedBundleServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedServiceDefinitionRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SelectedServiceRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedBundleServicesType", propOrder = {
    "selectedServiceDefinitionRefID",
    "selectedServiceRefID"
})
public class SelectedBundleServicesType {

    @XmlElement(name = "SelectedServiceDefinitionRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> selectedServiceDefinitionRefID;
    @XmlElement(name = "SelectedServiceRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String selectedServiceRefID;

    /**
     * Gets the value of the selectedServiceDefinitionRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedServiceDefinitionRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedServiceDefinitionRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSelectedServiceDefinitionRefID() {
        if (selectedServiceDefinitionRefID == null) {
            selectedServiceDefinitionRefID = new ArrayList<String>();
        }
        return this.selectedServiceDefinitionRefID;
    }

    /**
     * Gets the value of the selectedServiceRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedServiceRefID() {
        return selectedServiceRefID;
    }

    /**
     * Sets the value of the selectedServiceRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedServiceRefID(String value) {
        this.selectedServiceRefID = value;
    }

}
