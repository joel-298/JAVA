// SEARCH A WORD IN A TRIE !
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
    // INITILIZATION OF ROOT NODE
    public Node root ; 
    public Trie() {
        root = new Node() ; 
    }
    // INSERTION 
    public void INSERT(String word) {
        Node current = root ; 
        for(int i = 0 ; i < word.length() ; i++) {
            int index = word.charAt(i) - 'a' ; 
            // Null
            if(current.children[index] == null) {
                current.children[index] = new Node() ; 
            }
            // endOfWord
            if(i == word.length() - 1) {
                current.children[index].endOfWord = true ; 
            } 
            // Traversal
            current = current.children[index] ;
        }
    }
    // SEARCH
    public boolean SEARCH(String word) {
        Node current = root ; 
        for(int i = 0 ; i < word.length() ; i++) {
            int index = word.charAt(i) - 'a' ; // this will check for alphabet 
            // Null 
            if(current.children[index] == null) { 
                return false;  
            }
            // Traversal // match found
            else{ 
                current = current.children[index] ; // current => TO THE CHILD NODE OF PREVIOUS CHARACTER !
            }
            
            // end of word 
            if(i == word.length() - 1) { // last index 
                return current.endOfWord ; 
                // will return the boolean value of alphabet 
                // if its true ; then return true ;  // word found 
                // if its false ; then return false ; // word not found
            }
 
        }
        return false ; // this condition will only run when word length is 0 ; 
    }
}

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ; 
        String [] words = {"the" , "a" , "there" , "their" , "any" , "apple" , "joe" , "joel" , "math" , "matthew" } ; 
        Trie t = new Trie() ;
        for(int i = 0 ; i < words.length ; i++) {
            t.INSERT(words[i]) ; 
        }
        System.out.println("Trie Created") ; 

        String input = sc.nextLine() ; 
        if(t.SEARCH(input)) {
            System.out.println("Word is Present !") ; 
        }
        else{
            System.out.println("Word is Absent !") ;
        } 
    }
} 