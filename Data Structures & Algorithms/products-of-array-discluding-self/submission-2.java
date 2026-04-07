class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];

        for (int i=0;i<nums.length;i++) {
            int left=0;
            int right=i-1;
            int pre=1;
            while(left<=right) {
                pre=pre*nums[left];
                left++;
            }
            int start=i+1;
            int end=nums.length-1;
            int suf=1;
            while(start<=end) {
                suf=suf*nums[start];
                start++;
            }

            res[i]=suf*pre;
        }
        return res;
    }
}  
