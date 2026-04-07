class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxLeft[]=new int[n]; maxLeft[0]=0;
        int maxRight[]=new int[n]; maxRight[n-1]=0;

        for (int i=1;i<n;i++) {
            maxLeft[i]=Math.max(maxLeft[i-1], height[i-1]);
        }
        for (int j=n-2;j>=0;j--) {
            maxRight[j]=Math.max(maxRight[j+1], height[j+1]);
        }

        int maxWater=0;
        for (int i=0;i<n;i++) {
            if ((Math.min(maxLeft[i], maxRight[i])-height[i])<0) continue;
            maxWater+=Math.min(maxLeft[i], maxRight[i])-height[i];
        }
        return maxWater;
    }
}