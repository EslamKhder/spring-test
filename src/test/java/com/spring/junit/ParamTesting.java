package com.spring.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTesting {


    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
    //@ValueSource(strings = {"Eslam","Ahmed","Karim","Jo"})
    @EnumSource(Gender.class)
    void myParamTesting(Gender value){
        System.out.println(value);
    }
}
