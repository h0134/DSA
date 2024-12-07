class Solution {
    public String longestCommonPrefix(String[] strs) {
      int n = strs.length;
      Arrays.sort(strs);
      String first = strs[0];
      String second = strs[n-1];
       int left =0;int right=0;
       String empty =""; 
       while(left<first.length() && right<second.length()){
        if(first.charAt(left)==second.charAt(right)){
            empty=empty+first.charAt(left);
             left++;
        right++;
        }
       
       else{
        break;
       }
    
    }
    return empty;
}}