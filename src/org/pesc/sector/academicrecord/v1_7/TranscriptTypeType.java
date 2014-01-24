//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.sector.academicrecord.v1_7;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranscriptTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TranscriptTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undergraduate"/>
 *     &lt;enumeration value="Law"/>
 *     &lt;enumeration value="Dental"/>
 *     &lt;enumeration value="Pharmacy"/>
 *     &lt;enumeration value="Medical"/>
 *     &lt;enumeration value="Management"/>
 *     &lt;enumeration value="Health"/>
 *     &lt;enumeration value="Graduate"/>
 *     &lt;enumeration value="Complete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TranscriptTypeType")
@XmlEnum
public enum TranscriptTypeType {

    @XmlEnumValue("Undergraduate")
    UNDERGRADUATE("Undergraduate"),
    @XmlEnumValue("Law")
    LAW("Law"),
    @XmlEnumValue("Dental")
    DENTAL("Dental"),
    @XmlEnumValue("Pharmacy")
    PHARMACY("Pharmacy"),
    @XmlEnumValue("Medical")
    MEDICAL("Medical"),
    @XmlEnumValue("Management")
    MANAGEMENT("Management"),
    @XmlEnumValue("Health")
    HEALTH("Health"),
    @XmlEnumValue("Graduate")
    GRADUATE("Graduate"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete");
    private final String value;

    TranscriptTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TranscriptTypeType fromValue(String v) {
        for (TranscriptTypeType c: TranscriptTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}