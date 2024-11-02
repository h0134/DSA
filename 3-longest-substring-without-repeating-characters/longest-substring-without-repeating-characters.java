class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxLength =Integer.MIN_VALUE;
        HashSet<Character> myhash = new HashSet<>();
        if(s.length() ==0){
            return 0;
        }
        for(int right =0;right<s.length();right++ ){
            char currentCharcter = s.charAt(right);
            while(myhash.contains(currentCharcter)){
                myhash.remove(s.charAt(left));
                left++;
            }
            
            myhash.add(currentCharcter);
            maxLength = Math.max(maxLength,right-left+1);
        }
        
        return maxLength;
        
    }
}