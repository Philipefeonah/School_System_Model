package com.stackAssignment03;

import com.stackAssignment03.enums.Gender;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    @Test
    void admitApplicant_ValidAge_Success() {
        Principal principal = new Principal("John Doe", 1, Gender.MALE, 50, 500000);
        Applicant applicant = new Applicant("Alice", 10, Gender.FEMALE, 13);

        principal.admitApplicant(applicant);

        List<Student> enrolledStudents = principal.getEnrolledStudents();
        assertEquals(1, enrolledStudents.size(), "Student should be admitted");
        assertEquals("Alice", enrolledStudents.get(0).getName(), "Name should match");
        assertTrue(enrolledStudents.get(0).getId() >= 201, "Student ID should be generated");
    }

    @Test
    void admitApplicant_InvalidAge_Failure() {
        Principal principal = new Principal("John Doe", 1, Gender.MALE, 45, 600000);
        Applicant applicant = new Applicant("Bob", 8, Gender.MALE, 9); // Age not within the acceptable range

        principal.admitApplicant(applicant);

        List<Student> enrolledStudents = principal.getEnrolledStudents();
        assertTrue(enrolledStudents.isEmpty(), "Student should not be admitted");
    }

    @Test
    void expelStudent_ExistingStudent_Success() {
        Principal principal = new Principal("John Doe", 1, Gender.MALE, 40, 350000);
        Applicant applicant = new Applicant("Alice", 12, Gender.FEMALE, 15);
        principal.admitApplicant(applicant);

        Student student = principal.getEnrolledStudents().get(0);
        principal.expelStudent(student);

        List<Student> enrolledStudents = principal.getEnrolledStudents();
        assertTrue(enrolledStudents.isEmpty(), "Student should be expelled");
    }

    @Test
    void expelStudent_NonExistingStudent_Failure() {
        Principal principal = new Principal("John Doe", 1, Gender.MALE, 56, 700000);
        Student student = new Student("Bob", 205, Gender.MALE, 16);

        principal.expelStudent(student);

        List<Student> enrolledStudents = principal.getEnrolledStudents();
        assertTrue(enrolledStudents.isEmpty(), "No student should be expelled as they were never admitted");
    }

    @Test
    void generateStudentId_Incremental_Success() {
        Principal principal = new Principal("John Doe", 1, Gender.MALE, 35, 750000);

        int studentId1 = principal.generateStudentId();
        int studentId2 = principal.generateStudentId();

        assertTrue(studentId2 > studentId1, "Student ID should be incremented");
    }
}
