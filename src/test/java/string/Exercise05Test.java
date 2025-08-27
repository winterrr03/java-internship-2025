package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise05Test {
    private final Exercise05 exercise05 = new Exercise05();

    @Test
    void shouldDecompressStringWithCounts_OK() {
        assertEquals("abcccceeeeeefd", exercise05.decompressString("abc4e6fd"));
        assertEquals("abbbbbbbbbbbbbc", exercise05.decompressString("ab13c"));
        assertEquals("aaaaa", exercise05.decompressString("a5"));
    }

    @Test
    void shouldDecompressStringWithoutCounts_OK() {
        assertEquals("abcd", exercise05.decompressString("abcd"));
        assertEquals("xyz", exercise05.decompressString("xyz"));
    }

    @Test
    void shouldDecompressString_EmptyOrNull_OK() {
        assertEquals("", exercise05.decompressString(""));
        assertEquals("", exercise05.decompressString(null));
    }
}