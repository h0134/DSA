class Solution {
    public int searchInsert(int[] arr, int k) {
                int n = arr.length;
int left=0;
int right=n-1;

  while(left<=right){
     int mid = (left+right)/2;
     if(k==arr[mid]){
         return mid;
     }
     else if(k>arr[mid]){
         left=mid+1;
        
     }
         else if(k<arr[mid]){
         right=mid-1;
        
     }


 }
 return left;
        
    }
}