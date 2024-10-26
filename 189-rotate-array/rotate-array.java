class Solution {
  public  static void reverseArray(int [] arr,int index1,int index2){

        while (index1 < index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            index1++;
            index2--;
        }}
    public void rotate(int[] nums, int k) {
                int n = nums.length;
 k=k%n;
       int middleIndex = n-1-k;
        reverseArray(nums,0,middleIndex);
        reverseArray(nums,middleIndex+1,n-1);
        reverseArray(nums,0,n-1);
    }
}