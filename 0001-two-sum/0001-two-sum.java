class Solution {
    public int[] twoSum(int[] nums, int target) {
     int n = nums.length;
        int[][] arr = new int[n][2]; // value, original index
        
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0])); // sort by value
        
        int left = 0, right = n - 1;
        
        while (left < right) {
            int sum = arr[left][0] + arr[right][0];
            
            if (sum == target) {
                return new int[]{arr[left][1], arr[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        throw new IllegalArgumentException("No solution found");
     
    }
}