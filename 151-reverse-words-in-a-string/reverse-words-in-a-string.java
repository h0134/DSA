class Solution {
    public String reverseWords(String s) {
       
           s = s.trim();

        // Step 2: Split the string by one or more spaces using regular expression
        String[] words = s.split("\\s+");

        // Step 3: Reverse the order of words and join them with a single space
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        // Step 4: Return the reversed words as a single string
        return reversed.toString();
    


    }
}