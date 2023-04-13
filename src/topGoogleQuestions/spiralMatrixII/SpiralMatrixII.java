package topGoogleQuestions.spiralMatrixII;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int[][] output = spiralMatrixII(3);
        System.out.print("[");
        for(int[] row : output){
            for(int col : row){
                System.out.print(col+", ");
            }
            System.out.println();
        }
        System.out.print("]");
    }


    public static int[][] spiralMatrixII(int n){
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        int direction = 1, counter = 1;
        int[][] spiralMatrix = new int[n][n];

        while(counter <= n*n){
            if(direction == 1){
                for(int i = left; i <= right; i++){
                    spiralMatrix[top][i] = counter++;
                }
                direction++;
                top++;
            }else if(direction == 2){
                for(int i = top; i <= bottom; i++){
                    spiralMatrix[i][right] = counter++;
                }
                direction++;
                right--;
            }else if(direction == 3){
                for (int i = right; i >= left; i--){
                    spiralMatrix[bottom][i] = counter++;
                }
                direction++;
                bottom--;
            }else if(direction == 4){
                for(int i = bottom; i >= top; i--){
                    spiralMatrix[i][left] = counter++;
                }
                direction = 1;
                left++;
            }
        }
        return spiralMatrix;
    }
}
