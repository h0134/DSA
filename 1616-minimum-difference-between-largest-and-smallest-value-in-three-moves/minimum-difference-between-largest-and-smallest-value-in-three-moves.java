class Solution {
    public int minDifference(int[] nums) {
      Arrays.sort(nums);
        
        int n = nums.length;
        if (n <= 4) {
            return 0;
        }

        // We can change up to 3 elements, so we need to consider the following cases:
        // 1. Remove the three largest elements
        // 2. Remove the three smallest elements
        // 3. Remove two smallest and one largest
        // 4. Remove one smallest and two largest
        // Each scenario will give us a candidate for the smallest difference.

        int minDiff = Integer.MAX_VALUE;
        // Remove 0 largest and 3 smallest
        minDiff = Math.min(minDiff, nums[n-4] - nums[0]);
        // Remove 1 largest and 2 smallest
        minDiff = Math.min(minDiff, nums[n-3] - nums[1]);
        // Remove 2 largest and 1 smallest
        minDiff = Math.min(minDiff, nums[n-2] - nums[2]);
        // Remove 3 largest and 0 smallest
        minDiff = Math.min(minDiff, nums[n-1] - nums[3]);

        return minDiff;

        }
}