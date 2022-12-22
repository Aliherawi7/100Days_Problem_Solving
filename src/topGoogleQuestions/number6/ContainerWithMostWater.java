package topGoogleQuestions.number6;

public class ContainerWithMostWater {
    public static void main(String[] args) {
       int [] nums = {1,8,6,2,5,4,8,3,7};
     //   int [] nums = {1,5,4,3};
        System.out.println("result : "+getMaxContainer(nums));
    }
    //Input: [1,8,6,2,5,4,8,3,7]
    public static int getMaxContainer(int[] nums){
        int max = 0;
        for (int i = 0; i< nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                // get the min height of the container
                int height = Math.min(nums[i], nums[j]);
                // get the base of the container
                int base = j - i;
                // calculate the area of the container
                int currentValue = height * base;

                // if the new area is bigger than older, replace the new one
                if(max < currentValue){
                    max = currentValue;
                }
            }
        }
        return max;
    }

}
