package leetCodeChallenges.subSetsII;

import java.util.*;

public class SubSetsII {
    public static void main(String[] args) {
        int[] inputs = {1,2,3};
        subsets(inputs).forEach(System.out::println);
    }

    /*
    * simple solution
    * if we have some subsets generated from input numbers and we want to
    * add one more can take all already existing subsets and generated new
    * ones by appending the new number to each of the existing.
    *
    * For example : {1, 2, 3}
    * 1. start with an empty subset : {[]}
    * 2. create new subsets by adding "1" to each existing subset.
    * it will be: {[], [1]}
    * 3. create new subsets by adding "2" to each existing subset.
    * it will be: {[], [1], [2], [1,2]}
    * 4. create new subsets by adding "3" to each existing subset.
    * it will be: {[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]}
    *
    * */

    public static Set<ArrayList<Integer>> subsets(int[] nums){
        // this is where we store all subset
        List<ArrayList<Integer>> subsets = new ArrayList<>();
        // first we add an empty subset
        subsets.add(new ArrayList<>());

        // iterate over the input numbers
        for (int number : nums) {
            // store the subset size into a variable because the its size will increase in second loop
            int setLength = subsets.size();
            // iterate over the all subsets
            for (int j = 0; j < setLength; j++) {
                // take a subset and create a copy of it
                ArrayList<Integer> subHolder = new ArrayList<>(subsets.get(j));
                // add the number to it
                subHolder.add(number);
                // then add the subHolder to subsets
                subsets.add(subHolder);
            }
        }
        //
        return new HashSet<>(subsets);
    }

}
