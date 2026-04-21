package cat.inspla.ra3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // --- Exercici 1: mètode add ---

    @Test
    void addAmbDosPositiusRetornaSumaCorrecta() {
        // Arrange & Act & Assert
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void addAmbZeroRetornaElMateixValor() {
        assertEquals(7, calculator.add(7, 0));
    }

    @Test
    void addAmbNegatisRetornaSumaCorrecta() {
        assertEquals(1, calculator.add(-2, 3));
    }

    @Test
    void addAmbDosNegatiusRetornaSumaCorrecta() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    // --- Exercici 1: mètode subtract ---

    @Test
    void subtractRetornaRestaCorrecta() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    // --- Exercici 1: mètode multiply ---

    @Test
    void multiplyRetornaProducteCorrecte() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    // --- Exercici 1: divide per zero ---

    @Test
    void divideByZeroLlancaExcepcio() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    void divideAmbValorsVàlidsRetornaResultatCorrecte() {
        assertEquals(3, calculator.divide(9, 3));
    }

    // --- Exercici 3: proves parametritzades per a add ---

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "0, 0, 0",
            "-2, 5, 3",
            "7, -4, 3"
    })
    void addRetornaSumaCorrecta(int a, int b, int esperat) {
        assertEquals(esperat, calculator.add(a, b));
    }
}

