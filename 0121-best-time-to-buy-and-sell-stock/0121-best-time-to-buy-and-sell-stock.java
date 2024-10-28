class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int profit = 0;
        
        for(int i = 1; i < prices.length; i++) {
            int cost = prices[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(min, prices[i]);
        }
        return profit;
        
        //brute force
        // int n = prices.length;
        // int max = 0;
        // for(int i = 0; i < n; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         int diff = prices[j] - prices[i];
        //         if(prices[j] > prices[i]) {
        //             max = Math.max(max, diff);
        //         }
        //     }
        // }
        // return max;
    }
}