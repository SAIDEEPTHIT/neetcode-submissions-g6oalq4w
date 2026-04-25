class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //brute force

        int n=temperatures.length;
        int[] res=new int[n];

        for (int i=0;i<n;i++) {
            for (int j=i;j<n;j++) {
                if (temperatures[j]>temperatures[i]) {
                    res[i]=j-i;
                    break;
                } else res[i]=0;
            }
        }
        return res;
    }
}
