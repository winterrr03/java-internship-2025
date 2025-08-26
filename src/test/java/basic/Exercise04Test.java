package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {
    private final Exercise04 exercise04 = new Exercise04();

    @Test
    void shouldGenerateFibonacciUpTo_OK() {
        assertEquals("", exercise04.generateFibonacciUpTo(0));
        assertEquals("1 1", exercise04.generateFibonacciUpTo(1));
        assertEquals("1 1 2 3 5 8 13", exercise04.generateFibonacciUpTo(20));
        assertEquals("1 1 2 3 5 8 13 21 34", exercise04.generateFibonacciUpTo(50));
    }
}