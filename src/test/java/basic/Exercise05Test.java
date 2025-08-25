package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise05Test {
    private final Exercise05 exercise05 = new Exercise05();

    @Test
    void shouldCalculateFactorial_OK() {
        assertEquals(1, exercise05.calculateFactorial(0));
        assertEquals(1, exercise05.calculateFactorial(1));
        assertEquals(120, exercise05.calculateFactorial(5));
        assertEquals(5040, exercise05.calculateFactorial(7));
        assertEquals(479001600, exercise05.calculateFactorial(12));
    }
}