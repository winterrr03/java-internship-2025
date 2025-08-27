package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {
    private final Exercise02 exercise02 = new Exercise02();

    @Test
    void shouldBinarySearch_OK() {
        final int[] arr = {-10, -5, 0, 5, 10};

        assertEquals(0, exercise02.binarySearch(arr, -10));
        assertEquals(2, exercise02.binarySearch(arr, 0));
        assertEquals(4, exercise02.binarySearch(arr, 10));
        assertEquals(-1, exercise02.binarySearch(arr, 7));
        assertEquals(-1, exercise02.binarySearch(new int[]{}, 1));
        assertEquals(-1, exercise02.binarySearch(null, 1));
    }
}