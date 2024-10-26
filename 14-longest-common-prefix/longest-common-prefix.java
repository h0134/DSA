class Solution {
    public String longestCommonPrefix(String[] strs) {
      String common = strs[0];
     for(int i =0; i <strs.length;i++){
        String word1 = strs[i];
        
        common = commonPrefix(common,word1);

     }
     return common;
        
    }

    public String commonPrefix(String s1,String s2){
        String commonPrefix="";
        int m = s1.length();
        int n = s2.length();
        int minlength = Math.min(m,n);
        for(int i=0; i <minlength;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                commonPrefix =commonPrefix+s1.charAt(i);
                }
                else{
break;                }
        }
        return commonPrefix;
    }
}
