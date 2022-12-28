package topGoogleQuestions.number29;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] input1 = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        System.out.println(searchInArray(input1, 50));
    }
    public static boolean searchInArray(int[][] numbers, int target){
        int row = numbers.length;
        int col = numbers[0].length;
        if(row == 0 || col == 0) return false;

        int low = 0, high = row * col - 1;

        while(low <= high){
            // low + (high - low)/2 is a way to find the distance between two numbers and their mid
            int mid = low + (high - low)/2;
            // to get the index of mid row divide mid by col and to get index of mid col get remainder of mid/col
            int i = mid/col, j = mid % col;

            if(numbers[i][j] == target){
                return true;
            }else if(numbers[i][j] < target){
                low = mid + 1;
            }else {
                high = mid - 1;
            }

        }
        return false;
    }
}
