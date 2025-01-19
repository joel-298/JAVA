// WORD BREAK PROBLEM : 
// Given an input String and a dictionary of words, find out if the input string can be broken into a space-separated sequence of dictionary words.
// words[] = { "i" , "like" , "sam" , "samsung" , " mobile" , "ice"} ;
// key = "ilikesamsung" ; 
// output : true ; 


// i|like|sam|sung(false)
// i|like|samsung|                -> true ; 




import java.util.* ; 

class Node {
    public Node[] children ; 
    public boolean endOfWord ; 
    public Node() {
        children = new Node[26] ; // for 26 characters 
        for(int i = 0 ; i < 26 ; i++) {
            children[i] = null ; 
        }
        endOfWord = false ; 
    }
} ; 

class Trie { 
    public Node root ; 
    public Trie() {
        root = new Node() ; 
    }
    // CREATE TRIE 
    public void INSERT(String word) {
        Node current = root  ; 
        for(int i = 0 ; i < word.length() ; i++) {
            int index = word.charAt(i) - 'a' ; 
            // Null 
            if(current.children[index] == null) {
                current.children[index] = new Node() ;
            }
            // end of word 
            if(i == word.length() - 1) {
                current.children[index].endOfWord = true ; 
            }
            // traversal 
            current = current.children[index] ; 
            
        }
    }
    // SEARCH 
    public boolean SEARCH(String key) {
        Node current = root ; 
        for(int i = 0 ; i < key.length() ; i++) {
            int index = key.charAt(i)-'a' ; 
            if(current.children[index] == null) {
                return false ; 
            }
            else{
                current = current.children[index] ;    
            }
        }
        
        return current.endOfWord ; 
    }
    
    // WORD BREAK 
    public boolean wordBreak(String key) {
        // base case 
        if(key.length() == 0) {
            return true ; 
        }
        // formula
        for(int i = 0 ; i <= key.length() ; i++) {
            String first = key.substring(0, i) ; // starting from 0th upto i
            String second = key.substring(i) ;  // starting from i upto ending            
            // System.out.println(first+" "+second) ; 
            if(SEARCH(first) && wordBreak(second)) { // check 1st part and the rest of the string recursive
                return true ;
            }
        }
        return false ; 
    }
}

public class Main
{
	public static void main(String[] args) {
		String [] words = {"a","there","the","their","any","math","matthew","i","like","sam","samsung"} ; 
		Trie t = new Trie() ; 
		for(int i = 0 ; i < words.length ; i++) {
		    t.INSERT(words[i]) ; 
		}
		System.out.println("Trie Created !") ;
        
        
        
        // Scanner sc = new Scanner(System.in) ; 
        // String keys = sc.nextLine() ; 
        // if(t.wordBreak(keys)) {
        if(t.wordBreak("likeisamsungmatt")) {
            System.out.println("True") ; 
        }
        else{
            System.out.println("False") ; 
        }
	}
}