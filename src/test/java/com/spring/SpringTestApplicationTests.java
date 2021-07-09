package com.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTestApplicationTests {

    @Test
    void namePlayerTesting1() {
        Player player1 = new Player();
        Player player2 = new Player();
        Assertions.assertEquals(player1.getName("Messi"),player2.getName("Messi"));
    }
    @Test
    void namePlayerTesting2() {
        Player player1 = new Player();
        Player player2 = new Player();
        Assertions.assertEquals(player1.getName("M Salah"),player2.getName("M Salah"));
    }
    @Test
    void namePlayerTesting3() {
        Player player1 = new Player();
        Player player2 = new Player();
        Assertions.assertEquals(player1.getName("CR7"),"CR7");
    }
    @Test
    void namePlayerTesting4() {
        Player player1 = new Player();
        Player player2 = new Player();
        Assertions.assertEquals(player1.getName("Messi"),player2.getName("Messi"));
    }
}
