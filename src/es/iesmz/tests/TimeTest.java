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
        assertEquals(new Time(12,59,44), new Time(12,59,45).nexSecond());
    }
}