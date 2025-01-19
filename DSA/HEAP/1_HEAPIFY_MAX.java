// MAX HEAP : parent >= child 
// 0 based indexing
import java.util.* ; 

public class Main{
    public static void HEAPIFY_MAX(int [] arr , int index , int n){
        int Parent = index ;
        int Left = 2 * Parent + 1 ; 
        int Right = 2 * Parent + 2 ;
        // Left Node condition 
        if(Left <= n && arr[Parent] < arr[Left]) { // (out of bonds) && (condition) 
            Parent = Left ; 
        }  
        // Right Node condition 
        if(Right <= n && arr[Parent] < arr[Right]) { // (out of bonds) && (condition) 
            Parent = Right ; 
        }
        // if does not satisfy's heap condition
        if(Parent != index) {
            int temp = arr[Parent];   // SWAP  
            arr[Parent] = arr[index]; // SWAP
            arr[index] = temp;       //  SWAP
            HEAPIFY_MAX( arr , Parent , n ) ;
        } 
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,20,4,5,6,18,7,8,14,9,10} ;
        int n = arr.length - 1 ;
        for(int i = (arr.length/2) -1 ; i >= 0 ; i--){
            HEAPIFY_MAX( arr , i , n );
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ") ;
        }
    }
};