class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxLeft[]=new int[n]; maxLeft[0]=height[0];
        int maxRight[]=new int[n]; maxRight[n-1]=height[n-1];

        for (int i=1;i<n;i++) {
            maxLeft[i]=Math.max(maxLeft[i-1], height[i]);
        }
        for (int j=n-2;j>=0;j--) {
            maxRight[j]=Math.max(maxRight[j+1], height[j]);
        }

        int maxWater=0;
        for (int i=0;i<n;i++) {
            maxWater+=Math.min(maxLeft[i], maxRight[i])-height[i];
        }
        return maxWater;
    }
}