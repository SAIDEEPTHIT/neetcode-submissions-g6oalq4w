class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLen=0;

        int left=0;
        int right=0;
        HashSet<Character> set=new HashSet<>();
        int count=0;

        while (left<=right && right<n) {
            if(set.add(s.charAt(right))) {
                right++;
                count++;
                maxLen=Math.max(maxLen, count);
            } else {
                while (left<right && s.charAt(left)!=s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                    count--;
                }
                set.remove(s.charAt(left));
                left++;
                count--;
            }
        }
        return maxLen;
    }
}
