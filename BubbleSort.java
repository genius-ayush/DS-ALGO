class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        
        if(arr.length <= 1){
            return ; 
        }
        
        for(int i = 1 ; i<=arr.length-1 ; i++){
            
            
            for(int j = 0 ; j<arr.length-i ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr , j , j+1) ; 
                }
            }
            
        }
        
    }
    
    public void swap(int[]arr , int i , int j ){
        
        int s = arr[i] ; 
        arr[i] = arr[j] ; 
        arr[j] = s ; 
        
    }
}
