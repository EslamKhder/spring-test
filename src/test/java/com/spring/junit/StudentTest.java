package com.spring.junit;

import org.junit.jupiter.api.*;

class StudentTest {

    private Student student;

    @BeforeEach
    void setUpFunction() {
        student = new Student();
    }

    @Test
    void getName() {
        //Assertions.assertEquals(student.getName(),"eslam","Name not Matches");
        Assertions.assertTrue("eslam".equals(student.getName()),() -> "Name not Matches");
    }

    @Test
    void getAge() {
        //Assertions.assertEquals(student.getAge(),"22","Age not Matches");
        Assertions.assertTrue("22".equals(student.getAge()),() -> "Age not Matches");
    }

}