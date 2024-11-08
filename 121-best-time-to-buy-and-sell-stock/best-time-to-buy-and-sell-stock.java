class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = Integer.MIN_VALUE;
        int [] profit = new int [n];
        profit [0]=0;
        for(int i =1; i <n;i++){
            int currentProfit=prices[i]-prices[i-1];
            profit[i] = Math.max( currentProfit, currentProfit+profit[i-1]);
            maxProfit= Math.max(profit[i],maxProfit);

        }
        return maxProfit>0?maxProfit:0;

        }

        
    
}