// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/2199549975/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int removeDuplicates(int[] nums) {
        

        int p = 2 ; 
        int idx = 2 ; 


        while(p<nums.length){

            if(nums[p] != nums[idx-2]){
                nums[idx] = nums[p] ; 
                idx++ ; 
            }

            p++ ; 
        }

        return idx; 
    }
}
