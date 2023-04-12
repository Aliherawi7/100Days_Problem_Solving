package topGoogleQuestions.number5;

public class StringToInteger {
    public static void main(String[] args) {

     //   int i = stringToInteger("-879-0oiu9809 98 0942");
     //   System.out.println(i);
       // System.out.println(parsInt("-91283472332"));
        System.out.println(parsInt("9223372036854775808"));
        System.out.println(parsInt("   -42"));

      //  System.out.println(Integer.MAX_VALUE-2147483646);

    }

    public static int parsInt(String str) {
        str = str.trim();
        if(str.isEmpty()) return 0;
        long number = 0;
        boolean isNeg = false;
        int i = 0;
        if (str.charAt(i) == '-') {
            isNeg = true;
            i = 1;
        } else if (str.charAt(i) == '+') {
            i = 1;
        }

        for (; i < str.length(); i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                if(number >= Integer.MAX_VALUE){
                    return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                number *= 10;
                number += Character.getNumericValue(str.charAt(i));
            } else {
                break;
            }
        }
        number = (isNeg ? -number : number);
        return (int) number;

    }
}
