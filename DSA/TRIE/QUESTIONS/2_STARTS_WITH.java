// STARTS WITH PROBLEM 
// Create a function boolean starts with (String prefix) for a trie . 
// Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise

// words[] = {"apple","app","mango","man","woman"}  
// prefix = "app" , output : true 
// prefix = "moon" , output : false ; 

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
    public Node root ;
    public Trie() {
        root = new Node() ; 
    }
    // INSERT  
    public void INSERT(String key) {
        Node current = root ; 
        for(int i = 0 ; i < key.length() ; i++) {
            int index = key.charAt(i) - 'a' ; 
            if(current.children[index] == null) {
                current.children[index] = new Node() ; 

            }
            if(i == key.length()-1) {
                current.children[index].endOfWord = true ;
            }
            current = current.children[index] ; 
        }
    }
    // STARTS WITH
    public boolean STARTSWITH(String key) {
        Node current = root ; 
        for(int i = 0 ; i < key.length() ; i++) {
            int index = key.charAt(i) - 'a' ; 
            if(current.children[index] == null) {
                return false ; 
            }
            current = current.children[index] ; 
        }
        return true ; 
    }

}
 
public class Main{ 
    public static void main(String args[]) {
        Trie t = new Trie() ; 
        String [] words = {"apple","app","mango","man","woman"} ; 
        for(int i = 0 ; i < words.length ; i++) {
            t.INSERT(words[i]) ; 
        }

        if(t.STARTSWITH("man")){ // prefix 
            System.out.println("true") ; 
        } 
        else{
            System.out.println("false") ;   
        }
    }
}