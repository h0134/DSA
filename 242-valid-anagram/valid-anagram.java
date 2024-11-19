class Solution {
    public boolean isAnagram(String s1, String s2) {
       int [] dp = new int [26];
        for(int i=0; i <s1.length();i++){
            
           int index=s1.charAt(i)-'a';
          int count=  dp[index];
          count++;
          dp[index]=count;
        }

       for(int i=0; i <s2.length();i++){
            
           int index=s2.charAt(i)-'a';
          int count=  dp[index];
          count--;
          dp[index]=count;
        }
        for(int i=0;i<dp.length;i++){
            if(dp[i]!=0){
                return false;
            }
        }
        return true;
    }
}