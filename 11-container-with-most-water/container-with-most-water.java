class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left =0;
        int right = n-1;
        int maxArea= Integer.MIN_VALUE; 
        while(left<right){
            int currentheight= Math.min(height[left],height[right]);
            int width = right-left;
            int area = currentheight*width;
            maxArea=Math.max(area,maxArea);
            if(height[left]>height[right]){
                right--;
            }
            else if (height[right]>height[left]){
                left++;
            }
          else{
            left++;
            right--;
          }

        }
        return maxArea;
    }
}