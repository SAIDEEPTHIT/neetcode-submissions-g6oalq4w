class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;

        int pse[]=new int[n]; pse[0]=-1; Arrays.fill(pse, -1);
        int nse[]=new int[n]; nse[n-1]=n; Arrays.fill(nse, n);

        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();

        for (int i=0;i<n;i++) {
            while (!st2.isEmpty() && heights[i]<heights[st2.peek()]) {
                //store indices
                nse[st2.peek()]=i;
                st2.pop();
            }
            st2.push(i);
        }

        for (int i=n-1;i>=0;i--) {
            while (!st1.isEmpty() && heights[i]<heights[st1.peek()]) {
                //store indices again babe
                pse[st1.peek()]=i;
                st1.pop();
            }
            st1.push(i);
        }

        for (int i=0;i<n;i++) {
            maxArea=Math.max(maxArea, (nse[i]-pse[i]-1) * heights[i]);
        }
        return maxArea;
    }
}
