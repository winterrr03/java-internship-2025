package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise01Test {

    private final Exercise01 exercise01 = new Exercise01();

    @Test
    void shouldGetGCD_OK() {
        assertEquals(0, exercise01.getGCD(0, 0));
        assertEquals(5, exercise01.getGCD(5, 0));
        assertEquals(10, exercise01.getGCD(0, 10));
        assertEquals(6, exercise01.getGCD(12, 18));
        assertEquals(1, exercise01.getGCD(7, 13));
    }

    @Test
    void shouldGetLCM_OK() {
        assertEquals(0, exercise01.getLCM(0, 5));
        assertEquals(0, exercise01.getLCM(7, 0));
        assertEquals(0, exercise01.getLCM(0, 0));
        assertEquals(12, exercise01.getLCM(4, 6));
        assertEquals(91, exercise01.getLCM(7, 13));
        assertEquals(10, exercise01.getLCM(5, 10));
    }
}