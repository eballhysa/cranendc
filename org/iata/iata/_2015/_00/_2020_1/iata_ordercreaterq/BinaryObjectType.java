
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A binary object is a sequence of binary digits (bits).
 * 
 * <p>Java class for BinaryObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryObjectType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="CharacterSetCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="EncodingCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MIME_Code" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="UniformResourceID" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryObjectType", propOrder = {
    "value"
})
public class BinaryObjectType {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "CharacterSetCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String characterSetCode;
    @XmlAttribute(name = "EncodingCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String encodingCode;
    @XmlAttribute(name = "FileName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fileName;
    @XmlAttribute(name = "Format")
    protected String format;
    @XmlAttribute(name = "MIME_Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mimeCode;
    @XmlAttribute(name = "UniformResourceID")
    @XmlSchemaType(name = "anyURI")
    protected String uniformResourceID;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the characterSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * Sets the value of the characterSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSetCode(String value) {
        this.characterSetCode = value;
    }

    /**
     * Gets the value of the encodingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingCode() {
        return encodingCode;
    }

    /**
     * Sets the value of the encodingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingCode(String value) {
        this.encodingCode = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     * Gets the value of the mimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMECode() {
        return mimeCode;
    }

    /**
     * Sets the value of the mimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMECode(String value) {
        this.mimeCode = value;
    }

    /**
     * Gets the value of the uniformResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniformResourceID() {
        return uniformResourceID;
    }

    /**
     * Sets the value of the uniformResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniformResourceID(String value) {
        this.uniformResourceID = value;
    }

}
