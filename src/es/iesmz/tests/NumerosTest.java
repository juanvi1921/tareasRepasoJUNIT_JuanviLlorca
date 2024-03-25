package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {

    @Test
    void sonIgualesTest1() {
        assertEquals(2, Numeros.sonIguales(4,55,27));
    }

    @Test
    void sonIgualesTest2() {
        assertEquals(2, Numeros.sonIguales(14, 23, 27));
    }

    @Test
    void sonIgualesTest3() {
        assertEquals(1, Numeros.sonIguales(14,55,14));
    }

    @Test
    void sonIgualesTest4() {
        assertEquals(1, Numeros.sonIguales(14,14,33));
    }

    @Test
    void sonIgualesTest5() {
        assertEquals(1,Numeros.sonIguales(32,55,55));
    }
    @Test
    void sonIgualesTest6() {
        assertEquals(0,Numeros.sonIguales(329,329,329));
    }
}