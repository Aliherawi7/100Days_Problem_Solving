package masterDSA.arrays.number2;

public class FindSmallestElementInArray {
    public static void main(String[] args) {
        int[] input = {4,7,3,7,2,1,-3,2};
        int output = findSmallestElement(input);
        System.out.println(output);
    }
    public static int findSmallestElement(int[] numbers){
        int min = 0;
        for (int number : numbers) {
            if (min > number)
                min = number;
        }
        return min;
    }
}
