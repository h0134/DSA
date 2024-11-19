class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> myhash = new HashSet<>();
        int maxLength =Integer.MIN_VALUE;
        if(nums.length ==0){
            return 0;
        }
        for(int n : nums){
            myhash.add(n);
        }
        for(int i =0; i < nums.length;i++){
            int count=1;

            int ele = nums[i]+1;
            int elee=nums[i]-1;
             while(myhash.contains(ele)){
                count++;
                    myhash.remove(ele);

                ele=ele+1;
                 }


              while(myhash.contains(elee)){
                count++;
           myhash.remove(elee);

                elee=elee-1;
                 }
                 maxLength = Math.max(maxLength,count);
                 myhash.remove(nums[i]);
        }
        return maxLength;
    }
}