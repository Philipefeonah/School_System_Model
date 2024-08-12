package com.stackAssignment03;

import com.stackAssignment03.enums.Course;
import com.stackAssignment03.enums.Gender;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void addCourse_Success() {
        Student student = new Student("Doris", 101, Gender.FEMALE, 13);

        Course course = Course.MATHEMATICS;

        student.addCourse(course);

        List<Course> enrolledCourses = student.getEnrolledCourses();

        assertEquals(1, enrolledCourses.size(), "Course should be added");
        assertEquals(course, enrolledCourses.get(0), "Enrolled course should match");
    }

    @Test
    void addCourse_AlreadyEnrolled_Failure() {
        Student student = new Student("Bob", 102, Gender.MALE, 14);

        Course course = Course.MATHEMATICS;

        student.addCourse(course);
        student.addCourse(course);

        List<Course> enrolledCourses = student.getEnrolledCourses();
        assertTrue(enrolledCourses.size() == 1, "Course should not be added again");
    }

    @Test
    void canTakeCourse_Enrolled_Success() {
        Student student = new Student("Alice", 101, Gender.FEMALE, 14);

        Course course = Course.MATHEMATICS;

        student.addCourse(course);
        student.canTakeCourse(course);
    }

    @Test
    void canTakeCourse_NotEnrolled_Failure() {
        Student student = new Student("Bob", 102, Gender.MALE, 15);
        Course course = Course.MATHEMATICS;
        student.canTakeCourse(course);
    }
}
