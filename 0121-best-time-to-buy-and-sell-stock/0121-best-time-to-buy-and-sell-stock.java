class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0] + 1;
        
        for(int i = 0; i < prices.length; i++){
            if(minPrice <= prices[i]) continue;
            else{
                for(int j = i; j < prices.length; j++){
                    if(maxProfit < (prices[j] - prices[i])){
                        maxProfit = prices[j] - prices[i];
                    }
                }
                minPrice = prices[i];
            }
            
        }
        return maxProfit;
    }
}