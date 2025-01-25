class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left=0;
        int right= nums.length-1;
       
        while(left<=right){
            int middleIndex= (left+right)/2;
            if(target==nums[middleIndex]){
                return middleIndex;
            }
            else if(target>nums[middleIndex]){
                left=middleIndex+1;
            }
            else if(target<nums[middleIndex]){
                right=middleIndex-1;
            }
            
            
        }
                        return left;

    }
}