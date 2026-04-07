class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLen=0;

        int left=0;
        int right=0;
        HashMap<Character, Integer> map=new HashMap<>();

        while (left<=right && right<n) {
            if(map.containsKey(s.charAt(right))) {
                left=Math.max(left, map.get(s.charAt(right))+1);
            }


            map.put(s.charAt(right), right);
            right++;
            maxLen=Math.max(maxLen, right-left);
        }
        return maxLen;
    }
}
