class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
           int mid = (left+right)/2;
           if(target==nums[mid]){
            return mid;
           }
           else if(target<nums[mid]){
            right=mid-1;
           }
           else if(target>nums[mid]){
            left=mid+1;
           }
        }  
      return left;
      
    }
}