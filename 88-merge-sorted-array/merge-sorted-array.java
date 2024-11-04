class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int left = m - 1; // Last index of initial values in nums1
        int right = n - 1; // Last index in nums2
        int mergeIndex = m + n - 1; // Last index for merged result in nums1

        // Merge in reverse order to avoid overwriting elements in nums1
        while (left >= 0 && right >= 0) {
            if (nums1[left] > nums2[right]) {
                nums1[mergeIndex] = nums1[left];
                left--;
            } else {
                nums1[mergeIndex] = nums2[right];
                right--;
            }
            mergeIndex--;
        }

        // If any elements are left in nums2, copy them
        while (right >= 0) {
            nums1[mergeIndex] = nums2[right];
            right--;
            mergeIndex--;
        }
    }
}