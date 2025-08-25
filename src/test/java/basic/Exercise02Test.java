package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {

    private final Exercise02 exercise02 = new Exercise02();

    @Test
    void sumOfDigits() {
        assertEquals(5, exercise02.getSumOfDigits(5));
        assertEquals(9, exercise02.getSumOfDigits(9));
        assertEquals(0, exercise02.getSumOfDigits(0));
        assertEquals(6, exercise02.getSumOfDigits(123));
        assertEquals(15, exercise02.getSumOfDigits(555));
        assertEquals(19, exercise02.getSumOfDigits(199));
        assertEquals(45, exercise02.getSumOfDigits(123456789));
        assertEquals(1, exercise02.getSumOfDigits(1000));
    }
}