package masterDSA.arrays.number4;

import java.util.Arrays;

public class SortShortArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,1,2,1,1,1,0,2,0};
        sortArray(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] input2 = {2,1,0};
        sortShortArray(input2);
        System.out.println(Arrays.toString(input2));
    }

    // this method if for all size of integer array
    public static void sortArray(int[] numbers){
        for(int i =0; i < numbers.length; i++){
            int index = i;
            for (int j = i+1; j < numbers.length; j++){
                if(numbers[j] < numbers[index]){
                    index = j;
                }
            }
            if(index != i){
                int temp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = temp;
            }
        }
    }
    // this method is for array of size 3
    public static void sortShortArray(int[] numbers){
        if(numbers[0] > numbers[1] || numbers[0] > numbers[2]){
            if(numbers[0] > numbers[1]){
                int temp = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = temp;
            }
            if(numbers[0] > numbers[2]){
                int temp = numbers[0];
                numbers[0] = numbers[2];
                numbers[2] = temp;
            }
        }
        if(numbers[1] > numbers[2]){
            int temp = numbers[1];
            numbers[1] = numbers[2];
            numbers[2] = temp;
        }
    }

}
