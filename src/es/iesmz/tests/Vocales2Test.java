package es.iesmz.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {
    @Test
    void sinVocalesTest1() {
        assertEquals("Hl Mnd", Vocales2.sinVocales("Hola Mundo"));
    }

    @Test
    void sinVocalesTest2() {
        assertEquals("st s n cdn", Vocales2.sinVocales("Esto Es una cadenA"));
    }

    @Test
    void sinVocalesTest3() {
        assertEquals("Jv ml Mglln", Vocales2.sinVocales("Java mola MogollOn"));
    }

    @Test
    void sinVocalesTest4() {
        assertEquals("4h0r4 s0n nm3r0s", Vocales2.sinVocales("4h0r4 s0n num3r0s"));
    }

    @Test
    void sinVocalesTest5() {
        assertEquals("Cdn Sn Vcls", Vocales2.sinVocales("Cadena Sin Vocales"));
    }
}