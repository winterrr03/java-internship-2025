package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {
    private final Exercise04 exercise04 = new Exercise04();

    @Test
    void shouldCompressStringWithRepeatedCharacters_OK() {
        assertEquals("abc4e6fd", exercise04.compressString("abcccceeeeeefd"));
        assertEquals("ab13c", exercise04.compressString("abbbbbbbbbbbbbc"));
        assertEquals("a10", exercise04.compressString("aaaaaaaaaa"));
    }

    @Test
    void shouldCompressStringWithoutRepeats_OK() {
        assertEquals("abcd", exercise04.compressString("abcd"));
        assertEquals("xyz", exercise04.compressString("xyz"));
    }

    @Test
    void shouldCompressString_EmptyOrNull_OK() {
        assertEquals("", exercise04.compressString(""));
        assertEquals("", exercise04.compressString(null));
    }
}