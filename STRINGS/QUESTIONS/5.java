// QUESTION 5 :
// LEETCODE 151 

class Solution {
    public String reverseWords(String s) {

        s = s.trim() ; 


        String [] words = s.split("\\s+") ;

        for(int i = 0 ; i < words.length/2 ; i++){
            String temp = words[i] ; 
            words[i] = words[words.length - i - 1 ];
            words[words.length - i - 1 ] = temp ; 
        } 

        StringBuilder result = new StringBuilder() ; 
        for(int i = 0 ; i < words.length ; i++){
            result.append(words[i]) ;
            if(i < words.length - 1){
                result.append(" ") ;
            } 
        }

        return result.toString() ; 
        
    }
}