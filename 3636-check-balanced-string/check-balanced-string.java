class Solution {
    public boolean isBalanced(String num) {
        int [] prefixSum = new int [num.length()]; 
          int[] result = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            result[i] = num.charAt(i) - '0';
        }
        prefixSum[0]=result[0]; prefixSum[1]=result[1];
        for(int i=2; i <result.length;i++){
            prefixSum[i]=result[i]+prefixSum[i-2];

        }

        if(prefixSum[num.length()-1]==prefixSum[num.length()-2]){
            return true;
        }

return false;
        
    }
}