package masterDSA.strings.number3;

import java.util.Arrays;

public class AllAnagrams {
    public static void main(String[] args) {
        String p = "hello";
        String s = "world";
        String[] output = getAllAnagrams(p, s);
        System.out.println(Arrays.toString(output));
    }
    public static String[] getAllAnagrams(String p , String s){
        String[] anagrams = new String[p.length()];
        for(int i = 0; i < p.length(); i++){
            String holder = p.charAt(i) + s;
            anagrams[i] = holder;
        }
        return anagrams;
    }
}
