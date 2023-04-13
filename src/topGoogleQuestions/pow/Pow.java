package topGoogleQuestions.pow;

public class Pow {
    public static void main(String[] args) {
        double result = pow(2.0000,  10);
        System.out.println(result);
    }
    public static double pow(double base, int pow){
        double total = base;

        for(int i = 1; i < Math.abs(pow); i++){
            total *= base;
        }

        if(pow > 0)
            return total;
        else
            return 1.0/total;
    }
}
