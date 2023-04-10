package leetCodeChallenges.number5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println("Enter the number of paired parentheses");
        ArrayList<String> parentheses = new ArrayList<>();
        recurse(parentheses, 0, 0, "", n);
        System.out.println(new HashSet<>(parentheses));
    }


    /*
    * function which generates all possible n pairs of balanced parentheses
    * open : count of the number of open parentheses used in generating the current string s.
    * close: count of the number of closed parentheses used in  generating the current sting s.
    * s: currently generated string
    * list : a list of string to store all the valid parentheses
    * */
    static int count = 0;
    public static void recurse(ArrayList<String> list, int open, int close, String s, int n){
        /*
        * if the count of both open and close parentheses reaches n
        * it means we have generated a valid parentheses. so we add
        * the currently generated string to the final list and return.
        * */
        if(open == n && close == n){
            count++;
            System.out.println(count + ": when adding the string: " + s);
            list.add(s);
            return;
        }

        /*
        * At any index i in the generation of the string s,
        * we can put an open parentheses only if its count
        * until that time is less than n.
        * */
        if(open < n){
            System.out.println(count +": in open if :"+s);
            recurse(list, open+1, close, s + "(", n);
        }

        /*
        * At any index i in the generation of the string s,
        * we can put a close parentheses only if its count
        * until that time is less than the count of open parentheses
        * */
        if(close < open){
            System.out.println(count +": in close if :"+s);
            recurse(list, open, close + 1, s + ")", n);
        }
    }
}
