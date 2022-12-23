package topGoogleQuestions.number7;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"flower","flow","flight"};
        System.out.println(getLongestCommonPrefix(input));
    }

    public static String getLongestCommonPrefix(String[] words){
        String prefix = "";


        for (String selectedWord : words) {
            // in this loop we choose a word each time then to select its letter to check if exist in other words
            StringBuilder currentPrefix = new StringBuilder();
            for (int i = 0; i < selectedWord.length(); i++) {
                boolean isExist = true;
                // each time select one letter of the selectedWord to check if all other words also have this letter
                char selectedLetter = selectedWord.charAt(i);

                //this loop iterate base on each word of
                //list and check if the prefix is exist on each words
                for (String word : words) {
                    // if the the selectedWord is equal to the word[j] or current word in this loop then skip that word
                    if (selectedWord.equals(word)) continue;
                    // check if the word doesn't start with prefix
                    if (!word.startsWith((currentPrefix.toString() + selectedLetter))) {
                        isExist = false;
                        break;
                    }
                }
                // check if the currentPrefix + character is also exist in all words
                if (isExist)
                    currentPrefix.append(selectedLetter);
                else {
                    break;
                }
            }

            // check if the currentPrefix is greater than the old one then replace with new one
            if (prefix.length() < currentPrefix.length()) {
                prefix = currentPrefix.toString();
            }
        }


        return prefix;
    }
}
