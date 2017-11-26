package com.f1soft.rest.utilities;

import com.f1soft.rest.pojoClasses.StudentPojo;
import com.f1soft.rest.pojoClasses.SubjectEnrolledPojo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sadhana.dahal
 */
public class StudentInfoUtils {

    public static StudentPojo setStudentInfo() {
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setAddress("Biratnagar");
        studentPojo.setFathername("Ram Bahadur Shrestha");
        studentPojo.setMotherName("Laxmi Kumari Shrestha");
        studentPojo.setName("Asmita Shrestha");
        studentPojo.setRollNo("12");
        studentPojo.setSection("A");
        studentPojo.setStudentClass("Nursery");

        List<SubjectEnrolledPojo> subjectEnrolledPojos = new ArrayList<>();
        SubjectEnrolledPojo subjectEnrolledPojo = new SubjectEnrolledPojo();
        subjectEnrolledPojo.setSubjectName("Alphabets");
        subjectEnrolledPojo.setSubjectTeacher("Sadhana Dahal");
        subjectEnrolledPojos.add(subjectEnrolledPojo);

        SubjectEnrolledPojo subjectEnrolledPojo1 = new SubjectEnrolledPojo();
        subjectEnrolledPojo1.setSubjectName("Nepali Akshar");
        subjectEnrolledPojo1.setSubjectTeacher("Prashant Adhikari");
        subjectEnrolledPojos.add(subjectEnrolledPojo1);

        SubjectEnrolledPojo subjectEnrolledPojo2 = new SubjectEnrolledPojo();
        subjectEnrolledPojo2.setSubjectName("Numbers");
        subjectEnrolledPojo2.setSubjectTeacher("Chandra Giri");
        subjectEnrolledPojos.add(subjectEnrolledPojo2);

        SubjectEnrolledPojo subjectEnrolledPojo3 = new SubjectEnrolledPojo();
        subjectEnrolledPojo3.setSubjectName("Rhyme");
        subjectEnrolledPojo3.setSubjectTeacher("Jikesh Prajapati");
        subjectEnrolledPojos.add(subjectEnrolledPojo3);
        
        studentPojo.setSubjectEnrolledPojoList(subjectEnrolledPojos);
        return studentPojo;
    }
}
