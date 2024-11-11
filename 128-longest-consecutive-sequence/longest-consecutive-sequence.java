class Solution {
      int longestConsecutive(int[] nums) {
        HashSet<Integer> myhash= new HashSet<>();
        for(int num :nums){
            myhash.add(num);
        }
                    int longestLength =Integer.MIN_VALUE;



        for(int i = 0 ; i <nums.length; i++){
            int ele = nums[i]-1;
            int tele = nums[i]+1;
                                               int count =1;


            if(myhash.contains(nums[i])){

                while(myhash.contains(ele)){
            count=count+1;
              myhash.remove(ele);

            ele = ele-1;

            }
       while(myhash.contains(tele)){
            count=count+1;
             myhash.remove(tele);

            tele = tele+1;
            }

            }
           
          myhash.remove(nums[i]);

      longestLength=Math.max(longestLength,count);

        }

        return longestLength>0?longestLength:0;


        
    }
}