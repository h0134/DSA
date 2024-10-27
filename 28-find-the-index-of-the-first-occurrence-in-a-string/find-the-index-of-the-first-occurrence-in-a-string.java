class Solution {
    public int strStr(String haystack, String needle) {
       int  left =0;
       int  right=0;   int m = haystack.length(); int n = needle.length();
        while(left<m && right<n){
            if(haystack.charAt(left)!=needle.charAt(right)){
                left++;
                left=left-right;
                right=0;
            }
            else{
       
           left++;
           right++;
           if(right==n){
                return  left-right;  
           }
        }  
        }
        return -1;
        
    }

}