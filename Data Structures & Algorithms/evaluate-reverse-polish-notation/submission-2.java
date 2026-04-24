class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack <String> st=new Stack<>();

        for (int i=0;i<n;i++) {
            String curr=tokens[i];
            if (!("+-*/".contains(curr))) st.push(curr);
            else {
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                int result=0;

                if (curr.equals("+")) {
                    result = a + b;
                } else if (curr.equals("-")) {
                    result = b - a;
                } else if (curr.equals("*")) {
                    result = a * b;
                } else if (curr.equals("/")) {
                    result = b / a;
                }

                st.push(String.valueOf(result));
            }
        }

        return Integer.parseInt(st.peek());
    }
}
