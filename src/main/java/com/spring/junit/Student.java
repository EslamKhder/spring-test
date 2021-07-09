package com.spring.junit;

public class Student {

    private static String name = "Eslam";
    private static int age = 21;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Student.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Student.age = age;
    }
}
