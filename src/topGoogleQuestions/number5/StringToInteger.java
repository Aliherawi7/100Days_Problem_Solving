package topGoogleQuestions.number5;

public class StringToInteger {
    public static void main(String[] args) {

        int i = stringToInteger("-879-0oiu9809 98 0942");
        System.out.println(i);
    }


    public static int stringToInteger(String stringNumber) throws IllegalArgumentException{
        if(stringNumber.isEmpty())
            throw new IllegalArgumentException("Invalid string value: String is empty!");

        int number = 0;
        int digitCounter = 0;
        boolean isNegative = false;
        for(int i =0; i < stringNumber.length(); i++){
            char currentChar = stringNumber.charAt(i);
            if(currentChar < '0' || currentChar >'9'){
                if(currentChar == ' ' && digitCounter == 0){
                    continue;
                }
                if(currentChar == '-' && digitCounter == 0){
                    isNegative = true;
                }else {
                    if(digitCounter > 0)
                        return isNegative ? number*-1 : number;
                    else
                        return 0;
                }
            }
            if(currentChar >= '0' && currentChar <= '9'){
                digitCounter++;
                // get the digit value of the character for ex: '9' => 9
                int digit = getDigitNumber(currentChar);
                // add the digit to the number
                number = (int) ((number + (digit/10.0))*10);
               // System.out.println(number);
            }
        }
        return isNegative ? number*-1 : number;
    }
    public static int getDigitNumber(char ch){
        int digit;
        switch (ch){
            case '0':
                digit = 0;
                break;
            case '1':
                digit = 1;
                break;
            case '2':
                digit = 2;
                break;
            case '3':
                digit = 3;
                break;
            case '4':
                digit = 4;
                break;
            case '5':
                digit = 5;
                break;
            case '6':
                digit = 6;
                break;
            case '7':
                digit = 7;
                break;
            case '8':
                digit = 8;
                break;
            case '9':
                digit = 9;
                break;
            default:
                throw new IllegalArgumentException("The character is not a digit");
        }
        return digit;
    }
}
