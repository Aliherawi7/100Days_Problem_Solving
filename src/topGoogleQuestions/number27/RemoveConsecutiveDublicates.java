package topGoogleQuestions.number27;

public class RemoveConsecutiveDublicates {
    public static void main(String[] args) {
        String input = "hhhhhhheellllllloooo";
        String output = removeConsecutiveDublicates(input);
        System.out.println(output);
    }

    public static String removeConsecutiveDublicates(String input){

        StringBuilder output = new StringBuilder();

        for(int i =0; i< input.length(); i++){
            output.append(input.charAt(i));
            while(i < input.length()-1 && input.charAt(i) == input.charAt(i+1)){
                i++;
            }
        }
        return output.toString();
    }
}
