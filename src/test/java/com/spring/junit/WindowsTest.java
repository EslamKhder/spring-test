package com.spring.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class WindowsTest {

    @Test
    @EnabledOnOs(OS.MAC)
    void mac(){
        System.out.println("MAC..............");
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void windows(){
        System.out.println("WINDOWS..............");
    }
    @EnabledOnOs(OS.LINUX)
    @Test
    void Linux(){
        System.out.println("LINUX..............");
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void version8(){
        System.out.println("Java 8....................");
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void version11(){
        System.out.println("Java 11....................");
    }

    @EnabledIfEnvironmentVariable(named = "USERNAME",matches = "Eslam Khder")
    @Test
    void userName1(){
        System.out.println("Eslam.........");
    }

    @EnabledIfEnvironmentVariable(named = "USERNAME",matches = "Ahmed Mohamed")
    @Test
    void userName2(){
        System.out.println("Ahmed.........");
    }
}
