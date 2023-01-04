package masterDSA.arrays.number3;

import java.util.ArrayList;
import java.util.Arrays;

public class FindContiguousSubarray {
    public static void main(String[] args) {
        int[] numbers = {4,5,6,2,3,6,7};
        int output = findContiguousSubarray(numbers);
        System.out.println("total of subarray : " + output);
    }

//    [4,5,6,2,3,6,7]
    public static int findContiguousSubarray(int[] arr){
        ArrayList<Integer> subarray = null;
        int sum =0;
        for(int i = 0; i <arr.length; i++){
            // create a new empty subarray and add the current element to it
            ArrayList<Integer> sub = new ArrayList<>();
            sub.add(arr[i]);

            // add the all contiguous numbers
            while(i < arr.length-2 && arr[i+1] - arr[i]==1){
                i++;
                sub.add(arr[i]);
            }
            // calculate the total of new sub array
            int totalSubarray = sub.stream().mapToInt(num -> num).sum();

            // if the total element of sub array is greater than previous subarray
            // then assign the sub to the subarray and totalSubarray to the sum variable
            if(sum < totalSubarray){
                subarray = sub;
                sum = totalSubarray;
            }
        }
        System.out.println("The subarray: "+subarray);
        return sum;
    }
}
