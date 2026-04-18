class Solution {
    public int characterReplacement(String s, int k) {
        //BRUTE FORCE

        int n=s.length();
        int maxLen=0;

        for (int i=0;i<n;i++) {
            int freq[]=new int[26];
            int max=0;
            for (int j=i;j<n;j++) {
                freq[s.charAt(j)-'A']++;
                max=Math.max(max, freq[s.charAt(j)-'A']);

                if((j-i+1)-max <= k) {
                    maxLen=Math.max(maxLen, j-i+1);
                } else break;
            }
        }

        return maxLen;
    }
}
