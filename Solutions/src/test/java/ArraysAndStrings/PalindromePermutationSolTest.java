package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationSolTest {

    @Test
    void palPer() {
        assertEquals(true, PalindromePermutationSol.palPer("tact coa"), "taco cat");
        assertEquals(true, PalindromePermutationSol.palPer("d r  a  ar"), "r a  d  ar");
        assertEquals(true, PalindromePermutationSol.palPer("arepper   "), "repaper");
        assertEquals(true, PalindromePermutationSol.palPer("Lleve   "), "repaper");
        assertEquals(true, PalindromePermutationSol.palPer("A man, a plan a canal, panama"), "A man, a plan a canal, panama");
        assertEquals(false, PalindromePermutationSol.palPer("A man, a plan, a canal, panama"), "A man, a plan, a canal, panama");
        assertEquals(false,PalindromePermutationSol.palPer( "areper   "), "NONE");
    }
}