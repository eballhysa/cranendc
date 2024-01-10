
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Electronic documents, images, and other files which accompany and support some information.
 *  
 * 
 * <p>Java class for MediaObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BinaryObject" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}BinaryObjectType" minOccurs="0"/>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="FileSizeMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}MeasureType" minOccurs="0"/>
 *         &lt;element name="HeightMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}MeasureType" minOccurs="0"/>
 *         &lt;element name="HintText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="MediaID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="RenderingInstructionsText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="RenderingMethodText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="RenderingOutputFormatText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="RenderingOverviewText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="WidthMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaObjectType", propOrder = {
    "binaryObject",
    "descText",
    "fileSizeMeasure",
    "heightMeasure",
    "hintText",
    "mediaID",
    "renderingInstructionsText",
    "renderingMethodText",
    "renderingOutputFormatText",
    "renderingOverviewText",
    "widthMeasure"
})
public class MediaObjectType {

    @XmlElement(name = "BinaryObject")
    protected BinaryObjectType binaryObject;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "FileSizeMeasure")
    protected MeasureType fileSizeMeasure;
    @XmlElement(name = "HeightMeasure")
    protected MeasureType heightMeasure;
    @XmlElement(name = "HintText")
    protected String hintText;
    @XmlElement(name = "MediaID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mediaID;
    @XmlElement(name = "RenderingInstructionsText")
    protected String renderingInstructionsText;
    @XmlElement(name = "RenderingMethodText")
    protected String renderingMethodText;
    @XmlElement(name = "RenderingOutputFormatText")
    protected String renderingOutputFormatText;
    @XmlElement(name = "RenderingOverviewText")
    protected String renderingOverviewText;
    @XmlElement(name = "WidthMeasure")
    protected MeasureType widthMeasure;

    /**
     * Gets the value of the binaryObject property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getBinaryObject() {
        return binaryObject;
    }

    /**
     * Sets the value of the binaryObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setBinaryObject(BinaryObjectType value) {
        this.binaryObject = value;
    }

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
     * Gets the value of the fileSizeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getFileSizeMeasure() {
        return fileSizeMeasure;
    }

    /**
     * Sets the value of the fileSizeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setFileSizeMeasure(MeasureType value) {
        this.fileSizeMeasure = value;
    }

    /**
     * Gets the value of the heightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Sets the value of the heightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setHeightMeasure(MeasureType value) {
        this.heightMeasure = value;
    }

    /**
     * Gets the value of the hintText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHintText() {
        return hintText;
    }

    /**
     * Sets the value of the hintText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHintText(String value) {
        this.hintText = value;
    }

    /**
     * Gets the value of the mediaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaID() {
        return mediaID;
    }

    /**
     * Sets the value of the mediaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaID(String value) {
        this.mediaID = value;
    }

    /**
     * Gets the value of the renderingInstructionsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingInstructionsText() {
        return renderingInstructionsText;
    }

    /**
     * Sets the value of the renderingInstructionsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingInstructionsText(String value) {
        this.renderingInstructionsText = value;
    }

    /**
     * Gets the value of the renderingMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingMethodText() {
        return renderingMethodText;
    }

    /**
     * Sets the value of the renderingMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingMethodText(String value) {
        this.renderingMethodText = value;
    }

    /**
     * Gets the value of the renderingOutputFormatText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingOutputFormatText() {
        return renderingOutputFormatText;
    }

    /**
     * Sets the value of the renderingOutputFormatText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingOutputFormatText(String value) {
        this.renderingOutputFormatText = value;
    }

    /**
     * Gets the value of the renderingOverviewText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingOverviewText() {
        return renderingOverviewText;
    }

    /**
     * Sets the value of the renderingOverviewText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingOverviewText(String value) {
        this.renderingOverviewText = value;
    }

    /**
     * Gets the value of the widthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWidthMeasure() {
        return widthMeasure;
    }

    /**
     * Sets the value of the widthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWidthMeasure(MeasureType value) {
        this.widthMeasure = value;
    }

}
