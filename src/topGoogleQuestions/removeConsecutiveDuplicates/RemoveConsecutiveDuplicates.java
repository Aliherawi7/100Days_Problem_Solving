package topGoogleQuestions.removeConsecutiveDuplicates;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        // solution 1
        String input1 = "hhhhhhheellllllloooo";
        String output1 = removeConsecutiveDuplicates(input1);
        System.out.println(output1);

        // solution 2
        String input2 = "hhhhhhheellllllloooo";
        String output2 = removeConsecutiveDup(input2);
        System.out.println(output2);
    }

    // solution 1
    public static String removeConsecutiveDuplicates(String input){
        // create a empty stringBuilder to append each single character from the input string
        StringBuilder output = new StringBuilder();
        // iterate over the input string
        for(int i =0; i< input.length(); i++){
            // append the current character at i index from input string
            output.append(input.charAt(i));

            // if there are any consecutive duplicate character in the
            // next index, then increment the i index to the new not duplicated character's index
            while(i < input.length()-1 && input.charAt(i) == input.charAt(i+1)){
                i++;
            }
        }
        return output.toString();
    }

    // solution 2
    public static String removeConsecutiveDup(String input){
        // create an empty StringBuilder object
        StringBuilder output = new StringBuilder();
        // append the first letter of the input string
        output.append(input.charAt(0));

        // iterate over the input string
        for(int i = 1; i < input.length(); i++){

            // check if the the current character from input string is not equal to
            // the last character of output string, then append it to output
            if(input.charAt(i) != output.charAt(output.length()-1)){
                output.append(input.charAt(i));
            }
        }
        return output.toString();
    }
}
