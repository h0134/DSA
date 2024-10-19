class Solution {
        public static long numberOfHours(int[] bananas,int rate ){
        long numOfHours=0;
        for(int i =0; i<bananas.length;i++){
            int  remainder = bananas[i]%rate;
            int  quotent = bananas[i]/rate;
            if(remainder==0){
                numOfHours=numOfHours+quotent;
            }
            else{

                numOfHours=numOfHours+quotent+1;
            }
        }
        return  numOfHours;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxele = Arrays.stream(piles).max().getAsInt();
        int left = 1;
        int right = maxele;
        while (left <= right) {
            int mid = (left + right) / 2;
            long hh = numberOfHours(piles, mid);
            if (hh <= h) {
                right = mid - 1;
            } else {
                left = mid + 1;

            }

        }

        return left;
    }
}