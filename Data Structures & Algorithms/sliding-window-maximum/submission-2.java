class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;

        Deque <Integer> dq=new LinkedList<>();
        int res[]=new int[n-k+1];
        int j=0;

        int left = 0;
        int right = 0;

        while (right < n) {
            if (!dq.isEmpty() && left>dq.getFirst()) {
                dq.removeFirst();
            }

            while (!dq.isEmpty() && nums[dq.getLast()]<nums[right]) {
                dq.removeLast();
            }

            dq.addLast(right);

            if(right-left+1 == k) {
                res[j++]=nums[dq.getFirst()];
                left++;
            }

            right++;
        }
        return res;
    }
}
