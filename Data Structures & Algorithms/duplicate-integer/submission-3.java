class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();

        for (int i=0;i<n;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for (Integer val:map.values()) {
            if(val>1) {
                return true;
            }
        } 
        return false;
    } 
}