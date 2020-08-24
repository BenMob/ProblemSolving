package ArraysAndStrings;

import java.util.HashMap;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * You can ignore casing and non-letter characters
 */

public class PalindromePermutationSol {
    public static boolean palPer(String string) {
        if (string.length() == 1) {
            return true;
        }

        if (string.length() == 0) {
            return false;
        }

        // Getting rid of whitespaces
        string = string.replaceAll("\\s", "");

        HashMap<Character, Integer> map = new HashMap();
        final int length = string.length();
        System.out.println(string);
        for (int i = 0; i < length; i++) {
            char character = string.charAt(i);
            if (map.containsKey(character)) {
                map.remove(character);
            } else {
                map.put(character, 1);
            }
        }

        if (length % 2 == 0) {  // length is even
            return map.isEmpty();
        }

        return !map.isEmpty();  // length is not length

        // W(N): O(N)
    }
}



// SCRATCH WORK

// CASE: Size > 1
// race car   --  cear rca : cearrca   -> true
// noon       --  nono  -> true

// civic      --  iicvc      -> true
// america

// america
// -> a -> m -> e -> r

// a:1 - 2
// m:1
// e:1
// r:1
// i:1
// c:1


// nono
// -> n -> o -> n -> o

// n: 1 - 2
// o: 1 - 2



// cearrca
// -> c -> e -> a -> r

// c:1 - 2
// e:1
// a:1 - 2
// r:1 - 2
