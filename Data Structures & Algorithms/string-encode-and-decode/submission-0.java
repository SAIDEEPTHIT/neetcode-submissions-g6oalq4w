class Solution {

    public String encode(List<String> strs) {
        String res="";
        for (int i=0;i<strs.size();i++) {
            res+=strs.get(i);
            res+='€';
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        
        int i=0;
        while (i<str.length()){
            String val="";
            while (str.charAt(i)!='€') {
                val+=str.charAt(i);
                i++;
            }
            i=i+1;
            list.add(val);
        }
        return list;
    }
}
