package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {
    private final Exercise04 exercise04 = new Exercise04();

    @Test
    void shouldMergeSortedArrays_OK() {
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10},
                exercise04.mergeSortedArrays(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8, 10})
        );

        assertArrayEquals(
                new int[]{-5, -4, -3, -2, -1, 0},
                exercise04.mergeSortedArrays(new int[]{-5, -3, -1}, new int[]{-4, -2, 0})
        );

        assertArrayEquals(
                new int[]{1, 2, 2, 2, 2, 3, 4},
                exercise04.mergeSortedArrays(new int[]{1, 2, 2, 3}, new int[]{2, 2, 4})
        );

        assertArrayEquals(
                new int[]{1, 2},
                exercise04.mergeSortedArrays(new int[]{1}, new int[]{2})
        );
    }
}