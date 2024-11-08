class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
               int buy= prices[0];

        for(int i=1; i<prices.length;i++){

            int sell = prices[i];
            int profit =sell-buy;
            if(profit>0){
                maxProfit=Math.max(profit,maxProfit);
            }
            buy=Math.min(sell,buy);

        }
        return maxProfit>0?maxProfit:0;
        
    }
}