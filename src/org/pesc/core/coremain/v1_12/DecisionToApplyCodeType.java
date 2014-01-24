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
 * <p>Java class for DecisionToApplyCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DecisionToApplyCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alumni"/>
 *     &lt;enumeration value="CampusEvent"/>
 *     &lt;enumeration value="CampusVisit"/>
 *     &lt;enumeration value="ClassmateCollege"/>
 *     &lt;enumeration value="ClassmateHighSchool"/>
 *     &lt;enumeration value="CollegeFair"/>
 *     &lt;enumeration value="CollegeProfessor"/>
 *     &lt;enumeration value="CoWorker"/>
 *     &lt;enumeration value="Friend"/>
 *     &lt;enumeration value="GuidanceCounselor"/>
 *     &lt;enumeration value="HumanResourceDepartment"/>
 *     &lt;enumeration value="IndependentCounselor"/>
 *     &lt;enumeration value="InformationEvent"/>
 *     &lt;enumeration value="InstitutionCorrespondence"/>
 *     &lt;enumeration value="InstitutionReputation"/>
 *     &lt;enumeration value="Internet"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="MastersBusinessAdministrationForum"/>
 *     &lt;enumeration value="Media"/>
 *     &lt;enumeration value="MediaRanking"/>
 *     &lt;enumeration value="OffCampusEvent"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PlacementDepartment"/>
 *     &lt;enumeration value="Recruiter"/>
 *     &lt;enumeration value="Relative"/>
 *     &lt;enumeration value="Supervisor"/>
 *     &lt;enumeration value="Tuition"/>
 *     &lt;enumeration value="VisitToHighSchool"/>
 *     &lt;enumeration value="WebSite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DecisionToApplyCodeType")
@XmlEnum
public enum DecisionToApplyCodeType {

    @XmlEnumValue("Alumni")
    ALUMNI("Alumni"),
    @XmlEnumValue("CampusEvent")
    CAMPUS_EVENT("CampusEvent"),
    @XmlEnumValue("CampusVisit")
    CAMPUS_VISIT("CampusVisit"),
    @XmlEnumValue("ClassmateCollege")
    CLASSMATE_COLLEGE("ClassmateCollege"),
    @XmlEnumValue("ClassmateHighSchool")
    CLASSMATE_HIGH_SCHOOL("ClassmateHighSchool"),
    @XmlEnumValue("CollegeFair")
    COLLEGE_FAIR("CollegeFair"),
    @XmlEnumValue("CollegeProfessor")
    COLLEGE_PROFESSOR("CollegeProfessor"),
    @XmlEnumValue("CoWorker")
    CO_WORKER("CoWorker"),
    @XmlEnumValue("Friend")
    FRIEND("Friend"),
    @XmlEnumValue("GuidanceCounselor")
    GUIDANCE_COUNSELOR("GuidanceCounselor"),
    @XmlEnumValue("HumanResourceDepartment")
    HUMAN_RESOURCE_DEPARTMENT("HumanResourceDepartment"),
    @XmlEnumValue("IndependentCounselor")
    INDEPENDENT_COUNSELOR("IndependentCounselor"),
    @XmlEnumValue("InformationEvent")
    INFORMATION_EVENT("InformationEvent"),
    @XmlEnumValue("InstitutionCorrespondence")
    INSTITUTION_CORRESPONDENCE("InstitutionCorrespondence"),
    @XmlEnumValue("InstitutionReputation")
    INSTITUTION_REPUTATION("InstitutionReputation"),
    @XmlEnumValue("Internet")
    INTERNET("Internet"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("MastersBusinessAdministrationForum")
    MASTERS_BUSINESS_ADMINISTRATION_FORUM("MastersBusinessAdministrationForum"),
    @XmlEnumValue("Media")
    MEDIA("Media"),
    @XmlEnumValue("MediaRanking")
    MEDIA_RANKING("MediaRanking"),
    @XmlEnumValue("OffCampusEvent")
    OFF_CAMPUS_EVENT("OffCampusEvent"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PlacementDepartment")
    PLACEMENT_DEPARTMENT("PlacementDepartment"),
    @XmlEnumValue("Recruiter")
    RECRUITER("Recruiter"),
    @XmlEnumValue("Relative")
    RELATIVE("Relative"),
    @XmlEnumValue("Supervisor")
    SUPERVISOR("Supervisor"),
    @XmlEnumValue("Tuition")
    TUITION("Tuition"),
    @XmlEnumValue("VisitToHighSchool")
    VISIT_TO_HIGH_SCHOOL("VisitToHighSchool"),
    @XmlEnumValue("WebSite")
    WEB_SITE("WebSite");
    private final String value;

    DecisionToApplyCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DecisionToApplyCodeType fromValue(String v) {
        for (DecisionToApplyCodeType c: DecisionToApplyCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}