class Solution {
    public int lengthOfLIS(int[] arr) {
        int [] lis= new int [arr.length];
        Arrays.fill(lis,1);
        for(int i =1;i<arr.length;i++){
            for (int j =0;j<i;j++){
                if(arr[j]<arr[i]){
                    lis[i]=Math.max(lis[i],lis[j]+1);
                }
            }
        }
int max= Arrays.stream(lis).max().getAsInt();
return max;        
        
    }
}