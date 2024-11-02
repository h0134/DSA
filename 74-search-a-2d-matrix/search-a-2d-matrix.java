class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int floor = getFloor(matrix,target);
        int left = 0;
        int right =matrix[0].length-1;
        while(left<=right){
            int middleIndex = (left+right)/2;
            int middleElement = matrix[floor][middleIndex];
            if(target<middleElement){
                right = middleIndex-1;
            }
                if(target>middleElement){
                left = middleIndex+1;
            }    if(target==middleElement){
               return true;
            }
        }
        return false;
    }
    public int getFloor(int[][] matrix, int target){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = matrix.length-1;
        while(left<=right){
            int middleIndex = (left+right)/2;
            int middleElement = matrix[middleIndex][0];
            if(target<middleElement){
                right = middleIndex-1;
            }
                if(target>middleElement){
                left = middleIndex+1;
            }    if(target==middleElement){
               return middleIndex;
            }

        }
        
        return left==0?0:left-1;
    }
}