class Solution {
    public int maximumSwap(int num) {
        // Convert the number to a character array for easy swapping
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;

        // Suffix max index array to store the index of the largest digit on the right
        int[] maxRight = new int[n];
        
        // Initialize the last digit as the maximum for the suffix starting from the end
        maxRight[n - 1] = n - 1;

        // Populate the maxRight array (suffix maximums)
        for (int i = n - 2; i >= 0; i--) {
            if (digits[i] > digits[maxRight[i + 1]]) {
                maxRight[i] = i;
            } else {
                maxRight[i] = maxRight[i + 1];
            }
        }

        // Now find the first place where a swap is possible to get a larger number
        for (int i = 0; i < n; i++) {
            // If there's a larger digit on the right, swap it
            if (digits[i] != digits[maxRight[i]]) {
                swap(digits, i, maxRight[i]);
                // Convert back to an integer and return the result
                return Integer.parseInt(new String(digits));
            }
        }

        // If no swap was needed, return the original number
        return num;
    }

    // Helper function to swap two elements in the char array
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
