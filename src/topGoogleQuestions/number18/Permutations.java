package topGoogleQuestions.number18;

import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        int[] input = {1,2,3};
        int[][] perm = getPermutations(input);
        for(int[] n : perm){
            System.out.println(Arrays.toString(n));
        }
    }

    public static int[][] getPermutations(int[] numbers){
        int[][] permutations = new int[factorial(numbers.length)][numbers.length];
        int tail = 0;
        int head = 1;
        for(int i = 0; i < permutations.length; i++){
            int holder = numbers[tail];
            numbers[tail] = numbers[head];
            numbers[head] = holder;
            head++;
            tail++;
            if(head == numbers.length){
                head = 0;
            }
            if(tail == numbers.length){
                tail = 0;
            }

            permutations[i] = Arrays.copyOf(numbers, numbers.length);
        }
        return permutations;
    }

    public static int factorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++)
            factorial *= i;
        return factorial;
    }
}
