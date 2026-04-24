class Solution {
    public boolean isValid(String s) {
        //Using Stack only but better (hashmap)

        HashMap<Character, Character> map=new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack <Character> st=new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c) && !st.isEmpty() && st.peek()==map.get(c)) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
