package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise08Test {
    private final Exercise08 exercise08 = new Exercise08();

    @Test
    void shouldConvertToRoman_OK() {
        assertEquals("I", exercise08.convertToRoman(1));
        assertEquals("IV", exercise08.convertToRoman(4));
        assertEquals("XII", exercise08.convertToRoman(12));
        assertEquals("XXIX", exercise08.convertToRoman(29));
        assertEquals("MCMXCIV", exercise08.convertToRoman(1994));
        assertEquals("MMMCMXCIX", exercise08.convertToRoman(3999));
    }

    @Test
    void shouldConvertToRoman_Throws() {
        assertThrows(IllegalArgumentException.class, () -> exercise08.convertToRoman(0));
        assertThrows(IllegalArgumentException.class, () -> exercise08.convertToRoman(-5));
        assertThrows(IllegalArgumentException.class, () -> exercise08.convertToRoman(4000));
    }
}