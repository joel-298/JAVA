


static int func(int n, int [] arr){
    int PRODUCT = 1 ; 
    
    for(int i = 0 ; i < n ; i++){
        PRODUCT *= arr[i] ; 
    }


    int [] result = new int[n] ; 
    for(int i = 0 ; i < n ; i++){
        result[i] = PRODUCT/arr[i] ; 
    }

    return result ; // this was not working 

}