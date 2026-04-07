class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int curr=0;
        int maxProfit=0;

        while (right<prices.length) {
            if(prices[right]<prices[left]) left=right;
            else {
                curr=prices[right]-prices[left];
                maxProfit=Math.max(maxProfit, curr);
            }
            right++;
        }
        return maxProfit;
    }
    
}
