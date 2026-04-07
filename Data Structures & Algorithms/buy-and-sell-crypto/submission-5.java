class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int cheapestSeenSoFar=prices[0];

        for (int price : prices) {
            maxProfit=Math.max(maxProfit, price-cheapestSeenSoFar);
            cheapestSeenSoFar=Math.min(cheapestSeenSoFar, price);
        }
        return maxProfit;
    }
}
