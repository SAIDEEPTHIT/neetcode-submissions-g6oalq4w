class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        HashMap<Integer, Integer> map=new HashMap<>();

        for (int num:nums) map.put(num, map.getOrDefault(num, 0)+1);
        int count=1;
        int maxLen=1;

        for (int key : map.keySet()) {
            if(!map.containsKey(key-1)) {
                int curr=key;
                count=1;
                while (map.containsKey(curr+1)) {
                    curr++;
                    count++;
                    maxLen=Math.max(count, maxLen);
                } 
            } else {
                count=1;
            }
        }
        return maxLen;
    }
}
