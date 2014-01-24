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
import org.pesc.core.coremain.v1_12.LocalOrganizationIDType;
import org.pesc.core.coremain.v1_12.SchoolLevelType;
import org.pesc.core.coremain.v1_12.SchoolOverrideCodeType;


/**
 * <p>Java class for SchoolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationName" type="{urn:org:pesc:core:CoreMain:v1.12.0}OrganizationNameType"/>
 *         &lt;group ref="{urn:org:pesc:core:CoreMain:v1.12.0}OrganizationIDMultiChoiceGroup"/>
 *         &lt;element name="LocalOrganizationID" type="{urn:org:pesc:core:CoreMain:v1.12.0}LocalOrganizationIDType" minOccurs="0"/>
 *         &lt;element name="SchoolOverrideCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}SchoolOverrideCodeType" minOccurs="0"/>
 *         &lt;element name="SchoolLevel" type="{urn:org:pesc:core:CoreMain:v1.12.0}SchoolLevelType" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}ContactsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SchoolType", propOrder = {
    "organizationName",
    "opeid",
    "nchelpid",
    "ipeds",
    "atp",
    "fice",
    "act",
    "ccd",
    "pss",
    "ceebact",
    "csis",
    "usis",
    "esis",
    "psis",
    "duns",
    "mutuallyDefined",
    "localOrganizationID",
    "schoolOverrideCode",
    "schoolLevel",
    "contacts",
    "noteMessage"
})
public class SchoolType {

    @XmlElement(name = "OrganizationName", required = true)
    protected String organizationName;
    @XmlElement(name = "OPEID")
    protected String opeid;
    @XmlElement(name = "NCHELPID")
    protected String nchelpid;
    @XmlElement(name = "IPEDS")
    protected String ipeds;
    @XmlElement(name = "ATP")
    protected String atp;
    @XmlElement(name = "FICE")
    protected String fice;
    @XmlElement(name = "ACT")
    protected String act;
    @XmlElement(name = "CCD")
    protected String ccd;
    @XmlElement(name = "PSS")
    protected String pss;
    @XmlElement(name = "CEEBACT")
    protected String ceebact;
    @XmlElement(name = "CSIS")
    protected String csis;
    @XmlElement(name = "USIS")
    protected String usis;
    @XmlElement(name = "ESIS")
    protected String esis;
    @XmlElement(name = "PSIS")
    protected String psis;
    @XmlElement(name = "DUNS")
    protected String duns;
    @XmlElement(name = "MutuallyDefined")
    protected String mutuallyDefined;
    @XmlElement(name = "LocalOrganizationID")
    protected LocalOrganizationIDType localOrganizationID;
    @XmlElement(name = "SchoolOverrideCode")
    protected SchoolOverrideCodeType schoolOverrideCode;
    @XmlElement(name = "SchoolLevel")
    protected SchoolLevelType schoolLevel;
    @XmlElement(name = "Contacts")
    protected List<ContactsType> contacts;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the opeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPEID() {
        return opeid;
    }

    /**
     * Sets the value of the opeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPEID(String value) {
        this.opeid = value;
    }

    /**
     * Gets the value of the nchelpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCHELPID() {
        return nchelpid;
    }

    /**
     * Sets the value of the nchelpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCHELPID(String value) {
        this.nchelpid = value;
    }

    /**
     * Gets the value of the ipeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPEDS() {
        return ipeds;
    }

    /**
     * Sets the value of the ipeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPEDS(String value) {
        this.ipeds = value;
    }

    /**
     * Gets the value of the atp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATP() {
        return atp;
    }

    /**
     * Sets the value of the atp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATP(String value) {
        this.atp = value;
    }

    /**
     * Gets the value of the fice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFICE() {
        return fice;
    }

    /**
     * Sets the value of the fice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFICE(String value) {
        this.fice = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACT() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACT(String value) {
        this.act = value;
    }

    /**
     * Gets the value of the ccd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCD() {
        return ccd;
    }

    /**
     * Sets the value of the ccd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCD(String value) {
        this.ccd = value;
    }

    /**
     * Gets the value of the pss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSS() {
        return pss;
    }

    /**
     * Sets the value of the pss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSS(String value) {
        this.pss = value;
    }

    /**
     * Gets the value of the ceebact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEEBACT() {
        return ceebact;
    }

    /**
     * Sets the value of the ceebact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEEBACT(String value) {
        this.ceebact = value;
    }

    /**
     * Gets the value of the csis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSIS() {
        return csis;
    }

    /**
     * Sets the value of the csis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSIS(String value) {
        this.csis = value;
    }

    /**
     * Gets the value of the usis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSIS() {
        return usis;
    }

    /**
     * Sets the value of the usis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSIS(String value) {
        this.usis = value;
    }

    /**
     * Gets the value of the esis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESIS() {
        return esis;
    }

    /**
     * Sets the value of the esis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESIS(String value) {
        this.esis = value;
    }

    /**
     * Gets the value of the psis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSIS() {
        return psis;
    }

    /**
     * Sets the value of the psis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSIS(String value) {
        this.psis = value;
    }

    /**
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNS() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNS(String value) {
        this.duns = value;
    }

    /**
     * Gets the value of the mutuallyDefined property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMutuallyDefined() {
        return mutuallyDefined;
    }

    /**
     * Sets the value of the mutuallyDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMutuallyDefined(String value) {
        this.mutuallyDefined = value;
    }

    /**
     * Gets the value of the localOrganizationID property.
     * 
     * @return
     *     possible object is
     *     {@link LocalOrganizationIDType }
     *     
     */
    public LocalOrganizationIDType getLocalOrganizationID() {
        return localOrganizationID;
    }

    /**
     * Sets the value of the localOrganizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalOrganizationIDType }
     *     
     */
    public void setLocalOrganizationID(LocalOrganizationIDType value) {
        this.localOrganizationID = value;
    }

    /**
     * Gets the value of the schoolOverrideCode property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolOverrideCodeType }
     *     
     */
    public SchoolOverrideCodeType getSchoolOverrideCode() {
        return schoolOverrideCode;
    }

    /**
     * Sets the value of the schoolOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolOverrideCodeType }
     *     
     */
    public void setSchoolOverrideCode(SchoolOverrideCodeType value) {
        this.schoolOverrideCode = value;
    }

    /**
     * Gets the value of the schoolLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolLevelType }
     *     
     */
    public SchoolLevelType getSchoolLevel() {
        return schoolLevel;
    }

    /**
     * Sets the value of the schoolLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolLevelType }
     *     
     */
    public void setSchoolLevel(SchoolLevelType value) {
        this.schoolLevel = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactsType }
     * 
     * 
     */
    public List<ContactsType> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<ContactsType>();
        }
        return this.contacts;
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