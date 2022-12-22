package topGoogleQuestions.number3;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median = medianOfTwoSortedArray(nums1, nums2);
        System.out.println(median);
    }


    public static double medianOfTwoSortedArray(int[] nums1, int[] nums2){
        int length = nums1.length + nums2.length;
        int[] mainArray = new int[length];

        //copy the first array into main array
        for(int i = 0; i < nums1.length; i++){
            mainArray[i] = nums1[i];
        }

        // copy the second array into main array;
        int counter = nums1.length;
        for(int i=0; i<nums2.length; i++){
            System.out.println(i);
            mainArray[counter] = nums2[i];
            counter++;
        }
        System.out.println(Arrays.toString(mainArray));
        // sort the main array
        for(int i=0; i< mainArray.length-1; i++){
            int holder = mainArray[i];
            int index = i;
            for(int j = i+1; j < mainArray.length; j++){
                if(mainArray[j] < holder){
                    holder = mainArray[j];
                    index = j;
                }
            }
            if(index != i){
                mainArray[index] = mainArray[i];
                mainArray[i] = holder;
            }
        }
        System.out.println(Arrays.toString(mainArray));


        if(mainArray.length % 2 == 0){
            return (mainArray[mainArray.length/2]+mainArray[mainArray.length/2-1]) / 2.0;
        }

        return mainArray[mainArray.length/2];
    }
}
