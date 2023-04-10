package interview.hammingDistance;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(distance(3, 4));
        System.out.println(bit(6));
        System.out.println(bit(5));
        System.out.println(hammingDistance(1, 4));
        System.out.println(distance(1, 4));
    }

    // solution number 1
    public static int hammingDistance(int x, int y){
        return Integer.bitCount(x ^ y);
    }
    // solution number 2
    public static int distance(int x, int y) {
        int counter = 0;
        while (x > 0 || y > 0) {
            if (x % 2 != y % 2 ) {
                counter++;
            }
            x /= 2;
            y /= 2;
        }
        return counter;
    }


    // see how a number get stored in a short data type
    public static String bit(int number) {
        String bits = "";
        int counter = 1;
        boolean negCondition = number < 0;
        while (number != 0) {
            if (negCondition) {
                if (counter == 1) {
                    bits = 1 + "";
                } else {
                    int holder = number % 2;
                    if (holder == -1) {
                        bits = 0 + bits;
                    } else {
                        bits = 1 + bits;
                    }
                }
            } else {
                bits = number % 2 + bits;
            }
            number /= 2;
            counter++;
        }
        while (counter <= 16) {
            if (negCondition) {
                bits = 1 + bits;
            } else {
                bits = 0 + bits;
            }
            counter++;
        }
        return bits;
    }
}
