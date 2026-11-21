//https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int majorityElement(int[] nums) {
        
        
        int element = nums[0] ;
        
        int count = 1 ;  

        for(int i = 1 ; i<nums.length ; i++){

            if(nums[i] == element){
                count++ ; 
            }else{
                count-- ; 
                if(count == -1){
                    element = nums[i] ;
                    count = 1 ;  
                }
            }
        }

        return element ; 
        
    }
}
