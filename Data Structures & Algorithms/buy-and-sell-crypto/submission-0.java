class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = Integer.MIN_VALUE;
        for(int i=1; i<prices.length; i++){
            profit = prices[i]-buy>profit?prices[i]-buy:profit;
            buy = prices[i]<buy?prices[i]:buy;
        }
        return profit<0?0:profit;
    }
}
