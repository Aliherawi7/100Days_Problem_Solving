package masterDSA.arrays.number6;

import java.util.Arrays;

public class SumOfTwoELement {
    public static void main(String[] args) {
        int[] numbers = {2,4,5,6,3,1};
        int target = 11;
        int[] output = getIndicesOfTwoELements(numbers, target);
        System.out.println(Arrays.toString(output));
    }

    public static int[] getIndicesOfTwoELements(int[] numbers, int target){
        for(int i =0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
