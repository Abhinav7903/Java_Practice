

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // If no solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int targetSum = 9;
        int[] result = twoSum(nums, targetSum);
        System.out.println("Indices of the two numbers that add up to " + targetSum + ": " + Arrays.toString(result));
    }
}
