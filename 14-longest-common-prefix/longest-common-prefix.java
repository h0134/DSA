class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstWord = strs[0];
        System.out.println(firstWord);

        String secondWord = strs [strs.length-1];
                System.out.println(secondWord);

        int left =0;
        int right=0;
    
       StringBuilder str = new StringBuilder();

       
        while(left<firstWord.length() && right<secondWord.length()){
            if(firstWord.charAt(left)==secondWord.charAt(right)){
                str.append(firstWord.charAt(left));
            }
            else{
                return str.toString();
            }
      
            left++;
            right++;
        }
        return str.toString();
    }
}