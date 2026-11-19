//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeElement(int[] nums, int val) {
         
         if(nums.length == 0 ){
            return 0 ; 
         }

         int i = 0 ; 
         int j = nums.length -1 ; 
         int count = 0 ; 

         while( i <= j){

            if(nums[i] != val){
                i++ ; 
            }else{
                swap(nums , i , j ) ; 
                j-- ; 
                count++ ; 
            }
         }

         return (nums.length-count) ; 
    }


    public void swap(int[]nums , int i , int j ){

        int s = nums[i] ; 
        nums[i] = nums[j] ; 
        nums[j] = s ; 
    }
}
