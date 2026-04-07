class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length==0) return 0;
        Set<Integer> set=new TreeSet<>();
        for (int num:nums) set.add(num);
        List<Integer> list=new ArrayList<>();
        for (int num:set) list.add(num);

        int count=1;
        int maxLen=1;

        for (int i=0;i<list.size()-1;i++) {
            if(list.get(i+1)==list.get(i)+1) {
                count++;
                maxLen=Math.max(maxLen, count);
            } else {
                count=1;
            }
        }
        return maxLen;
    }
}
