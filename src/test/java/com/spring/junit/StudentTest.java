package com.spring.junit;

import org.assertj.core.api.Assertions;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.springframework.test.annotation.Repeat;

@Tag("student")
class StudentTest {

    @Test
    @DisplayName("Hi Function")
    @RepeatedTest(value = 5,name = "{displayName} : {currentRepetition} | {totalRepetitions}")
    void myTest(){
        System.out.println("HI");
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


    @BeforeEach
    void setUp() {
        System.out.println("Out");
    }

    @Test
    void newTest(){
        Student student = new Student();
        //Assertions.assertThat(student.getName()).isEqualTo("Eslamm");
        //Assertions.assertTrue("Eslam".equalsIgnoreCase("ESLAML"));
        MatcherAssert.assertThat(student.getName(), Matchers.is("Eslam"));
    }

    @Nested
    class nestedStudent {

        @BeforeEach
        void setUp() {
            System.out.println("In");
        }

        @Test
        void nestedTest(){
            Student student = new Student();
            Assertions.assertThat(student.getName()).isEqualTo("Eslam");
        }
    }
* */