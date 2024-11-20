class Solution {
    public int[] productExceptSelf(int[] arr) {
         int n= arr.length;
        int [] leftProduct=new int [arr.length];
        int [] rightProduct = new int [arr.length];
       int [] output = new int [arr.length];
        
        leftProduct[0]=1;
        int product=1;
        for(int i=1;i<arr.length;i++){
         product= product*arr[i-1];
         leftProduct[i]=product;
        }
        
        rightProduct[n-1]=1;
         product=1;
        for(int i=n-2;i>=0;i--){
         product= product*arr[i+1];
        rightProduct[i]=product;
        }
        for(int i=0;i<n;i++){
            output[i]= leftProduct[i]*  rightProduct[i];
        }
        return output;
    }
}