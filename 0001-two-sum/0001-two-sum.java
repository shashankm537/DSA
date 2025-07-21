import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store the value and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Calculate the complement
            
            // If complement is already in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            
            // If not found, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // If no pair is found (this is guaranteed to not happen in this problem)
        throw new IllegalArgumentException("No two sum solution");
    }
}
