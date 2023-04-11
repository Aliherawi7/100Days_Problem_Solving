package interview.flipImageHorizontally;

import java.util.Arrays;

public class FlipImageHorizontally {

    public static void main(String[] args) {
        int[][] images = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] image = flipHorizontally(images);
        for(int[] img : image){
            System.out.println(Arrays.toString(img));
        }
    }

    public static int[][] flipHorizontally(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0;
            int end = image[i].length - 1;

            // this loop is reversing the row
            while (start != end) {
                int holder = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = holder;
                start++;
                end--;
            }
            // this for is inverting the row
            for(int j = 0; j < image[i].length; j++){
                image[i][j] = image[i][j] == 1 ? 0:1;
            }

        }
        return image;
    }
}
