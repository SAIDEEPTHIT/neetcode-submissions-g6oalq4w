class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String arr[]=new String[strs.length];

        //Sort each word of the String array one by one
        for (int i=0;i<strs.length;i++) {
            arr[i]=sortString(strs[i]);
        }

        HashMap<String, List<String>> map=new HashMap<>();

        for (int i=0;i<arr.length;i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList<>(Arrays.asList(strs[i])));
            } else {
                map.get(arr[i]).add(strs[i]);
            }
        }

        List<List<String>> list=new ArrayList<>();

        map.forEach((key, value) -> {
            list.add(value);
        });

        return list;
    }
    static String sortString(String input) {
            char[] chars = input.toCharArray();
            Arrays.sort(chars); // In-place sorting of the array
            return new String(chars); // Create a new string from the sorted array
    }
}
