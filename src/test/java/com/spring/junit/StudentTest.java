package com.spring.junit;

import org.junit.jupiter.api.*;

class StudentTest {

    @Test
    void testing(){
        Student student = new Student();
        Assertions.assertAll
                ("Student Data",
                    () -> Assertions.assertEquals(student.getName(),"Eslam","Name not Matches"),
                    () -> Assertions.assertEquals(student.getAge(),"20","Age  not Matches")
                );
    }

}

/*

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
* */