// UNIQUE SUBSTRING 
// Given a string of length n of lowercase alphabet characters. we need to count total number of distinct substrings of this string. 
// str = "ababa" 
// ans = 10 


// SUFFIX :                
// "ababa"        PREFIX : "a","ab","aba","abab","ababa" 
//  "baba"        PREFIX : "b","ba","baba"
//   "aba"        PREFIX : "a","ab","aba"
//    "ba"        PREFIX : "b","ba"
//     "a"        PREFIX : "a"
//     " "        PREFIX : " "

// OUT OF THESE : 
//     only include unique prefix ! 


import java.util.* ; 

class Node { 
    public Node [] children ; 
    public boolean endOfWord ;
    public Node() {
        children = new Node[26] ;
        for(int i = 0 ; i < 26 ; i++) {
            children[i] = null ; 
        }
        endOfWord = false ; 
    }
}
class Trie { 
    public Node root  ;
    public Trie() {
        root = new Node() ; 
    }
    // INSERT 
    public void INSERT(String word) {
        Node current = root ; 
        for(int i = 0 ; i < word.length() ; i++) {
            int index = word.charAt(i) - 'a' ; 
            if(current.children[index] == null) {
                current.children[index] = new Node() ; 
            }
            if(i == word.length() -1) {
                current.children[index].endOfWord = true ; 
            }
            current = current.children[index] ; 
        }
    }
    // COUNT 
    public int countUniquePrefix(Node root) {
        if(root == null) {
            return 0 ;
        } 
        int count = 0 ; 
        for(int i = 0 ; i < 26 ; i++) {
            if(root.children[i] != null) {
                count += countUniquePrefix(root.children[i]) ; 
            }
        }
        return count + 1 ; 
    }
}
public class Main {
    public static void main(String args[]) {
        String words = "ababa" ; 
        Trie t = new Trie() ; 
        for(int i = 0 ; i < words.length() ; i++) {
            String temp = words.substring(i) ; 
            t.INSERT(temp) ; 
        }
        System.out.println(t.countUniquePrefix(t.root)) ;       
    }
}



// STEP 1 : Create a trie from suffix 
// STEP 2 : count the nodes of trie ; (EVRY NODE IN A TRIE IS A UNIQUE PREFIX) 
// STEP 3 : just add + 1 in the end to include the " " 