class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int nums[]=new int[n*m];
        int k=0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                nums[k++]=matrix[i][j];
            }
        }

        int low=0;
        int high=nums.length-1;

        boolean res=binarySearch(nums, target, low, high);
        return res;
    }

    public static boolean binarySearch(int[] nums, int target, int low, int high) {
        if(low>high) return false;

        int mid=(low+high)/2;

        if(nums[mid]==target) {
            return true;
        } else if (nums[mid]>target) {
            high=mid-1;
            return binarySearch(nums, target, low, high);
        } else {
            low=mid+1;
            return binarySearch(nums, target, low, high);
        }
    }
}
