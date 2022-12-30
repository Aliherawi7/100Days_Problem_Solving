package topGoogleQuestions.number32;

import java.util.*;

public class HtmlElement {
    public static void main(String[] args) {
        String element = "<div><div><b></b></div>< /p>";
        String output = htmlElement(element);
        System.out.println(output);
    }

    public  static  String htmlElement(String str){
        ArrayList<String> allEmlement = new ArrayList<>();


        /*in this loop we find all open and close tag in the str string. and add them all in a arraylist*/
        int index = -1;
        for(int i = 0; i < str.length(); i++){
            // if there is '<' character in i index then keep the value in index variable
            if(str.charAt(i) == '<'){
                index = i;
            }
            // if there is '>' character in i index then create a substring from index to i+1 and add it to the arraylist
            if(str.charAt(i) == '>' && index >= 0){
                String tag = str.substring(index, i+1);
                allEmlement.add(tag);
            }
        }
        System.out.println(allEmlement.toString());
        /* in this loop we replace all opened and closed tag with empty string. */
        for(int i =0;  i < allEmlement.size(); i++){
            String openTag = allEmlement.get(i).replace("<", "</");

            for(int j = i+1; j < allEmlement.size(); j++){
                if(allEmlement.get(j).equals(openTag)){
                    allEmlement.set(j, "");
                    allEmlement.set(i, "");
                    break;
                }
            }
        }
        /* if there is any string in array with length higher than
         zero then it is the tag which has not close tag and must be returned */
        for(String tag : allEmlement){
            if(tag.length() > 0){
                return tag.substring(1, tag.length()-1);
            }
        }
        System.out.println(allEmlement.toString());

        /* if the code reach here is means that there
        is no open tag without close tag so the program must return true*/
        return "true";
    }
}
