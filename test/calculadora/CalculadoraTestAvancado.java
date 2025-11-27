package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Classe de testes da Calculadora.
 * Conjunto de testes organizado em cenários
 * e cobrindo diferentes comportamentos esperados.
 */
@DisplayName("Suite de Testes da Calculadora - Testes Abrangentes")
public class CalculadoraTestAvancado {

    private Calculadora calc;

    @BeforeEach
    void setup() {
        calc = new Calculadora();
    }

    // --------------------------------------------------------------------
    // SOMA
    // --------------------------------------------------------------------
    @Nested
    @DisplayName("Operação de Soma")
    class SomaTests {

        @Test
        @DisplayName("Soma de dois números inteiros positivos")
        void deveSomarDoisInteirosPositivos() {
            assertEquals(9, calc.soma(4, 5));
        }

        @Test
        @DisplayName("Soma envolvendo número negativo")
        void deveSomarComNegativos() {
            assertEquals(2, calc.soma(5, -3));
        }

        @Test
        @DisplayName("Soma resultando em overflow")
        void deveTratarPossivelOverflow() {
            int a = Integer.MAX_VALUE;
            int b = 1;

            // Aqui não sabemos se a classe trata overflow,
            // mas garantimos que a JVM não lançará exceção.
            assertDoesNotThrow(() -> calc.soma(a, b));
        }
    }

    // --------------------------------------------------------------------
    // SUBTRAÇÃO
    // --------------------------------------------------------------------
    @Nested
    @DisplayName("Operação de Subtração")
    class SubtracaoTests {

        @Test
        @DisplayName("Subtração simples entre inteiros")
        void deveSubtrairDoisInteiros() {
            assertEquals(1, calc.subtracao(5, 4));
        }

        @Test
        @DisplayName("Subtração resultando em valor negativo")
        void deveSubtrairResultandoNegativo() {
            assertEquals(-2, calc.subtracao(3, 5));
        }
    }

    // --------------------------------------------------------------------
    // MULTIPLICAÇÃO
    // --------------------------------------------------------------------
    @Nested
    @DisplayName("Operação de Multiplicação")
    class MultiplicacaoTests {

        @Test
        @DisplayName("Multiplicação entre dois números")
        void deveMultiplicarDoisNumeros() {
            assertEquals(20, calc.multiplicacao(4, 5));
        }

        @Test
        @DisplayName("Multiplicação por zero")
        void deveMultiplicarPorZero() {
            assertEquals(0, calc.multiplicacao(10, 0));
        }
    }

    // --------------------------------------------------------------------
    // DIVISÃO
    // --------------------------------------------------------------------
    @Nested
    @DisplayName("Operação de Divisão")
    class DivisaoTests {

        @Test
        @DisplayName("Divisão simples entre dois números")
        void deveDividirDoisNumeros() {
            assertEquals(2, calc.divisao(8, 4));
        }

        @Test
        @DisplayName("Divisão por zero deve lançar exceção")
        void deveLancarExcecaoAoDividirPorZero() {
            assertThrows(ArithmeticException.class,
                    () -> calc.divisao(8, 0),
                    "Esperava-se exceção ao dividir por zero");
        }
    }

    // --------------------------------------------------------------------
    // SOMATÓRIA
    // --------------------------------------------------------------------
    @Nested
    @DisplayName("Operação de Somatória")
    class SomatoriaTests {

        @Test
        @DisplayName("Somatória de um número positivo")
        void deveCalcularSomatoria() {
            assertEquals(3, calc.somatoria(2));
        }

        @Test
        @DisplayName("Somatória de zero deve retornar zero")
        void deveRetornarZeroParaSomatoriaZero() {
            assertEquals(0, calc.somatoria(0));
        }

        @Test
        @DisplayName("Somatória de número negativo deve lançar exceção")
        void somatoriaNumeroNegativo() {
            assertThrows(IllegalArgumentException.class,
                    () -> calc.somatoria(-5),
                    "Somatória não deveria aceitar números negativos");
        }
    }

    // --------------------------------------------------------------------
    // COMPARAÇÃO
    // --------------------------------------------------------------------
    @Nested
    @DisplayName("Operação de Comparação")
    class ComparacaoTests {

        @Test
        @DisplayName("Comparar dois valores iguais")
        void deveRetornarZeroQuandoIguais() {
            assertEquals(0, calc.compara(4, 4));
        }

        @Test
        @DisplayName("Comparar quando primeiro é maior")
        void deveRetornarUmQuandoPrimeiroMaior() {
            assertEquals(1, calc.compara(5, 4));
        }

        @Test
        @DisplayName("Comparar quando primeiro é menor")
        void deveRetornarMenosUmQuandoPrimeiroMenor() {
            assertEquals(-1, calc.compara(4, 5));
        }
    }
}
