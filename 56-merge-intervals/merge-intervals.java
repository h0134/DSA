class Solution {
    public int[][] merge(int[][] intervals) {
        int start =Integer.MIN_VALUE;
        int end = Integer.MIN_VALUE;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
       
        for(int [] pair : intervals){
            if(start==Integer.MIN_VALUE && end ==Integer.MIN_VALUE){
              start=pair[0];
              end = pair[1];
            }
            else{
                if(pair[0]<=end ){
                    end = Math.max(end,pair[1]);
                }
                else{
                    result.add(new int [] {start,end});
                    start=pair[0];
                    end=pair[1];
                    }
            }

        }
result.add(new int [] {start,end});

        return result.toArray(new int[result.size()][]);

    }
}

