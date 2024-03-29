package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    void nextSecondTest1() {
        Time h = new Time(12,14,15);
        assertEquals(new Time(12,14,16), h.nexSecond());
    }

    @Test
    void nextSecondTest2() {
        assertEquals(new Time(12,59,45), new Time(12,59,44).nexSecond());
    }

    @Test
    void nextSecondTest3() {
        assertEquals(new Time(1,10,0), new Time(1, 9, 59).nexSecond());
    }

    @Test
    void nextSecondTest4() {
        assertEquals(new Time(18,0,0), new Time(17,59,59).nexSecond());
    }

    @Test
    void nextSecondTest5() {
        assertEquals(new Time(0,0,0), new Time(23,59,59).nexSecond());
    }
}