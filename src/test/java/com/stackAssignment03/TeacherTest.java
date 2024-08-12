package com.stackAssignment03;

import com.stackAssignment03.enums.Course;
import com.stackAssignment03.enums.Gender;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void addCourse_Success() {
        Teacher teacher = new Teacher("John Doe", 201, Gender.MALE, 23, 56000);

        Course course = Course.PHYSICS;
        teacher.addCourse(course);

        List<Course> courseList = teacher.getCourseList();

        assertTrue(courseList.size() == 1, "Course should be added");
        assertEquals(course, courseList.get(0), "Added course should match");
    }

    @Test
    void addCourse_AlreadyAdded_Failure() {
        Teacher teacher = new Teacher("Jane Smith", 202, Gender.FEMALE, 30, 54000);

        Course course = Course.PHYSICS;
        teacher.addCourse(course);
        teacher.addCourse(course);

        List<Course> courseList = teacher.getCourseList();
        assertEquals(1, courseList.size(), "Course should not be added again");
    }

    @Test
    void canTeachCourse_Enrolled_Success() {
        Teacher teacher = new Teacher("John Doe", 201, Gender.MALE, 30, 50000);

        Course course = Course.ENGLISH_LANGUAGE;
        teacher.addCourse(course);
        teacher.canTeachCourse(course);
    }

    @Test
    void canTeachCourse_NotEnrolled_Failure() {
        Teacher teacher = new Teacher("Jane Smith", 202, Gender.FEMALE, 55, 400000);
        Course course = Course.ENGLISH_LANGUAGE;
        teacher.canTeachCourse(course);
    }

}