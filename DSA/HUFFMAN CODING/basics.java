// HUFFMAN CODING ? 

// HOW IT WORKS : 
// Reduce memory 
// Count frequency of each character in the input.
// Build a priority queue (min-heap) with these characters as nodes.
// Build a binary tree using the queue by combining the least frequent nodes.
// Assign 0 and 1 to left and right edges respectively.
// Generate prefix codes from the tree.



// 🔧 Example :
// Input: "aaaabbc"

// Frequencies:

// a: 4
// b: 2
// c: 1

// You’d get codes like:

// a = 0
// b = 10
// c = 11

// So the output becomes: 00001010011 — shorter than the original 7 characters x 8 bits.
// Let me know if you were referring to something else (like “Hoffman cogin” is a person or another term) — or if you want to see a C++ or JS implementation!



// EXPLANATION : 

// 🔍 1. Normal Encoding (without compression)
// Assume we're using ASCII encoding, where each character takes 8 bits (1 byte).

        // 📦 Original String : "aaaabbc"
        // Total characters = 7

        // Each character = 8 bits
        // So total = 7 × 8 = 56 bits

        // ✅ Data size without compression = 56 bits

// ⚙️ 2. Now with Huffman Coding
    // Step 1: Count Frequency
    // We start by counting how many times each character occurs:
    // Character	Frequency
    // a	            4
    // b	            2
    // c	            1
    
    // Step 2: Build Min-Heap (Priority Queue)
    // Treat each character and its frequency as a node. We build a min-heap based on frequency:
    // [ a:4, b:2, c:1 ]
    // Step-by-step:
    // Take smallest two nodes: c:1 and b:2
    // Combine into new node: (c+b):3

    // Now you have:

    // [ a:4, cb:3 ]
    // Combine the next two: (a:4 + cb:3) = abc:7

    // 🎉 Done — we now have a Huffman tree.

// Step 3: Assign Binary Codes
    // Now we traverse the tree:
    // Going left = 0
    // Going right = 1
    // Suppose the tree looks like this (actual path depends on build order):


    //         (*:7)
    //        /     \
    //     a:4      (*:3)
    //             /    \
    //          c:1     b:2
    
    // Encoding:
    // a = 0
    // c = 10
    // b = 11

// Step 4: Encode the String
    // Original string = "aaaabbc"
    // Character by character:
    // a = 0
    // a = 0
    // a = 0
    // a = 0
    // b = 11
    // b = 11
    // c = 10

// ✅ Final Huffman Encoded String:
// 0000111110

// That's 10 bits total!

// 🧮 Final Comparison
// Method	Bits used
// Normal (ASCII)	56 bits
// Huffman Coding	10 bits
// 🎯 Compression achieved: ~82% reduction in size

// 🔑 Key Takeaway:
// Huffman coding improves compression by:
// Giving shorter codes to frequent characters
// Giving longer codes to rare characters
// Using a prefix-free system (no code is a prefix of another)