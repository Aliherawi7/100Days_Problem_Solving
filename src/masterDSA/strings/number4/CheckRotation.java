package masterDSA.strings.number4;

public class CheckRotation {
    public static void main(String[] args) {
        String input = "abcd";
        String target = "bdca";
        System.out.println(checkRotation(input, target));
    }

    /* in this solution, I used concatenating solution, the way is to creating another string by concatenating first string with itself.
     and then check if the target string is substring of concatenated string
     for example: "JavaProgrammer" => after concatenated => "JavaProgrammerJavaProgrammer"
     now it contains every possible rotation of first string
     */

    public static boolean checkRotation(String str, String target){
        if(str.length() != target.length()) return false;

        str = str.concat(str);
        return str.contains(target);
    }


}
