package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifySolTest {

    @Test
    void URLify() {
       assertEquals("Mr%20John%20Smith", URLifySol.URLify("Mr John Smith    ", 13));
       assertEquals("course%20assignment%20scores%20benjamin", URLifySol.URLify("  course   assignment    scores      benjamin    ", 39));
       assertEquals("", URLifySol.URLify(" ", 0));
    }
}