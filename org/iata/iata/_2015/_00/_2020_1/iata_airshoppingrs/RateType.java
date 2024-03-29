
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A rate is a quantity, amount, frequency, or dimensionless factor, measured against an independent base unit, expressed as a quotient.
 * 
 * <p>Java class for RateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="BaseCurCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="BaseMultiplierValue" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="BaseUnitCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="CurCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MultiplierValue" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateType", propOrder = {
    "value"
})
public class RateType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "BaseCurCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baseCurCode;
    @XmlAttribute(name = "BaseMultiplierValue")
    protected BigDecimal baseMultiplierValue;
    @XmlAttribute(name = "BaseUnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baseUnitCode;
    @XmlAttribute(name = "CurCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String curCode;
    @XmlAttribute(name = "Format")
    protected String format;
    @XmlAttribute(name = "MultiplierValue")
    protected BigDecimal multiplierValue;
    @XmlAttribute(name = "UnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String unitCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the baseCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurCode() {
        return baseCurCode;
    }

    /**
     * Sets the value of the baseCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurCode(String value) {
        this.baseCurCode = value;
    }

    /**
     * Gets the value of the baseMultiplierValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseMultiplierValue() {
        return baseMultiplierValue;
    }

    /**
     * Sets the value of the baseMultiplierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseMultiplierValue(BigDecimal value) {
        this.baseMultiplierValue = value;
    }

    /**
     * Gets the value of the baseUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUnitCode() {
        return baseUnitCode;
    }

    /**
     * Sets the value of the baseUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUnitCode(String value) {
        this.baseUnitCode = value;
    }

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCode(String value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the multiplierValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplierValue() {
        return multiplierValue;
    }

    /**
     * Sets the value of the multiplierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplierValue(BigDecimal value) {
        this.multiplierValue = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

}
