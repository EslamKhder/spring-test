package com.spring.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TimeOut {

    @Test
    void timeOutTest1(){
        Assertions.assertTimeout(Duration.ofMillis(1000),
                    () -> {
                        Thread.sleep(2000);
                        System.out.println("Time Out Testing 1");
                    }
                );
    }

    @Test
    void timeOutTest2(){
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(1000),
                () -> {
                    Thread.sleep(2000);
                    System.out.println("Time Out Testing 2");
                }
        );
    }
}
