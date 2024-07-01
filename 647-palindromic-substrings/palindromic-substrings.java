class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        // Iterate through all possible starting points
        for (int i = 0; i < s.length(); i++) {
            // Iterate through all possible ending points
            for (int j = i + 1; j <= s.length(); j++) {
                // Check if the substring s[i, j) is palindromic
                if (isPalindromic(s.substring(i, j))) {
                    count++;
                }
            }
        }
        return count;

          }
    // Helper method to check if a given string is palindromic
    public boolean isPalindromic(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}