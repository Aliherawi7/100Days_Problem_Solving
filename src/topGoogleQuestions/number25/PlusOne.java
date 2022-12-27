package topGoogleQuestions.number25;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] input1 = {1,2,3};
        plusOne(input1);
        System.out.println(Arrays.toString(input1));

        int[] input2 = {4,3,2,9};
        plusOne(input2);
        System.out.println(Arrays.toString(input2));

    }

    public static void plusOne(int[] numbers){
        int current = 1;
        for(int i = numbers.length-1; i >= 0; i--){
            current += numbers[i];
            numbers[i] = current%10;
            current /= 10;
        }

    }
}
