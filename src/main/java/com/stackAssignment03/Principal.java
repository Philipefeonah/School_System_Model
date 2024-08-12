package com.stackAssignment03;

import com.stackAssignment03.enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Principal extends Staff{

    public List<Student> enrolledStudents;
    private static final AtomicInteger newStudentId = new AtomicInteger(201);

    public Principal(String name, int id, Gender gender, int age, double salary) {
        super(name, id, gender, age, salary);
        enrolledStudents = new ArrayList<>();
    }


    public void admitApplicant(Applicant applicant){
        if(applicant.getAge() >= 10 && applicant.getAge() <= 18){
            Student student = new Student(applicant.getName(), generateStudentId(), applicant.getGender(), getAge());
            enrolledStudents.add(student);
            System.out.println("\nApplicant successfully added!!");
            System.out.println("\nApplicant Details: \n" + "Name: " + student.getName() + "\n" + "Student ID: " + student.getId());
        }else
            System.out.println("\nApplicant: " + applicant.getName() + "with Age: " + applicant.getAge() + " is not eligible for admission");
    }


    public void expelStudent(Student student){

        if(enrolledStudents.contains(student)){
            enrolledStudents.remove(student);
            System.out.println("\nStudent: " + student.getName() + " with ID#" + student.getId() + " has been expelled.");
        }else
            System.out.println("\nStudent Name: " + student.getName() + " with ID: " + student.getId() + " is NOT a student.");
    }


    public void addStudent(Student student){
        if(enrolledStudents.contains(student))
            return;
        else
            enrolledStudents.add(student);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public int generateStudentId(){
        return newStudentId.getAndIncrement();
    }
}
