class Solution {
    

    
    public int kthFactor(int n, int k) {

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(i);
                if (i != n / i) {
                    result.add(n / i);
                }
            }
        }

        Collections.sort(result);

        if (result.size() < k) {
            return -1;
        } else {
            return result.get(k - 1);
        }
    }
    
}