package com.f1soft.rest.pojoClasses;

import java.util.List;

/**
 *
 * @author sadhana.dahal
 */
public class StudentPojo {

    private String name;
    private String studentClass;
    private String rollNo;
    private String section;
    private String address;
    private String fathername;
    private String motherName;
    private List<SubjectEnrolledPojo> subjectEnrolledPojoList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public List<SubjectEnrolledPojo> getSubjectEnrolledPojoList() {
        return subjectEnrolledPojoList;
    }

    public void setSubjectEnrolledPojoList(List<SubjectEnrolledPojo> subjectEnrolledPojoList) {
        this.subjectEnrolledPojoList = subjectEnrolledPojoList;
    }

}
