class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();

        for (int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        List<Integer> list=new ArrayList<>(map.keySet());
        list.sort(Comparator.comparing(map::get).reversed());

        ArrayList<Integer> array=new ArrayList<>(list.subList(0, k));
        int arr[]=new int[array.size()];
        for (int i=0;i<array.size();i++) arr[i]=array.get(i);
        return arr;
    }
}
