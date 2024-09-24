// DO QUESTIONS BASED ON SORTING THE STRING ARRAY , wrt different conditions ; 

import java.util.Arrays;
import java.util.Comparator;

public class SortByLength {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "pear", "kiwi", "orange"};

        // Sort the array based on the length of strings
        Arrays.sort(arr, Comparator.comparingInt(String::length));

        // Output the sorted array
        System.out.println(Arrays.toString(arr));
    }
}