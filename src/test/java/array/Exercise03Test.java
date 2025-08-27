package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {
    private final Exercise03 exercise03 = new Exercise03();

    @Test
    void shouldReverseArray_OK() {
        final int[] arr1 = {1, 2, 3, 4, 5};
        exercise03.reverseArray(arr1);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, arr1);

        final int[] arr2 = {-1, 0, 3, -5};
        exercise03.reverseArray(arr2);
        assertArrayEquals(new int[]{-5, 3, 0, -1}, arr2);

        final int[] arr3 = {42};
        exercise03.reverseArray(arr3);
        assertArrayEquals(new int[]{42}, arr3);
    }
}