// CHECK IS THE ARRAY IS MAX HEAP OR NOT 
// STEPS : 
// 1) PASS THE ARRAY IN HEAPIFY FUNCTION 
// 2) IS PARENT != INDEX { RETURN FALSE }

static boolean HEAPIFY(int arr[] , int n, int index) {
    int Parent = index ;
    int Left = 2 * Parent + 1 ; 
    int Right = 2 * Parent + 2 ;
    if(Left <= n && arr[Parent] < arr[Left]) {
        Parent = Left ; 
    }
    if(Right <= n && arr[Parent] < arr[Right]) {
        Parent = Right ; 
    }
    if(Parent != index) {
        return false ; 
    }
    return true ; 
}
static int isMaxHeap(int array[], int n){
    boolean x = true ; 
    for(int i = (n/2)-1 ; i >= 0 ; i--) {
        if(!HEAPIFY(array,n-1,i)) { // i.e not heap detected
            x = false ; 
            break ;
        } 
    }
    if(x) {
        return 1 ; 
    }
    else{
        return 0 ;
    }
}




HEAP : 

Heapify :  N = original size
pass        : N-1
forloop   : (N/2) -1


HEAP SORT : 
for loop (N-1 ; N > 0 ) {
        // SWAP arr[0] and arr[i] 
        // HEAPIFY  :    i-1 , 0  
}


HEAPIFY ADD 
pass the last index 
parent = (index/2) -1

HEAPIFY DELETE 
normal heapify function 