package topGoogleQuestions.number33;

public class ReverseNumber {
    public static void main(String[] args) {
        int input = 12345;
        int output = reverseNumber(input);
        System.out.println(output);
    }

    public static int reverseNumber(int number){
        int holder = 0;
        // the loop will iterate while the number is not zero if the number is zero it will stop
        while(number != 0){
            // get the last digit of the input number
            int remainder = number % 10;
            // remove the last digit from input number
            number = number/10;
            // add a zero at the end of the holder
            holder = holder * 10;
            // add the remainder digit at the end of the holder
            holder += remainder;
        }
        return holder;
    }
}
