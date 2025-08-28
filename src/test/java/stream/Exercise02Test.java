package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {
    private final Exercise02 exercise02 = new Exercise02();

    @Test
    void shouldFindMissingNumber_OK() {
        assertEquals(3, exercise02.findMissingNumber(new int[]{1, 2, 4, 5}));
        assertEquals(2, exercise02.findMissingNumber(new int[]{1, 3, 4, 5}));
        assertEquals(1, exercise02.findMissingNumber(new int[]{2, 3, 4, 5}));
        assertEquals(6, exercise02.findMissingNumber(new int[]{1, 2, 3, 4, 5}));
    }
}