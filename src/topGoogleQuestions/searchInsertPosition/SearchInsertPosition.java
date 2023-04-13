package topGoogleQuestions.searchInsertPosition;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,6};
        int target = 5;
        int index = searchInsertPosition(numbers, target);
        System.out.println(index);
    }

    public static int searchInsertPosition(int[] numbers, int target){
        int index = -1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                index = i;
                break;
            }else if(numbers[i] < target){
                index = i+1;
            }else {
                break;
            }
        }
        return index;
    }
}
