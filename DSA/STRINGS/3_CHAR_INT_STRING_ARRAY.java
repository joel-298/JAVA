// FORM GREATEST NUMBER FROM AN ARRAY OF INTEGERS

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length ;
        String [] arr = new String[n] ; 
        for(int i = 0 ; i < n ; i++) {
            arr[i] = String.valueOf(nums[i]) ;  // any data type to string 
        }
        Arrays.sort(arr) ; 
        StringBuilder newString = new StringBuilder("") ; 
        for(int i = n-1 ; i >= 0 ; i--) {
            newString.append(arr[i]) ; 
        }
        return newString.toString() ; 
    }
}

// IS NOT FULLY CORRECT  :


// CUSTOM COMPARATOR : CORRECT SOLUTION
import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];

        // Convert integers to strings
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort using a custom comparator
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: If the largest number is "0", return "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build the final string
        StringBuilder newString = new StringBuilder();
        for (String s : arr) {
            newString.append(s);
        }

        return newString.toString();
    }
}
