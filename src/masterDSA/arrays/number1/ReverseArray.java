package masterDSA.arrays.number1;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void reverseArray(int[] numbers){
        int tail = 0,  head = numbers.length - 1;

        while(tail <= head){
            int temp = numbers[tail];
            numbers[tail] = numbers[head];
            numbers[head] = temp;
            tail++;
            head--;
        }
    }
}
