class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: count frequency
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        // Step 2: min heap based on frequency
        PriorityQueue<int[]> heap =
            new PriorityQueue<>((a,b) -> a[0] - b[0]);

        // Step 3: keep only k elements in heap
        for(int num : map.keySet()){

            int freq = map.get(num);

            heap.offer(new int[]{freq, num});

            if(heap.size() > k){
                heap.poll();
            }
        }

        // Step 4: build result
        int[] res = new int[k];

        for(int i=0;i<k;i++){
            res[i] = heap.poll()[1];
        }

        return res;
    }
}