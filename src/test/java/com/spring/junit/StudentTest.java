package com.spring.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void findById() {
        System.out.println("Student 3333");
        Student student = new Student();
        Assertions.assertEquals(student.findById(1), null);
    }
}