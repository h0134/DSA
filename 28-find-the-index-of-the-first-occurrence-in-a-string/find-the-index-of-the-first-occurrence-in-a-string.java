class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int left =0;
        int right =0;
        while(left<n && right<m){
            if(haystack.charAt(left)!=needle.charAt(right)){
               left=left-right+1;
             right=0;

            }
         else  if(haystack.charAt(left)==needle.charAt(right)){
                left++;
                right++;
            if(right==m){
                return left-m;
            }

            }
        }
        return -1;
        
    }
}