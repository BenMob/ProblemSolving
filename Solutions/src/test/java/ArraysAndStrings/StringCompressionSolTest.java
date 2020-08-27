package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionSolTest {

    @Test
    void stringCompression() {
        assertEquals("a4b2a1c2", StringCompressionSol.stringCompression("aaaabbacc"), "Input: \"a4b2a1c2\"");
        assertEquals("a", StringCompressionSol.stringCompression("a"), "Input: \"a\"");
        assertEquals("a1b11a1", StringCompressionSol.stringCompression("abbbbbbbbbbba"), "Input: \"abbbbbbbbbbba\"");
        assertEquals("abababababab" , StringCompressionSol.stringCompression("abababababab" ), "Input: \"abababababab\" ");
        assertEquals("" , StringCompressionSol.stringCompression(""), "Input: \"\" ");
    }
}