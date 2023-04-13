package topGoogleQuestions.singleNumber;

public class SingleNumber {
    public static void main(String[] args) {
        int[] numbers = {4,1,2,1,2};
        int output = findSingleNumber(numbers);
        System.out.println("solution 1: " + output);
        int  output2 = findSingleNumberII(numbers);
        System.out.println("solution 2: " + output2);

    }
    //solution 1
    public static int findSingleNumber(int[] numbers){
        for (int number : numbers) {
            int count = 0;
            for (int i : numbers) {
                if (number == i) {
                    count++;
                }
            }
            if (count == 1) {
                return number;
            }
        }
        return 0;
    }


    // solution 2
    public static int findSingleNumberII(int[] numbers){
        int count = 0;
        for(int number : numbers){
            count ^= number;
        }
        return count;
    }
}
