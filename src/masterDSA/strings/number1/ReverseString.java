package masterDSA.strings.number1;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello world";
        String output = reverseString(input);
        System.out.println(output);

        String output2 = reverseStringWithArray(input);
        System.out.println(output2);
    }


    // using string holder
    public static String reverseString(String str){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String reverseStringWithArray(String str){
        char[] reverse = str.toCharArray();
        int tail = 0, head = reverse.length-1;
        while(tail <= head){
            char temp = reverse[tail];
            reverse[tail] = reverse[head];
            reverse[head] = temp;
            head--;
            tail++;
        }
        return new String(reverse);
    }
}
