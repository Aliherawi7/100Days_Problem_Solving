package topGoogleQuestions.number44;

public class PowerOfTwo {
    public static void main(String[] args) {
        int input1 = 1;
        boolean output1 = isPowerOfTwo(input1);
        System.out.println("input 1: " + input1 + "\noutput 1: " + output1);

        int input2 = 16;
        boolean output2 = isPowerOfTwo(input1);
        System.out.println("input 2: " + input2 + "\noutput 2: " + output2);
    }
    public static boolean isPowerOfTwo(int number){
        int i = 0, holder = 0;
        while(Math.pow(2, i) <= number)
            holder = (int) Math.pow(2, i++);

        return holder == number;
    }
}
