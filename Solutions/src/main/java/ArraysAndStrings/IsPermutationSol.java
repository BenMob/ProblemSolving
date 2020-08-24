package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;


/**
 * Question: Write a method that determines if one string is a permutation of another
 */

public class IsPermutationSol {
    private static boolean charFrequencyIsZero(char theChar, HashMap<Character, Integer> map){
        if(map.containsKey(theChar)){
            return map.get(theChar) < 1 ? true: false;
        }

        return false;
    }

    // O(N) Solution using Map Data Structure
    public static boolean isPermutation(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        final int length = str1.length();
        HashMap<Character, Integer> frequency = new HashMap<>();

        // Maps each character with its frequency in str1
        for(int i = 0; i < length; i++){
            final char character = str1.charAt(i);
            if(frequency.containsKey(character)){
                frequency.replace(character, frequency.get(character) + 1);
            }else{
                frequency.put(character, 1);
            }
        }

        // Goes through str2 making sure each all frequencies match
        for(int i = 0; i < length; i++){
            final char character = str2.charAt(i);
            if(frequency.containsKey(character)){
                frequency.replace(character, frequency.get(character) - 1);
                if(charFrequencyIsZero(character, frequency)){
                    frequency.remove(character);
                }
            }else{
                return false;
            }
        }

        return frequency.isEmpty() ? true : false;
    }


    // O(N) Solution using an Array Data Structure
    public static boolean isPermutation2(String str1, String str2){
        return sort(str1).equals(sort(str2));
    }

    private static String sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}








