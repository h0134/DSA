class Solution {
    public int maxProfit(int[] prices) {
    
    int n = prices.length;
    int [] profit = new int [n];

    int maxProfit =Integer.MIN_VALUE;
    profit[0]=0;
       maxProfit=Math.max(maxProfit, profit[0]);

    for(int i=1;i<n;i++){
        profit[i]=prices[i]-prices[i-1]+maxProfit;
        maxProfit=Math.max( profit[i],maxProfit);
    }

       return maxProfit;

    }
}

