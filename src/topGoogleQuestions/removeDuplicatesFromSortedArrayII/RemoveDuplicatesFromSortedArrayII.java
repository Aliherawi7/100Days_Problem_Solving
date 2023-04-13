package topGoogleQuestions.removeDuplicatesFromSortedArrayII;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] input = {1,1,1,2,2,3};
        int output = removeDuplicatesFromSortedArray(input);
        System.out.println(output);
    }

    public static int removeDuplicatesFromSortedArray(int[] numbers) {

        int slow = 0, fast = 1, count;
        for (; fast < numbers.length; fast++) {
            count = 1;
            // this loop go ahead and find the last consecutive repeated number
            while (fast < numbers.length && numbers[fast] == numbers[fast - 1]) {
                count++;
                // if count is equal to 2 then increase the slow and put the number[fast] into number[slow+1]
                if (count == 2) {
                    count++;
                    numbers[++slow] = numbers[fast];
                }
                fast++;
            }

            // bring the new unrepeated number at the end of new subarray
            if (fast < numbers.length && numbers[slow] != numbers[fast]) {
                System.out.println(Arrays.toString(numbers));
                numbers[++slow] = numbers[fast];
            }
        }
        System.out.println(Arrays.toString(numbers));
        return slow + 1;
    }

}
