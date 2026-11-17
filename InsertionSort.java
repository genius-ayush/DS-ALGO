//https://www.geeksforgeeks.org/problems/insertion-sort/1

class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        
        for(int i = 1 ; i<arr.length ; i++){
            

            for(int j = i-1 ; j>=0 ; j--){
                
                if(arr[j] > arr[j+1]){
                    swap(arr , j , j+1) ; 
                    
                }else{
                    break ; 
                }
            }
        }
        
    }
    
    public void swap(int arr[] , int i , int j ){
        
        int s = arr[i] ; 
        arr[i] = arr[j] ; 
        arr[j] = s ; 
    }
}
