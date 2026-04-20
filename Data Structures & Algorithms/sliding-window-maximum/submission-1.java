class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n=nums.length;
        int left=0;
        int right=k-1;
        int res[]=new int[n-k+1];
        int j=0;

        while (right < n) {
            int max=Integer.MIN_VALUE;
            for (int i=left;i<=right;i++) max=Math.max(max, nums[i]);

            res[j++]=max;
            left++;
            right++;
        }

        return res;
    }
}
