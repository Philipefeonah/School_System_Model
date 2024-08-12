package com.stackAssignment03;

import com.stackAssignment03.enums.Class;
import com.stackAssignment03.enums.Gender;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClassRoomTest {
    @Test
    public void addStudent_Success() {
        ClassRoom classroom = new ClassRoom(Class.SCIENCE);
        Student student = new Student("Alice", 101, Gender.FEMALE, 15);

        classroom.addStudent(student);
        List<Student> students = classroom.getStudents();

        assertTrue(students.size() == 1, "Student should be added");
        assertEquals(student, students.get(0), "Added student should match");
    }

    @Test
    public void removeStudent_ExistingStudent_Success() {
        ClassRoom classroom = new ClassRoom(Class.ART);

        Student student = new Student("Bob", 102, Gender.MALE, 13);

        classroom.addStudent(student);
        classroom.removeStudent(student);

        List<Student> students = classroom.getStudents();
        assertTrue(students.isEmpty(), "Student should be removed");
    }

    @Test
    public void removeStudent_NonExistingStudent_Failure() {
        ClassRoom classroom = new ClassRoom(Class.COMMERCIAL);
        Student student = new Student("Alice", 101, Gender.FEMALE, 12);

        classroom.removeStudent(student);
        List<Student> students = classroom.getStudents();

        assertTrue(students.isEmpty(), "No student should be removed as they were not added");
    }

}