class Solution {
    public boolean isAnagram(String s, String t) {
    
        int n = s.length();
        int[] arr = new int [26];
        Arrays.fill(arr,0);

      if (s.length() != t.length()) {
            return false;
        }
     for(char c : s.toCharArray()){
         arr[c-'a']++;

        } 
        for(char c : t.toCharArray()){
            arr[c-'a']--;

        }
            for(int  count : arr){
    if(count !=0){
        return false;
    }
}
return true;
}
    
}