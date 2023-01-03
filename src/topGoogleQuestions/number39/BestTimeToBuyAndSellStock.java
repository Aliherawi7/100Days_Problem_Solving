package topGoogleQuestions.number39;

import java.util.ArrayList;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] numbers = {7,1,5,3,6,4};
        int output = bestTimeToBuyAndSellStock(numbers);
        System.out.println(output);
    }

    public static int bestTimeToBuyAndSellStock(int [] numbers){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i =1; i < numbers.length; i++){
            System.out.println(numbers[i] - numbers[i-1]);
            list.add(numbers[i] - numbers[i-1]);

        }
        System.out.println(" second for loop");
        int max = Math.max(0, list.get(0));
        for(int i = 1; i < list.size(); i++){
            if(list.get(i-1) > 0){
                list.set(i, list.get(i)+list.get(i-1));
            }
            System.out.println(list.get(i));
            max = Math.max(max, list.get(i));
        }

        return max;
    }
}
