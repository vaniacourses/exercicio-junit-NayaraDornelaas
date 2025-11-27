package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste de Mutação Manual da Calculadora")
public class CalculadoraMutantesTest {

    @Test
    public void testarMutantesDaSoma() {

        // Mutante 1 – soma virando subtração
        CalculadoraMutantes.Mutante1 m1 = new CalculadoraMutantes.Mutante1();
        int res1 = m1.soma(4, 5);
        assertNotEquals(9, res1, "Mutante1 deveria ser morto — soma virou subtração");

        // Mutante 2 – soma virando multiplicação
        CalculadoraMutantes.Mutante2 m2 = new CalculadoraMutantes.Mutante2();
        int res2 = m2.soma(4, 5);
        assertNotEquals(9, res2, "Mutante2 deveria ser morto — soma virou multiplicação");

        // Mutante 3 – soma com a + b + 1
        CalculadoraMutantes.Mutante3 m3 = new CalculadoraMutantes.Mutante3();
        int res3 = m3.soma(4, 5);
        assertNotEquals(9, res3, "Mutante3 deveria ser morto — soma virou a+b+1");

        // Mutante 4 – soma com a + b - 1
        CalculadoraMutantes.Mutante4 m4 = new CalculadoraMutantes.Mutante4();
        int res4 = m4.soma(4, 5);
        assertNotEquals(9, res4, "Mutante4 deveria ser morto — soma virou a+b-1");

        // Mutante 5 – soma com a + b * 0
        CalculadoraMutantes.Mutante5 m5 = new CalculadoraMutantes.Mutante5();
        int res5 = m5.soma(4, 5);
        assertNotEquals(9, res5, "Mutante5 deveria ser morto — soma virou 0");

        // Mutante 6 – soma com a - b + 2
        CalculadoraMutantes.Mutante6 m6 = new CalculadoraMutantes.Mutante6();
        int res6 = m6.soma(4, 5);
        assertNotEquals(9, res6, "Mutante6 deveria ser morto — soma virou a-b+2");
    }
}
