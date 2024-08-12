package com.stackAssignment03;

import com.stackAssignment03.enums.Gender;

public abstract class Person {
    private String name;
    private int id;
    private Gender gender;
    private int age;

    public Person(String name, int id, Gender gender, int age) {
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
