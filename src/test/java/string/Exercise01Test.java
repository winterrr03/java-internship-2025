package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise01Test {
    private final Exercise01 exercise01 = new Exercise01();

    @Test
    void shouldReturnTrue_WhenStringIsPalindrome() {
        assertTrue(exercise01.isPalindrome(""));
        assertTrue(exercise01.isPalindrome("abcdcba"));
        assertTrue(exercise01.isPalindrome("a"));
        assertTrue(exercise01.isPalindrome("aa"));
        assertTrue(exercise01.isPalindrome("madam"));
    }

    @Test
    void shouldReturnFalse_WhenStringIsNotPalindrome() {
        assertFalse(exercise01.isPalindrome("hello"));
        assertFalse(exercise01.isPalindrome("java"));
    }

    @Test
    void shouldReturnFalse_WhenInputIsNull() {
        assertFalse(exercise01.isPalindrome(null));
    }
}