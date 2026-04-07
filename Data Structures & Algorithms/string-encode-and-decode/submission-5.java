class Solution {

    public String encode(List<String> strs) {
        String val="";
        for (int i=0;i<strs.size();i++) {
            val+=strs.get(i).length();
            val+='#';
            val+=strs.get(i);
        }
        return val;
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();

        int i=0;
        while (i<str.length()) {
            String num="";
            while (str.charAt(i)!='#') {num+=str.charAt(i); i++;}
            int endIndex = Integer.parseInt(num) + i + 1;
            String val=str.substring(i+1, endIndex);
            list.add(val);
            i=Integer.parseInt(num) + i + 1;
        }
        return list;
    }
}
