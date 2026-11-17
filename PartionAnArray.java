// https://www.youtube.com/watch?v=if40LxQ8_Xo&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=8
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0 ; 
        int j = 0 ; 

        while(i< nums.length){

            if(nums[i] > pivot){
                i++ ; 
            }else{
                swap(nums , i , j) ; 
                i++ ; 
                j++ ; 
            }
        }

        return nums ; 
    }

    public void swap(int[]nums , int i , int j){

        int s = nums[i] ; 
        nums[i] = nums[j] ; 
        nums[j] = s ; 
    }

}
