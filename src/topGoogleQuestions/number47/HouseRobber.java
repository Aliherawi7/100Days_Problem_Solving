package topGoogleQuestions.number47;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] input1 = {1,2,3,1};
        int output1 = totalMoneyOsHouses(input1);
        System.out.println("input 1 : "+ Arrays.toString(input1) +"\noutput 1: "+output1);
        int[] input2 = {2,7,9,3,1};
        int output2 = totalMoneyOsHouses(input2);
        System.out.println("input 1 : "+ Arrays.toString(input2) +"\noutput 1: "+output2);

    }
    public static int totalMoneyOsHouses(int[] houses){
        int total = 0;
        for(int i =0; i < houses.length; i+=2){
            total += houses[i];
        }
        return total;
    }
}
