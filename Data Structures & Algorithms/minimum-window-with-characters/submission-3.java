class Solution {
    public String minWindow(String s, String t) {
        int n=t.length();
        int m=s.length();

        if(n>m) return "";

        int res[]={-1, -1};
        int resLen=Integer.MAX_VALUE;

        HashMap<Character, Integer> map1=new HashMap<>();
        for (int i=0;i<n;i++) {
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0)+1);
        }

        for (int i=0;i<m;i++) {
            HashMap<Character, Integer> map2=new HashMap<>();
            for (int j=i;j<m;j++) {
                map2.put(s.charAt(j), map2.getOrDefault(s.charAt(j), 0)+1);

                boolean flag=true;
                for (char c : map1.keySet()) {
                    if (map2.getOrDefault(c, 0) < map1.get(c)) {
                        flag=false;
                        break;
                    }
                }

                if(flag && (j-i+1)<resLen) {
                    resLen=j-i+1;
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        if (resLen==Integer.MAX_VALUE) return "";
        return s.substring(res[0], res[1]+1);
    }
}
