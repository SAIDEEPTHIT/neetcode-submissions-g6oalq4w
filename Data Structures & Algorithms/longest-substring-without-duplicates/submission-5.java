class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLen=0;

        int left=0;
        int right=0;
        HashSet<Character> set=new HashSet<>();

        while (left<=right && right<n) {
            if(set.add(s.charAt(right))) {
                right++;
                maxLen=Math.max(maxLen, right-left);
            } else {
                while (left<right && s.charAt(left)!=s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
