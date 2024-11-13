class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int start= Integer.MIN_VALUE;
        int end = Integer.MIN_VALUE;
        int count=1;
        for(int [] pair : pairs){
            if(start==Integer.MIN_VALUE && end ==Integer.MIN_VALUE){
                start=pair[0];
                end=pair[1];
            }
            else{
                if(pair[0]>end){
                    count++;
                    start=pair[0];
                    end=pair[1];
                    }
                    
            }
        }
        return count;

    }
}

// N = 6,  start[] = {1,3,0,5,8,5}, end[] =  {2,4,5,7,9,9}

// [1,3,0,5,8,5]
// [2,4,5,7,9,9]