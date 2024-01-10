
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Currency related parameters intended to influence which currency the shopping results are displayed in.
 * 
 * <p>Java class for CurParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}CurAppCodeType" minOccurs="0"/>
 *         &lt;element name="CurCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}CurCodeType" minOccurs="0"/>
 *         &lt;element name="DecimalsAllowedNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NumberType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurParameterType", propOrder = {
    "appCode",
    "curCode",
    "decimalsAllowedNumber",
    "name"
})
public class CurParameterType {

    @XmlElement(name = "AppCode")
    @XmlSchemaType(name = "string")
    protected CurAppCodeContentType appCode;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "DecimalsAllowedNumber")
    protected BigDecimal decimalsAllowedNumber;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Gets the value of the appCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurAppCodeContentType }
     *     
     */
    public CurAppCodeContentType getAppCode() {
        return appCode;
    }

    /**
     * Sets the value of the appCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAppCodeContentType }
     *     
     */
    public void setAppCode(CurAppCodeContentType value) {
        this.appCode = value;
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
     * Gets the value of the decimalsAllowedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalsAllowedNumber() {
        return decimalsAllowedNumber;
    }

    /**
     * Sets the value of the decimalsAllowedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalsAllowedNumber(BigDecimal value) {
        this.decimalsAllowedNumber = value;
    }

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

}
