class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprofit = prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprofit){
                minprofit = prices[i];
            }
            int profit= prices[i]-minprofit;

            if(profit>maxprofit){
                maxprofit = profit;
            }
        }
        return maxprofit;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna