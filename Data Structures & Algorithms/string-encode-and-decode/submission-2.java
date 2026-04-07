class Solution {

    public String encode(List<String> strs) {
        String res="";

        for (int i=0;i<strs.size();i++) {
            res+=strs.get(i).length();
            res+='#';
            res+=strs.get(i);
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();

        for (int i=0;i<str.length();i++) {
            String val="";
            String num="";
            while (str.charAt(i)!='#') {num+=str.charAt(i); i++;}
            int n = Integer.parseInt(num);
            i++;
            int end=n+i;
            val=str.substring(i, end);
            list.add(val);
            i=end-1;
        }
        return list;
    }
}
