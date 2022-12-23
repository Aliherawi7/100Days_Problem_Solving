package topGoogleQuestions.number11;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] numbers = {0,0,1,1,1,2,2,3,3,4};
        int length = removedDubplicatesFromSortedArray(numbers);
        System.out.println(length);
        System.out.println(Arrays.toString(numbers));
    }

    public static int removedDubplicatesFromSortedArray(int[] numbers){
        // the tail var is for controlling index of the unrepeated numbers and the head var is used to control index og the repeated numbers
        int tail = 0, head = 1;

        // iterate over the array
        for (; head < numbers.length; head++){
            // go after the repeated numbers
            while(numbers[head] == numbers[head-1]){
                head++;
                // if it goes up to the end of array then stop going
                if(head >= numbers.length)
                    break;

            }
            // if head is a valid index number
            if(head < numbers.length){
                tail++;
                // then swap the next new unrepeated number with the second repeated number from the tail
                numbers[tail] = numbers[head];
            }
        }
        // the tail is the total number of the unrepeated numbers based on index. so the total is tail + 1
        return tail + 1;
    }
}
