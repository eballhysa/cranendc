
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

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
 * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at:
 *  https://guides.developer.iata.org/docs/industry-taxonomy
 * 
 * <p>Java class for ServiceTaxonomyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceTaxonomyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         &lt;element name="ServiceFeature" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ServiceFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxonomyCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTaxonomyType", propOrder = {
    "descText",
    "serviceFeature",
    "taxonomyCode"
})
public class ServiceTaxonomyType {

    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "ServiceFeature")
    protected List<ServiceFeatureType> serviceFeature;
    @XmlElement(name = "TaxonomyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxonomyCode;

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the serviceFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureType }
     * 
     * 
     */
    public List<ServiceFeatureType> getServiceFeature() {
        if (serviceFeature == null) {
            serviceFeature = new ArrayList<ServiceFeatureType>();
        }
        return this.serviceFeature;
    }

    /**
     * Gets the value of the taxonomyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxonomyCode() {
        return taxonomyCode;
    }

    /**
     * Sets the value of the taxonomyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxonomyCode(String value) {
        this.taxonomyCode = value;
    }

}
