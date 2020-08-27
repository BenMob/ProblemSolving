package ArraysAndStrings;

/**
 * Write a method tha performs basic string compression
 * So if the input is "aaabbbbcc" it shourl return "a3b4c2"
 * If the String will not get shorter after compression,
 * return the same string.
 *
 * You can assume the string only has uppercase letters and
 * lowercase letters from (a-z)
 */


public class StringCompressionSol {


    public static String stringCompression(String string){
        if(string.isEmpty()){
            return string;
        }
        StringBuilder compressed = new StringBuilder(Character.toString(string.charAt(0)));

        // Sliding window
        for(int keeper = 0, runner = 1; runner < string.length(); runner ++){
            if(string.charAt(runner) != string.charAt(keeper)){
                compressed.append((Integer.toString(runner - keeper)));
                keeper = runner;
                compressed.append(string.charAt(runner));
            }

            // Last character of the string
            if(runner + 1 == string.length()){
                compressed.append(runner - keeper + 1);
            }

            // Size boundery case
            if(compressed.length() > string.length()) {
                return string;
            }
        }

        return new String(compressed);
    }


    public static void main(String[] args){

        String[] testCases = {"aaaabbacc", "a", "abbbbbbbbbbba", "abababababab" };
        String[] outputs = {"a4b2a1c2", "a", "a1b11a1", "abababababab" };

        for(int i = 0; i < testCases.length; i++){
            System.out.println("Input: " + testCases[i]);
            System.out.println("Output: " + stringCompression(testCases[i]) + "      Expected: " + outputs[i]);
            System.out.println("Passed: " + stringCompression(testCases[i]).equals(outputs[i]));
            System.out.println();
        }
    }
}



