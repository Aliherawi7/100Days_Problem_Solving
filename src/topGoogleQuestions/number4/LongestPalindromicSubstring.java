package topGoogleQuestions.number4;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String test = "ghuiubabababd987utu";
        System.out.println(test);
        System.out.println(getLongestPalindromicSubstring(test));
    }


    public static String getLongestPalindromicSubstring(String str){
        String subString = "";

        for (int i=0; i<str.length(); i++){
            StringBuilder holder = new StringBuilder();
            // start adding the chars to the holder from i
            int counter = i;
            while(counter <= str.lastIndexOf(str.charAt(i))){
                holder.append(str.charAt(counter));
                counter++;
            }

            // check if the holder value is prime
            boolean isPrime = true;
            int start =0, end = holder.length()-1;
            while(start < end){
                if(holder.charAt(start) != holder.charAt(end)){
                    isPrime = false;
                }
                start++;
                end--;
            }

            // if the holder value is prime and its size is bigger than the subString
            if(isPrime && holder.length() > subString.length()){
                subString = holder.toString();
            }
        }
        return subString;
    }
}
