class Solution {
    public int maxProfit(int[] prices) {
                int maxProfit = 0;
        int bestPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > bestPrice){
                maxProfit = Math.max(maxProfit, prices[i] - bestPrice);
            }
            bestPrice = Math.min(bestPrice, prices[i]);
        }
        return maxProfit;
    }
}
