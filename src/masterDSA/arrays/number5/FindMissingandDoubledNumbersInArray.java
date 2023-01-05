package masterDSA.arrays.number5;

public class FindMissingandDoubledNumbersInArray {
    public static void main(String[] args) {
        int[] number = {1,2,3,5,6,6};
        findMissingAndTwiceOccurs(number);
    }


    public static void findMissingAndTwiceOccurs(int[] numbers){
        // step 1 sort the array
        for (int i = 0; i < numbers.length; i++){
            int index = i;
            for(int j=0; j < numbers.length; j++){
                if(numbers[j] < numbers[index]){
                    index = j;
                }
            }
            if(index != i){
                int temp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = temp;
            }
        }

        // find the missing and twice occurs numbers
        int missing = -1;
        int twiceOccurs = -1;
        for(int i = 0; i < numbers.length-1; i++){
            if(numbers[i+1] - numbers[i] > 1){
                missing = numbers[i]+1;
            }
            if(numbers[i+1] - numbers[i] == 0){
                twiceOccurs = numbers[i];
            }
        }
        System.out.println("missing number " + missing);
        System.out.println("twice occur number " + twiceOccurs);
    }
}
