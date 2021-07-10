package com.spring.junit;

import org.junit.jupiter.api.*;

class StudentTest {

    @Test
    void personTest(){
        Person person = new Person();
        /*Assertions.assertAll
                ("Student Data",
                        () -> Assertions.assertEquals(person.getFName(),"Eslam","F Name not Matches"),
                        () -> Assertions.assertEquals(person.getLName(),"Khder","L Name  not Matches"),
                        () -> Assertions.assertEquals(person.getPhone1(),"01113903660","Phone not Matches"),
                        () -> Assertions.assertEquals(person.getPhone2(),"01255582855","Phone  not Matches")
                );*/
        Assertions.assertAll("Person Data",
                () -> Assertions.assertAll
                        ("Person Names",
                                () -> Assertions.assertEquals(person.getFName(),"Eslamm","F Name not Matches"),
                                () -> Assertions.assertEquals(person.getLName(),"Khder","L Name  not Matches")
                        ),
                () -> Assertions.assertAll
                        ("Person Phones",
                                () -> Assertions.assertEquals(person.getPhone1(),"01113903660","Phone not Matches"),
                                () -> Assertions.assertEquals(person.getPhone2(),"012555828555","Phone  not Matches")
                        )
               );
    }
}

/*

@Test
    void testing(){
        Student student = new Student();
        Assertions.assertAll
                ("Student Data",
                    () -> Assertions.assertEquals(student.getName(),"Eslam","Name not Matches"),
                    () -> Assertions.assertEquals(student.getAge(),"20","Age  not Matches")
                );
    }
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