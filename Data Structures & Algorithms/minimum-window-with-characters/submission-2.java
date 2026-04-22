class Solution {
    public String minWindow(String s, String t) {
        int n=t.length();
        int m=s.length();

        if(n>m) return "";

        int res[]={-1, -1};
        int resLen=Integer.MAX_VALUE;

        HashMap<Character, Integer> countT=new HashMap<>();
        HashMap<Character, Integer> window=new HashMap<>();
        for (int i=0;i<n;i++) {
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0)+1);
        }

        int left=0;
        int right=0;
        int have=0;
        int need=countT.size();

        while (right<m) {
            char curr=s.charAt(right);
            window.put(curr, window.getOrDefault(curr, 0)+1);

            if(countT.containsKey(curr) && countT.get(curr)==window.get(curr)) {
                have++;
            }

            while (have==need) {
                if ((right-left+1 < resLen)) {
                    resLen=right-left+1;
                    res[0]=left;
                    res[1]=right;
                }

                window.put(s.charAt(left), window.getOrDefault(s.charAt(left), 0)-1);
                if (countT.containsKey(s.charAt(left)) && window.get(s.charAt(left)) < countT.get(s.charAt(left))) {
                    have--;
                }
                left++;
            }
            right++;
        }
        if (resLen==Integer.MAX_VALUE) return "";
        return s.substring(res[0], res[1]+1);
    }
}
