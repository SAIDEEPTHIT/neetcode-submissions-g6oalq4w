class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int max=0;
        int val=1;
        while (i<j) {
            int tot=Math.min(heights[i], heights[j]);
            val=(j-i)*tot;
            max=Math.max(max, val);
            if(tot==heights[i]) i++;
            else j--;
        }
        return max;
    }
}
