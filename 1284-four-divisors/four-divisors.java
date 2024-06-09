class Solution {
    
    public int sumFourDivisors(int[] nums) {
              int totalSum = 0;
        
        for (int num : nums) {
            int sum = 0;
            int count = 0;
            
            // Find divisors of num
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    // If i is a divisor
                    sum += i;
                    count++;
                    
                    int complement = num / i; // Calculate the complement
                    
                    // If complement is also a divisor and different from i
                    if (i != complement) {
                        sum += complement;
                        count++;
                    }
                    
                    // If more than 4 divisors, break early
                    if (count > 4) {
                        break;
                    }
                }
            }
            
            // Add to totalSum if there are exactly 4 divisors
            if (count == 4) {
                totalSum += sum;
            }
        }
        
        return totalSum;
   

    }
}