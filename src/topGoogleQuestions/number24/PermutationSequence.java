package topGoogleQuestions.number24;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class PermutationSequence {
    public static void main(String[] args) {
        String num = permutationSequence(4, 5);
        System.out.println(num);
    }


    public static String permutationSequence(int n, int k){
        StringBuilder sb = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        for(int i = 1; i <= n; i++)
            numbers.append(i);
        permute(numbers.toString(), 0, numbers.length()-1, sb);
        /* this is just for test to print all permutations: */
        AtomicInteger incrementer = new AtomicInteger(0);
        Arrays.stream(sb.toString().split(" ")).forEach(a -> System.out.println(incrementer.getAndIncrement()+": "+a));

        return sb.toString().split(" ")[k];
    }
    public static void permute(String str, int l , int r, StringBuilder sb){
        if(l == r){
            sb.append(" ").append(str);
        }else {
            for(int i = l; i <= r; i++){
                str = swap(str, l, i);
                permute(str, l + 1, r, sb);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int a, int b) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = temp;
        return String.valueOf(charArray);
    }
}
