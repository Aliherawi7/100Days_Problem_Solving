package topGoogleQuestions.number42;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public static void main(String[] args) {
        int[] inputs = {0,1,0,1,0,1,99};
        int output = singleNumberII(inputs);
        System.out.println(output);
    }

    public static int singleNumberII(int[] numbers){
        Map<Integer, Integer> nums = new HashMap<>();

        for (int n : numbers)
            nums.put(n, nums.getOrDefault(n, 0) + 1);


        for(int key : nums.keySet())
            if(nums.get(key) == 1){
                return key;
            }

        return 0;
    }

}
