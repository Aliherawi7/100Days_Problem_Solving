package topGoogleQuestions.maximumSubarray;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("input: " + Arrays.toString(numbers));

        int max = maximumSubarray(numbers);
        System.out.println("output: " + max);
    }


    public static int maximumSubarray(int[] numbers) {
        if (numbers.length <= 0)
            return 0;

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > 0)
                numbers[i] += numbers[i - 1];

            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }
}
