class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int best = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - minPrice;

            if (profit > best) {
                best = profit;
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return best;
    }
}