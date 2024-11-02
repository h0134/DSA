class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left =0;
        int right = n-1;
        while(left<=right){
            int middleIndex = (right+left)/2;
            int middleElement = nums[middleIndex];
            if(target<middleElement){
                right=middleIndex-1;
            
         }
          if(target>middleElement){
                left=middleIndex+1;

         }
           if(target==middleElement){
               return  right=middleIndex;
            
         }
        }
        
     return left;
        
        }
    }
