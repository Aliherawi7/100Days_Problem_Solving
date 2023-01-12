package topGoogleQuestions.number48;

import java.util.Arrays;


public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        boolean output = isAnagram(s1, t1);
        System.out.println(output);
    }
    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()) return false;

        char[] aAllLetters = a.toCharArray();
        char[] bAllLetters = b.toCharArray();
        Arrays.sort(aAllLetters);
        Arrays.sort(bAllLetters);

        for(int i =0; i < aAllLetters.length; i++){
            if(aAllLetters[i] != bAllLetters[i])
                return false;
        }
        return true;
    }

}
