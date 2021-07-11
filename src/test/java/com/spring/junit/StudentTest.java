package com.spring.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.MissingFormatArgumentException;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void newTest(){
        Assertions.assertTrue("Eslam".equalsIgnoreCase("ESLAML"));
    }

}
/*
@Test
    @DisplayName("Test Student By Id")
    void findById() {
        Student student = new Student();
        //Assertions.assertEquals(student.findById(1), null);
        Assertions.assertThrows(MissingFormatArgumentException.class,
                () -> student.getException());
    }
* */