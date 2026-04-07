class Solution {
    public int maxArea(int[] height) {
        int currArea=0;
        int maxArea=0;

        int left=0;
        int right=height.length-1;

        while (left<right) {
            currArea=0;
            currArea+=(right-left)*Math.min(height[left], height[right]);
            maxArea=Math.max(currArea, maxArea);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}