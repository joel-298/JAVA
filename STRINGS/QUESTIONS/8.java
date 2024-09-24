// QUESTION 8 : 
// LEETCODE 551 


class Solution {
    public boolean checkRecord(String s) {
        int count_A = 0 ;

        int i = 0 ;
        while(i < s.length()) {
            if(s.charAt(i) == 'A'){
                count_A++ ;
            }
            else if(s.charAt(i) == 'L'){
                if((i+1 < s.length() && s.charAt(i+1) == 'L') && (i+2 < s.length() && s.charAt(i+2) == 'L')){
                    return false ;
                }
            }
            i++ ;
        };

        if(count_A < 2){
            return true ;
        }
        return false; 
    }
}