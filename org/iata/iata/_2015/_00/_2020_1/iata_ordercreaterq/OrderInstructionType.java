
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Instruction Special service information
 * 
 * <p>Java class for OrderInstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInstructionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CabinTypeUpgrade" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CabinTypeType" maxOccurs="unbounded"/>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CommissionType"/>
 *         &lt;element name="SpecialService" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SpecialServiceType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInstructionType", propOrder = {
    "cabinTypeUpgrade",
    "commission",
    "specialService"
})
public class OrderInstructionType {

    @XmlElement(name = "CabinTypeUpgrade")
    protected List<CabinTypeType> cabinTypeUpgrade;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "SpecialService")
    protected List<SpecialServiceType> specialService;

    /**
     * Gets the value of the cabinTypeUpgrade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinTypeUpgrade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinTypeUpgrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * 
     * 
     */
    public List<CabinTypeType> getCabinTypeUpgrade() {
        if (cabinTypeUpgrade == null) {
            cabinTypeUpgrade = new ArrayList<CabinTypeType>();
        }
        return this.cabinTypeUpgrade;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the specialService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceType }
     * 
     * 
     */
    public List<SpecialServiceType> getSpecialService() {
        if (specialService == null) {
            specialService = new ArrayList<SpecialServiceType>();
        }
        return this.specialService;
    }

}
