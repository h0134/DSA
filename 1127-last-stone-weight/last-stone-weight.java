import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
       
        PriorityQueue<Integer> myque = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int stone:  stones){
            myque.add(stone);
        }

      while(myque.size()>1){
    
        int firstStone = myque.poll();
        int secondStone = myque.poll();
        int diff= firstStone-secondStone;
        if(diff>=1){
            myque.add(diff);
        }
      }
        
        return myque.isEmpty()?0:myque.poll();
     

}
}