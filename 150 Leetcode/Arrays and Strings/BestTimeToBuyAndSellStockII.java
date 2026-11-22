// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/2201229322/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {
        
        int bd = 0 ;
        int sd = 0 ; 
        int profit = 0 ; 

        for(int i = 1 ; i<prices.length ; i++){

            if(prices[i] >= prices[i-1]){
                sd = i   ; 
            }else{

                profit += prices[sd] - prices[bd] ; 
                sd = bd = i ; 
            }
        }
        profit += prices[sd] - prices[bd] ; 
        return profit ; 
    }
}
