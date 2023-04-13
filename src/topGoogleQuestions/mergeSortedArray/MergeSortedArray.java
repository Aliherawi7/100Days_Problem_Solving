package topGoogleQuestions.mergeSortedArray;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        mergeSortedArray(nums1, nums2);
        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeSortedArray(int[] array1, int[] array2){
        // step the last number in first array to add new elements after that
        int index = 0;
        for(int i =0; i < array2.length; i++){
            if(array1[index] < array1[i]){
                index = i;
            }
        }
        // add elements from array2 into arrays1
        for (int value : array2) {
            array1[++index] = value;
        }

        // step 2: sort the array1
        for(int i = 0; i< array1.length; i++){
            int temp = i;
            for(int j = i+1; j < array1.length; j++){
                if(array1[temp] > array1[j]){
                    temp = j;
                }
            }
            if(temp != i){
                int holder = array1[i];
                array1[i] = array1[temp];
                array1[temp] = holder;
            }
        }
    }
}
