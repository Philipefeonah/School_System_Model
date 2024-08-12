package com.stackAssignment03;

import com.stackAssignment03.enums.Gender;

public class Staff extends Person {
    private double salary;

    public Staff(String name, int id, Gender gender,int age, double salary) {
        super(name, id, gender, age);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
