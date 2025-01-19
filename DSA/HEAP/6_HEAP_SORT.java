// similar to heapify 


// MIN HEAP SORT
class Result {
    static void heapify (int array[], int n, int i) {
        int Parent = i ; 
        int Left = 2 * Parent + 1 ;
        int Right = 2 * Parent + 2 ;
        if(Left <= n && array[Parent] < array[Left]){
            Parent = Left ;
        }
        if(Right <= n && array[Parent] < array[Right]){
            Parent = Right ;
        }
        if(Parent != i) {
            int temp = array[Parent] ;
            array[Parent] = array[i] ;
            array[i] = temp ; 
            heapify(array,n,Parent) ;
        }
    }

    static void heapSort(int array[], int n) {
        for(int i = (n/2)-1 ; i >= 0 ; i--) {
            heapify(array,n-1,i) ;
        }
        // One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root (max element) to the end arr[0] & arr[i] ; 
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // Call heapify on the reduced heap
            heapify(array, i - 1, 0);  // Corrected to i-1 to reduce the heap size
        }
    }
}

// MAX HEAP SORT 
class Result {
    static void heapify (int array[], int n, int i) {
        int Parent = i ; 
        int Left = 2 * Parent + 1 ;
        int Right = 2 * Parent + 2 ;
        if(Left <= n && array[Parent] > array[Left]){
            Parent = Left ;
        }
        if(Right <= n && array[Parent] > array[Right]){
            Parent = Right ;
        }
        if(Parent != i) {
            int temp = array[Parent] ;
            array[Parent] = array[i] ;
            array[i] = temp ; 
            heapify(array,n,Parent) ;
        }
    }

    static void heapSort(int array[], int n) {
        for(int i = (n/2)-1 ; i >= 0 ; i--) {
            heapify(array,n-1,i) ;
        }
        // One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root (max element) to the end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // Call heapify on the reduced heap
            heapify(array, i - 1, 0);  // Corrected to i-1 to reduce the heap size
        }
    }
}