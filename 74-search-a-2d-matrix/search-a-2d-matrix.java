class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left =0;
        int right=rows-1;
        int floor=-1;
        while(left<=right){
           int  mid=(left+right)/2;
            if(target==matrix[mid][0]){
                floor=mid;
                break;
            }
            else if(target>matrix[mid][0]){
                left=mid+1;
            }
            else if(target<matrix[mid][0]){
                right=mid-1;
            }}
            if(floor==-1){

                floor= left-1;
                
                }
                System.out.println(floor);
   if(floor<0){
    floor =0;
   }
           left =0;
           right = cols-1;
           while(left<=right){
            int mid = (left+right)/2;
            if(target ==matrix[floor][mid]){
                return true;

            }
            else if (target>matrix[floor][mid]){
                left=mid+1;
            }
              else if (target<matrix[floor][mid]){
                right=mid-1;
            }
           }
           return false;      
    }
}