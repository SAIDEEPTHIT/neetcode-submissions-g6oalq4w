class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max=0;

        for (int i=0;i<n;i++) {
            int val=1;
            for (int j=i+1;j<n;j++) {
                val=(j-i)*Math.min(heights[i], heights[j]);
                max=Math.max(val, max);
            }
        }
        return max;
    }
}
