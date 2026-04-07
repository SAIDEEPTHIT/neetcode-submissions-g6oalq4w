class Solution {

    public String encode(List<String> strs) {
        String val="";
        for (int i=0;i<strs.size();i++) {
            val+=strs.get(i);
            val+='é';
        }
        return val;
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        for (int i=0;i<str.length();i++) {
            String val="";
            while (str.charAt(i)!='é') {
                val+=str.charAt(i);
                i++;
            }
            list.add(val);
        }
        return list;
    }
}
