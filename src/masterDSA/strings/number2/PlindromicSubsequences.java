package masterDSA.strings.number2;

import java.util.ArrayList;

public class PlindromicSubsequences {
    public static void main(String[] args) {
        String input = "dad is not bob";
        getPlindromicSubsequences(input);
    }

    // find all palindromic substring
    public static ArrayList<String> getPlindromicSubsequences(String str){
        ArrayList<String> allPalindroms = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            StringBuilder sb = new StringBuilder(str.charAt(i)+"");
            for (int j = i + 1; j < str.length(); j++){
                sb.append(str.charAt(j));
                if(isPalindrome(sb.toString())){
                    allPalindroms.add(sb.toString());
                    break;
                }
            }
        }
        System.out.println(allPalindroms);
        return allPalindroms;
    }

    // this method check if the string is palindrome
    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}
