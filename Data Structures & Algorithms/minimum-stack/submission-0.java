class MinStack {
    Stack <Integer> st=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for (Integer item : st) {
            min=Math.min(min, item);
        }
        return min;
    }
}
