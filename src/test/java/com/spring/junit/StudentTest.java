package com.spring.junit;

import org.junit.jupiter.api.*;


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


    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach................");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll................");
    }
}