// QUESTION 7 
// LEETCODE : 43

// import java.util.BigInteger ; 
// import java.util.Math ; 

import java.math.BigInteger;  // Import the BigInteger class

class Solution {
    public String multiply(String num1, String num2) {
        // Convert the input strings to BigInteger
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        
        // Multiply the two BigInteger numbers
        BigInteger result = a.multiply(b);
        
        // Convert the result back to a string and return
        return result.toString();

    }
}