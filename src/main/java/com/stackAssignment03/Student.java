package com.stackAssignment03;

import com.stackAssignment03.enums.Course;
import com.stackAssignment03.enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<Course> enrolledCourses;

    public Student(String name, int id, Gender gender, int age) {
        super(name, id, gender, age);
        enrolledCourses = new ArrayList<>();
    }


    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void addCourse(Course course){
        if(!enrolledCourses.contains(course)){
            enrolledCourses.add(course);
            System.out.println(getName() + " has successfully registered for " + course.name() + " course.");
        }else {
            System.out.println(getName() + " has already registered for " +course.name() + " course");
            System.out.println();
        }
    }

    public void canTakeCourse(Course course){
        if(enrolledCourses.contains(course))
            System.out.println(getName() + " with ID #" +getId() + " is qualified to take the course");
        else
            System.out.println(getName() + " with ID #" + getId() + " can not take this course!!");
    }

}
