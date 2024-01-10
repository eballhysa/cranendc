
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

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
 * An organized structure set up for a particular purpose, such as a business, government body, department, charity, or financial institution.
 * 
 * <p>Java class for EmployerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}NameType" minOccurs="0"/>
 *         &lt;element name="SalesTaxRegistration" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}SalesTaxRegistrationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxationExemptionQualifierCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}TaxExemptionQualificationCodeType" minOccurs="0"/>
 *         &lt;element name="TaxdeductedatSourceCapabilityInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}IndType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerType", propOrder = {
    "name",
    "salesTaxRegistration",
    "taxationExemptionQualifierCode",
    "taxdeductedatSourceCapabilityInd"
})
public class EmployerType {

    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "SalesTaxRegistration")
    protected List<SalesTaxRegistrationType> salesTaxRegistration;
    @XmlElement(name = "TaxationExemptionQualifierCode")
    @XmlSchemaType(name = "token")
    protected TaxExemptionQualificationCodeContentType taxationExemptionQualifierCode;
    @XmlElement(name = "TaxdeductedatSourceCapabilityInd")
    protected boolean taxdeductedatSourceCapabilityInd;

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
     * Gets the value of the salesTaxRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTaxRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTaxRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesTaxRegistrationType }
     * 
     * 
     */
    public List<SalesTaxRegistrationType> getSalesTaxRegistration() {
        if (salesTaxRegistration == null) {
            salesTaxRegistration = new ArrayList<SalesTaxRegistrationType>();
        }
        return this.salesTaxRegistration;
    }

    /**
     * Gets the value of the taxationExemptionQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionQualificationCodeContentType }
     *     
     */
    public TaxExemptionQualificationCodeContentType getTaxationExemptionQualifierCode() {
        return taxationExemptionQualifierCode;
    }

    /**
     * Sets the value of the taxationExemptionQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionQualificationCodeContentType }
     *     
     */
    public void setTaxationExemptionQualifierCode(TaxExemptionQualificationCodeContentType value) {
        this.taxationExemptionQualifierCode = value;
    }

    /**
     * Gets the value of the taxdeductedatSourceCapabilityInd property.
     * 
     */
    public boolean isTaxdeductedatSourceCapabilityInd() {
        return taxdeductedatSourceCapabilityInd;
    }

    /**
     * Sets the value of the taxdeductedatSourceCapabilityInd property.
     * 
     */
    public void setTaxdeductedatSourceCapabilityInd(boolean value) {
        this.taxdeductedatSourceCapabilityInd = value;
    }

}
