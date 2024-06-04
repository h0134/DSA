class Solution {
       public  int numSplits(String S) {
            int n = S.length();
            if (n == 0) {
                return 0;
            }

            // Prefix array for unique characters count
            int[] prefixCount = new int[n];
            HashSet<Character> seen = new HashSet<>();

            for (int i = 0; i < n; i++) {
                seen.add(S.charAt(i));
                prefixCount[i] = seen.size();
            }

            // Suffix array for unique characters count
            int[] suffixCount = new int[n];
            seen.clear();

            for (int i = n - 1; i >= 0; i--) {
                seen.add(S.charAt(i));
                suffixCount[i] = seen.size();
            }

            // Count the number of valid splits
            int validSplits = 0;

            for (int i = 0; i < n - 1; i++) {
                if (prefixCount[i] == suffixCount[i + 1]) {
                    validSplits += 1;
                }
            }

            return validSplits;
        }
       
 }
