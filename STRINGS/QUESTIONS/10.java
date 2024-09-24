// QUESTION : 10 
// LEETCODE 443 

class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder() ;
        int count = 1 ;
        sb.append(chars[0]) ; // initialy appending 1st character

        for(int i = 1 ; i < chars.length ; i++) {
            if(chars[i] == chars[i-1]){
                count++ ; 
            }
            else{
                if(count > 1){
                    sb.append(count) ; 
                }
                sb.append(chars[i]); // appending next character
                count = 1 ; // resetting count to ONE 
            }
        }

        // appending the last count 
        if(count > 1){
            sb.append(count) ;
        }

        for(int i = 0 ; i < sb.length() ; i++){
            chars[i] = sb.charAt(i) ; 
        }
        return sb.length(); // Return the new length of the compressed array
    }
}
