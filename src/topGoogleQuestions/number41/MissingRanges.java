package topGoogleQuestions.number41;

import java.util.ArrayList;

public class MissingRanges {
    public static void main(String[] args) {
        int[] input = {0, 1, 3, 50, 75};
        ArrayList<String> ranges = findAllMissingRanges(input, 0, 99);
        System.out.println(ranges);

    }

    public static ArrayList<String> findAllMissingRanges(int[] numbers, int min , int max){
        ArrayList<String> missingRanges = new ArrayList<>();
        int prev = min;
        String temp = "";
        for(int num : numbers){
            if (num - prev > 1){
                temp = (prev+1) + "->"+(num-1);
                if(num - prev ==2){
                    temp = ""+(prev+1);
                }

                missingRanges.add(temp);
            }
            prev = num;
        }
        if(prev != max){
            temp = (prev+1) + "->"+(max);
            missingRanges.add(temp);
        }
        return missingRanges;
    }
}
