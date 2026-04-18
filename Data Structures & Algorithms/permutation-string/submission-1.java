class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] c1=s1.toCharArray();
        Arrays.sort(c1);
        for (int i=0;i<s2.length();i++) {
            String curr="";

            for (int j=i;j<s2.length();j++) {
                curr+=s2.charAt(j);
                char[] c2=curr.toCharArray();
                Arrays.sort(c2);

                if(Arrays.equals(c1, c2)) return true;
            }
        }
        return false;
    }
}
