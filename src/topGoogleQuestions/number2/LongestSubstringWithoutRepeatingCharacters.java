package topGoogleQuestions.number2;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String input =  "getLongestSubstringWithoutRepeatingChar";
        int result = getLongestSubstringWithoutRepeatingChar(input);
        System.out.println(result);
    }

    public static int getLongestSubstringWithoutRepeatingChar(String text){
        text = text.toLowerCase();
        StringBuilder subString = new StringBuilder();
        String subHolder = "";

        for(int i= 0; i < text.length(); i++ ){

            if(subString.toString().contains(text.charAt(i)+"")){
                if(subHolder.length() < subString.length()){
                    subHolder = subString.toString();
                }
                subString = new StringBuilder();
            }
            subString.append(text.charAt(i));
        }
        System.out.println(subHolder);
        return subHolder.length();
    }
}
