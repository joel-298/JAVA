// QUESTION 17
// LEETCODE 541 

class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder(); // To store the final result

        for (int i = 0; i < s.length(); i += 2 * k) {
            // Reverse the first k characters in the current segment
            String segment = s.substring(i, Math.min(i + k, s.length())); // Get the substring
            result.append(new StringBuilder(segment).reverse()); // Append reversed segment
            
            // Append the next k characters without reversing
            if (i + k < s.length()) {
                result.append(s.substring(i + k, Math.min(i + 2 * k, s.length())));
            }
        }
        
        return result.toString(); // Convert StringBuilder to String and return
    }
}