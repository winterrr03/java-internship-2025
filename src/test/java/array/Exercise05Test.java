package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise05Test {
    private final Exercise05 exercise05 = new Exercise05();

    @Test
    void shouldFindMissingNumber_OK() {
        assertEquals(3, exercise05.findMissingNumber(new int[]{1, 2, 4, 5}));
        assertEquals(2, exercise05.findMissingNumber(new int[]{1, 3, 4, 5}));
        assertEquals(1, exercise05.findMissingNumber(new int[]{2, 3, 4, 5}));
        assertEquals(6, exercise05.findMissingNumber(new int[]{1, 2, 3, 4, 5}));
    }
}