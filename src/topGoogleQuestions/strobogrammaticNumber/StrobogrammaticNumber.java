package topGoogleQuestions.strobogrammaticNumber;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {
    public static void main(String[] args) {
        String input1 = "69";
        boolean output1 = isStrobogrammatic(input1);
        System.out.println(output1);
        String input2 = "926";
        boolean output2 = isStrobogrammatic(input2);
        System.out.println(output2);
    }
    public static boolean isStrobogrammatic(String number){
        Map<Character, Character> specialDigits = new HashMap<>();
        specialDigits.put('0','0');
        specialDigits.put('1','1');
        specialDigits.put('6','9');
        specialDigits.put('8','8');
        specialDigits.put('9','6');
        String holder = "";
        for (int i = 0; i < number.length(); i++){
            if(specialDigits.get(number.charAt(i)) == null){
                return false;
            }
            holder = specialDigits.get(number.charAt(i)) + holder;
        }
        return number.equals(holder);
    }
}
