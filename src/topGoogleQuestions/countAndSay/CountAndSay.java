package topGoogleQuestions.countAndSay;

public class CountAndSay {
    public static void main(String[] args) {
        // input = 4
        String number1 = countAndSay(4);
        // output = "1211"
        System.out.println(number1);

        // input = 5
        String number2 = countAndSay(5);
        // output = "111221"
        System.out.println(number2);

    }

    public static String countAndSay(int a){
        if(a == 1) return "1";
        String number = "1";
        for(int i=2; i <= a; i++){
            StringBuilder holder = new StringBuilder();
            for(int j =0; j < number.length(); j++){
                int countRepeated = 0;
                int index = j;
                while(number.charAt(j) == number.charAt(index)){
                    index++;
                    countRepeated++;
                    if(index >= number.length()){
                        break;
                    }
                }
                j = index-1;
                holder.append(countRepeated).append(number.charAt(j));

            }
            number = holder.toString();
        }
        return number;
    }
}
