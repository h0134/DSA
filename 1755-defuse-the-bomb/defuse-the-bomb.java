class Solution {
    public int[] decrypt(int[] code, int k) {
      int n = code.length;
        int[] decryptedCode = new int[n];

        if (k == 0) {
            // If k is 0, fill the decrypted code with 0s.
            for (int i = 0; i < n; i++) {
                decryptedCode[i] = 0;
            }
            return decryptedCode;
        }

        // Compute the suffix sum array
        int[] suffixSum = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + code[i];
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                int start = (i + 1) % n;
                int end = (i + k + 1) % n;
                if (end > start) {
                    sum = suffixSum[start] - suffixSum[end];
                } else {
                    sum = suffixSum[start] + suffixSum[0] - suffixSum[end];
                }
            } else {
                int start = (i + n + k) % n;
                int end = i;
                if (end > start) {
                    sum = suffixSum[start] - suffixSum[end];
                } else {
                    sum = suffixSum[start] + suffixSum[0] - suffixSum[end];
                }
            }
            decryptedCode[i] = sum;
        }

        return decryptedCode;
    }

}