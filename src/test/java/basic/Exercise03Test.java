package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {

    private final Exercise03 exercise03 = new Exercise03();

    @Test
    void shouldFactorizePrime_OK() {
        assertEquals("97", exercise03.factorizePrime(97));
        assertEquals("2 * 2 * 3", exercise03.factorizePrime(12));
        assertEquals("2 * 2 * 5 * 5", exercise03.factorizePrime(100));
        assertEquals("2 * 2 * 2 * 3 * 5 * 5", exercise03.factorizePrime(600));
    }
}