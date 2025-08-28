package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {
    private final Exercise03 exercise03 = new Exercise03();

    @Test
    void shouldConvertNumberToWords_OK() {
        assertEquals("Zero", exercise03.convertNumberToWords(0));
        assertEquals("One, Two, Three", exercise03.convertNumberToWords(123));
        assertEquals("One, Zero, One", exercise03.convertNumberToWords(101));
        assertEquals("Four, Five, Six", exercise03.convertNumberToWords(456));
        assertEquals("Seven, Eight, Nine", exercise03.convertNumberToWords(789));
    }
}