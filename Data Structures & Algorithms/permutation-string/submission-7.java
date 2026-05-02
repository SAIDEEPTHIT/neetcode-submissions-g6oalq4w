class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();

        int freq1[]=new int[26];
        for (int i=0;i<n1;i++) freq1[s1.charAt(i)-'a']++;

        int freq2[]=new int[26];

        int left=0;
        int right=0;

        while (right<n2) {
            freq2[s2.charAt(right)-'a']++;

            if (right-left+1==n1) {
                if (Arrays.equals(freq1, freq2)) return true;
                else {
                    freq2[s2.charAt(left)-'a']--;
                    left++;
                }
            }
            right++;
        }
        return false;
    }
}