class Solution {
    public int findLongestChain( int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int start=pairs[0][0];

        int end = pairs[0][1];
        int count=1;

        for(int [] pair : pairs){
         if(pair[0]>end){
                    count++;
                    start=pair[0];
                    end=pair[1];
                    }}
                    return count;
                    } 
                    
                    
                    }
                    
                




