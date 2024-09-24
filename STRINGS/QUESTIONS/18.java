// QUESTION 18 : 
// LEETCODE 680 : 
// iss wale code mae mere itne test cases chale hae : i dont recoment ki tu yae wala code kare  : 
// I recomend ki tu youtube sae dekh lae yae wala if u want 
// else tu skip bhi kar sakti hae if you want : 

// 465 / 472 testcases



class Solution {
    public boolean validPalindrome(String s) {
        int i = 0; 
        int j = s.length() - 1;
        boolean deleted = false; // Keep track if a character has already been deleted
        
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if (deleted) { // If a character has already been deleted, return false
                    return false;
                }
                // Try skipping one character and continue checking
                if (s.charAt(i + 1) == s.charAt(j)) {
                    i++;  // Skip the character at i
                } else if (s.charAt(i) == s.charAt(j - 1)) {
                    j--;  // Skip the character at j
                } else {
                    return false; // If neither skip works, it's not a valid palindrome
                }
                deleted = true; // Mark that we have deleted one character
            }
        }
        
        return true;
    }
}
