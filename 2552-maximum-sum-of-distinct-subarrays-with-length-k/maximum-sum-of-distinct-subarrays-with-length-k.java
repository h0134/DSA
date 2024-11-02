class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       
        HashSet<Integer> myhash = new HashSet<>();
        long maxSum = 0;
        long sum =0;
        int left =0;

        for(int right=0; right <nums.length;right++){
          
            if(myhash.size()<k){
               while(myhash.contains(nums[right])){
                myhash.remove(nums[left]);
                sum =sum -nums[left];
                left++;

             }
               myhash.add(nums[right]);
               sum = sum+nums[right];
                }

        if(myhash.size()==k){
            maxSum =Math.max(maxSum,sum);
            myhash.remove(nums[left]);
            sum=sum-nums[left];
            left++;
             }


 }
              return    maxSum;
    }
        
        
    }
