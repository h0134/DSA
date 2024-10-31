class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int n = prices.length;
        int[] prefix_min= new int [n];
        prefix_min[0]=prices[0];
        for(int i = 1; i<n;i++){
            prefix_min[i]=Math.min(prices[i],prefix_min[i-1]);
           maxProfit=Math.max(maxProfit,prices[i]-prefix_min[i]);
        }

 
      return maxProfit>=0?maxProfit:0;
    }
}