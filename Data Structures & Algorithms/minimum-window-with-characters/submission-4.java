class Solution {
    public String minWindow(String s, String t) {
        int n1=s.length();
        int n2=t.length();

        if (n2>n1) return "";

        int minLen=Integer.MAX_VALUE;
        int res[]=new int[2];

        HashMap<Character, Integer> map1=new HashMap<>();
        for (char val : t.toCharArray()) map1.put(val, map1.getOrDefault(val, 0)+1);


        for (int i=0;i<n1;i++) {
            HashMap<Character, Integer> map2=new HashMap<>();

            for (int j=i;j<n1;j++) {
                map2.put(s.charAt(j), map2.getOrDefault(s.charAt(j), 0)+1);
                
                boolean flag = true;
                for (char key : map1.keySet()) {
                    if (!map2.containsKey(key) || map1.get(key) > map2.get(key)) {
                    flag = false;
                    break;
                }
}

                if (flag==true && j-i+1<minLen) {
                    minLen=j-i+1;
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return minLen!=Integer.MAX_VALUE ? s.substring(res[0], res[1]+1) : "";
    }
}