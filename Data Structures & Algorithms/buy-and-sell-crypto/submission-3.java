class Solution {
    public int maxProfit(int[] prices) {
        
        //optimal solution
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }

            int profit = prices[i]-minPrice;

            if(profit>maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
















        //brute force
        // int maxProfit = 0; 
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int profit = prices[j]-prices[i]; 

        //         if(profit>maxProfit){
        //             maxProfit = profit;
        //         }
        //     }
        // } return maxProfit;
    }
}
