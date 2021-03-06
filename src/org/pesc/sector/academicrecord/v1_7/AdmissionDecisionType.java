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
import org.pesc.core.coremain.v1_12.AdmissionStatusCodeType;
import org.pesc.core.coremain.v1_12.AdmissionTypeType;
import org.pesc.core.coremain.v1_12.StudentLevelType;


/**
 * Admission Decision Type
 * 
 * <p>Java class for AdmissionDecisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdmissionDecisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademicSession" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}AcademicSessionType" minOccurs="0"/>
 *         &lt;element name="AdmissionStatusCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}AdmissionStatusCodeType" minOccurs="0"/>
 *         &lt;element name="AdmissionStatusDate" type="{urn:org:pesc:core:CoreMain:v1.12.0}AdmissionStatusDateType" minOccurs="0"/>
 *         &lt;element name="AdmissionTypeType" type="{urn:org:pesc:core:CoreMain:v1.12.0}AdmissionTypeType" minOccurs="0"/>
 *         &lt;element name="CohortYear" type="{urn:org:pesc:core:CoreMain:v1.12.0}CohortYearType" minOccurs="0"/>
 *         &lt;element name="StudentLevel" type="{urn:org:pesc:core:CoreMain:v1.12.0}StudentLevelType" minOccurs="0"/>
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
@XmlType(name = "AdmissionDecisionType", propOrder = {
    "academicSession",
    "admissionStatusCode",
    "admissionStatusDate",
    "admissionTypeType",
    "cohortYear",
    "studentLevel",
    "noteMessage"
})
public class AdmissionDecisionType {

    @XmlElement(name = "AcademicSession")
    protected AcademicSessionType academicSession;
    @XmlElement(name = "AdmissionStatusCode")
    protected AdmissionStatusCodeType admissionStatusCode;
    @XmlElement(name = "AdmissionStatusDate")
    protected XMLGregorianCalendar admissionStatusDate;
    @XmlElement(name = "AdmissionTypeType")
    protected AdmissionTypeType admissionTypeType;
    @XmlElement(name = "CohortYear")
    protected XMLGregorianCalendar cohortYear;
    @XmlElement(name = "StudentLevel")
    protected StudentLevelType studentLevel;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the academicSession property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicSessionType }
     *     
     */
    public AcademicSessionType getAcademicSession() {
        return academicSession;
    }

    /**
     * Sets the value of the academicSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicSessionType }
     *     
     */
    public void setAcademicSession(AcademicSessionType value) {
        this.academicSession = value;
    }

    /**
     * Gets the value of the admissionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link AdmissionStatusCodeType }
     *     
     */
    public AdmissionStatusCodeType getAdmissionStatusCode() {
        return admissionStatusCode;
    }

    /**
     * Sets the value of the admissionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdmissionStatusCodeType }
     *     
     */
    public void setAdmissionStatusCode(AdmissionStatusCodeType value) {
        this.admissionStatusCode = value;
    }

    /**
     * Gets the value of the admissionStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdmissionStatusDate() {
        return admissionStatusDate;
    }

    /**
     * Sets the value of the admissionStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdmissionStatusDate(XMLGregorianCalendar value) {
        this.admissionStatusDate = value;
    }

    /**
     * Gets the value of the admissionTypeType property.
     * 
     * @return
     *     possible object is
     *     {@link AdmissionTypeType }
     *     
     */
    public AdmissionTypeType getAdmissionTypeType() {
        return admissionTypeType;
    }

    /**
     * Sets the value of the admissionTypeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdmissionTypeType }
     *     
     */
    public void setAdmissionTypeType(AdmissionTypeType value) {
        this.admissionTypeType = value;
    }

    /**
     * Gets the value of the cohortYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCohortYear() {
        return cohortYear;
    }

    /**
     * Sets the value of the cohortYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCohortYear(XMLGregorianCalendar value) {
        this.cohortYear = value;
    }

    /**
     * Gets the value of the studentLevel property.
     * 
     * @return
     *     possible object is
     *     {@link StudentLevelType }
     *     
     */
    public StudentLevelType getStudentLevel() {
        return studentLevel;
    }

    /**
     * Sets the value of the studentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentLevelType }
     *     
     */
    public void setStudentLevel(StudentLevelType value) {
        this.studentLevel = value;
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
