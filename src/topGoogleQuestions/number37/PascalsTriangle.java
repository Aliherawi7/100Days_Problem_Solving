package topGoogleQuestions.number37;

import java.util.Arrays;

public class PascalsTriangle {
    public static void main(String[] args) {
        int[][] pas = getPascalsTriangle(5);
        System.out.println("[");
        for (int[] i : pas){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("]");
    }

    public static int[][] getPascalsTriangle(int numRows){
        int[][] pascalsTriangle = new int[numRows][];

        for(int i =0; i < numRows; i++){
            int[] row = new int[i+1];
            for (int j =0; j < row.length; j++){
                // the first column and last column should always be 1
                if(j == 0 || j == row.length-1){
                    row[j] = 1;
                    continue;
                }
                // get the sum of two numbers directly above row[j]
                row[j] = pascalsTriangle[i-1][j-1]+ pascalsTriangle[i-1][j] ;
            }
            // add the new row to the pascals's triangle
            pascalsTriangle[i] = row;
            // the next row length
        }


        return pascalsTriangle;
    }
}
