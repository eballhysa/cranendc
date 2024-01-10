
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import java.math.BigDecimal;
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
 * Message policy information, including PCI, PII information.
 * 
 * <p>Java class for PolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NameType" minOccurs="0"/>
 *         &lt;element name="PolicyNodeInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PolicyNodeInfoType" maxOccurs="unbounded"/>
 *         &lt;element name="PolicyTypeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="VersionNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyType", propOrder = {
    "desc",
    "ownerName",
    "policyNodeInfo",
    "policyTypeText",
    "versionNumber"
})
public class PolicyType {

    @XmlElement(name = "Desc")
    protected List<DescType> desc;
    @XmlElement(name = "OwnerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    @XmlElement(name = "PolicyNodeInfo", required = true)
    protected List<PolicyNodeInfoType> policyNodeInfo;
    @XmlElement(name = "PolicyTypeText")
    protected String policyTypeText;
    @XmlElement(name = "VersionNumber")
    protected BigDecimal versionNumber;

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
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the policyNodeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyNodeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyNodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyNodeInfoType }
     * 
     * 
     */
    public List<PolicyNodeInfoType> getPolicyNodeInfo() {
        if (policyNodeInfo == null) {
            policyNodeInfo = new ArrayList<PolicyNodeInfoType>();
        }
        return this.policyNodeInfo;
    }

    /**
     * Gets the value of the policyTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTypeText() {
        return policyTypeText;
    }

    /**
     * Sets the value of the policyTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyTypeText(String value) {
        this.policyTypeText = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersionNumber(BigDecimal value) {
        this.versionNumber = value;
    }

}
