class Solution {
    public int trap(int[] height) {
        int area=0;
        int n=height.length;

        
        
        for (int i=0;i<n;i++) {
            int l=0;
            int r=n-1;
            int maxLeft=0;
            int maxRight=0;
            while (l<i) {
                maxLeft=Math.max(maxLeft, height[l]);
                l++;
            }
            while (r>i) {
                maxRight=Math.max(maxRight, height[r]);
                r--;
            }
            int water = Math.min(maxRight, maxLeft) - height[i];
            if (water > 0) area += water;
        }
        return area;
    }
}
