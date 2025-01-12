class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0;
        int left = 0;
        int zeroesCount = 0;

        for (int right = 0; right < nums.length; right++) {
            // Count zeros in the current window
            if (nums[right] == 0) {
                zeroesCount++;
            }

            // Shrink the window until zeroesCount is <= k
            while (zeroesCount > k) {
                if (nums[left] == 0) {
                    zeroesCount--;
                }
                left++;
            }

            // Update the maximum length of the window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
