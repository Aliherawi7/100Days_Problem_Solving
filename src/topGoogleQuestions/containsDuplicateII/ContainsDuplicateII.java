package topGoogleQuestions.containsDuplicateII;

import java.util.Arrays;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] input1 = {1,2,3,1};
        int k1 = 3;
        boolean output1 = containsDuplicateII(input1,k1);
        System.out.println("input 1: "+ Arrays.toString(input1));
        System.out.println("output 1: "+ output1);

    }
    public static boolean containsDuplicateII(int[] numbers, int k){
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j] && j-i <= k)
                    return true;
            }
        }
        return false;
    }

}
