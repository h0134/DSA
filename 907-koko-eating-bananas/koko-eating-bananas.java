class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right= Arrays.stream(piles).max().getAsInt();
        int left = 1;
        while(left<right){
      int mid =  left +(right-left)/2;
      if(canFinish(piles,h,mid)){
        right=mid;
      }
      else 
       left = mid+1; 

        }
        return left;


    }

    public boolean canFinish(int [] piles, int h,int k){
         int hoursneeded=0;
        for(int pile : piles){
             hoursneeded +=( pile + k - 1)/k;

      }
      return hoursneeded<=h;

    }
}