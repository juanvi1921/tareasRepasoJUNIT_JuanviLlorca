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
        assertEquals("st s n cdn", Vocales2.sinVocales("Esto es una cadena"));
    }


}