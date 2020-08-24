package ArraysAndStrings;

/**
 * Write a method that replaces every space in string with `%20`. You may assume that the string has sufficient space at
 * the end to hold the additional characters and that you are given the true length of the string.
 *
 * EXAMPLE:
 * Input: "Mr John Smith   " 13
 * Output: "Mr%20John%20Smith"
 */
public class URLifySol{

    public static String URLify(String str, int length){
        str = str.trim();
        char[] array = str.toCharArray();
        StringBuilder solution = new StringBuilder();

        for(int i = 0; i < array.length; i++){
            if(array[i] == ' ' && array[i + 1] != ' '){
                solution.append("%20");
            }else if(array[i] != ' '){
                solution.append(array[i]);
            }
        }
        return new String(solution);
    }
}
