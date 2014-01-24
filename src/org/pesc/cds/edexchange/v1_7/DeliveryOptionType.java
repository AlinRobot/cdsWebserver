//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.cds.edexchange.v1_7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_12.URLType;
import org.pesc.core.coremain.v1_12.UserDefinedExtensionsType;
import org.pesc.sector.academicrecord.v1_7.SourceDestinationType;


/**
 * 
 *         Type for Delivery Options for those Vendors and Institutions interested in providing a
 *         service to send a payload (transcripts or other data) from one Institution/Vendor
 *         to another Institution/Vendor..
 *       
 * 
 * <p>Java class for DeliveryOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationOrganization" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}SourceDestinationType" maxOccurs="unbounded"/>
 *         &lt;element name="WebserviceURL" type="{urn:org:pesc:core:CoreMain:v1.12.0}URLType"/>
 *         &lt;element name="ContentCode" type="{urn:xmlns:EdExchange:v1.0.7}ContentCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CostAmount" type="{urn:org:pesc:core:CoreMain:v1.12.0}SmallCurrencyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpeedCode" type="{urn:xmlns:EdExchange:v1.0.7}SpeedCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeliveryConfirmationFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ErrorHandlingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RoleCode" type="{urn:xmlns:EdExchange:v1.0.7}RoleCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NoteMessageText" type="{urn:org:pesc:core:CoreMain:v1.12.0}NoteMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserDefinedExtensionsText" type="{urn:org:pesc:core:CoreMain:v1.12.0}UserDefinedExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryOptionType", propOrder = {
    "destinationOrganization",
    "webserviceURL",
    "contentCode",
    "costAmount",
    "speedCode",
    "deliveryConfirmationFlag",
    "errorHandlingIndicator",
    "roleCode",
    "noteMessageText",
    "userDefinedExtensionsText"
})
public class DeliveryOptionType {

    @XmlElement(name = "DestinationOrganization", required = true)
    protected List<SourceDestinationType> destinationOrganization;
    @XmlElement(name = "WebserviceURL", required = true)
    protected URLType webserviceURL;
    @XmlElement(name = "ContentCode")
    protected List<ContentCodeType> contentCode;
    @XmlElement(name = "CostAmount")
    protected List<BigDecimal> costAmount;
    @XmlElement(name = "SpeedCode")
    protected List<SpeedCodeType> speedCode;
    @XmlElement(name = "DeliveryConfirmationFlag")
    protected Boolean deliveryConfirmationFlag;
    @XmlElement(name = "ErrorHandlingIndicator")
    protected Boolean errorHandlingIndicator;
    @XmlElement(name = "RoleCode")
    protected List<RoleCodeType> roleCode;
    @XmlElement(name = "NoteMessageText")
    protected List<String> noteMessageText;
    @XmlElement(name = "UserDefinedExtensionsText")
    protected UserDefinedExtensionsType userDefinedExtensionsText;

    /**
     * Gets the value of the destinationOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceDestinationType }
     * 
     * 
     */
    public List<SourceDestinationType> getDestinationOrganization() {
        if (destinationOrganization == null) {
            destinationOrganization = new ArrayList<SourceDestinationType>();
        }
        return this.destinationOrganization;
    }

    /**
     * Gets the value of the webserviceURL property.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getWebserviceURL() {
        return webserviceURL;
    }

    /**
     * Sets the value of the webserviceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setWebserviceURL(URLType value) {
        this.webserviceURL = value;
    }

    /**
     * Gets the value of the contentCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentCodeType }
     * 
     * 
     */
    public List<ContentCodeType> getContentCode() {
        if (contentCode == null) {
            contentCode = new ArrayList<ContentCodeType>();
        }
        return this.contentCode;
    }

    /**
     * Gets the value of the costAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getCostAmount() {
        if (costAmount == null) {
            costAmount = new ArrayList<BigDecimal>();
        }
        return this.costAmount;
    }

    /**
     * Gets the value of the speedCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speedCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeedCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpeedCodeType }
     * 
     * 
     */
    public List<SpeedCodeType> getSpeedCode() {
        if (speedCode == null) {
            speedCode = new ArrayList<SpeedCodeType>();
        }
        return this.speedCode;
    }

    /**
     * Gets the value of the deliveryConfirmationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryConfirmationFlag() {
        return deliveryConfirmationFlag;
    }

    /**
     * Sets the value of the deliveryConfirmationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryConfirmationFlag(Boolean value) {
        this.deliveryConfirmationFlag = value;
    }

    /**
     * Gets the value of the errorHandlingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorHandlingIndicator() {
        return errorHandlingIndicator;
    }

    /**
     * Sets the value of the errorHandlingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorHandlingIndicator(Boolean value) {
        this.errorHandlingIndicator = value;
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleCodeType }
     * 
     * 
     */
    public List<RoleCodeType> getRoleCode() {
        if (roleCode == null) {
            roleCode = new ArrayList<RoleCodeType>();
        }
        return this.roleCode;
    }

    /**
     * Gets the value of the noteMessageText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteMessageText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteMessageText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoteMessageText() {
        if (noteMessageText == null) {
            noteMessageText = new ArrayList<String>();
        }
        return this.noteMessageText;
    }

    /**
     * Gets the value of the userDefinedExtensionsText property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public UserDefinedExtensionsType getUserDefinedExtensionsText() {
        return userDefinedExtensionsText;
    }

    /**
     * Sets the value of the userDefinedExtensionsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public void setUserDefinedExtensionsText(UserDefinedExtensionsType value) {
        this.userDefinedExtensionsText = value;
    }

}