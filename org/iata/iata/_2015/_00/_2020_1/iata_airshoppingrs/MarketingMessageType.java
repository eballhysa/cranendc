
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional, supplementary information about the document or service.
 * 
 * <p>Java class for MarketingMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}DescType"/>
 *         &lt;element name="GeneralAssociation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}GeneralAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingMessageType", propOrder = {
    "desc",
    "generalAssociation"
})
public class MarketingMessageType {

    @XmlElement(name = "Desc", required = true)
    protected DescType desc;
    @XmlElement(name = "GeneralAssociation")
    protected List<GeneralAssociationType> generalAssociation;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link DescType }
     *     
     */
    public DescType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescType }
     *     
     */
    public void setDesc(DescType value) {
        this.desc = value;
    }

    /**
     * Gets the value of the generalAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralAssociationType }
     * 
     * 
     */
    public List<GeneralAssociationType> getGeneralAssociation() {
        if (generalAssociation == null) {
            generalAssociation = new ArrayList<GeneralAssociationType>();
        }
        return this.generalAssociation;
    }

}
