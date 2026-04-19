class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        if (s1.length()>s2.length()) return false;

        int freq1[]=new int[26];

        for (int i=0;i<n;i++) freq1[s1.charAt(i)-'a']++;

        int left=0;
        int right=s1.length()-1;

        while (right<m) {

            int freq2[]=new int[26];

            for (int i=left;i<=right;i++) freq2[s2.charAt(i)-'a']++;

            if(Arrays.equals(freq1, freq2)) return true;
            else {
                left++;
                right++;
            }
        }
        return false;
    }
}
