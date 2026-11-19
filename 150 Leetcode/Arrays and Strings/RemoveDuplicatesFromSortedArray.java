//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 0 ;


        for(int j = 1 ; j<nums.length ; j++){

            if(nums[j] != nums[i]){
                i++ ; 
                swap(nums , i , j ) ; 
            }
        } 

        return i+1 ; 


    }

    public void swap(int[]nums , int i , int j ){
        int s = nums[i] ; 
        nums[i] = nums[j] ; 
        nums[j] = s ; 
    }
}
