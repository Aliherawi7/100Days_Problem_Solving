package topGoogleQuestions.number46;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] input1 = {3,2,3};
        int output1 = findMajorityElement(input1);
        System.out.println("input 1 : "+ Arrays.toString(input1) +"\noutput 1: "+output1);

        int[] input2 = {2,2,1,1,1,2,2};
        int output2 = findMajorityElement(input2);
        System.out.println("input 2 : "+ Arrays.toString(input2) +"\noutput 2: "+output2);
    }


    public static int findMajorityElement(int[] numbers){
        Map<Integer, Integer> elementRepetition = new HashMap<>();
        for(int n : numbers){
            elementRepetition.put(n, elementRepetition.getOrDefault(n, 0)+1);
        }
        int key = numbers[0] , max = 0;
        for(int k : elementRepetition.keySet()){
            if(elementRepetition.get(k) > max){
                key = k;
                max = elementRepetition.get(k);
            }
        }
        return key;
    }

}
