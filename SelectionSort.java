//https://www.geeksforgeeks.org/problems/selection-sort/1
class Solution {
    void selectionSort(int[] arr) {
        // code here
        
        if(arr.length <=1){
            return ; 
        }
        
        for(int i = 0 ; i<arr.length-1 ; i++){
            
            int min = i ; 
            
            for(int j = i+1 ; j<arr.length ; j++){
                
                if(arr[min] > arr[j]){
                    min = j ; 
                }
            }
            
            swap(arr , i , min) ; 
        }
        
    }
    
    void swap(int[]arr , int i , int j){
        
        int s = arr[i] ; 
        arr[i] = arr[j] ; 
        arr[j] = s ; 
    }
}
