package topGoogleQuestions.number22;

public class JumpGame {
    public static void main(String[] args) {
        int[] input1 = {2,3,1,1,4};
        boolean output1 = jumpGame(input1);
        System.out.println(output1);
        int[] input2 = {3,2,1,0,4};
        boolean output2 = jumpGame(input2);
        System.out.println(output2);
    }

    public static boolean jumpGame(int[] numbers){
        if(numbers.length <=1) return false;

        int index = 0;
        while(index < numbers.length){
            // if the element is
            if(numbers[index] <= 0){
                return false;
            }
            // jump from index to index + numbers[index]
            index += numbers[index];
        }
        return true;
    }
}
