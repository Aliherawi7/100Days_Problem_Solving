package topGoogleQuestions.longestSubstringWithoutRepeatingCharacters;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String input =  " ";
        System.out.println(getLongestSubString(input));
    }

    public static int getLongestSubString(String s){
        String mainHolder = "";
        for(int i =0; i < s.length(); i++){
            StringBuilder holder = new StringBuilder();
            int index = i;
            while(! holder.toString().contains(s.charAt(index)+"") ){
                holder.append(s.charAt(index++));
                if(index == s.length()) break;
            }
            if(holder.length() >= mainHolder.length()){
                mainHolder = holder.toString();
            }

        }
        return mainHolder.length();
    }
}
