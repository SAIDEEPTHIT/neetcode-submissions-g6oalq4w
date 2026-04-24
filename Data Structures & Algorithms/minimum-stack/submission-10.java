class MinStack {
    Stack <Integer> st;
    Stack <Integer> stMin;
    public MinStack() {
        st=new Stack<>();
        stMin=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (stMin.isEmpty() || !stMin.isEmpty() && val <= stMin.peek()) 
            stMin.push(val);
    }
    
    public void pop() {
        if (st.peek().equals(stMin.peek())) stMin.pop(); // dont use ==
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return stMin.peek();
    }
}
