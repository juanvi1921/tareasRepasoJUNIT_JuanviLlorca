package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    @Test
    void vectorReversoTest1(){
        int[] v = {1,2,3,4,5,6};
        int[] vEsperado = {6,5,4,3,2,1};
        assertEquals(Arrays.toString(vEsperado), Arrays.toString(Vector.reverso(v)));
    }

    @Test
    void vectorReversoTest2(){
        int[] v = {10,12,5,221,6,7};
        int[] vEsperado = {7,6,221,5,12,10};
        assertEquals(Arrays.toString(vEsperado), Arrays.toString(Vector.reverso(v)));
    }

    @Test
    void vectorReversoTest3() {
        int[] v = {5};
        int[] vEspeado = {5};
        assertEquals(Arrays.toString(vEspeado), Arrays.toString(Vector.reverso(v)));
    }

    @Test
    void vectorReversoTest4() {
        int[] v = {5,10,20};
        int[] vEsperado = {20,10,5};
        assertEquals(Arrays.toString(vEsperado), Arrays.toString(Vector.reverso(v)));
    }
}