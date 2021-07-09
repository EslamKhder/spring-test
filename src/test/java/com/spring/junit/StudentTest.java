package com.spring.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class StudentTest {

    private Student student;
    @BeforeAll
    static void beforeAllFunction() {
        System.out.println("@BeforeAll..........");
    }

    @BeforeEach
    void setUpFunction() {
        student = new Student();
        System.out.println("@BeforeEach..........");
    }

    @Test
    void getName() {
        System.out.println(student.getName());
    }

    @Test
    void getAge() {
        System.out.println(student.getAge());
    }
}