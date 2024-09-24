


// 1. StringBuffer
// Definition:
// StringBuffer is a mutable sequence of characters. It is used to create strings that can be modified after they are created. 
// It is thread-safe, meaning it can be safely used in a multi-threaded environment.

// 2. StringBuilder
// Definition:
// StringBuilder is similar to StringBuffer but is not synchronized (thread-safe). It is faster and is preferred when only a single thread is working with strings.
 
// 3. StringTokenizer  --------------------------------> IMPORT StringTokenizer
// Definition:
// StringTokenizer is a legacy class used to split a string into tokens (substrings) based on specified delimiters. It's simpler than using regular expressions but less powerful.

import java.util.StringTokenizer; 


public class Main{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World!");  // Modifies the original string
        System.out.println(sb); // Output: Hello World!

        StringBuilder SB = new StringBuilder("Hello");
        SB.append(" World!");  // Modifies the original string
        System.out.println(SB); // Output: Hello World!

        StringTokenizer st = new StringTokenizer("Hello,World,Java", ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken()); // Output: Hello World Java
        }

    }
}