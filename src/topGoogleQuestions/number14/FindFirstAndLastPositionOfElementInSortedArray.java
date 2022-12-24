package topGoogleQuestions.number14;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        int[] numbers = {5,7,7,8,8,10};
        int target = 8;
        numbers = findFirstAndLastPositionOfElementInSortedArray(numbers, target);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] findFirstAndLastPositionOfElementInSortedArray(int[] numbers, int target){

        int low = 0;
        int high = numbers.length;
        int mid;

        while(low <= high){
            mid = (low + high) / 2;
            if(target == numbers[mid]){
                int firstIndex = mid;

                while(mid != 0 && numbers[firstIndex] == numbers[firstIndex - 1]){
                    firstIndex--;
                    if(firstIndex == 0)
                        break;
                }
                int lastIndex = mid;
                while(numbers[lastIndex] == numbers[lastIndex + 1]){
                    lastIndex++;
                    if(lastIndex == numbers.length-1)
                        break;
                }
                return new int[]{firstIndex, lastIndex == mid ? -1 : lastIndex};

            }else if(target > numbers[mid]){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
