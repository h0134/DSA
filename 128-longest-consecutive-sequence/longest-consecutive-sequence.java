class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> myhash = new HashSet<>();
        if(nums.length<1){
            return 0;
        }
        
        for(int num :nums){
            myhash.add(num);
        }
        int maxCount =1;
        for(int i=0;i<nums.length;i++){
          int count=1;

           int temp =nums[i]+1;
           if(myhash.contains(nums[i])){
             while(myhash.contains(temp)){
                  myhash. remove(temp);
                    count++;


            temp=temp+1;
           }
            temp = nums[i]-1;
 while(myhash.contains(temp)){
    myhash.remove(temp);
          count++;

            temp=temp-1;
           }
           }
           maxCount=Math.max(maxCount,count);
myhash.remove(nums[i]);
      
        }
        return maxCount;
    }
}