package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {

    @Test
    void contarVocalesTest1() {
        assertEquals(4, Vocales.contarVocales("Hola Mundo"));
    }

    @Test
    void contarVocalesTest2() {
        assertEquals(8, Vocales.contarVocales("Esto Es una cadenA"));
    }

    @Test
    void contarVocalesTest3() {
        assertEquals(7, Vocales.contarVocales("Java mola MogollOn"));
    }

    @Test
    void contarVocalesTest4() {
        assertEquals(1, Vocales.contarVocales("4h0r4 s0n num3r0s"));
    }

    @Test
    void contarVocalesTest5() {
        assertEquals(6, Vocales.contarVocales("Cadena S1n Vocales"));
    }
}