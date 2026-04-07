class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLen=0;

        for (int i=0;i<n;i++) {
            HashSet<Character> set=new HashSet<>();
            int count=0;
            for (int j=i;j<n;j++) {
                if (set.add(s.charAt(j))) {
                    count++;
                    maxLen=Math.max(maxLen, count);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }
}
