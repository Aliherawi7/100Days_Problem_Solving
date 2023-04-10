package leetCodeChallenges.number6;

import java.util.*;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        String solution1 = solution1(num);
        System.out.println(solution1);
        String solution2 = solution2(num);
        System.out.println(solution2);
    }
    public static String solution1(int number){
        int[] staticNumbers = {1000, 900, 500, 400, 100, 90,50,40, 10, 9,5,4,1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V","IV", "I"};
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < roman.length; i++){
            while( number >= staticNumbers[i]){
                result.append(roman[i]);
                number -= staticNumbers[i];
            }
        }
        return result.toString();
    }
    public static String solution2(int number){
        String[] ONES = {"", "I","II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] TENS = {"", "X","XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] HRNS = {"", "C","CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] THS = {"", "M","MM", "MMM"};
        return THS[number/1000] + HRNS[(number%1000)/100] + TENS[(number%100)/10]+ONES[number%10];
    }


}
