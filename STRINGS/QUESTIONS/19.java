// QUESTION : 19
// LEETCODE 521

// ISS WALE PURE CODE KA LOGIC MANE HINTS MAE SAE RAAT LIYA THA : 
// Hint 1
// Think very simple.
// Hint 2
// If a == b, the answer is -1.
// Hint 3
// Otherwise, the answer is the string a or the string b.

class Solution {
    public int findLUSlength(String a, String b) {
        if(a == b){
            return -1 ;
        }
        
        int x = 0 ;
        if(a.length() > b.length()){
            x = a.length() ;
        } 
        else {
            x = b.length() ; 
        }
        return x ;
    }
}
