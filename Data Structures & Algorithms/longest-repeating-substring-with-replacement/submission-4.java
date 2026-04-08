class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxLen=0;

        int left=0;
        int right=0;
        int freq[]=new int[26];
        int max=0;

        while (right<n) {
            freq[s.charAt(right)-'A']++;
            max=Math.max(max, freq[s.charAt(right)-'A']);

            if((right-left+1)-max > k) {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}
