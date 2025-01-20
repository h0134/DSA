class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        String firstword= strs[0];
        String lastword= strs[n-1];
        int m = firstword.length();
        int o = lastword.length();
        int left =0;
        int right=0;
        StringBuilder sb =new StringBuilder();
        while(left<m && right< o){
            if(firstword.charAt(left)==lastword.charAt(right)){
                sb.append(firstword.charAt(left));
                left++;
                right++;
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}