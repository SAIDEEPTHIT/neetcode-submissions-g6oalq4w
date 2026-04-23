class Solution {
    public boolean isValid(String s) {
        int n=s.length();

        Stack <Character> st=new Stack<>();

        for (int i=0;i<n;i++) {
            if (!st.isEmpty() && 
            st.peek()=='(' &&
            s.charAt(i)==')') st.pop();
            else if (!st.isEmpty() &&
            st.peek()=='{' &&
            s.charAt(i)=='}') st.pop();
            else if (!st.isEmpty() &&
            st.peek()=='[' &&
            s.charAt(i)==']') st.pop();
            else st.push(s.charAt(i));
        }
        return st.isEmpty();
    }
}