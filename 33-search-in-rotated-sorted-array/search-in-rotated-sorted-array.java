class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
          int middle = (left+right)/2;
          if(target==nums[middle]){
            return middle;
          }

         if(nums[left]<=nums[middle]){

            if(target>=nums[left] && target<nums[middle]){
              right=middle-1;
            }
            else{
               left=middle+1; 
            }
        }

        else {
             if(target>nums[middle] && target<=nums[right]){
              left=middle+1;
            }
            else{
               right=middle-1; 
            }


        }

        }
       
       return -1; 
        
    }


}


