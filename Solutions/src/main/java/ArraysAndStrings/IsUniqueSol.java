package ArraysAndStrings;

import java.util.ArrayList;

public class IsUniqueSol {

    public static boolean isUnique(String str){
        if(str.isEmpty()){
            return true;
        }else{
            ArrayList<Character> characters = new ArrayList<>();
            characters.add(str.charAt(0));

            for(int i = 1; i < str.length(); i++){
                if(characters.contains(str.charAt(i))){
                    return false;
                }else{
                    if(str.charAt(i) != ' ') {
                        characters.add(str.charAt(i));
                    }
                }
            }
            return true;
        }
    }
    // Worst case: O(N)
    // Best case: O(1)
}

