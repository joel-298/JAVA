//QUESTION : 3
// LEETCODE : 2129


class Solution {
    public String capitalizeTitle(String title) {
        String [] words = title.split(" ") ;

        StringBuilder result = new StringBuilder() ;

        for(int i = 0 ; i < words.length ; i++){
            String word = words[i].toLowerCase() ; 

            if(word.length() > 2){
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1) ; 
            }
            
            result.append(word) ; 
            if( i < words.length - 1){
                result.append(" ") ;
            }
        }

        return result.toString() ; 
    }
}