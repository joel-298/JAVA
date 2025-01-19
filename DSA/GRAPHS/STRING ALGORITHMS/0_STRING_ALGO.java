/// STRING ALGORITHMS : 
// 1) Manacher's Algorithm: Used for efficiently finding the longest palindromic substring in linear time.

// 2) Z-Algorithm: Used for string matching by calculating the Z-array to find substring matches in a string.
// 3) KMP (Knuth-Morris-Pratt): Used for pattern matching in a string by preprocessing the pattern to avoid redundant comparisons.

// Both the Z-Algorithm and KMP Algorithm aim to efficiently find all occurrences of a pattern in a string 
// Z-Algorithm finds all occurrences of a pattern in a string using a Z-array.
// KMP Algorithm uses a prefix-suffix table (LPS array) to avoid unnecessary comparisons during pattern matching.

// Both Z-Algorithm and KMP Algorithm have a time complexity of O(n + m), where:
// n is the length of the text.
// m is the length of the pattern.

// QUESTIONS FOR KMP AND Z-VALUE 
// 📌 Z-Algorithm Questions
    // 🟢 Easy:
    //      686.  Repeated String Match
    // 🟡 Medium:
    //      1923. Longest Common Subpath
    //      796.  Rotate String
// 📌 KMP Algorithm Questions
    // 🟢 Easy:
    //      796.  Rotate String
    // 🟡 Medium:
    //      1405. Longest Happy Prefix
// COMMON : 
// 28 , 459 , 214 , 1392 , 1035 , 1745