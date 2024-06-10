class Solution {
    public int heightChecker(int[] heights) {
         int[] sortedNumbers = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedNumbers);
        int count =0;

        for(int i =0 ; i <heights.length;i++){
            if(heights[i]!=sortedNumbers[i]){
                count+=1;
            }
        }
        return count;
        }
}