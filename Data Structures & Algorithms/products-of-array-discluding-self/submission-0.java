class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int k=0;

        for (int i=0;i<nums.length;i++) {
            int pro=1;
            for (int j=0;j<nums.length;j++) {
                if(i!=j) {
                    pro=pro*nums[j];
                }
            }
            res[k++]=pro;
        }
        return res;
    }
}  
