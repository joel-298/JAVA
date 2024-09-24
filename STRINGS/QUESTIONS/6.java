// QUESTION 6 : 
// LEETCODE 67 : iski approach mane youtube sae copy kari thi 

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0; // Use int for carry to simplify arithmetic operations
        
        // Traverse both strings from the end
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;    

            if(i >= 0){
                sum += a.charAt(i) - '0' ;
                i-- ; 
            }
            if( j >= 0 ){
                sum += b.charAt(j) - '0' ;
                j-- ;
            }
            
            result.append(sum%2); // result will convert int to string automatically : 
                                  // and will have the remainder of sum

            // Update carry (sum / 2 gives the carry)
            carry = sum / 2;  // if sum = 3 -> 3/2 = 1 ; 
                              // if sum = 2 -> 2/2 = 1 ;
                              // if sum = 1 -> 1/2 = 0 ;
                              // if sum = 0 -> 0/2 = 0 ;
        }

        // Reverse the result since we added bits from the least significant side
        return result.reverse().toString();
    }
}