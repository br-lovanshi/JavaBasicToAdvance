import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store numbers and their indices
        HashMap<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the hashmap
            if (numIndices.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{numIndices.get(complement), i};
            }

            // If not found, store the current number and its index in the hashmap
            numIndices.put(nums[i], i);
        }

        // If no solution is found, return an empty array or throw an exception
        throw new IllegalArgumentException("No two numbers add up to the target");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
