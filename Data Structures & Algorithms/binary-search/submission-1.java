class Solution {
    public int search(int[] nums, int target) {
        //RECURSIVE

        int low=0;
        int high=nums.length-1;

        int res=binarySearch(nums, target, low, high);
        return res;
    }

    public static int binarySearch(int[] nums, int target, int low, int high) {
        if(low>high) return -1;

        int mid=(low+high)/2;

        if(nums[mid]==target) {
            return mid;
        } else if (nums[mid]>target) {
            high=mid-1;
            return binarySearch(nums, target, low, high);
        } else {
            low=mid+1;
            return binarySearch(nums, target, low, high);
        }
    }
}
