package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois n�meros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}
	
	@Test
	public void testSubtracaoDoisNumeros() {
		int subtracao = calc.subtracao(5, 4);		
		Assertions.assertEquals(1, subtracao);		
	}
	
	@Test
	public void testMultiplicacaoDoisNumeros() {
		int multiplicacao = calc.multiplicacao(4, 5);		
		Assertions.assertEquals(20, multiplicacao);		
	}
	
	@Test
	public void somatoria() {
		int somatoria = calc.somatoria(2);		
		Assertions.assertEquals(3, somatoria);		
	}
	
	@Test
	public void testComparaIguais() {
		int compara = calc.compara(4, 4);		
		Assertions.assertEquals(0, compara);		
	}

	@Test
	public void testComparaMaior() {
		int compara = calc.compara(5, 4);		
		Assertions.assertEquals(1, compara);		
	}
	
	@Test
	public void testComparaMenor() {
		int compara = calc.compara(4, 5);		
		Assertions.assertEquals(-1, compara);		
	}


}
