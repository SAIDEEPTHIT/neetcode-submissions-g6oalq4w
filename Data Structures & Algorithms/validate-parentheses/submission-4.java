class Solution {
    public boolean isValid(String s) {
        int n=s.length();

        HashMap<Character, Character>
        map=new HashMap<>();

        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack <Character> st=new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c) &&
            !st.isEmpty() &&
            map.get(c)==st.peek()) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
