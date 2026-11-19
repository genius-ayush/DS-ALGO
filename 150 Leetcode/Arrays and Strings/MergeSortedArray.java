// https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int mArray[] = new int[m+n] ; 

        int i = 0 ; 
        int j = 0 ; 
        int k = 0 ; 


        while(i<m && j<n ){

            if(nums1[i] <= nums2[j]){
                mArray[k] = nums1[i] ; 
                i++ ; 
                k++ ; 
            }else{
                mArray[k] = nums2[j] ; 
                j++ ; 
                k++ ; 
            }
        }

        while(i<m){
            mArray[k] = nums1[i] ; 
            i++ ; 
            k++ ; 
        }

        while(j<n){
            mArray[k] = nums2[j] ; 
            j++ ; 
            k++ ; 
        }


        for(int l = 0 ; l<mArray.length ; l++){
            
            nums1[l] = mArray[l] ; 
        }
    }
}
