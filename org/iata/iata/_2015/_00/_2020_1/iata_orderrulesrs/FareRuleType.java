
package org.iata.iata._2015._00._2020_1.iata_orderrulesrs;

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
 * Special purchasing rules and restrictions used to differentiate fare levels from one another.
 * 
 * <p>Java class for FareRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareRuleText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RuleCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRuleType", propOrder = {
    "fareRuleText",
    "ruleCode"
})
public class FareRuleType {

    @XmlElement(name = "FareRuleText")
    protected List<RemarkType> fareRuleText;
    @XmlElement(name = "RuleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ruleCode;

    /**
     * Gets the value of the fareRuleText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRuleText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getFareRuleText() {
        if (fareRuleText == null) {
            fareRuleText = new ArrayList<RemarkType>();
        }
        return this.fareRuleText;
    }

    /**
     * Gets the value of the ruleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * Sets the value of the ruleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleCode(String value) {
        this.ruleCode = value;
    }

}
