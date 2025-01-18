class Solution {
    public int coinChange(int[] coins, int amount) {
        int [] dp = new int [amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int coin:coins){
            for(int i =1; i<=amount;i++){
                if(coin<=i){
                  if (dp[i - coin] != Integer.MAX_VALUE) {  // Check to avoid overflow

                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }

    }
    return dp[amount]!=Integer.MAX_VALUE?dp[amount]:-1;

}}