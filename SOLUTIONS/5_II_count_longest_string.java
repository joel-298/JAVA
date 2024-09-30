// Input : My name is joel matthew abcdefg 
// Output : matthew 
// // explanation  : both abcdefg and matthew have same length but output == matthew because it is occuring first 



public String func(String input){
    input = input.trim() ; 
    String [] arr = input.split("\\s+"); 

    String result = "";
    int max = 0 ;
    for(int i = 0 ; i < arr.length ; i++){
        if(max < arr[i].length()){
            max = arr[i].length() ; 
            result = arr[i] ; 
        }
    }

    return result ; 
}