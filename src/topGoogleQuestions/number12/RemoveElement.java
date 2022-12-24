package topGoogleQuestions.number12;

import java.awt.print.PageFormat;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println("--- first test ---");
        int[] numbers = {0,1,2,2,3,0,4,2};
        int value = 2;
        int l = removeElement(numbers, value);
        System.out.println("new length : "+l);
        System.out.println(Arrays.toString(numbers));
        System.out.println("--- second test ---");
        int[] numbers2 = {3,2,2,3};
        int value2 = 3;
        int l2 = removeElement(numbers2, value2);
        System.out.println("new length : "+l2);
        System.out.println(Arrays.toString(numbers2));
    }

    public static int removeElement(int[] numbers, int value){
        // this variable is for controlling the new length
        int newLength = 0;
        // this variable control the index of the target element
        int head;
        for (int i =0; i < numbers.length; i++){
            head = i;
            // check if the current element is equal to the target number
            if(numbers[i] == value){
                // check if next adjacent numbers are the same. then get the last one's index
                while(numbers[head] == value){
                    head++;
                    if(head >= numbers.length)
                        break;
                }
                // the loop will continue iteration from the next number of the target number
                i = head;
            }
            // if i is a valid index then replace the numbers[newLength] with numbers[i]
            if(i < numbers.length)
                numbers[newLength] = numbers[i];

            newLength++;
        }
        return newLength - 1;
    }
}
