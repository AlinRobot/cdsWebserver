//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.sector.academicrecord.v1_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.pesc.core.coremain.v1_12.BatchDeliveryMethodType;


/**
 * <p>Java class for TransmissionBatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransmissionBatchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchID" type="{urn:org:pesc:core:CoreMain:v1.12.0}BatchIDType"/>
 *         &lt;element name="BatchDateTime" type="{urn:org:pesc:core:CoreMain:v1.12.0}BatchDateTimeType"/>
 *         &lt;element name="BatchDeliveryMethod" type="{urn:org:pesc:core:CoreMain:v1.12.0}BatchDeliveryMethodType"/>
 *         &lt;element name="SourceAgency" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}SourceDestinationType"/>
 *         &lt;element name="DestinationAgency" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}SourceDestinationType"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.12.0}NoteMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmissionBatchType", propOrder = {
    "batchID",
    "batchDateTime",
    "batchDeliveryMethod",
    "sourceAgency",
    "destinationAgency",
    "noteMessage"
})
public class TransmissionBatchType {

    @XmlElement(name = "BatchID", required = true)
    protected String batchID;
    @XmlElement(name = "BatchDateTime", required = true)
    protected XMLGregorianCalendar batchDateTime;
    @XmlElement(name = "BatchDeliveryMethod", required = true)
    protected BatchDeliveryMethodType batchDeliveryMethod;
    @XmlElement(name = "SourceAgency", required = true)
    protected SourceDestinationType sourceAgency;
    @XmlElement(name = "DestinationAgency", required = true)
    protected SourceDestinationType destinationAgency;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchID(String value) {
        this.batchID = value;
    }

    /**
     * Gets the value of the batchDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBatchDateTime() {
        return batchDateTime;
    }

    /**
     * Sets the value of the batchDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBatchDateTime(XMLGregorianCalendar value) {
        this.batchDateTime = value;
    }

    /**
     * Gets the value of the batchDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BatchDeliveryMethodType }
     *     
     */
    public BatchDeliveryMethodType getBatchDeliveryMethod() {
        return batchDeliveryMethod;
    }

    /**
     * Sets the value of the batchDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchDeliveryMethodType }
     *     
     */
    public void setBatchDeliveryMethod(BatchDeliveryMethodType value) {
        this.batchDeliveryMethod = value;
    }

    /**
     * Gets the value of the sourceAgency property.
     * 
     * @return
     *     possible object is
     *     {@link SourceDestinationType }
     *     
     */
    public SourceDestinationType getSourceAgency() {
        return sourceAgency;
    }

    /**
     * Sets the value of the sourceAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceDestinationType }
     *     
     */
    public void setSourceAgency(SourceDestinationType value) {
        this.sourceAgency = value;
    }

    /**
     * Gets the value of the destinationAgency property.
     * 
     * @return
     *     possible object is
     *     {@link SourceDestinationType }
     *     
     */
    public SourceDestinationType getDestinationAgency() {
        return destinationAgency;
    }

    /**
     * Sets the value of the destinationAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceDestinationType }
     *     
     */
    public void setDestinationAgency(SourceDestinationType value) {
        this.destinationAgency = value;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoteMessage() {
        if (noteMessage == null) {
            noteMessage = new ArrayList<String>();
        }
        return this.noteMessage;
    }

}