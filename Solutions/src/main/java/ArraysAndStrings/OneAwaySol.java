package ArraysAndStrings;

/**
 * There are three types of operations that can be done on a string
 * 1. insert a character
 * 2. remove a character
 * 3. replace a character
 *
 * Given two strings, write a function that determines whether they are one edit or zero edit away
 *
 * Return
 * "one" if they are one edit away
 * "zero" if they are the same
 * "void" if they are more that one edit away
 */

public class OneAwaySol {
    public static String OneAway(String stringA, String stringB){
        if(stringA.equals(stringB)){  // Same strings
            return "zero";
        }else if(Math.abs(stringA.length() - stringB.length()) == 1){   // length difference of one -> check if one char needs to be added or removed
            final int length = getShorterLength(stringA, stringB);
            boolean foundMissMatch = false;
            for (int pointer1 = 0, pointer2 = 0; pointer2 < length; pointer1++, pointer2++){
                if(stringA.charAt(pointer1) != stringB.charAt(pointer2) && foundMissMatch){
                    return "void";
                }else if(stringA.charAt(pointer1) != stringB.charAt(pointer2)){
                    foundMissMatch = true;
                    if(stringA.length() == length) {
                        pointer1--;
                    }else {
                        pointer2--;
                    }
                }
            }
            return "one";

        }else if(stringA.length() == stringB.length()){   // same length  -> Check if one char needs to be replaced
            final int length = stringA.length();
            boolean foundMissmatch = false;
            for (int pointer = 0; pointer < length; pointer++){
                if(stringA.charAt(pointer) != stringB.charAt(pointer) && foundMissmatch){
                    return "void";
                }else if(stringA.charAt(pointer) != stringB.charAt(pointer)){
                    foundMissmatch = true;
                }
            }
            return "one";
        }else{
            return "void";
        }

        // W(N): O(N) where N is the length of the longest of the two strings
        // Suggestion: optimize by using String.substring() to avoid unnecessary extra steps
    }


    // Given two strings this this function returns the length of the shorter one
    private static int getShorterLength(String string1, String string2){
        return Math.min(string1.length(), string2.length());
    }
}











