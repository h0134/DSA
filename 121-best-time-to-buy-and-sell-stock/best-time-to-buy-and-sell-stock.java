class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int n = prices.length;
        int minElement =prices[0];
        for(int i = 1; i<n;i++){
           minElement = Math.min(prices[i], minElement);
           maxProfit=Math.max(maxProfit,prices[i]-minElement);
        }

return maxProfit>=0?maxProfit:0;
    }
}