class Solution {
    public int maxProfit(int[] prices) {
        
        int result = 0;
        
        if(prices.length == 0 || prices == null) {
            return 0;
        }
        
        // initialize min to be the first element of the prices array
        int min = prices[0];
        
        // loop over the array to find the minimum element from the array.
        // also find the largest difference
        for(int i = 1; i < prices.length; i++) {
            result = Math.max(prices[i] - min,result);
            min = Math.min(min,prices[i]);
        }
        
        return result;
    }
}
