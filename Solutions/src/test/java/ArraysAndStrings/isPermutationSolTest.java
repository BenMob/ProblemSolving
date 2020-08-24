package ArraysAndStrings;

import ArraysAndStrings.IsPermutationSol;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class isPermutationSolTest {

    @Test
    void isPermutation() {
        assertEquals(true, IsPermutationSol.isPermutation("BANANA", "BAANAN"), "Input: BANANA - BAANAN");
        assertEquals(true, IsPermutationSol.isPermutation("BANANA", "BANANA"), "Input: BANANA - BANANA");
        assertEquals(true, IsPermutationSol.isPermutation("AAAAA", "AAAAA"), "Input: AAAAA - AAAAA");
        assertEquals(true, IsPermutationSol.isPermutation("AMERICA", "CAIRMAE"), "Input: AMERICA - CAIRMAE");
        assertEquals(true, IsPermutationSol.isPermutation("", ""), "Input: \"\" - \"\"");
        assertEquals(false, IsPermutationSol.isPermutation("BANANA", "BAANANB"), "Input: BANANA - BAANANB ");
        assertEquals(false, IsPermutationSol.isPermutation("BANANA", "BANANB"), "Input: BANANA - BANANB ");
        assertEquals(false, IsPermutationSol.isPermutation("BANANA", "BAANVA"), "Input: BANANA - BAANVA");
        assertEquals(false, IsPermutationSol.isPermutation("AAAAA", "AAAA"), "Input: AAAAA - AAAA");
        assertEquals(false, IsPermutationSol.isPermutation("BANANA", "BANABN"), "Input: BANANA - BAANAN");
    }

    @Test
    void isPermutation2() {
        assertEquals(true, IsPermutationSol.isPermutation2("BANANA", "BAANAN"), "Input: BANANA - BAANAN");
        assertEquals(true, IsPermutationSol.isPermutation2("AAAAA", "AAAAA"), "Input: AAAAA - AAAAA");
        assertEquals(true, IsPermutationSol.isPermutation2("AMERICA", "CAIRMAE"), "Input: AMERICA - CAIRMAE");
        assertEquals(true, IsPermutationSol.isPermutation2("", ""), "Input: \"\" - \"\"");
        assertEquals(true, IsPermutationSol.isPermutation2("BANANA", "BANANA"), "Input: BANANA - BANANA");
        assertEquals(false, IsPermutationSol.isPermutation2("BANANA", "BANABN"), "Input: BANANA - BAANAN");
        assertEquals(false, IsPermutationSol.isPermutation2("BANANA", "BAANANB"), "Input: BANANA - BAANANB ");
        assertEquals(false, IsPermutationSol.isPermutation2("BANANA", "BANANB"), "Input: BANANA - BANANB ");
        assertEquals(false, IsPermutationSol.isPermutation2("BANANA", "BAANVA"), "Input: BANANA - BAANVA");
        assertEquals(false, IsPermutationSol.isPermutation2("AAAAA", "AAAA"), "Input: AAAAA - AAAA");
    }
}