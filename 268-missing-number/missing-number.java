class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int nSum =( n *(n+1))/2;
        int sum =0;

        for(int i =0 ; i <nums.length;i++){
sum=sum+nums[i];
        }
        
        int missingElement = nSum-sum;
        return missingElement;
    }
}