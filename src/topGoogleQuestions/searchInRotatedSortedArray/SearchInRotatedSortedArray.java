package topGoogleQuestions.searchInRotatedSortedArray;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;

        System.out.println(searchInRotatedSortedArray(numbers, target));
    }

    public static int searchInRotatedSortedArray(int[] numbers, int target) {

        int high = numbers.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else {
                if (numbers[mid] < numbers[low]) {
                    if (target > numbers[low] && target > numbers[high]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }else {
                    if(target < numbers[high] && target < numbers[low]){
                        low = mid + 1;
                    }else{
                        high = mid - 1;
                    }
                }
            }
        }

        return -1;
    }
}
