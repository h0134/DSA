class Solution {
    public String longestDiverseString(int a, int b, int c) {
        // Create a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Store the remaining counts of 'a', 'b', and 'c' in a pair list
        int[] count = {a, b, c};
        char[] letters = {'a', 'b', 'c'};

        while (true) {
            // Sort characters by their remaining counts in descending order
            if (count[0] < count[1]) {
                swap(count, letters, 0, 1);
            }
            if (count[1] < count[2]) {
                swap(count, letters, 1, 2);
            }
            if (count[0] < count[1]) {
                swap(count, letters, 0, 1);
            }

            // If the most frequent character can't be added (count[0] == 0), break the loop
            if (count[0] == 0) break;

            // Check if adding the most frequent character violates the "no three consecutive" rule
            int len = result.length();
            if (len >= 2 && result.charAt(len - 1) == letters[0] && result.charAt(len - 2) == letters[0]) {
                // If adding would violate, try to add the second most frequent character
                if (count[1] == 0) break; // No more valid characters to add, so we stop

                // Append the second most frequent character
                result.append(letters[1]);
                count[1]--;
            } else {
                // Append the most frequent character
                result.append(letters[0]);
                count[0]--;
            }
        }

        // Return the final string
        return result.toString();
    }

    // Helper method to swap characters and their corresponding counts
    private void swap(int[] count, char[] letters, int i, int j) {
        int tempCount = count[i];
        count[i] = count[j];
        count[j] = tempCount;

        char tempChar = letters[i];
        letters[i] = letters[j];
        letters[j] = tempChar;
    }
}
