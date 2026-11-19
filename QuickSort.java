// https://www.geeksforgeeks.org/problems/merge-sort/1
class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        
        int ans[] =  helper(arr , l , r) ; 
        
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = ans[i] ; 
        }
        
        
    }
    
    public int []helper(int arr[] , int l , int r){
        
        if(l == r){
            int ba[] = new int[1] ; 
            ba[0] = arr[l]; 
            return ba ; 
        }
        
        int mid = (l+r)/2 ; 
        
        int left[] = helper(arr , l , mid ) ; 
        int right[] = helper(arr , mid+1 , r) ; 
        
        
        int ans[] = mergeSortedArray(left , right) ; 
        
        return ans ; 
        
    }
    
    public int[] mergeSortedArray(int[] arr1 , int[]arr2){
        
        int i = 0 ; 
        int j = 0 ; 
        int k = 0 ; 
        int sArray[] = new int[arr1.length + arr2.length] ; 
        
        while(i<arr1.length && j<arr2.length){
            
            if(arr1[i] <= arr2[j]){
                sArray[k] = arr1[i] ; 
                i++ ; 
                k++ ; 
            }else{
                sArray[k] = arr2[j] ; 
                j++ ; 
                k++ ; 
            }
        }
        
        while(i < arr1.length) {
            sArray[k++] = arr1[i++];
        }

        while(j < arr2.length) {
            sArray[k++] = arr2[j++];
        }
        
        return sArray ; 
    }
}
