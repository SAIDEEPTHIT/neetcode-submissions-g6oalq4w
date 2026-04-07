class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>,List<String>> map=new HashMap<>();

        for (int i=0;i<strs.length;i++) {
            int arr[]=new int[26];
            String word=strs[i];
            for (int j=0;j<word.length();j++) arr[word.charAt(j)-'a']++;
            List<Integer> key = new ArrayList<>();
            for (int val : arr) key.add(val);

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>(Arrays.asList(word)));
            } else {
                map.get(key).add(word);
            }
        }
        List<List<String>> list = new ArrayList<>();
        map.forEach((key, value)-> {
            list.add(value);
        });
        return list;
    }
}
