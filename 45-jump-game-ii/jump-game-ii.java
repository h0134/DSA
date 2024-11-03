class Solution {
    public int jump(int[] nums) {
        int minJumps = Integer.MAX_VALUE;
        int [] jumps = new int [nums.length];
        Arrays.fill(jumps,minJumps);
        jumps[0]=0;

        for(int i =1; i<nums.length;i++){
            for(int j =0;j<i;j++){
             
                if(i<=nums[j]+j){
                      jumps[i]=Math.min(jumps[i],jumps[j]+1);


       }
             }
        }
        return jumps[nums.length-1];
        
    }
}