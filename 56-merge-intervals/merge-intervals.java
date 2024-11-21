class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> output = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start = Integer.MIN_VALUE;
        int end=Integer.MIN_VALUE;
        for(int []  pair : intervals){
            if(start==Integer.MIN_VALUE && end==Integer.MIN_VALUE){
                start = pair[0];
                end=pair[1];
            }
            else{
                if(pair[0]<=end){
                    end=Math.max(pair[1],end);
                }
                else {
                   output.add(new int[] {start,end});

                    start=pair[0];
                    end=pair[1];
                }
            }

        }

    output.add(new int[] {start,end});

return output.toArray(new int [output.size()][]);
    }
}