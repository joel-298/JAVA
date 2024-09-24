// QUESTION : 11 
// LEETCODE 1071 : yae wala mane college mae ratta mara tha 


class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // 1st based on length
        if(str2.length() > str1.length()){
            return gcdOfStrings(str2,str1) ; 
        }

        // 2nd based if both are equal 
        if(str2.equals(str1)){
            return str2 ; 
        }

        // 3rd starts with : gcd : substring
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()),str2) ; 
        }

        // 4th return empty
        return "" ;
    }
}