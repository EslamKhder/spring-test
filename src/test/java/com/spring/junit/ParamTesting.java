package com.spring.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class ParamTesting {



    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
    //@ValueSource(strings = {"Eslam","Ahmed","Karim","Jo"})
    @EnumSource(Gender.class)
    void myParamTesting1(Gender value){
        System.out.println(value);
    }
    /*
     * name  age  phone
     * Ahmed 21   01235
     * Karim 19   012254
     * Jo   12    0125551
     * */

    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
    @CsvSource({
            "Ahmed ,21, 01235",
            "Karim ,19, 012254",
            "Jo,12,0125551"
    })
    void myParamTesting2(String name,int age, String phone){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("phone: " + phone);
    }

    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
    @CsvFileSource(resources = "/mydata.csv",numLinesToSkip = 1)
    void myParamTesting3(String name,int age, String phone){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("phone: " + phone);
    }

    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
    @MethodSource("getData")
    void myParamTesting4(String name,int age, String phone){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("phone: " + phone);
    }


    static Stream<Arguments> getData(){
        return Stream.of(
                Arguments.of("Ahmed" ,21, "01235"),
                Arguments.of("Karim" ,19, "012254"),
                Arguments.of("Jo" ,17, "0125558")
        );
    }


    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
    @ArgumentsSource(DataArguments.class)
    void myParamTesting5(String name,int age, String phone){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("phone: " + phone);
    }

}
