package topGoogleQuestions.number27;

public class RemoveConsecutiveDublicates {
    public static void main(String[] args) {
        String input = "hhhhhhheellllllloooo";
        String output = removeConsecutiveDublicates(input);
        System.out.println(output);
    }

    public static String removeConsecutiveDublicates(String input){
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
}
