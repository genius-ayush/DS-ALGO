//https://www.geeksforgeeks.org/problems/quick-sort/1
class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low >= high){
            return ; 
        }
        int p = partition(arr , low , high) ; 
        quickSort(arr , low  , p-1) ; 
        quickSort(arr , p+1 , high) ; 
        
        
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        
        int i = low ; 
        int j =  low ;  
        int pivot = arr[high] ; 
        
        
        while(i<=high){
            
            
            if(arr[i] > pivot){
                i++ ; 
            }else{
                swap(arr , i , j) ; 
                i++ ; 
                j++ ; 
            }
        }
        
        return (j-1) ; 
        
    }
    
    private void swap(int[]arr ,  int i , int j ){
        
        int s = arr[i] ; 
        arr[i] = arr[j] ; 
        arr[j] = s ; 
    }
}
