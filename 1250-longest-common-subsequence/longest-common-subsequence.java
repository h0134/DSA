class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int rows= text1.length();
        int columns = text2.length();
        int [][] dp = new int [rows+1][columns+1];
        for(int i = 0; i <columns+1;i++){
                    dp[0][i]=0;
        }
        for(int j = 0; j <rows+1;j++){
                    dp[j][0]=0;
        }
        for(int i=1; i <text1.length()+1;i++){
            for(int j =1; j <text2.length()+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]= dp[i-1][j-1]+1;

                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                    dp[i][j]= Math.max( dp[i][j],dp[i-1][j-1]);                }
            }
        }


       return dp[rows][columns];
    }
}