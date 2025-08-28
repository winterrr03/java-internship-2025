package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {
    private final Exercise04 exercise04 = new Exercise04();

    @Test
    void shouldSortByDictionaryOrder_OK() {
        final int[] input1 = {1, 9, 23, 123, 100, 45, 43};
        final int[] expected1 = {1, 100, 123, 23, 43, 45, 9};
        assertArrayEquals(expected1, exercise04.sortByDictionaryOrder(input1));

        final int[] input2 = {1, 10, 100, 101};
        final int[] expected2 = {1, 10, 100, 101};
        assertArrayEquals(expected2, exercise04.sortByDictionaryOrder(input2));

        final int[] input3 = {42};
        final int[] expected3 = {42};
        assertArrayEquals(expected3, exercise04.sortByDictionaryOrder(input3));
    }
}