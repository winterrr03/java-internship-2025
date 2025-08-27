package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise01Test {
    private final Exercise01 exercise01 = new Exercise01();

    @Test
    void shouldSumEvenSubtractOdd_OK() {
        assertEquals(3, exercise01.sumEvenSubtractOdd(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(-10, exercise01.sumEvenSubtractOdd(new int[]{10, 15, 20, 25}));
        assertEquals(12, exercise01.sumEvenSubtractOdd(new int[]{2, 4, 6}));
        assertEquals(60, exercise01.sumEvenSubtractOdd(new int[]{10, 20, 30}));
        assertEquals(-9, exercise01.sumEvenSubtractOdd(new int[]{1, 3, 5}));
        assertEquals(-45, exercise01.sumEvenSubtractOdd(new int[]{5, 15, 25}));
        assertEquals(0, exercise01.sumEvenSubtractOdd(new int[]{}));
        assertEquals(0, exercise01.sumEvenSubtractOdd(null));
    }
}