package leetCodeChallenges.number3;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(1));
    }

    public static int sqrt(int x){
        if(x == 1 || x == 0) return x;

        int low = 0, high = x;
        while(low <= high){
            int mid = low + (high - low)/2;
            int sqrt = mid * mid;
            System.out.println("sqrt " + sqrt);
            if(sqrt == x){
                System.out.println("mid " + mid);
                return mid;
            }else if(sqrt > x){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return high;
    }
}
