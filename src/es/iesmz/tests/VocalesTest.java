package es.iesmz.tests;

import es.iesmz.utils.Vocales;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VocalesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"Hola Mundo, 4", "Esto Es una cadenA, 8", "Java mola MogollOn, 7",
                "4h0r4 s0n num3r0s, 1", "Cadena S1n Vocales, 6"})
    void contarVocalesTest(String cadena, int valorEsperado) {
        assertEquals(valorEsperado, Vocales.contarVocales(cadena));
    }
}