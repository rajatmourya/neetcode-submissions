class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int r = 1;
        while(r < prices.length){
            if(prices[r] < buy){
                buy = prices[r];
            }
            if(prices[r] > buy && (prices[r] - buy)>profit){
                profit = prices[r] - buy;
            }
            r++;
        }
        return profit;
    }
}
