class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
         int buy =prices[0];

        for(int i=1;i<prices.length;i++){
         int sell = prices[i];
         int profit = sell-buy;
         buy=Math.min(sell,buy);
         maxProfit=Math.max(maxProfit,profit);

        }
        return maxProfit;
    }
}