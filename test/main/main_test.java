package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class main_test {
	@Test
    public void testEmpate() {
        main jogo = new main();
        
        assertEquals(0, jogo.jogar(1, 1)); 
        assertEquals(0, jogo.jogar(2, 2)); 
        assertEquals(0, jogo.jogar(3, 3));
    }
	
	
	@Test
    public void testJogador1Vence() {
        main jogo = new main(); 
        assertEquals(1, jogo.jogar(1, 2));
        assertEquals(1, jogo.jogar(2, 3)); 
        assertEquals(1, jogo.jogar(3, 1)); 
    }

    @Test
    public void testJogador2Vence() {
        main jogo = new main();
        assertEquals(2, jogo.jogar(2, 1));
        assertEquals(2, jogo.jogar(3, 2));
        assertEquals(2, jogo.jogar(1, 3)); 
    }

}
