//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.sector.academicrecord.v1_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_12.UserDefinedExtensionsType;


/**
 * Electronic Delivery Details
 * 
 * <p>Java class for ElectronicDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicDeliveryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElectronicFormat" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}ElectronicFormatType"/>
 *         &lt;element name="ElectronicMethod" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}ElectronicMethodType"/>
 *         &lt;element name="ServiceProvider" type="{urn:org:pesc:core:CoreMain:v1.12.0}OrganizationNameType" minOccurs="0"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.12.0}NoteMessageType" minOccurs="0"/>
 *         &lt;element name="UserDefinedExtensions" type="{urn:org:pesc:core:CoreMain:v1.12.0}UserDefinedExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicDeliveryType", propOrder = {
    "electronicFormat",
    "electronicMethod",
    "serviceProvider",
    "noteMessage",
    "userDefinedExtensions"
})
public class ElectronicDeliveryType {

    @XmlElement(name = "ElectronicFormat", required = true)
    protected ElectronicFormatType electronicFormat;
    @XmlElement(name = "ElectronicMethod", required = true)
    protected String electronicMethod;
    @XmlElement(name = "ServiceProvider")
    protected String serviceProvider;
    @XmlElement(name = "NoteMessage")
    protected String noteMessage;
    @XmlElement(name = "UserDefinedExtensions")
    protected UserDefinedExtensionsType userDefinedExtensions;

    /**
     * Gets the value of the electronicFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicFormatType }
     *     
     */
    public ElectronicFormatType getElectronicFormat() {
        return electronicFormat;
    }

    /**
     * Sets the value of the electronicFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicFormatType }
     *     
     */
    public void setElectronicFormat(ElectronicFormatType value) {
        this.electronicFormat = value;
    }

    /**
     * Gets the value of the electronicMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicMethod() {
        return electronicMethod;
    }

    /**
     * Sets the value of the electronicMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicMethod(String value) {
        this.electronicMethod = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvider(String value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteMessage() {
        return noteMessage;
    }

    /**
     * Sets the value of the noteMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteMessage(String value) {
        this.noteMessage = value;
    }

    /**
     * Gets the value of the userDefinedExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public UserDefinedExtensionsType getUserDefinedExtensions() {
        return userDefinedExtensions;
    }

    /**
     * Sets the value of the userDefinedExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public void setUserDefinedExtensions(UserDefinedExtensionsType value) {
        this.userDefinedExtensions = value;
    }

}
