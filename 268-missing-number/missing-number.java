class Solution {
    public int missingNumber(int[] nums) {
    //     Arrays.sort(nums);
    //   if (nums[nums.length - 1] != nums.length) {
    //         return nums.length;
    //     }        
    //     for (int i=0; i <nums.length ; i++){
       
    //         if (i!= nums[i]) {
    //             return i;
    //         }
    //     }

    //     return -1;
        
int n =  nums.length +1;
int expected_sum = n *(n-1)/2;
int actual_sum=0;
for(int num : nums){
    actual_sum = actual_sum + num;
}

return expected_sum-actual_sum;

    }
}

