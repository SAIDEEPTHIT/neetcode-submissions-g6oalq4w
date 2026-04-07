class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();

        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                for (int k=j+1;k<n;k++) {
                    if(nums[i]+nums[j]+nums[k]==0) {
                        if (set.add(Arrays.asList(nums[i], nums[j], nums[k])))
                            res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return res;
    }
}
