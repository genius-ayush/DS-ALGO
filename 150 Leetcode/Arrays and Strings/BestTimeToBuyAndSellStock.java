// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {
        
        int cAns = 0 ; 
        int psb = Integer.MAX_VALUE ; 

        for(int i = 0 ; i<prices.length ; i++){

            if(psb > prices[i]){
                psb = prices[i] ; 
            }

            cAns = Math.max(cAns , prices[i]-psb) ; 
        }
        return  cAns ; 
    }

}
