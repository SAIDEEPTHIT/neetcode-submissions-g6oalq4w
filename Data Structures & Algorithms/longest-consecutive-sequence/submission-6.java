class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;

        HashSet<Integer> set=new HashSet<>();
        for (int num : nums) set.add(num);

        int count=1;
        int maxLen=1;

        for (int val : set) {
            count=1;
            int curr=val;
            while (set.contains(curr+1)) {
                count++;
                curr++;
                maxLen=Math.max(count, maxLen);
            } 
        }
        return maxLen;
    }
}
