class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nrows = matrix.length;
        int ncols = matrix[0].length;
        int left=0;
        int right=nrows-1;
        int floor =-1;
      
    while(left<=right){
        int mid =(left+right)/2;

        if(target==matrix[mid][0]){
            floor= mid;
            break;
            
      }
        else if(target>matrix[mid][0]){
            left=mid+1;
        }
           else if(target<matrix[mid][0]){
            right=mid-1;
        }
        
    }
    if(floor==-1){
    floor=left-1;

 }
  if(floor==-1){
    floor=0;

 }
     left=0;
     right=ncols-1;

while(left<=right){
     int mid =(left+right)/2;

        if(target==matrix[floor][mid]){
            return true;
            
      }
        else if(target>matrix[floor][mid]){
            left=mid+1;
        }
           else if(target<matrix[floor][mid]){
            right=mid-1;
        }}
return false;
    }
}