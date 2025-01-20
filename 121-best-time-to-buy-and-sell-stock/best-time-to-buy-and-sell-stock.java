class Solution {
    public int maxProfit(int[] prices) {
       
       int maxProfit=Integer.MIN_VALUE;
        int buy = prices[0];


        for(int i = 0 ; i<prices.length;i++){
            int sell = prices[i];
             int  profit = sell-buy;
             if(sell<buy){
                buy= sell;
             }
           maxProfit=Math.max(profit,maxProfit);
 
        }
        
       return maxProfit;
        
    }
}