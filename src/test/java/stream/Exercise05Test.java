package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise05Test {
    private final Exercise05 exercise05 = new Exercise05();

    @Test
    void shouldSumOfLongestNumbers_OK() {
        assertEquals(999, exercise05.sumOfLongestNumbers(new int[]{1, 32, 444, 555, 12, 33}));
        assertEquals(102, exercise05.sumOfLongestNumbers(new int[]{12, 34, 56}));
        assertEquals(7890, exercise05.sumOfLongestNumbers(new int[]{7890}));
        assertEquals(0, exercise05.sumOfLongestNumbers(new int[]{}));
    }
}