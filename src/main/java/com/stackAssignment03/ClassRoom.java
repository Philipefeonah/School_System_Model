package com.stackAssignment03;

import com.stackAssignment03.enums.Class;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private Class className;
    List<Student> students;


    public List<Student> getStudents() {
        return students;
    }

    public ClassRoom(Class className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println("\n"+student.getName() + " with ID #" + student.getId() + " has been added to the " + className + " class.");
    }

    public void removeStudent(Student student){
        if(students.contains(student)){
            students.remove(student);
            System.out.println(student.getName() + " has been removed from the " + className);
        }else
            System.out.println(student.getName() + " is not registered in this class");
    }

    public void displayClass(){
        if(students.isEmpty())
            System.out.println(className.name() + " currently does not contain any student.");
        else {
            System.out.println("Students in Class " + className.name() + ": ");
            int i = 1;
            for(Student student : students){
                System.out.println(i + ". " + student.getName());
                i++;
            }
        }
    }

}
