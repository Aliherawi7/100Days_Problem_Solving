package topGoogleQuestions.number30;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        // Main List for storing all subsets
        List<List<Integer> > subset = new ArrayList<>();
        // Input ArrayList
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        findSubsets(subset, input, new ArrayList<>(), 0);
        System.out.println(subset.toString());

    }

    // solution 1
    public static void findSubsets(List<List<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> output, int index) {
        // Base Condition
        if (index == nums.size()) {
            subset.add(output);
            return;
        }

        // Not Including Value which is at Index
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);

        // Including Value which is at Index
        System.out.println(nums.get(index));
        output.add(nums.get(index));
        System.out.println(output.toString());
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
    }

    // solution 2

}
