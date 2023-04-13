package topGoogleQuestions.searchInRotatedSortedArrayII;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;
        boolean output = searchInRotatedSortedArrayII(nums, target);
        System.out.println(output);
    }


    public static boolean searchInRotatedSortedArrayII(int[] numbers, int target){
        int low = 0, high = numbers.length-1;
        // [4,5,6,0,1,2,3]
        while(low <= high){
            if(numbers[high] == target || numbers[low] == target)
                return true;
            int mid = low + (high - low)/2;
            System.out.println(" mid "+mid);
            if(numbers[mid] == target){
                return true;
            // if target number is bigger o smaller than number[mid]
            } else {
                // check if the number[mid] is lower than number[low]
                if (numbers[mid] < numbers[low]) {
                    // check if the target is greater than number[low] and  greater than number[high]
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
        return false;
    }
}
