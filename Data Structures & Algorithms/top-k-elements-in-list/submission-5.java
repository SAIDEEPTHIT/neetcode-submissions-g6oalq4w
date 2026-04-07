class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();

        for (int val:nums) map.put(val, map.getOrDefault(val, 0)+1);

        List<Integer>[] freq=new List[nums.length+1];
        for (int i=0;i<freq.length;i++) {
            freq[i]=new ArrayList<>();
        }

        map.forEach((key, value)-> {
            freq[value].add(key);
        });

        int res[]=new int[k];
        int idx=0;

        for (int i=freq.length-1;i>0 && idx<k;i--) {
            for (int n:freq[i]) {
                res[idx++]=n;
            }
        }
        return res;
    }
}