package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {
    private final Exercise02 exercise02 = new Exercise02();

    @Test
    void shouldExtractAndSumIntegers_OK() {
        assertEquals(380, exercise02.extractAndSumIntegers("abc 123 def 33 mn 3.221"));
        assertEquals(12345, exercise02.extractAndSumIntegers("12345"));
        assertEquals(579, exercise02.extractAndSumIntegers("abc111xyz222qwe246"));
        assertEquals(0, exercise02.extractAndSumIntegers("abcdef"));
        assertEquals(46, exercise02.extractAndSumIntegers("12abc34"));
    }

    @Test
    void shouldHandleEmptyOrNullString() {
        assertEquals(0, exercise02.extractAndSumIntegers(""));
        assertEquals(0, exercise02.extractAndSumIntegers(null));
    }
}