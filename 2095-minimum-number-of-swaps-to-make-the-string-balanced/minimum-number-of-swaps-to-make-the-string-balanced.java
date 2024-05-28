class Solution {

    public int minSwaps(String s) {
    int swaps = 0;
    int balance = 0; // This will keep track of the balance between '[' and ']'
    
    for (char ch : s.toCharArray()) {
        if (ch == '[') {
            balance++;
        } else {
            balance--;
        }

        // If balance goes negative, it means we have more ']' than '[' at this point
        if (balance < 0) {
            swaps++;
            balance = 1; // Reset balance to 1 because we are assuming we did a swap
        }
    }
    
    return swaps;
}

            

}

        
    
