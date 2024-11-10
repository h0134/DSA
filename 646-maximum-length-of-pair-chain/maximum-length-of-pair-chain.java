class Solution {
    public int findLongestChain(int[][] pairs) {
        int count =0;
        int end =Integer.MIN_VALUE;
        int rows = pairs.length;
                Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
for(int pair[]: pairs){
if(end==Integer.MIN_VALUE){
    end=pair[1];
    count=count+1;
}
else{
    if(end <pair[0]){
        count=count+1;
        end = pair[1];
    }
}

}
return count;

        
    }
}