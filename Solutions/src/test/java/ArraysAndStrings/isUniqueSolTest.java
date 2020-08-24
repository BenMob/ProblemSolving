package ArraysAndStrings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class isUniqueSolTest {

    @Test
    void isUnique() {
        assertEquals(true, IsUniqueSol.isUnique( "p"), "Input: p" );
        assertEquals(true, IsUniqueSol.isUnique( "public"), "Input: Public" );
        assertEquals(false, IsUniqueSol.isUnique( "benjamin"), "Input: benjamin" );
        assertEquals(false, IsUniqueSol.isUnique("bbenjamin"), "Input: bbenjamin");
        assertEquals(false, IsUniqueSol.isUnique("benjaminn"), "Input: benjaminn");
        assertEquals(true, IsUniqueSol.isUnique(""), "Input: \"\" ");
        assertEquals(false, IsUniqueSol.isUnique("programming"), "Input: programming");
        assertEquals(false, IsUniqueSol.isUnique("banana"), "Input: banana");
        assertEquals(true, IsUniqueSol.isUnique("The car slip"), "Input: the car slip");
    }
}