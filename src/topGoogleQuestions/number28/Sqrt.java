package topGoogleQuestions.number28;

public class Sqrt {
    public static void main(String[] args) {
        int input = 61;
        double output = sqrt(input);
        System.out.println(output);
    }


    public static double sqrt(int number){
        if(number == 0 || number == 1) return number;
        if(number < 0) throw new ArithmeticException("no answer for sqrt of negative number");
        long s = System.currentTimeMillis();
        double low =0, high = number / 2.0;

        while(low <= high){
            double mid = low + (high - low) / 2.0;
            double sqrt = mid * mid;
            if(sqrt == number){
                return mid;
            }else if(sqrt > number){
                high = mid - 0.01;
            }else {
                low = mid + 0.01;
            }
        }
        System.out.println("total time(millis): "+(System.currentTimeMillis()-s));
        return high;
    }
}
