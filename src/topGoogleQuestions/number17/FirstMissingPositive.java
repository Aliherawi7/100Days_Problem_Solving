package topGoogleQuestions.number17;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] numbers = {1,2,0};
        int output = findFirstMissingPositive(numbers);

        System.out.println(output);
    }



    public static int findFirstMissingPositive(int[] numbers){
        int min = 1;

        // sort the array with selection algorithm
        for(int i = 0; i< numbers.length; i++){
            int index = i;
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[index] > numbers[j]){
                    index = j;
                }
            }
            if(index != i){
                int temp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = temp;
            }
        }
        // iterate over the numbers array
        for (int number : numbers) {
            // check if there is such number in array then increment the min
            if (number == min) {
                min++;
            }
        }
        return min;

    }
}
