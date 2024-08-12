package com.stackAssignment03;

import com.stackAssignment03.enums.Course;
import com.stackAssignment03.enums.Gender;
import com.stackAssignment03.enums.Role;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ifeoma", 101, Gender.FEMALE,14);
        student1.addCourse(Course.MATHEMATICS);
        student1.addCourse(Course.CHEMISTRY);
        student1.canTakeCourse(Course.CHEMISTRY);
        Student student2 = new Student("Maximillian", 102, Gender.MALE, 16);
        Student student3 = new Student("JohnMary", 102, Gender.MALE, 15);
        Student student4 = new Student("MaryJane", 102, Gender.FEMALE, 13);
        Student student5 = new Student("Damilola", 102, Gender.FEMALE,12);

//
//        Applicant applicant1 = new Applicant("Doris Jane", 15, Gender.FEMALE);
//        Applicant applicant2 = new Applicant("Mark John", 13, Gender.MALE);


//        Teacher teacher =new Teacher("Mason John", 789, Gender.MALE, 200_000);
//        teacher.addCourse(Course.MATHEMATICS);
//        teacher.addCourse(Course.CHEMISTRY);
//        teacher.addCourse(Course.CHEMISTRY);
//        teacher.addCourse(Course.PHYSICS);
//
//        teacher.canTeachCourse(Course.ENGLISH_LANGUAGE);
//        teacher.canTeachCourse(Course.CHEMISTRY);


//        ClassRoom classRoom = new ClassRoom(Class.SCIENCE);
//        classRoom.addStudent(student1);
//        classRoom.addStudent(student2);
//        classRoom.addStudent(student3);
//        classRoom.addStudent(student4);
//        classRoom.addStudent(student5);
//
//        classRoom.removeStudent(student1);
//        classRoom.displayClass();


        NonAcademicStaff nonAcademicStaff1 = new NonAcademicStaff("Mr Francis", 234, Gender.MALE, 45, 67000);
        nonAcademicStaff1.addRole(Role.CLERK);
        nonAcademicStaff1.addRole(Role.LAB_ATTENDANT);
        nonAcademicStaff1.addRole(Role.CUSTODIAN);
        nonAcademicStaff1.removeRole(Role.CLERK);

        nonAcademicStaff1.displayRoles();






    }
}