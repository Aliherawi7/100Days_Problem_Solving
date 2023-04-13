package topGoogleQuestions.pascalsTriangleII;

import java.util.Arrays;

public class PascalsTriangleII {
    public static void main(String[] args) {
        int[] output = getPascalTriangleRow(3);
        System.out.println(Arrays.toString(output));
    }
    public static int[] getPascalTriangleRow (int rowIndex){
        int[][] pascalsTriangle = new int[rowIndex+1][];

        for(int i =0; i < pascalsTriangle.length; i++){
            int[] row = new int[i+1];
            for(int j = 0; j < row.length; j++){
                if(j == 0 || j == row.length-1){
                    row[j] = 1;
                    continue;
                }
                row[j] = pascalsTriangle[i-1][j-1] + pascalsTriangle[i-1][j];
            }
            pascalsTriangle[i] = row;
        }
        return pascalsTriangle[rowIndex];
    }
}
