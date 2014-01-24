//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.core.coremain.v1_12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchoolAcademicLoadCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SchoolAcademicLoadCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FullTime"/>
 *     &lt;enumeration value="PartTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SchoolAcademicLoadCodeType")
@XmlEnum
public enum SchoolAcademicLoadCodeType {

    @XmlEnumValue("FullTime")
    FULL_TIME("FullTime"),
    @XmlEnumValue("PartTime")
    PART_TIME("PartTime");
    private final String value;

    SchoolAcademicLoadCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchoolAcademicLoadCodeType fromValue(String v) {
        for (SchoolAcademicLoadCodeType c: SchoolAcademicLoadCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}