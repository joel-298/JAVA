// QUESTION : 14 
// LEETCODE : 58

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim() ; 
        String [] str = s.split(".\\s+") ; 
    
        return str[str.length-1].length() ; 
    }
}