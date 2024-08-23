class Solution {
    public int maximumLengthSubstring(String s) {
       
        Map<Character ,Integer> charCount = new HashMap<>();
        int left =0;
        int maxLength =0;
        for(int right=0; right < s.length();right++){
            char rightchar = s.charAt(right);
           
         charCount.put(rightchar,charCount.getOrDefault(rightchar,0)+1);

         
         while(charCount.get(rightchar)>2){
            char leftchar = s.charAt(left);
            charCount.put(leftchar,charCount.get(leftchar)-1);
            if(charCount.get(leftchar)==0){
                charCount.remove(leftchar);
            }
            left++;
         }
          maxLength =  Math.max(maxLength,right-left+1);

        }
        return maxLength;
        
    }
}