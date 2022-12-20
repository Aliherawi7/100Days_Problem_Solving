package topGoogleQuestions.number2;

public class LongestSubstringWithoutRepeatingCharacters {


    public static int getLongestSubstringWithoutRepeatingChar(String text){
        StringBuilder subString = new StringBuilder();
        String subHolder = "";

        for(int i=0; i < text.length(); i++ ){

            if(subString.toString().contains(text.charAt(i)+"")){
                if(subHolder.length() < subString.length()){
                    subHolder = subString.toString();
                }
                subString.delete(0, subString.length()-1);
            }
            subString.append(text.charAt(i));
        }

        return subString.length();
    }
}
