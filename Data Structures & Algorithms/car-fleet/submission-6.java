class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        List<int[]> pairs = new ArrayList<>();

        for (int i=0;i<n;i++) {
            pairs.add(new int[] {position[i], speed[i]});
        }
        pairs.sort((a, b) -> Integer.compare(b[0], a[0]));
        Stack <Double> st=new Stack<>();

        for (int i = 0; i < pairs.size(); i++) {
            int[] pair = pairs.get(i);
            double time=(double)(target-pair[0])/pair[1];

            if (st.isEmpty() || !st.isEmpty() && st.peek()<time) st.push(time);
        }
        return st.size();

    }
}
