class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;

        int left; int right;

        for (int i=0;i<n;i++) {
            left=right=i;

            while (left>0 && heights[left-1]>heights[i]) left--;
            while (right<n-1 && heights[right+1]>=heights[i]) right++;

            maxArea=Math.max(maxArea, (right-left+1)*heights[i]);
        }
        return maxArea;
    }
}
