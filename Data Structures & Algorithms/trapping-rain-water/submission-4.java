class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxWater=0;

        for (int i=0;i<n;i++) {
            int maxLeft=height[i];
            int maxRight=height[i];

            for (int j=0;j<i;j++) maxLeft=Math.max(maxLeft, height[j]);
            for (int k=i+1;k<n;k++) maxRight=Math.max(maxRight, height[k]);

            maxWater+=Math.min(maxLeft, maxRight)-height[i];
        }
        return maxWater;
    }
}