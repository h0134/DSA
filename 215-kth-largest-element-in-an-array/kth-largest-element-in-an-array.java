class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
     for(int n:nums){
        minheap.add(n);
     }
  while(minheap.size()>k){
    minheap.remove();
  }
      return  minheap.poll();
    }
}