class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String firstWord= strs[0];
        String lastWord= strs[n-1];
     String common=  commonPrefix(firstWord,lastWord);
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
