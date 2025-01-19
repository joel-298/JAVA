// # Trie

// ### 1. **Introduction to Tries**

// A **Trie** (also known as a prefix tree) is a special type of tree data structure used to store strings. The main use case of Tries is to store words efficiently for prefix-based search operations.

// ### 1.1 **Trie Structure**

// - Each node of the Trie represents a character of the string.
// - The root node represents an empty string.
// - Each edge represents the next character in the string.
// - Strings that share a common prefix share a common path in the Trie.
// - Leaf nodes represent the end of words.

// ### 1.2 **Basic Operations on Tries**

// - **Insertion**: Inserting a word involves starting at the root and adding nodes for each character in the word if they don’t already exist.
// - **Search**: Searching involves traversing the Trie along the characters of the string. If the path exists and ends at a valid word (indicated by a special marker or end node), the word is found.
// - **Prefix Search**: To search for words with a common prefix, you start at the root and traverse down the nodes corresponding to the prefix.

// ### 1.3 **Time Complexity of Trie Operations**

// - **Insertion**: O(m), where m is the length of the word.
// - **Search**: O(m), where m is the length of the word.
// - **Prefix Search**: O(m), where m is the length of the prefix.

// ### 2. **Suffix Arrays**

// A **Suffix Array** is an array of all suffixes of a given string sorted in lexicographical order. It’s a powerful tool for pattern matching and substring-related queries.

// ### 2.1 **Definition**

// - Let’s say we have a string `S = "banana"`. The suffixes of this string are:
//     - "banana"
//     - "anana"
//     - "nana"
//     - "ana"
//     - "na"
//     - "a"
// - A **Suffix Array** is an array of indices representing the starting positions of these suffixes in lexicographically sorted order.

// ### 2.2 **Building a Suffix Array**

// - Construct all possible suffixes of a string.
// - Sort the suffixes lexicographically.
// - Record the starting index of each sorted suffix.

// For the string `banana`, the suffix array would be `[5, 3, 1, 0, 4, 2]`.

// ### 2.3 **Applications of Suffix Arrays**

// - **Pattern Searching**: Efficient for finding whether a pattern exists in a string and locating all occurrences.
// - **Longest Common Prefix (LCP)**: Helps to compute the longest common prefix between suffixes.
// - **String Matching**: Useful for substring matching in linear time with binary search.

// ### 2.4 **Time Complexity**

// - **Construction**: Naive methods take O(n^2 log n), but efficient algorithms like **Karkkainen-Sanders** build it in O(n).
// - **Pattern Matching**: O(m log n) with binary search, where m is the pattern length and n is the length of the text.

// ### 3. **Longest Repeated Substring (Overlapping and Non-overlapping)**

// The **Longest Repeated Substring** problem involves finding the longest substring that appears more than once in a given string. The repeated substring can either be **overlapping** or **non-overlapping**.

// ### 3.1 **Overlapping vs Non-overlapping**

// - **Overlapping**: A substring can overlap with itself. For example, in the string `abcab`, the substring "ab" repeats and overlaps.
// - **Non-overlapping**: A substring cannot overlap with itself. In the same string `abcab`, the substring "ab" only repeats without overlapping.

// ### 3.2 **Using Suffix Arrays for Longest Repeated Substring**

// The problem can be solved efficiently using a **Suffix Array** and an **LCP (Longest Common Prefix) Array**:

// 1. Build the suffix array for the given string.
// 2. Construct the LCP array, where each entry LCP[i] gives the longest common prefix between suffixes at index i and i-1 in the suffix array.
// 3. The maximum value in the LCP array represents the length of the longest repeated substring.

// ### 3.3 **Algorithm**

// - Build the Suffix Array in O(n log n).
// - Build the LCP array in O(n).
// - Scan the LCP array to find the maximum value, which gives the length of the longest repeated substring.

// ### 3.4 **Time Complexity**

