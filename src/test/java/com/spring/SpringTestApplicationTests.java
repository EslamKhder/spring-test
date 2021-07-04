package com.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTestApplicationTests {

    @Test
    void namePlayerTesting() {
        Player player1 = new Player();
        Player player2 = new Player();
        //Assertions.assertEquals(player.getName("Terka"),null);
        Assertions.assertEquals(player1.getName("Messi"),player2.getName("eslam"));
    }

}
