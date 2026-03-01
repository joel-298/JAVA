// Longest Substring with non repeating characters 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0 ; 
        int count = 0 ; 
        HashSet<Character> h = new HashSet<>() ; 
        int left = 0 ;
        for(int i = 0 ; i < s.length() ; i++) {
            if(!h.contains(s.charAt(i))) {
                h.add(s.charAt(i)) ;
                count++ ; 
                max = Math.max(count,max) ; 
            }
            else {
                while(h.contains(s.charAt(i))) {
                    h.remove(s.charAt(left)) ; 
                    count-- ; 
                    left++ ; 
                }
                h.add(s.charAt(i)) ; 
                count++ ; 
            }
        }
        return max ; 
    }
}