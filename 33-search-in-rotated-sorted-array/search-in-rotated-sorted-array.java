class Solution {
    public int search(int[] arr, int target) {
   int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middleIndex = (right + left) / 2;
            int middleElement = arr[middleIndex];

            if (target == middleElement) {
                return middleIndex;
            }
            if (middleElement >= arr[left] ) {
                if(target >= arr[left] && target < middleElement){
                    right=middleIndex-1;
                }
                else {
                    left=middleIndex+1;
                }

            }

            else if(middleElement < arr[right]) {
                if(target<=arr[right] && target>middleElement){
                    left=middleIndex+1;
                }
                else {
                    right=middleIndex-1;
                }

            }

        }
        return -1;     
}
}