package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise07Test {
    private final Exercise07 exercise07 = new Exercise07();

    @Test
    void shouldReverseBinary_OK() {
        assertEquals(29, exercise07.reverseBinary(23));
        assertEquals(1, exercise07.reverseBinary(1));
        assertEquals(0, exercise07.reverseBinary(0));
    }

    @Test
    void shouldReverseBinary_Throws() {
        assertThrows(IllegalArgumentException.class, () -> exercise07.reverseBinary(-23));
        assertThrows(IllegalArgumentException.class, () -> exercise07.reverseBinary(-1));
    }
}