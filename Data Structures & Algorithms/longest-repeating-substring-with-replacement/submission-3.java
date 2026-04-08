class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxLen=0;

        int left=0;
        int right=0;

        while (right<n) {
            int freq[]=new int[26];
            int max=0;

            for (int i=left; i<=right;i++) {
                freq[s.charAt(i)-'A']++;
                max=Math.max(max, freq[s.charAt(i)-'A']);
            }

            if( (right-left+1)-max <= k) {
                maxLen=Math.max(maxLen, right-left+1);
                right++;
            } else {
                left++;
            }
        }
        return maxLen;        
    }
}