// - The overall time complexity is **O(n log n)** due to the construction of the Suffix Array and LCP array.

// ---

// ### **Summary**

// 1. **Trie**: A tree data structure for efficient string searching (particularly useful for prefix searches). Operations like insertion, search, and prefix search run in O(m) time, where m is the length of the string.
// 2. **Suffix Arrays**: An array of starting indices of all suffixes of a string, sorted lexicographically. It is a highly efficient structure for pattern matching and solving substring-related problems.
// 3. **Longest Repeated Substring**: Can be solved using a combination of the Suffix Array and LCP Array. The LCP array helps in determining the longest common prefix between suffixes, which leads to finding repeated substrings.

// ### **Applications**

// - Tries are used in autocomplete systems, dictionary word lookups, and IP routing.
// - Suffix Arrays are used in bioinformatics for DNA sequence analysis, text search algorithms, and data compression.
// - Longest Repeated Substring algorithms are applied in string matching, compression, and plagiarism detection.















// SUFFIX ARRAY CONSTRUCTION 
import java.util.Arrays;

class SuffixArray {
    public static int[] buildSuffixArray(String s) {
        int n = s.length();
        Suffix[] suffixes = new Suffix[n];

        for (int i = 0; i < n; i++) {
            suffixes[i] = new Suffix(s.substring(i), i);
        }

        Arrays.sort(suffixes, (a, b) -> a.suffix.compareTo(b.suffix));

        int[] suffixArray = new int[n];
        for (int i = 0; i < n; i++) {
            suffixArray[i] = suffixes[i].index;
        }

        return suffixArray;
    }

    static class Suffix {
        String suffix;
        int index;

        Suffix(String suffix, int index) {
            this.suffix = suffix;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        String s = "banana";
        int[] suffixArray = buildSuffixArray(s);

        System.out.println("Suffix Array:");
        for (int i : suffixArray) {
            System.out.print(i + " ");
        }
    }
}


// LONGEST REPEATED SUBSTRING USING SUFFIX ARRAY AND LCP 
import java.util.Arrays;

class LongestRepeatedSubstring {

    public static int[] buildSuffixArray(String s) {
        int n = s.length();
        Suffix[] suffixes = new Suffix[n];

        for (int i = 0; i < n; i++) {
            suffixes[i] = new Suffix(s.substring(i), i);
        }

        Arrays.sort(suffixes, (a, b) -> a.suffix.compareTo(b.suffix));

        int[] suffixArray = new int[n];
        for (int i = 0; i < n; i++) {
            suffixArray[i] = suffixes[i].index;
        }

        return suffixArray;
    }

    public static int[] buildLCPArray(String s, int[] suffixArray) {
        int n = s.length();
        int[] rank = new int[n];
        int[] lcp = new int[n];

        for (int i = 0; i < n; i++) {
            rank[suffixArray[i]] = i;
        }

        int h = 0;
        for (int i = 0; i < n; i++) {
            if (rank[i] > 0) {
                int j = suffixArray[rank[i] - 1];
                while (i + h < n && j + h < n && s.charAt(i + h) == s.charAt(j + h)) {
                    h++;
                }
                lcp[rank[i]] = h;
                if (h > 0) h--;
            }
        }
        return lcp;
    }

    public static String findLongestRepeatedSubstring(String s) {
        int[] suffixArray = buildSuffixArray(s);
        int[] lcpArray = buildLCPArray(s, suffixArray);

        int maxLCP = 0;
        int index = 0;
        for (int i = 1; i < lcpArray.length; i++) {
            if (lcpArray[i] > maxLCP) {
                maxLCP = lcpArray[i];
                index = suffixArray[i];
            }
        }

        return s.substring(index, index + maxLCP);
    }

    public static void main(String[] args) {
        String s = "banana";
        String lrs = findLongestRepeatedSubstring(s);
        System.out.println("Longest Repeated Substring: " + lrs);
    }
}
