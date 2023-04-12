package topGoogleQuestions.number1;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] Given_nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(Given_nums, target);
        System.out.println(Arrays.toString(result));
    }


    public static int[] twoSum(int[] array, int target){
        int[] indexArray = {-1, -1};

        for(int i =0; i < array.length-1; i++){
            for(int j = i+1; j <array.length; j++){
                if((array[i]+array[j]) == target){
                    indexArray[0] = j;
                    indexArray[1] = j;
                    return indexArray;
                }
            }

        }

        return indexArray;
    }

}
