class Solution {
    public int maxProfit(int[] prices) {
        //Solution in O(n) time, O(1) space
        int min = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}