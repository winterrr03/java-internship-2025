package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {
    private final Exercise03 exercise03 = new Exercise03();

    @Test
    void shouldReturnFalseWhenNotRepeatedSubstring_OK() {
        assertFalse(exercise03.isRepeatedSubstring(null));
        assertFalse(exercise03.isRepeatedSubstring(""));
        assertFalse(exercise03.isRepeatedSubstring("a"));
        assertFalse(exercise03.isRepeatedSubstring("aba"));
        assertFalse(exercise03.isRepeatedSubstring("abc"));
        assertFalse(exercise03.isRepeatedSubstring("abcdabc"));
    }

    @Test
    void shouldReturnTrueWhenRepeatedSubstring_OK() {
        assertTrue(exercise03.isRepeatedSubstring("abab"));
        assertTrue(exercise03.isRepeatedSubstring("aaaa"));
        assertTrue(exercise03.isRepeatedSubstring("xyzxyz"));
        assertTrue(exercise03.isRepeatedSubstring("xyzxyzxyz"));
        assertTrue(exercise03.isRepeatedSubstring("abcdabcdabcd"));
    }
}