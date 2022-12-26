package topGoogleQuestions.number21;

import java.util.Arrays;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] numbers1 ={
                {1, 2, 3} ,
                {4, 5, 6} ,
                {7, 8, 9}
        };
        int[][] numbers2 ={
                {1,   2,  3, 4,  5,  6},
                {16, 17, 18, 19, 20, 7},
                {15, 24, 23, 22, 21, 8},
                {14, 13, 12, 11, 10, 9}
        };
        int[] resForNumbers1 = spiralMatrix(numbers1);
        int[] resForNumbers2 = spiralMatrix(numbers2);


        System.out.println("number1 : "+Arrays.toString(resForNumbers1));
        System.out.println("number2 : "+Arrays.toString(resForNumbers2));

    }
    public static int[] spiralMatrix(int[][] numbers){
        int top = 0,  bottom = numbers.length - 1;
        int left = 0, right = numbers[0].length - 1;

        // control the moving direction on 2d array
        int direction = 1;

        //new spiral order array
        int[] spiralOrder = new int[numbers.length * numbers[0].length];

        // control the index of spiralOrder array
        int counter = 0;

        while(top <= bottom && left <= right){

            // it is moving left to right
            if(direction == 1){
                for(int i = top; i <= right; i++){
                    spiralOrder[counter++] = numbers[top][i];
                }
                direction++;
                top++;

                // it is moving from top the bottom at right side
            }else if(direction == 2){
                for(int i = top; i <= bottom; i++){
                    spiralOrder[counter++] = numbers[i][right];
                }
                direction++;
                right--;

            // it is moving from right to left
            }else if(direction == 3){
                for(int i = right; i >= left; i--){
                    spiralOrder[counter++] = numbers[bottom][i];
                }
                direction++;
                bottom--;

            // it is moving from bottom to the up
            }else if(direction == 4){
                for(int i = bottom; i >= top; i--){
                    spiralOrder[counter++] = numbers[i][left];
                }
                direction = 1;
                left++;
            }

        }

        return spiralOrder;
    }
}
