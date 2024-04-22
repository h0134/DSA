class Solution {
    public int[] topKFrequent(int[] nums, int k) {
 
        // Count the frequency of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Use a PriorityQueue to keep track of top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );

        pq.addAll(countMap.entrySet());

        // Get the top k frequent elements
        int[] topKFrequent = new int[k];
        int index = 0;
        while (k-- > 0 && !pq.isEmpty()) {
            topKFrequent[index++] = pq.poll().getKey();
        }

        return topKFrequent;
    }
    




}