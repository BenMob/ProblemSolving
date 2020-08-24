package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwaySolTest {

    @Test
    void oneAway() {
        assertEquals("one", OneAwaySol.OneAway("pale", "ple"));
        assertEquals("one", OneAwaySol.OneAway("pale", "pales"));
        assertEquals("one", OneAwaySol.OneAway("bale", "pale"));
        assertEquals("one", OneAwaySol.OneAway("", "b"));
        assertEquals("one", OneAwaySol.OneAway("acdsfdsfadsf", "acdsgdsfadsf"));
        assertEquals("one", OneAwaySol.OneAway("acdsfdsfadsf", "acdsfdfadsf"));
        assertEquals("one", OneAwaySol.OneAway("acdsfdsfadsf", "acdsfdsfads"));
        assertEquals("one", OneAwaySol.OneAway("acdsfdsfadsf", "cdsfdsfadsf"));
        assertEquals("void", OneAwaySol.OneAway("adfdsfadsf", "acdfdsfdsf"));
        assertEquals("void", OneAwaySol.OneAway("adfdsfadsf", "bdfdsfadsg"));
        assertEquals("void", OneAwaySol.OneAway("adfdsfadsf", "bdfdsfadsg"));
        assertEquals("void", OneAwaySol.OneAway("adfdsfadsf", "affdsfads"));
        assertEquals("void", OneAwaySol.OneAway("pale", "bake"));
        assertEquals("zero", OneAwaySol.OneAway("pale", "pale"));
    }
}