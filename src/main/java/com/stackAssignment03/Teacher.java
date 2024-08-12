package com.stackAssignment03;

import com.stackAssignment03.enums.Gender;
import com.stackAssignment03.enums.Course;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff{
    private List<Course> courseList;

    public Teacher(String name, int id, Gender gender, int age, double salary) {
        super(name, id, gender, age, salary);
        courseList = new ArrayList<>();
    }

    public List<Course> getCourseList() {
        return courseList;
    }


    public void addCourse(Course course){
        if(courseList.contains(course))
            System.out.println("Course name: " + course.name() + " already exist");
        else {
            courseList.add(course);
            System.out.println("Course name: " + course + " successfully added!");
        }
    }

    public void canTeachCourse(Course course){
        if(courseList.contains(course))
            System.out.println("\nTeacher name: " + getName() + " can teach " + course.name());
        else
            System.out.println("\nTeacher name: " + getName() + " cannot teach " + course.name());
    }

}
