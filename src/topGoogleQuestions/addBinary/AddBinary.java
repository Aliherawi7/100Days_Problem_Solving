package topGoogleQuestions.addBinary;


public class AddBinary {
    public static void main(String[] args) {
        String b1 = "11";
        String b2 = "1";
        String output = addBinary(b1, b2);
        System.out.println(output);
    }

    // add two binary number together
    public static String addBinary(String a, String b){
        if(a.length() <= 0 || a.startsWith("0")) return b;
        if(b.length() <= 0 || b.startsWith("0")) return a;
        // convert the first and second binary string into decimal
        int number1 = binaryStringToInt(a);
        int number2 = binaryStringToInt(b);
        // convert the total of number1 and number2 into binary string
        return Integer.toBinaryString(number1+number2);

    }
    // convert a binary string into a decimal number
    public static int binaryStringToInt(String binary){
        int decimal = 0;
        for (int i =binary.length()-1; i >= 0; i--){
            if(binary.charAt(i) != '0' && binary.charAt(i) != '1'){
                throw new IllegalArgumentException("invalid binary number: at index "+i);
            }
            decimal += ((int)Math.pow(2, i)) * (binary.charAt(i) == '0' ? 0 : 1);
        }
        return decimal;
    }


}
