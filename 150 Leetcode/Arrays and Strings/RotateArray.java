// https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public void rotate(int[] nums, int k) {

        if(nums.length == 1 || nums.length == 0){
            return ; 
        }
        
        int p = k%nums.length ; 
        swapArray(nums , 0 , nums.length-p-1) ; 
        swapArray(nums , nums.length-p , nums.length-1) ; 
        swapArray(nums , 0 , nums.length-1) ; 
    }

    public void swap(int[]nums , int i , int j){

        int s = nums[i] ; 
        nums[i] = nums[j] ; 
        nums[j] = s ; 
    }

    public void swapArray(int[]nums , int i , int j ){

        while(i<j){

            swap(nums , i , j) ; 
            i++ ; 
            j-- ; 
        }
    }
}
