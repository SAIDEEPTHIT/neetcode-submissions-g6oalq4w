class Solution {
    public boolean isValid(String s) {
        //using stack

        Stack<Character> st=new Stack<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && c==')' && st.peek()=='(') st.pop();
            else if (!st.isEmpty() && c==']' && st.peek()=='[') st.pop();
            else if (!st.isEmpty() && c=='}' && st.peek()=='{') st.pop();
            else st.push(c);
        }
        return st.isEmpty();
    }
}
